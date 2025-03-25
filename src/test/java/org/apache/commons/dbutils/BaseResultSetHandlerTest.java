/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.dbutils;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.*;

import org.junit.Test;

import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public final class BaseResultSetHandlerTest extends BaseTestCase {

    private static final class ToMapCollectionHandler extends BaseResultSetHandler<Collection<Map<String, Object>>> {

        @Override
        protected Collection<Map<String, Object>> handle() throws SQLException {
            final Collection<Map<String, Object>> result = new LinkedList<>();

            while (next()) {
                final Map<String, Object> current = new HashMap<>();

                for (int i = 1; i <= getMetaData().getColumnCount(); i++) {
                    current.put(getMetaData().getColumnName(i), getObject(i));
                }

                result.add(current);
            }

            return result;
        }

    }


    @Test
    public void testHandleWithoutExplicitResultSetInvocation() throws Exception {
        final Collection<Map<String, Object>> result = new ToMapCollectionHandler().handle(createMockResultSet());

        assertFalse(result.isEmpty());

        for (final Map<String, Object> current : result) {
            assertTrue(current.containsKey("one"));
            assertTrue(current.containsKey("two"));
            assertTrue(current.containsKey("three"));
            assertTrue(current.containsKey("notInBean"));
            assertTrue(current.containsKey("intTest"));
            assertTrue(current.containsKey("integerTest"));
            assertTrue(current.containsKey("nullObjectTest"));
            assertTrue(current.containsKey("nullPrimitiveTest"));
            assertTrue(current.containsKey("notDate"));
            assertTrue(current.containsKey("columnProcessorDoubleTest"));
        }
    }

    @Test
    public void testHandleShouldReturnEmptyCollectionWhenResultSetIsEmpty() throws SQLException {
        ResultSet resultSet = mock(ResultSet.class);
        when(resultSet.next()).thenReturn(false);

        ToMapCollectionHandler handler = new ToMapCollectionHandler();
        Collection<Map<String, Object>> result = handler.handle(resultSet);

        assertTrue(result.isEmpty());
    }

    @Test
    public void testHandleShouldThrowSQLExceptionWhenResultSetThrowsSQLException() throws SQLException {
        ResultSet resultSet = mock(ResultSet.class);
        when(resultSet.next()).thenThrow(new SQLException());

        ToMapCollectionHandler handler = new ToMapCollectionHandler();

        assertThrows(SQLException.class, () -> handler.handle(resultSet));
    }

    @Test
    public void testHandleShouldReturnCorrectDataWhenResultSetHasData() throws SQLException {
        ResultSet resultSet = mock(ResultSet.class);
        ResultSetMetaData metaData = mock(ResultSetMetaData.class);

        when(resultSet.next()).thenReturn(true, false);
        when(resultSet.getMetaData()).thenReturn(metaData);
        when(metaData.getColumnCount()).thenReturn(2);
        when(metaData.getColumnName(1)).thenReturn("column1");
        when(metaData.getColumnName(2)).thenReturn("column2");
        when(resultSet.getObject(1)).thenReturn("value1");
        when(resultSet.getObject(2)).thenReturn("value2");

        ToMapCollectionHandler handler = new ToMapCollectionHandler();
        Collection<Map<String, Object>> result = handler.handle(resultSet);

        assertFalse(result.isEmpty());
        Map<String, Object> row = result.iterator().next();
        assertEquals("value1", row.get("column1"));
        assertEquals("value2", row.get("column2"));
    }

    @Test
    public void testHandleShouldReturnMultipleRowsWhenResultSetHasMultipleRows() throws SQLException {
        ResultSet resultSet = mock(ResultSet.class);
        ResultSetMetaData metaData = mock(ResultSetMetaData.class);

        when(resultSet.next()).thenReturn(true, true, false);
        when(resultSet.getMetaData()).thenReturn(metaData);
        when(metaData.getColumnCount()).thenReturn(2);
        when(metaData.getColumnName(1)).thenReturn("column1");
        when(metaData.getColumnName(2)).thenReturn("column2");
        when(resultSet.getObject(1)).thenReturn("value1", "value3");
        when(resultSet.getObject(2)).thenReturn("value2", "value4");

        ToMapCollectionHandler handler = new ToMapCollectionHandler();
        Collection<Map<String, Object>> result = handler.handle(resultSet);

        assertEquals(2, result.size());
        Iterator<Map<String, Object>> iterator = result.iterator();
        Map<String, Object> firstRow = iterator.next();
        Map<String, Object> secondRow = iterator.next();

        assertEquals("value1", firstRow.get("column1"));
        assertEquals("value2", firstRow.get("column2"));
        assertEquals("value3", secondRow.get("column1"));
        assertEquals("value4", secondRow.get("column2"));
    }

}
