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

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test001");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner1 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0);
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1, (-1.0f), 10.0f, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture8 = asyncQueryRunner1.update("", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, -1.0, 10.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, -1.0, 10.0, 1]");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test002");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService1);
        javax.sql.DataSource dataSource3 = asyncQueryRunner2.getDataSource();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture5 = asyncQueryRunner2.update("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource3);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test003");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner1 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0);
        java.lang.Class<?> wildcardClass2 = asyncQueryRunner1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test004");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService1);
        javax.sql.DataSource dataSource3 = asyncQueryRunner2.getDataSource();
        javax.sql.DataSource dataSource5 = null;
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner7 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource5, executorService6);
        java.lang.Object obj9 = new java.lang.Object();
        java.util.concurrent.ExecutorService executorService11 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner12 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService11);
        java.lang.Object[] objArray13 = new java.lang.Object[] { dataSource5, (short) 10, obj9, 10L, executorService11 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture14 = asyncQueryRunner2.update("", objArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test005");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner1);
        java.sql.PreparedStatement preparedStatement3 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner2.fillStatement(preparedStatement3, objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] {});
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test006");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner1);
        java.sql.Connection connection3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture5 = asyncQueryRunner2.update(connection3, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test007");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner1 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0);
        java.sql.PreparedStatement preparedStatement2 = null;
        java.util.concurrent.ExecutorService executorService5 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner6 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner7 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService5, queryRunner6);
        java.lang.Object[] objArray11 = new java.lang.Object[] { (short) 100, 1.0d, asyncQueryRunner7, 1L, (short) 0, 100L };
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner1.fillStatement(preparedStatement2, objArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test008");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService1);
        java.lang.Object[] objArray10 = new java.lang.Object[] { 0.0f, (-1L), '4', 1.0f, 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture11 = asyncQueryRunner2.update("", objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0.0, -1, 4, 1.0, 0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0.0, -1, 4, 1.0, 0, -1]");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test009");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService1);
        javax.sql.DataSource dataSource3 = asyncQueryRunner2.getDataSource();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture6 = asyncQueryRunner2.update("", (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource3);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test010");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        java.sql.PreparedStatement preparedStatement3 = null;
        java.lang.Object[] objArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner2.fillStatement(preparedStatement3, objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test011");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture5 = asyncQueryRunner2.update("", (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test012");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner1 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture3 = asyncQueryRunner1.update("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test013");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, false, executorService2);
        javax.sql.DataSource dataSource4 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.sql.ParameterMetaData parameterMetaData6 = asyncQueryRunner3.getParameterMetaData(preparedStatement5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource4);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test014");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService1);
        javax.sql.DataSource dataSource3 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement4 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner2.fillStatementWithBean(preparedStatement4, (java.lang.Object) 10.0d, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Couldn't find bean property: class java.lang.Double ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "hi!", "", "", "hi!" });
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test015");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement4 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner2.fillStatementWithBean(preparedStatement4, (java.lang.Object) (-1.0f), strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Couldn't find bean property: class java.lang.Float ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "" });
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test016");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner1);
        java.sql.PreparedStatement preparedStatement3 = null;
        javax.sql.DataSource dataSource4 = null;
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner7 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource4, false, executorService6);
        java.util.concurrent.ExecutorService executorService9 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner10 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService9);
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService12);
        java.lang.Object[] objArray16 = new java.lang.Object[] { false, asyncQueryRunner10, asyncQueryRunner13, false, 10L };
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner2.fillStatement(preparedStatement3, objArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test017");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, false, executorService2);
        javax.sql.DataSource dataSource4 = asyncQueryRunner3.getDataSource();
        java.sql.Connection connection5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture8 = asyncQueryRunner3.update(connection5, "", (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource4);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test018");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture4 = asyncQueryRunner2.update("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test019");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner1 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0);
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0.0f, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture6 = asyncQueryRunner1.update("hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0, 4]");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test020");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture5 = asyncQueryRunner2.update("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test021");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, false, executorService2);
        javax.sql.DataSource dataSource4 = asyncQueryRunner3.getDataSource();
        java.lang.Object[][] objArray6 = new java.lang.Object[][] {};
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<int[]> intArrayFuture7 = asyncQueryRunner3.batch("hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[][] {});
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test022");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        javax.sql.DataSource dataSource3 = asyncQueryRunner2.getDataSource();
        java.util.concurrent.ExecutorService executorService9 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner10 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService9);
        javax.sql.DataSource dataSource11 = asyncQueryRunner10.getDataSource();
        java.lang.Object[] objArray14 = new java.lang.Object[] { (byte) 100, '#', 10.0d, dataSource11, "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture15 = asyncQueryRunner2.update("hi!", objArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100, #, 10.0, null, , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100, #, 10.0, null, , hi!]");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test023");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, false, executorService2);
        java.sql.Connection connection4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture7 = asyncQueryRunner3.update(connection4, "", (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test024");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, false, executorService2);
        javax.sql.DataSource dataSource4 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.lang.String[] strArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner3.fillStatementWithBean(preparedStatement5, (java.lang.Object) 0.0f, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"propertyNames\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource4);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test025");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner1 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0);
        java.sql.PreparedStatement preparedStatement2 = null;
        java.util.concurrent.ExecutorService executorService4 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner5 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService4);
        javax.sql.DataSource dataSource6 = asyncQueryRunner5.getDataSource();
        java.beans.PropertyDescriptor propertyDescriptor7 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = new java.beans.PropertyDescriptor[] { propertyDescriptor7 };
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner1.fillStatementWithBean(preparedStatement2, (java.lang.Object) dataSource6, propertyDescriptorArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.beans.PropertyDescriptor.getReadMethod()\" because \"property\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray8, new java.beans.PropertyDescriptor[] { null });
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test026");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, false, executorService2);
        javax.sql.DataSource dataSource4 = asyncQueryRunner3.getDataSource();
        java.sql.Connection connection5 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10L, 10.0d };
        java.lang.Object[] objArray12 = new java.lang.Object[] { 10L, 10.0d };
        java.lang.Object[][] objArray13 = new java.lang.Object[][] { objArray9, objArray12 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<int[]> intArrayFuture14 = asyncQueryRunner3.batch(connection5, "hi!", objArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, 10.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[10, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[10, 10.0]");
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test027");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, false, executorService2);
        javax.sql.DataSource dataSource4 = asyncQueryRunner3.getDataSource();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1), 100, "" };
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture10 = asyncQueryRunner3.update("", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1, 100, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1, 100, ]");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test028");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner1 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0);
        java.sql.Connection connection2 = null;
        javax.sql.DataSource dataSource4 = null;
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner7 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource4, false, executorService6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture8 = asyncQueryRunner1.update(connection2, "hi!", (java.lang.Object) dataSource4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test029");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement4 = null;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 1.0f, (byte) 10, 'a', (byte) 0, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner2.fillStatement(preparedStatement4, objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1.0, 10, a, 0,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1.0, 10, a, 0,  ]");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test030");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture6 = asyncQueryRunner3.update("", (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test031");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        boolean boolean4 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.Connection connection5 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture9 = asyncQueryRunner2.update(connection5, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100]");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test032");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, false, executorService2);
        javax.sql.DataSource dataSource4 = asyncQueryRunner3.getDataSource();
        java.sql.Connection connection5 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService8);
        java.lang.Object[] objArray13 = new java.lang.Object[] { false, 1.0d, 1.0d, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture14 = asyncQueryRunner3.update(connection5, "hi!", objArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[false, 1.0, 1.0, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[false, 1.0, 1.0, a]");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test033");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService1);
        javax.sql.DataSource dataSource3 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement4 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner2.fillStatement(preparedStatement4, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[] {});
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test034");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        java.sql.Connection connection3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture5 = asyncQueryRunner2.update(connection3, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test035");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture6 = asyncQueryRunner2.update("", (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test036");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement4 = null;
        java.util.concurrent.ExecutorService executorService9 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner10 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner11 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService9, queryRunner10);
        boolean boolean12 = asyncQueryRunner11.isPmdKnownBroken();
        java.lang.Object[] objArray14 = new java.lang.Object[] { '#', 100.0d, (-1), true, asyncQueryRunner11, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner2.fillStatement(preparedStatement4, objArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test037");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner1 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0);
        java.sql.Connection connection2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture4 = asyncQueryRunner1.update(connection2, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test038");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture4 = asyncQueryRunner2.update("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test039");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        javax.sql.DataSource dataSource3 = asyncQueryRunner2.getDataSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = dataSource3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource3);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test040");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        java.sql.Connection connection3 = null;
        javax.sql.DataSource dataSource5 = null;
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner8 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource5, false, executorService7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture9 = asyncQueryRunner2.update(connection3, "hi!", (java.lang.Object) executorService7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test041");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        java.sql.PreparedStatement preparedStatement3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.sql.ParameterMetaData parameterMetaData4 = asyncQueryRunner2.getParameterMetaData(preparedStatement3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test042");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner1 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0);
        java.sql.Connection connection2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 'a', 10, (byte) 100, false };
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture9 = asyncQueryRunner1.update(connection2, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[a, 10, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[a, 10, 100, false]");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test043");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService1);
        javax.sql.DataSource dataSource4 = null;
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner7 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource4, true, executorService6);
        javax.sql.DataSource dataSource11 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource11, executorService12);
        java.lang.Object[] objArray15 = new java.lang.Object[] { asyncQueryRunner7, 'a', (byte) 100, 1, asyncQueryRunner13, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture16 = asyncQueryRunner2.update("", objArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test044");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, false, executorService2);
        javax.sql.DataSource dataSource4 = asyncQueryRunner3.getDataSource();
        java.lang.Object[][] objArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<int[]> intArrayFuture7 = asyncQueryRunner3.batch("hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource4);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test045");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.Connection connection4 = null;
        javax.sql.DataSource dataSource6 = null;
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner8 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource6, executorService7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture9 = asyncQueryRunner2.update(connection4, "hi!", (java.lang.Object) executorService7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test046");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture5 = asyncQueryRunner2.update("", (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test047");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        java.sql.Connection connection5 = null;
        javax.sql.DataSource dataSource10 = null;
        java.util.concurrent.ExecutorService executorService11 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner12 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource10, executorService11);
        java.lang.Object[] objArray15 = new java.lang.Object[] { (byte) 0, 0.0f, 0L, dataSource10, 10, (byte) 0 };
        javax.sql.DataSource dataSource19 = null;
        java.util.concurrent.ExecutorService executorService20 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner21 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource19, executorService20);
        java.lang.Object[] objArray24 = new java.lang.Object[] { (byte) 0, 0.0f, 0L, dataSource19, 10, (byte) 0 };
        javax.sql.DataSource dataSource28 = null;
        java.util.concurrent.ExecutorService executorService29 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner30 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource28, executorService29);
        java.lang.Object[] objArray33 = new java.lang.Object[] { (byte) 0, 0.0f, 0L, dataSource28, 10, (byte) 0 };
        javax.sql.DataSource dataSource37 = null;
        java.util.concurrent.ExecutorService executorService38 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner39 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource37, executorService38);
        java.lang.Object[] objArray42 = new java.lang.Object[] { (byte) 0, 0.0f, 0L, dataSource37, 10, (byte) 0 };
        javax.sql.DataSource dataSource46 = null;
        java.util.concurrent.ExecutorService executorService47 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner48 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource46, executorService47);
        java.lang.Object[] objArray51 = new java.lang.Object[] { (byte) 0, 0.0f, 0L, dataSource46, 10, (byte) 0 };
        javax.sql.DataSource dataSource55 = null;
        java.util.concurrent.ExecutorService executorService56 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner57 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource55, executorService56);
        java.lang.Object[] objArray60 = new java.lang.Object[] { (byte) 0, 0.0f, 0L, dataSource55, 10, (byte) 0 };
        java.lang.Object[][] objArray61 = new java.lang.Object[][] { objArray15, objArray24, objArray33, objArray42, objArray51, objArray60 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<int[]> intArrayFuture62 = asyncQueryRunner2.batch(connection5, "hi!", objArray61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0, 0.0, 0, null, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0, 0.0, 0, null, 10, 0]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[0, 0.0, 0, null, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[0, 0.0, 0, null, 10, 0]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[0, 0.0, 0, null, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[0, 0.0, 0, null, 10, 0]");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[0, 0.0, 0, null, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[0, 0.0, 0, null, 10, 0]");
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[0, 0.0, 0, null, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[0, 0.0, 0, null, 10, 0]");
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[0, 0.0, 0, null, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[0, 0.0, 0, null, 10, 0]");
        org.junit.Assert.assertNotNull(objArray61);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test048");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, false, executorService2);
        javax.sql.DataSource dataSource4 = asyncQueryRunner3.getDataSource();
        java.sql.Connection connection5 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService8);
        boolean boolean10 = asyncQueryRunner9.isPmdKnownBroken();
        java.lang.Object[] objArray11 = new java.lang.Object[] { asyncQueryRunner9 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture12 = asyncQueryRunner3.update(connection5, "hi!", objArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test049");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        javax.sql.DataSource dataSource3 = asyncQueryRunner2.getDataSource();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture6 = asyncQueryRunner2.update("", (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource3);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test050");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        boolean boolean4 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.Connection connection5 = null;
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<int[]> intArrayFuture8 = asyncQueryRunner2.batch(connection5, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test051");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService1);
        javax.sql.DataSource dataSource3 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.sql.ParameterMetaData parameterMetaData5 = asyncQueryRunner2.getParameterMetaData(preparedStatement4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource3);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test052");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner7 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner8 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService6, queryRunner7);
        boolean boolean9 = asyncQueryRunner8.isPmdKnownBroken();
        boolean boolean10 = asyncQueryRunner8.isPmdKnownBroken();
        java.lang.Object[] objArray11 = new java.lang.Object[] { (short) -1, 1L, asyncQueryRunner8 };
        java.util.concurrent.ExecutorService executorService14 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner15 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner16 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService14, queryRunner15);
        boolean boolean17 = asyncQueryRunner16.isPmdKnownBroken();
        boolean boolean18 = asyncQueryRunner16.isPmdKnownBroken();
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) -1, 1L, asyncQueryRunner16 };
        java.util.concurrent.ExecutorService executorService22 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner23 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner24 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService22, queryRunner23);
        boolean boolean25 = asyncQueryRunner24.isPmdKnownBroken();
        boolean boolean26 = asyncQueryRunner24.isPmdKnownBroken();
        java.lang.Object[] objArray27 = new java.lang.Object[] { (short) -1, 1L, asyncQueryRunner24 };
        java.util.concurrent.ExecutorService executorService30 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner31 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner32 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService30, queryRunner31);
        boolean boolean33 = asyncQueryRunner32.isPmdKnownBroken();
        boolean boolean34 = asyncQueryRunner32.isPmdKnownBroken();
        java.lang.Object[] objArray35 = new java.lang.Object[] { (short) -1, 1L, asyncQueryRunner32 };
        java.util.concurrent.ExecutorService executorService38 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner39 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner40 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService38, queryRunner39);
        boolean boolean41 = asyncQueryRunner40.isPmdKnownBroken();
        boolean boolean42 = asyncQueryRunner40.isPmdKnownBroken();
        java.lang.Object[] objArray43 = new java.lang.Object[] { (short) -1, 1L, asyncQueryRunner40 };
        java.util.concurrent.ExecutorService executorService46 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner47 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner48 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService46, queryRunner47);
        boolean boolean49 = asyncQueryRunner48.isPmdKnownBroken();
        boolean boolean50 = asyncQueryRunner48.isPmdKnownBroken();
        java.lang.Object[] objArray51 = new java.lang.Object[] { (short) -1, 1L, asyncQueryRunner48 };
        java.lang.Object[][] objArray52 = new java.lang.Object[][] { objArray11, objArray19, objArray27, objArray35, objArray43, objArray51 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<int[]> intArrayFuture53 = asyncQueryRunner2.batch("", objArray52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray52);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test053");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        java.lang.Object[] objArray7 = new java.lang.Object[] { '4', 0L };
        java.lang.Object[] objArray10 = new java.lang.Object[] { '4', 0L };
        java.lang.Object[][] objArray11 = new java.lang.Object[][] { objArray7, objArray10 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<int[]> intArrayFuture12 = asyncQueryRunner3.batch("", objArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[4, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[4, 0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[4, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[4, 0]");
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test054");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService1);
        javax.sql.DataSource dataSource3 = asyncQueryRunner2.getDataSource();
        javax.sql.DataSource dataSource5 = null;
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner8 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource5, false, executorService7);
        boolean boolean9 = asyncQueryRunner8.isPmdKnownBroken();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture10 = asyncQueryRunner2.update("hi!", (java.lang.Object) boolean9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test055");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService1);
        javax.sql.DataSource dataSource3 = asyncQueryRunner2.getDataSource();
        javax.sql.DataSource dataSource5 = null;
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner8 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource5, false, executorService7);
        java.lang.Object[] objArray9 = new java.lang.Object[] { asyncQueryRunner8 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture10 = asyncQueryRunner2.update("", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test056");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        javax.sql.DataSource dataSource3 = asyncQueryRunner2.getDataSource();
        java.sql.Connection connection4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture7 = asyncQueryRunner2.update(connection4, "hi!", (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource3);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test057");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        boolean boolean4 = asyncQueryRunner2.isPmdKnownBroken();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture6 = asyncQueryRunner2.update("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test058");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture4 = asyncQueryRunner2.update("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test059");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, false, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.Connection connection5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture8 = asyncQueryRunner3.update(connection5, "hi!", (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test060");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture6 = asyncQueryRunner2.update("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource4);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test061");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.Connection connection4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture7 = asyncQueryRunner2.update(connection4, "hi!", (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test062");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, false, executorService2);
        javax.sql.DataSource dataSource5 = null;
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner7 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource5, executorService6);
        boolean boolean8 = asyncQueryRunner7.isPmdKnownBroken();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture9 = asyncQueryRunner3.update("", (java.lang.Object) boolean8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test063");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, false, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.Connection connection5 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService8);
        java.util.concurrent.ExecutorService executorService11 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner12 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService11);
        javax.sql.DataSource dataSource13 = asyncQueryRunner12.getDataSource();
        java.lang.Object[] objArray17 = new java.lang.Object[] { asyncQueryRunner9, dataSource13, (-1.0f), 1, 10.0f };
        java.lang.Object[][] objArray18 = new java.lang.Object[][] { objArray17 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<int[]> intArrayFuture19 = asyncQueryRunner3.batch(connection5, "", objArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test064");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        java.sql.PreparedStatement preparedStatement3 = null;
        java.util.concurrent.ExecutorService executorService5 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner6 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService5);
        java.lang.Class<?> wildcardClass7 = asyncQueryRunner6.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner2.fillStatementWithBean(preparedStatement3, (java.lang.Object) wildcardClass7, propertyDescriptorArray8);
        java.sql.Connection connection10 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner13 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner14 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService12, queryRunner13);
        java.util.concurrent.ExecutorService executorService16 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner17 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService16);
        java.lang.Object[] objArray18 = new java.lang.Object[] { queryRunner13, asyncQueryRunner17 };
        java.util.concurrent.ExecutorService executorService19 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner20 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner21 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService19, queryRunner20);
        java.util.concurrent.ExecutorService executorService23 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner24 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService23);
        java.lang.Object[] objArray25 = new java.lang.Object[] { queryRunner20, asyncQueryRunner24 };
        java.util.concurrent.ExecutorService executorService26 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner27 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner28 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService26, queryRunner27);
        java.util.concurrent.ExecutorService executorService30 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner31 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService30);
        java.lang.Object[] objArray32 = new java.lang.Object[] { queryRunner27, asyncQueryRunner31 };
        java.util.concurrent.ExecutorService executorService33 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner34 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner35 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService33, queryRunner34);
        java.util.concurrent.ExecutorService executorService37 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner38 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService37);
        java.lang.Object[] objArray39 = new java.lang.Object[] { queryRunner34, asyncQueryRunner38 };
        java.util.concurrent.ExecutorService executorService40 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner41 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner42 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService40, queryRunner41);
        java.util.concurrent.ExecutorService executorService44 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner45 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService44);
        java.lang.Object[] objArray46 = new java.lang.Object[] { queryRunner41, asyncQueryRunner45 };
        java.util.concurrent.ExecutorService executorService47 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner48 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner49 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService47, queryRunner48);
        java.util.concurrent.ExecutorService executorService51 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner52 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService51);
        java.lang.Object[] objArray53 = new java.lang.Object[] { queryRunner48, asyncQueryRunner52 };
        java.lang.Object[][] objArray54 = new java.lang.Object[][] { objArray18, objArray25, objArray32, objArray39, objArray46, objArray53 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<int[]> intArrayFuture55 = asyncQueryRunner2.batch(connection10, "", objArray54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray8, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray54);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test065");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        javax.sql.DataSource dataSource3 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement4 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner2.fillStatementWithBean(preparedStatement4, (java.lang.Object) (byte) 1, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Couldn't find bean property: class java.lang.Byte hi!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "hi!", "" });
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test066");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService1);
        java.sql.PreparedStatement preparedStatement3 = null;
        java.beans.PropertyDescriptor propertyDescriptor5 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = new java.beans.PropertyDescriptor[] { propertyDescriptor5 };
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner2.fillStatementWithBean(preparedStatement3, (java.lang.Object) (short) 100, propertyDescriptorArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.beans.PropertyDescriptor.getReadMethod()\" because \"property\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray6, new java.beans.PropertyDescriptor[] { null });
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test067");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner1);
        java.sql.PreparedStatement preparedStatement3 = null;
        javax.sql.DataSource dataSource4 = null;
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner7 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource4, false, executorService6);
        boolean boolean8 = asyncQueryRunner7.isPmdKnownBroken();
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner2.fillStatementWithBean(preparedStatement3, (java.lang.Object) boolean8, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Couldn't find bean property: class java.lang.Boolean ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "" });
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test068");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement4 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = new java.beans.PropertyDescriptor[] {};
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner2.fillStatementWithBean(preparedStatement4, (java.lang.Object) 100L, propertyDescriptorArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray6, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test069");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        java.util.concurrent.ExecutorService executorService5 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner6 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService5);
        java.sql.PreparedStatement preparedStatement7 = null;
        java.util.concurrent.ExecutorService executorService9 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner10 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService9);
        java.lang.Class<?> wildcardClass11 = asyncQueryRunner10.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray12 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner6.fillStatementWithBean(preparedStatement7, (java.lang.Object) wildcardClass11, propertyDescriptorArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture14 = asyncQueryRunner2.update("hi!", (java.lang.Object[]) propertyDescriptorArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(propertyDescriptorArray12);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray12, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test070");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.Connection connection4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture7 = asyncQueryRunner2.update(connection4, "", (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test071");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        javax.sql.DataSource dataSource3 = asyncQueryRunner2.getDataSource();
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner8 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService7);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 0L, 100.0d, executorService7 };
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService12);
        java.lang.Object[] objArray14 = new java.lang.Object[] { 0L, 100.0d, executorService12 };
        java.util.concurrent.ExecutorService executorService17 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner18 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService17);
        java.lang.Object[] objArray19 = new java.lang.Object[] { 0L, 100.0d, executorService17 };
        java.util.concurrent.ExecutorService executorService22 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner23 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService22);
        java.lang.Object[] objArray24 = new java.lang.Object[] { 0L, 100.0d, executorService22 };
        java.lang.Object[][] objArray25 = new java.lang.Object[][] { objArray9, objArray14, objArray19, objArray24 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<int[]> intArrayFuture26 = asyncQueryRunner2.batch("", objArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0, 100.0, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0, 100.0, null]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0, 100.0, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0, 100.0, null]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[0, 100.0, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[0, 100.0, null]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[0, 100.0, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[0, 100.0, null]");
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test072");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        javax.sql.DataSource dataSource3 = asyncQueryRunner2.getDataSource();
        java.sql.Connection connection4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture6 = asyncQueryRunner2.update(connection4, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource3);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test073");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService1);
        javax.sql.DataSource dataSource3 = asyncQueryRunner2.getDataSource();
        java.sql.Connection connection4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture7 = asyncQueryRunner2.update(connection4, "", (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource3);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test074");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService1);
        javax.sql.DataSource dataSource5 = null;
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner8 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource5, false, executorService7);
        boolean boolean9 = asyncQueryRunner8.isPmdKnownBroken();
        java.lang.Object[] objArray10 = new java.lang.Object[] { 100L, asyncQueryRunner8 };
        javax.sql.DataSource dataSource12 = null;
        java.util.concurrent.ExecutorService executorService14 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner15 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource12, false, executorService14);
        boolean boolean16 = asyncQueryRunner15.isPmdKnownBroken();
        java.lang.Object[] objArray17 = new java.lang.Object[] { 100L, asyncQueryRunner15 };
        javax.sql.DataSource dataSource19 = null;
        java.util.concurrent.ExecutorService executorService21 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner22 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource19, false, executorService21);
        boolean boolean23 = asyncQueryRunner22.isPmdKnownBroken();
        java.lang.Object[] objArray24 = new java.lang.Object[] { 100L, asyncQueryRunner22 };
        javax.sql.DataSource dataSource26 = null;
        java.util.concurrent.ExecutorService executorService28 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner29 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource26, false, executorService28);
        boolean boolean30 = asyncQueryRunner29.isPmdKnownBroken();
        java.lang.Object[] objArray31 = new java.lang.Object[] { 100L, asyncQueryRunner29 };
        java.lang.Object[][] objArray32 = new java.lang.Object[][] { objArray10, objArray17, objArray24, objArray31 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<int[]> intArrayFuture33 = asyncQueryRunner2.batch("", objArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test075");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        java.sql.Connection connection5 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService12);
        java.lang.Class<?> wildcardClass14 = asyncQueryRunner13.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner9.fillStatementWithBean(preparedStatement10, (java.lang.Object) wildcardClass14, propertyDescriptorArray15);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture17 = asyncQueryRunner2.update(connection5, "", (java.lang.Object[]) propertyDescriptorArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray15, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test076");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, false, executorService2);
        javax.sql.DataSource dataSource4 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner3.fillStatementWithBean(preparedStatement5, (java.lang.Object) '4', strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Couldn't find bean property: class java.lang.Character hi!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test077");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        java.lang.Class<?> wildcardClass3 = asyncQueryRunner2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test078");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        java.sql.Connection connection5 = null;
        java.lang.Object[] objArray11 = new java.lang.Object[] { 0.0f, (byte) 0, (short) -1, "" };
        java.lang.Object[] objArray16 = new java.lang.Object[] { 0.0f, (byte) 0, (short) -1, "" };
        java.lang.Object[] objArray21 = new java.lang.Object[] { 0.0f, (byte) 0, (short) -1, "" };
        java.lang.Object[] objArray26 = new java.lang.Object[] { 0.0f, (byte) 0, (short) -1, "" };
        java.lang.Object[] objArray31 = new java.lang.Object[] { 0.0f, (byte) 0, (short) -1, "" };
        java.lang.Object[][] objArray32 = new java.lang.Object[][] { objArray11, objArray16, objArray21, objArray26, objArray31 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<int[]> intArrayFuture33 = asyncQueryRunner2.batch(connection5, "hi!", objArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[0.0, 0, -1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[0.0, 0, -1, ]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[0.0, 0, -1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[0.0, 0, -1, ]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[0.0, 0, -1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[0.0, 0, -1, ]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[0.0, 0, -1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[0.0, 0, -1, ]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[0.0, 0, -1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[0.0, 0, -1, ]");
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test079");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, false, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner8 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService7);
        javax.sql.DataSource dataSource9 = asyncQueryRunner8.getDataSource();
        java.lang.String[] strArray10 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner3.fillStatementWithBean(preparedStatement5, (java.lang.Object) dataSource9, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"bean\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test080");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService1);
        javax.sql.DataSource dataSource3 = asyncQueryRunner2.getDataSource();
        java.sql.Connection connection4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture6 = asyncQueryRunner2.update(connection4, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource3);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test081");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner1 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0);
        java.sql.Connection connection2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture5 = asyncQueryRunner1.update(connection2, "hi!", (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test082");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner1 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0);
        java.sql.Connection connection2 = null;
        java.lang.Object obj4 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture5 = asyncQueryRunner1.update(connection2, "", obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test083");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture4 = asyncQueryRunner2.update("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test084");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, false, executorService2);
        java.sql.PreparedStatement preparedStatement4 = null;
        javax.sql.DataSource dataSource5 = null;
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner8 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource5, false, executorService7);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner3.fillStatementWithBean(preparedStatement4, (java.lang.Object) executorService7, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"bean\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "" });
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test085");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement4 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner2.fillStatement(preparedStatement4, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[] {});
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test086");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner1);
        java.util.concurrent.ExecutorService executorService5 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner6 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService5);
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService7, queryRunner8);
        boolean boolean10 = asyncQueryRunner9.isPmdKnownBroken();
        java.lang.Object[] objArray11 = new java.lang.Object[] { executorService5, asyncQueryRunner9 };
        java.lang.Object[][] objArray12 = new java.lang.Object[][] { objArray11 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<int[]> intArrayFuture13 = asyncQueryRunner2.batch("", objArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test087");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        java.sql.PreparedStatement preparedStatement3 = null;
        java.util.concurrent.ExecutorService executorService5 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner6 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService5);
        java.lang.Class<?> wildcardClass7 = asyncQueryRunner6.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner2.fillStatementWithBean(preparedStatement3, (java.lang.Object) wildcardClass7, propertyDescriptorArray8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = asyncQueryRunner2.getParameterMetaData(preparedStatement10);
        java.sql.Connection connection12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture15 = asyncQueryRunner2.update(connection12, "", (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray8, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(parameterMetaData11);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test088");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture5 = asyncQueryRunner2.update("hi!", (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test089");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        boolean boolean4 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.sql.ParameterMetaData parameterMetaData6 = asyncQueryRunner2.getParameterMetaData(preparedStatement5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test090");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        java.sql.PreparedStatement preparedStatement3 = null;
        java.util.concurrent.ExecutorService executorService5 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner6 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService5);
        java.lang.Class<?> wildcardClass7 = asyncQueryRunner6.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner2.fillStatementWithBean(preparedStatement3, (java.lang.Object) wildcardClass7, propertyDescriptorArray8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = asyncQueryRunner2.getParameterMetaData(preparedStatement10);
        java.sql.Connection connection12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture15 = asyncQueryRunner2.update(connection12, "hi!", (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray8, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(parameterMetaData11);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test091");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        boolean boolean4 = asyncQueryRunner2.isPmdKnownBroken();
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner8 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService7);
        java.lang.Class<?> wildcardClass9 = asyncQueryRunner8.getClass();
        java.lang.Object[] objArray13 = new java.lang.Object[] { wildcardClass9, 0L, 100.0d, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture14 = asyncQueryRunner2.update("", objArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[class org.apache.commons.dbutils.AsyncQueryRunner, 0, 100.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[class org.apache.commons.dbutils.AsyncQueryRunner, 0, 100.0, 0]");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test092");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner1 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0);
        java.sql.PreparedStatement preparedStatement2 = null;
        java.util.concurrent.ExecutorService executorService4 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner5 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService4);
        java.sql.PreparedStatement preparedStatement6 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService8);
        java.lang.Class<?> wildcardClass10 = asyncQueryRunner9.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner5.fillStatementWithBean(preparedStatement6, (java.lang.Object) wildcardClass10, propertyDescriptorArray11);
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner1.fillStatement(preparedStatement2, (java.lang.Object[]) propertyDescriptorArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(propertyDescriptorArray11);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray11, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test093");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        boolean boolean4 = asyncQueryRunner2.isPmdKnownBroken();
        java.lang.Object[][] objArray6 = new java.lang.Object[][] {};
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<int[]> intArrayFuture7 = asyncQueryRunner2.batch("", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[][] {});
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test094");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        java.sql.PreparedStatement preparedStatement3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner2.fillStatementWithBean(preparedStatement3, (java.lang.Object) (byte) 10, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Couldn't find bean property: class java.lang.Byte hi!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test095");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.Connection connection4 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture8 = asyncQueryRunner2.update(connection4, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10]");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test096");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, false, executorService2);
        java.sql.Connection connection4 = null;
        java.util.concurrent.ExecutorService executorService9 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner10 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService9);
        java.lang.Object[] objArray11 = new java.lang.Object[] { 10, 1, asyncQueryRunner10 };
        java.lang.Object[][] objArray12 = new java.lang.Object[][] { objArray11 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<int[]> intArrayFuture13 = asyncQueryRunner3.batch(connection4, "hi!", objArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test097");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        java.util.concurrent.ExecutorService executorService5 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner6 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService5);
        java.sql.PreparedStatement preparedStatement7 = null;
        java.util.concurrent.ExecutorService executorService9 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner10 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService9);
        java.lang.Class<?> wildcardClass11 = asyncQueryRunner10.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray12 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner6.fillStatementWithBean(preparedStatement7, (java.lang.Object) wildcardClass11, propertyDescriptorArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture14 = asyncQueryRunner2.update("", (java.lang.Object[]) propertyDescriptorArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(propertyDescriptorArray12);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray12, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test098");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        boolean boolean4 = asyncQueryRunner2.isPmdKnownBroken();
        java.lang.Class<?> wildcardClass5 = asyncQueryRunner2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test099");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        java.sql.PreparedStatement preparedStatement3 = null;
        java.util.concurrent.ExecutorService executorService5 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner6 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService5);
        java.lang.Class<?> wildcardClass7 = asyncQueryRunner6.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner2.fillStatementWithBean(preparedStatement3, (java.lang.Object) wildcardClass7, propertyDescriptorArray8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = asyncQueryRunner2.getParameterMetaData(preparedStatement10);
        java.util.concurrent.ExecutorService executorService14 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner15 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService14);
        java.lang.Object[] objArray19 = new java.lang.Object[] { false, '4', true, 10L };
        java.util.concurrent.ExecutorService executorService21 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner22 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService21);
        java.lang.Object[] objArray26 = new java.lang.Object[] { false, '4', true, 10L };
        java.util.concurrent.ExecutorService executorService28 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner29 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService28);
        java.lang.Object[] objArray33 = new java.lang.Object[] { false, '4', true, 10L };
        java.util.concurrent.ExecutorService executorService35 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner36 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService35);
        java.lang.Object[] objArray40 = new java.lang.Object[] { false, '4', true, 10L };
        java.util.concurrent.ExecutorService executorService42 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner43 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService42);
        java.lang.Object[] objArray47 = new java.lang.Object[] { false, '4', true, 10L };
        java.lang.Object[][] objArray48 = new java.lang.Object[][] { objArray19, objArray26, objArray33, objArray40, objArray47 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<int[]> intArrayFuture49 = asyncQueryRunner2.batch("hi!", objArray48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray8, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(parameterMetaData11);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[false, 4, true, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[false, 4, true, 10]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[false, 4, true, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[false, 4, true, 10]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[false, 4, true, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[false, 4, true, 10]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[false, 4, true, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[false, 4, true, 10]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[false, 4, true, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[false, 4, true, 10]");
        org.junit.Assert.assertNotNull(objArray48);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test100");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner1 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0);
        java.sql.Connection connection2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture4 = asyncQueryRunner1.update(connection2, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test101");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        java.lang.Object[][] objArray5 = new java.lang.Object[][] {};
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<int[]> intArrayFuture6 = asyncQueryRunner2.batch("hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[][] {});
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test102");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, false, executorService2);
        java.lang.Class<?> wildcardClass4 = asyncQueryRunner3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test103");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        java.sql.Connection connection4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture6 = asyncQueryRunner3.update(connection4, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test104");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        java.sql.PreparedStatement preparedStatement3 = null;
        java.util.concurrent.ExecutorService executorService5 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner6 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService5);
        java.sql.PreparedStatement preparedStatement7 = null;
        java.util.concurrent.ExecutorService executorService9 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner10 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService9);
        java.lang.Class<?> wildcardClass11 = asyncQueryRunner10.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray12 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner6.fillStatementWithBean(preparedStatement7, (java.lang.Object) wildcardClass11, propertyDescriptorArray12);
        java.sql.PreparedStatement preparedStatement14 = null;
        java.sql.ParameterMetaData parameterMetaData15 = asyncQueryRunner6.getParameterMetaData(preparedStatement14);
        java.beans.PropertyDescriptor propertyDescriptor16 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = new java.beans.PropertyDescriptor[] { propertyDescriptor16 };
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner2.fillStatementWithBean(preparedStatement3, (java.lang.Object) asyncQueryRunner6, propertyDescriptorArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.beans.PropertyDescriptor.getReadMethod()\" because \"property\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(propertyDescriptorArray12);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray12, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(parameterMetaData15);
        org.junit.Assert.assertNotNull(propertyDescriptorArray17);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray17, new java.beans.PropertyDescriptor[] { null });
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test105");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, false, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement5 = null;
        javax.sql.DataSource dataSource6 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource6, true, executorService8);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner3.fillStatementWithBean(preparedStatement5, (java.lang.Object) true, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test106");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.sql.ParameterMetaData parameterMetaData6 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService12);
        java.lang.Class<?> wildcardClass14 = asyncQueryRunner13.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner9.fillStatementWithBean(preparedStatement10, (java.lang.Object) wildcardClass14, propertyDescriptorArray15);
        asyncQueryRunner2.fillStatement(preparedStatement5, parameterMetaData6, (java.lang.Object[]) propertyDescriptorArray15);
        java.sql.Connection connection18 = null;
        java.lang.Object[][] objArray20 = new java.lang.Object[][] {};
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<int[]> intArrayFuture21 = asyncQueryRunner2.batch(connection18, "hi!", objArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray15, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertArrayEquals(objArray20, new java.lang.Object[][] {});
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test107");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, false, executorService2);
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = null;
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService7, queryRunner8);
        boolean boolean10 = asyncQueryRunner9.isPmdKnownBroken();
        boolean boolean11 = asyncQueryRunner9.isPmdKnownBroken();
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) -1, asyncQueryRunner9, (byte) 10, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner3.fillStatement(preparedStatement4, parameterMetaData5, objArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.setObject(int, Object)\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test108");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService1);
        javax.sql.DataSource dataSource3 = asyncQueryRunner2.getDataSource();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture6 = asyncQueryRunner2.update("", (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource3);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test109");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        java.lang.Class<?> wildcardClass4 = asyncQueryRunner2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test110");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement4 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { '4', 100L, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner2.fillStatement(preparedStatement4, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[4, 100, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[4, 100, 1.0]");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test111");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        javax.sql.DataSource dataSource3 = asyncQueryRunner2.getDataSource();
        java.sql.Connection connection4 = null;
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner8 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService7);
        java.sql.PreparedStatement preparedStatement9 = null;
        java.util.concurrent.ExecutorService executorService11 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner12 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService11);
        java.lang.Class<?> wildcardClass13 = asyncQueryRunner12.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner8.fillStatementWithBean(preparedStatement9, (java.lang.Object) wildcardClass13, propertyDescriptorArray14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture16 = asyncQueryRunner2.update(connection4, "", (java.lang.Object[]) propertyDescriptorArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(propertyDescriptorArray14);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray14, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test112");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner1);
        java.sql.Connection connection3 = null;
        javax.sql.DataSource dataSource5 = null;
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner8 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource5, true, executorService7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture9 = asyncQueryRunner2.update(connection3, "hi!", (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test113");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, false, executorService2);
        javax.sql.DataSource dataSource4 = asyncQueryRunner3.getDataSource();
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner8 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService7);
        javax.sql.DataSource dataSource9 = asyncQueryRunner8.getDataSource();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture10 = asyncQueryRunner3.update("hi!", (java.lang.Object) dataSource9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(dataSource9);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test114");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.sql.ParameterMetaData parameterMetaData6 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService12);
        java.lang.Class<?> wildcardClass14 = asyncQueryRunner13.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner9.fillStatementWithBean(preparedStatement10, (java.lang.Object) wildcardClass14, propertyDescriptorArray15);
        asyncQueryRunner2.fillStatement(preparedStatement5, parameterMetaData6, (java.lang.Object[]) propertyDescriptorArray15);
        java.lang.Object[][] objArray19 = new java.lang.Object[][] {};
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<int[]> intArrayFuture20 = asyncQueryRunner2.batch("", objArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray15, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertArrayEquals(objArray19, new java.lang.Object[][] {});
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test115");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner2.fillStatement(preparedStatement5, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test116");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService1);
        java.sql.Connection connection3 = null;
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner7 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService6);
        java.lang.Class<?> wildcardClass8 = asyncQueryRunner7.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { asyncQueryRunner7 };
        java.util.concurrent.ExecutorService executorService11 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner12 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService11);
        java.lang.Class<?> wildcardClass13 = asyncQueryRunner12.getClass();
        java.lang.Object[] objArray14 = new java.lang.Object[] { asyncQueryRunner12 };
        java.util.concurrent.ExecutorService executorService16 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner17 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService16);
        java.lang.Class<?> wildcardClass18 = asyncQueryRunner17.getClass();
        java.lang.Object[] objArray19 = new java.lang.Object[] { asyncQueryRunner17 };
        java.util.concurrent.ExecutorService executorService21 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner22 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService21);
        java.lang.Class<?> wildcardClass23 = asyncQueryRunner22.getClass();
        java.lang.Object[] objArray24 = new java.lang.Object[] { asyncQueryRunner22 };
        java.util.concurrent.ExecutorService executorService26 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner27 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService26);
        java.lang.Class<?> wildcardClass28 = asyncQueryRunner27.getClass();
        java.lang.Object[] objArray29 = new java.lang.Object[] { asyncQueryRunner27 };
        java.util.concurrent.ExecutorService executorService31 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner32 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService31);
        java.lang.Class<?> wildcardClass33 = asyncQueryRunner32.getClass();
        java.lang.Object[] objArray34 = new java.lang.Object[] { asyncQueryRunner32 };
        java.lang.Object[][] objArray35 = new java.lang.Object[][] { objArray9, objArray14, objArray19, objArray24, objArray29, objArray34 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<int[]> intArrayFuture36 = asyncQueryRunner2.batch(connection3, "", objArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray35);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test117");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, false, executorService2);
        java.util.concurrent.ExecutorService executorService5 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner6 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService5);
        java.sql.PreparedStatement preparedStatement7 = null;
        java.sql.ParameterMetaData parameterMetaData8 = null;
        javax.sql.DataSource dataSource9 = null;
        java.util.concurrent.ExecutorService executorService10 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner11 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource9, executorService10);
        boolean boolean12 = asyncQueryRunner11.isPmdKnownBroken();
        javax.sql.DataSource dataSource13 = asyncQueryRunner11.getDataSource();
        java.sql.PreparedStatement preparedStatement14 = null;
        java.sql.ParameterMetaData parameterMetaData15 = null;
        java.util.concurrent.ExecutorService executorService17 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner18 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService17);
        java.sql.PreparedStatement preparedStatement19 = null;
        java.util.concurrent.ExecutorService executorService21 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner22 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService21);
        java.lang.Class<?> wildcardClass23 = asyncQueryRunner22.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray24 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner18.fillStatementWithBean(preparedStatement19, (java.lang.Object) wildcardClass23, propertyDescriptorArray24);
        asyncQueryRunner11.fillStatement(preparedStatement14, parameterMetaData15, (java.lang.Object[]) propertyDescriptorArray24);
        asyncQueryRunner6.fillStatement(preparedStatement7, parameterMetaData8, (java.lang.Object[]) propertyDescriptorArray24);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture28 = asyncQueryRunner3.update("hi!", (java.lang.Object[]) propertyDescriptorArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(propertyDescriptorArray24);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray24, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test118");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        java.sql.Connection connection5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture7 = asyncQueryRunner2.update(connection5, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource4);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test119");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, false, executorService2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture5 = asyncQueryRunner3.update("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test120");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        java.sql.Connection connection3 = null;
        java.util.concurrent.ExecutorService executorService5 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner6 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner7 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService5, queryRunner6);
        boolean boolean8 = asyncQueryRunner7.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement9 = null;
        java.sql.ParameterMetaData parameterMetaData10 = null;
        java.util.concurrent.ExecutorService executorService11 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner12 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService11);
        java.sql.PreparedStatement preparedStatement13 = null;
        java.sql.ParameterMetaData parameterMetaData14 = null;
        javax.sql.DataSource dataSource15 = null;
        java.util.concurrent.ExecutorService executorService16 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner17 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource15, executorService16);
        boolean boolean18 = asyncQueryRunner17.isPmdKnownBroken();
        javax.sql.DataSource dataSource19 = asyncQueryRunner17.getDataSource();
        java.sql.PreparedStatement preparedStatement20 = null;
        java.sql.ParameterMetaData parameterMetaData21 = null;
        java.util.concurrent.ExecutorService executorService23 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner24 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService23);
        java.sql.PreparedStatement preparedStatement25 = null;
        java.util.concurrent.ExecutorService executorService27 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner28 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService27);
        java.lang.Class<?> wildcardClass29 = asyncQueryRunner28.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray30 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner24.fillStatementWithBean(preparedStatement25, (java.lang.Object) wildcardClass29, propertyDescriptorArray30);
        asyncQueryRunner17.fillStatement(preparedStatement20, parameterMetaData21, (java.lang.Object[]) propertyDescriptorArray30);
        asyncQueryRunner12.fillStatement(preparedStatement13, parameterMetaData14, (java.lang.Object[]) propertyDescriptorArray30);
        asyncQueryRunner7.fillStatement(preparedStatement9, parameterMetaData10, (java.lang.Object[]) propertyDescriptorArray30);
        java.lang.Object[] objArray36 = new java.lang.Object[] { asyncQueryRunner7, true };
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture37 = asyncQueryRunner2.update(connection3, "hi!", objArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(propertyDescriptorArray30);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray30, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test121");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, false, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { "", (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner3.fillStatement(preparedStatement5, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[, 10]");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test122");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        java.lang.Class<?> wildcardClass5 = asyncQueryRunner2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test123");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner1 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0);
        java.sql.Connection connection2 = null;
        java.util.concurrent.ExecutorService executorService5 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner6 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService5);
        boolean boolean7 = asyncQueryRunner6.isPmdKnownBroken();
        java.lang.Object[] objArray8 = new java.lang.Object[] { boolean7 };
        java.lang.Object[][] objArray9 = new java.lang.Object[][] { objArray8 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<int[]> intArrayFuture10 = asyncQueryRunner1.batch(connection2, "hi!", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[false]");
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test124");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, false, executorService2);
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = null;
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner7 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService6);
        java.sql.PreparedStatement preparedStatement8 = null;
        java.sql.ParameterMetaData parameterMetaData9 = null;
        javax.sql.DataSource dataSource10 = null;
        java.util.concurrent.ExecutorService executorService11 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner12 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource10, executorService11);
        boolean boolean13 = asyncQueryRunner12.isPmdKnownBroken();
        javax.sql.DataSource dataSource14 = asyncQueryRunner12.getDataSource();
        java.sql.PreparedStatement preparedStatement15 = null;
        java.sql.ParameterMetaData parameterMetaData16 = null;
        java.util.concurrent.ExecutorService executorService18 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner19 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService18);
        java.sql.PreparedStatement preparedStatement20 = null;
        java.util.concurrent.ExecutorService executorService22 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner23 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService22);
        java.lang.Class<?> wildcardClass24 = asyncQueryRunner23.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray25 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner19.fillStatementWithBean(preparedStatement20, (java.lang.Object) wildcardClass24, propertyDescriptorArray25);
        asyncQueryRunner12.fillStatement(preparedStatement15, parameterMetaData16, (java.lang.Object[]) propertyDescriptorArray25);
        asyncQueryRunner7.fillStatement(preparedStatement8, parameterMetaData9, (java.lang.Object[]) propertyDescriptorArray25);
        asyncQueryRunner3.fillStatement(preparedStatement4, parameterMetaData5, (java.lang.Object[]) propertyDescriptorArray25);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture32 = asyncQueryRunner3.update("hi!", (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(propertyDescriptorArray25);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray25, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test125");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner7 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner8 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService6, queryRunner7);
        boolean boolean9 = asyncQueryRunner8.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService12);
        java.sql.PreparedStatement preparedStatement14 = null;
        java.sql.ParameterMetaData parameterMetaData15 = null;
        javax.sql.DataSource dataSource16 = null;
        java.util.concurrent.ExecutorService executorService17 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner18 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource16, executorService17);
        boolean boolean19 = asyncQueryRunner18.isPmdKnownBroken();
        javax.sql.DataSource dataSource20 = asyncQueryRunner18.getDataSource();
        java.sql.PreparedStatement preparedStatement21 = null;
        java.sql.ParameterMetaData parameterMetaData22 = null;
        java.util.concurrent.ExecutorService executorService24 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner25 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService24);
        java.sql.PreparedStatement preparedStatement26 = null;
        java.util.concurrent.ExecutorService executorService28 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner29 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService28);
        java.lang.Class<?> wildcardClass30 = asyncQueryRunner29.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray31 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner25.fillStatementWithBean(preparedStatement26, (java.lang.Object) wildcardClass30, propertyDescriptorArray31);
        asyncQueryRunner18.fillStatement(preparedStatement21, parameterMetaData22, (java.lang.Object[]) propertyDescriptorArray31);
        asyncQueryRunner13.fillStatement(preparedStatement14, parameterMetaData15, (java.lang.Object[]) propertyDescriptorArray31);
        asyncQueryRunner8.fillStatement(preparedStatement10, parameterMetaData11, (java.lang.Object[]) propertyDescriptorArray31);
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner2.fillStatement(preparedStatement5, (java.lang.Object[]) propertyDescriptorArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(propertyDescriptorArray31);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray31, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test126");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner1 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0);
        java.sql.PreparedStatement preparedStatement2 = null;
        java.sql.ParameterMetaData parameterMetaData3 = null;
        javax.sql.DataSource dataSource4 = null;
        java.util.concurrent.ExecutorService executorService5 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner6 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource4, executorService5);
        boolean boolean7 = asyncQueryRunner6.isPmdKnownBroken();
        javax.sql.DataSource dataSource8 = asyncQueryRunner6.getDataSource();
        java.sql.PreparedStatement preparedStatement9 = null;
        java.sql.ParameterMetaData parameterMetaData10 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService12);
        java.sql.PreparedStatement preparedStatement14 = null;
        java.util.concurrent.ExecutorService executorService16 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner17 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService16);
        java.lang.Class<?> wildcardClass18 = asyncQueryRunner17.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner13.fillStatementWithBean(preparedStatement14, (java.lang.Object) wildcardClass18, propertyDescriptorArray19);
        asyncQueryRunner6.fillStatement(preparedStatement9, parameterMetaData10, (java.lang.Object[]) propertyDescriptorArray19);
        asyncQueryRunner1.fillStatement(preparedStatement2, parameterMetaData3, (java.lang.Object[]) propertyDescriptorArray19);
        boolean boolean23 = asyncQueryRunner1.isPmdKnownBroken();
        java.sql.Connection connection24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture26 = asyncQueryRunner1.update(connection24, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray19, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test127");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner1);
        java.sql.PreparedStatement preparedStatement3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.sql.ParameterMetaData parameterMetaData4 = asyncQueryRunner2.getParameterMetaData(preparedStatement3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test128");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, false, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.lang.Object obj6 = null;
        javax.sql.DataSource dataSource7 = null;
        java.util.concurrent.ExecutorService executorService9 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner10 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource7, false, executorService9);
        java.sql.PreparedStatement preparedStatement11 = null;
        java.sql.ParameterMetaData parameterMetaData12 = null;
        java.util.concurrent.ExecutorService executorService13 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner14 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService13);
        java.sql.PreparedStatement preparedStatement15 = null;
        java.sql.ParameterMetaData parameterMetaData16 = null;
        javax.sql.DataSource dataSource17 = null;
        java.util.concurrent.ExecutorService executorService18 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner19 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource17, executorService18);
        boolean boolean20 = asyncQueryRunner19.isPmdKnownBroken();
        javax.sql.DataSource dataSource21 = asyncQueryRunner19.getDataSource();
        java.sql.PreparedStatement preparedStatement22 = null;
        java.sql.ParameterMetaData parameterMetaData23 = null;
        java.util.concurrent.ExecutorService executorService25 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner26 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService25);
        java.sql.PreparedStatement preparedStatement27 = null;
        java.util.concurrent.ExecutorService executorService29 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner30 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService29);
        java.lang.Class<?> wildcardClass31 = asyncQueryRunner30.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray32 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner26.fillStatementWithBean(preparedStatement27, (java.lang.Object) wildcardClass31, propertyDescriptorArray32);
        asyncQueryRunner19.fillStatement(preparedStatement22, parameterMetaData23, (java.lang.Object[]) propertyDescriptorArray32);
        asyncQueryRunner14.fillStatement(preparedStatement15, parameterMetaData16, (java.lang.Object[]) propertyDescriptorArray32);
        asyncQueryRunner10.fillStatement(preparedStatement11, parameterMetaData12, (java.lang.Object[]) propertyDescriptorArray32);
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner3.fillStatementWithBean(preparedStatement5, obj6, propertyDescriptorArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(dataSource21);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(propertyDescriptorArray32);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray32, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test129");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner1 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0);
        java.sql.PreparedStatement preparedStatement2 = null;
        java.sql.ParameterMetaData parameterMetaData3 = null;
        javax.sql.DataSource dataSource4 = null;
        java.util.concurrent.ExecutorService executorService5 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner6 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource4, executorService5);
        boolean boolean7 = asyncQueryRunner6.isPmdKnownBroken();
        javax.sql.DataSource dataSource8 = asyncQueryRunner6.getDataSource();
        java.sql.PreparedStatement preparedStatement9 = null;
        java.sql.ParameterMetaData parameterMetaData10 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService12);
        java.sql.PreparedStatement preparedStatement14 = null;
        java.util.concurrent.ExecutorService executorService16 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner17 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService16);
        java.lang.Class<?> wildcardClass18 = asyncQueryRunner17.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner13.fillStatementWithBean(preparedStatement14, (java.lang.Object) wildcardClass18, propertyDescriptorArray19);
        asyncQueryRunner6.fillStatement(preparedStatement9, parameterMetaData10, (java.lang.Object[]) propertyDescriptorArray19);
        asyncQueryRunner1.fillStatement(preparedStatement2, parameterMetaData3, (java.lang.Object[]) propertyDescriptorArray19);
        java.sql.PreparedStatement preparedStatement23 = null;
        javax.sql.DataSource dataSource25 = null;
        java.util.concurrent.ExecutorService executorService27 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner28 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource25, false, executorService27);
        boolean boolean29 = asyncQueryRunner28.isPmdKnownBroken();
        java.util.concurrent.ExecutorService executorService31 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner32 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService31);
        boolean boolean33 = asyncQueryRunner32.isPmdKnownBroken();
        java.util.concurrent.ExecutorService executorService34 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner35 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService34);
        java.lang.Class<?> wildcardClass36 = asyncQueryRunner35.getClass();
        java.lang.Object[] objArray37 = new java.lang.Object[] { 0, boolean29, asyncQueryRunner32, wildcardClass36 };
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner1.fillStatement(preparedStatement23, objArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray19, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(objArray37);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test130");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.Connection connection4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture6 = asyncQueryRunner2.update(connection4, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test131");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        java.util.concurrent.ExecutorService executorService4 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner5 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService4);
        java.sql.PreparedStatement preparedStatement6 = null;
        java.sql.ParameterMetaData parameterMetaData7 = null;
        javax.sql.DataSource dataSource8 = null;
        java.util.concurrent.ExecutorService executorService9 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner10 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource8, executorService9);
        boolean boolean11 = asyncQueryRunner10.isPmdKnownBroken();
        javax.sql.DataSource dataSource12 = asyncQueryRunner10.getDataSource();
        java.sql.PreparedStatement preparedStatement13 = null;
        java.sql.ParameterMetaData parameterMetaData14 = null;
        java.util.concurrent.ExecutorService executorService16 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner17 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService16);
        java.sql.PreparedStatement preparedStatement18 = null;
        java.util.concurrent.ExecutorService executorService20 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner21 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService20);
        java.lang.Class<?> wildcardClass22 = asyncQueryRunner21.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner17.fillStatementWithBean(preparedStatement18, (java.lang.Object) wildcardClass22, propertyDescriptorArray23);
        asyncQueryRunner10.fillStatement(preparedStatement13, parameterMetaData14, (java.lang.Object[]) propertyDescriptorArray23);
        asyncQueryRunner5.fillStatement(preparedStatement6, parameterMetaData7, (java.lang.Object[]) propertyDescriptorArray23);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture27 = asyncQueryRunner2.update("hi!", (java.lang.Object[]) propertyDescriptorArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(propertyDescriptorArray23);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray23, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test132");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner1 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0);
        java.sql.PreparedStatement preparedStatement2 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner1.fillStatementWithBean(preparedStatement2, (java.lang.Object) (short) 0, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Couldn't find bean property: class java.lang.Short ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "", "", "hi!", "" });
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test133");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner1 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0);
        java.sql.PreparedStatement preparedStatement2 = null;
        java.sql.ParameterMetaData parameterMetaData3 = null;
        javax.sql.DataSource dataSource4 = null;
        java.util.concurrent.ExecutorService executorService5 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner6 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource4, executorService5);
        boolean boolean7 = asyncQueryRunner6.isPmdKnownBroken();
        javax.sql.DataSource dataSource8 = asyncQueryRunner6.getDataSource();
        java.sql.PreparedStatement preparedStatement9 = null;
        java.sql.ParameterMetaData parameterMetaData10 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService12);
        java.sql.PreparedStatement preparedStatement14 = null;
        java.util.concurrent.ExecutorService executorService16 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner17 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService16);
        java.lang.Class<?> wildcardClass18 = asyncQueryRunner17.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner13.fillStatementWithBean(preparedStatement14, (java.lang.Object) wildcardClass18, propertyDescriptorArray19);
        asyncQueryRunner6.fillStatement(preparedStatement9, parameterMetaData10, (java.lang.Object[]) propertyDescriptorArray19);
        asyncQueryRunner1.fillStatement(preparedStatement2, parameterMetaData3, (java.lang.Object[]) propertyDescriptorArray19);
        boolean boolean23 = asyncQueryRunner1.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.sql.ParameterMetaData parameterMetaData25 = asyncQueryRunner1.getParameterMetaData(preparedStatement24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray19, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test134");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner8 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService7);
        boolean boolean9 = asyncQueryRunner8.isPmdKnownBroken();
        java.lang.Class<?> wildcardClass10 = asyncQueryRunner8.getClass();
        java.lang.String[] strArray16 = new java.lang.String[] { "", "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner2.fillStatementWithBean(preparedStatement5, (java.lang.Object) wildcardClass10, strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Couldn't find bean property: class java.lang.Class ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "", "", "", "hi!" });
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test135");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement4 = null;
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner7 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService6);
        boolean boolean8 = asyncQueryRunner7.isPmdKnownBroken();
        java.lang.String[] strArray9 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner2.fillStatementWithBean(preparedStatement4, (java.lang.Object) boolean8, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test136");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        java.util.concurrent.ExecutorService executorService5 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner6 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService5);
        java.sql.PreparedStatement preparedStatement7 = null;
        java.util.concurrent.ExecutorService executorService9 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner10 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService9);
        java.lang.Class<?> wildcardClass11 = asyncQueryRunner10.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray12 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner6.fillStatementWithBean(preparedStatement7, (java.lang.Object) wildcardClass11, propertyDescriptorArray12);
        java.sql.PreparedStatement preparedStatement14 = null;
        java.sql.ParameterMetaData parameterMetaData15 = asyncQueryRunner6.getParameterMetaData(preparedStatement14);
        java.util.concurrent.ExecutorService executorService17 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner18 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner19 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService17, queryRunner18);
        boolean boolean20 = asyncQueryRunner19.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement21 = null;
        java.sql.ParameterMetaData parameterMetaData22 = null;
        java.util.concurrent.ExecutorService executorService23 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner24 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService23);
        java.sql.PreparedStatement preparedStatement25 = null;
        java.sql.ParameterMetaData parameterMetaData26 = null;
        javax.sql.DataSource dataSource27 = null;
        java.util.concurrent.ExecutorService executorService28 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner29 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource27, executorService28);
        boolean boolean30 = asyncQueryRunner29.isPmdKnownBroken();
        javax.sql.DataSource dataSource31 = asyncQueryRunner29.getDataSource();
        java.sql.PreparedStatement preparedStatement32 = null;
        java.sql.ParameterMetaData parameterMetaData33 = null;
        java.util.concurrent.ExecutorService executorService35 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner36 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService35);
        java.sql.PreparedStatement preparedStatement37 = null;
        java.util.concurrent.ExecutorService executorService39 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner40 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService39);
        java.lang.Class<?> wildcardClass41 = asyncQueryRunner40.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray42 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner36.fillStatementWithBean(preparedStatement37, (java.lang.Object) wildcardClass41, propertyDescriptorArray42);
        asyncQueryRunner29.fillStatement(preparedStatement32, parameterMetaData33, (java.lang.Object[]) propertyDescriptorArray42);
        asyncQueryRunner24.fillStatement(preparedStatement25, parameterMetaData26, (java.lang.Object[]) propertyDescriptorArray42);
        asyncQueryRunner19.fillStatement(preparedStatement21, parameterMetaData22, (java.lang.Object[]) propertyDescriptorArray42);
        java.lang.Object[] objArray47 = new java.lang.Object[] { parameterMetaData15, 0.0f, preparedStatement21 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture48 = asyncQueryRunner2.update("hi!", objArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(propertyDescriptorArray12);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray12, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(parameterMetaData15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(dataSource31);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(propertyDescriptorArray42);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray42, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[null, 0.0, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[null, 0.0, null]");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test137");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.sql.ParameterMetaData parameterMetaData6 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService12);
        java.lang.Class<?> wildcardClass14 = asyncQueryRunner13.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner9.fillStatementWithBean(preparedStatement10, (java.lang.Object) wildcardClass14, propertyDescriptorArray15);
        asyncQueryRunner2.fillStatement(preparedStatement5, parameterMetaData6, (java.lang.Object[]) propertyDescriptorArray15);
        java.sql.Connection connection18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture20 = asyncQueryRunner2.update(connection18, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray15, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test138");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = asyncQueryRunner3.getParameterMetaData(preparedStatement4);
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1.0f };
        java.lang.Object[][] objArray9 = new java.lang.Object[][] { objArray8 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<int[]> intArrayFuture10 = asyncQueryRunner3.batch("hi!", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameterMetaData5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1.0]");
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test139");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner1 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0);
        java.sql.PreparedStatement preparedStatement2 = null;
        java.sql.ParameterMetaData parameterMetaData3 = null;
        javax.sql.DataSource dataSource4 = null;
        java.util.concurrent.ExecutorService executorService5 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner6 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource4, executorService5);
        boolean boolean7 = asyncQueryRunner6.isPmdKnownBroken();
        javax.sql.DataSource dataSource8 = asyncQueryRunner6.getDataSource();
        java.sql.PreparedStatement preparedStatement9 = null;
        java.sql.ParameterMetaData parameterMetaData10 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService12);
        java.sql.PreparedStatement preparedStatement14 = null;
        java.util.concurrent.ExecutorService executorService16 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner17 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService16);
        java.lang.Class<?> wildcardClass18 = asyncQueryRunner17.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner13.fillStatementWithBean(preparedStatement14, (java.lang.Object) wildcardClass18, propertyDescriptorArray19);
        asyncQueryRunner6.fillStatement(preparedStatement9, parameterMetaData10, (java.lang.Object[]) propertyDescriptorArray19);
        asyncQueryRunner1.fillStatement(preparedStatement2, parameterMetaData3, (java.lang.Object[]) propertyDescriptorArray19);
        java.util.concurrent.ExecutorService executorService24 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner25 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner26 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService24, queryRunner25);
        boolean boolean27 = asyncQueryRunner26.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement28 = null;
        java.sql.ParameterMetaData parameterMetaData29 = null;
        java.util.concurrent.ExecutorService executorService30 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner31 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService30);
        java.sql.PreparedStatement preparedStatement32 = null;
        java.sql.ParameterMetaData parameterMetaData33 = null;
        javax.sql.DataSource dataSource34 = null;
        java.util.concurrent.ExecutorService executorService35 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner36 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource34, executorService35);
        boolean boolean37 = asyncQueryRunner36.isPmdKnownBroken();
        javax.sql.DataSource dataSource38 = asyncQueryRunner36.getDataSource();
        java.sql.PreparedStatement preparedStatement39 = null;
        java.sql.ParameterMetaData parameterMetaData40 = null;
        java.util.concurrent.ExecutorService executorService42 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner43 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService42);
        java.sql.PreparedStatement preparedStatement44 = null;
        java.util.concurrent.ExecutorService executorService46 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner47 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService46);
        java.lang.Class<?> wildcardClass48 = asyncQueryRunner47.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray49 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner43.fillStatementWithBean(preparedStatement44, (java.lang.Object) wildcardClass48, propertyDescriptorArray49);
        asyncQueryRunner36.fillStatement(preparedStatement39, parameterMetaData40, (java.lang.Object[]) propertyDescriptorArray49);
        asyncQueryRunner31.fillStatement(preparedStatement32, parameterMetaData33, (java.lang.Object[]) propertyDescriptorArray49);
        asyncQueryRunner26.fillStatement(preparedStatement28, parameterMetaData29, (java.lang.Object[]) propertyDescriptorArray49);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture54 = asyncQueryRunner1.update("hi!", (java.lang.Object[]) propertyDescriptorArray49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray19, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(dataSource38);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(propertyDescriptorArray49);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray49, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test140");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.sql.ParameterMetaData parameterMetaData6 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService12);
        java.lang.Class<?> wildcardClass14 = asyncQueryRunner13.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner9.fillStatementWithBean(preparedStatement10, (java.lang.Object) wildcardClass14, propertyDescriptorArray15);
        asyncQueryRunner2.fillStatement(preparedStatement5, parameterMetaData6, (java.lang.Object[]) propertyDescriptorArray15);
        java.sql.PreparedStatement preparedStatement18 = null;
        java.sql.ParameterMetaData parameterMetaData19 = null;
        java.util.concurrent.ExecutorService executorService21 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner22 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService21);
        java.sql.PreparedStatement preparedStatement23 = null;
        java.util.concurrent.ExecutorService executorService25 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner26 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService25);
        java.lang.Class<?> wildcardClass27 = asyncQueryRunner26.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner22.fillStatementWithBean(preparedStatement23, (java.lang.Object) wildcardClass27, propertyDescriptorArray28);
        asyncQueryRunner2.fillStatement(preparedStatement18, parameterMetaData19, (java.lang.Object[]) propertyDescriptorArray28);
        javax.sql.DataSource dataSource32 = null;
        java.util.concurrent.ExecutorService executorService33 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner34 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource32, executorService33);
        boolean boolean35 = asyncQueryRunner34.isPmdKnownBroken();
        javax.sql.DataSource dataSource36 = asyncQueryRunner34.getDataSource();
        java.sql.PreparedStatement preparedStatement37 = null;
        java.sql.ParameterMetaData parameterMetaData38 = null;
        java.util.concurrent.ExecutorService executorService40 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner41 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService40);
        java.sql.PreparedStatement preparedStatement42 = null;
        java.util.concurrent.ExecutorService executorService44 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner45 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService44);
        java.lang.Class<?> wildcardClass46 = asyncQueryRunner45.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray47 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner41.fillStatementWithBean(preparedStatement42, (java.lang.Object) wildcardClass46, propertyDescriptorArray47);
        asyncQueryRunner34.fillStatement(preparedStatement37, parameterMetaData38, (java.lang.Object[]) propertyDescriptorArray47);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture50 = asyncQueryRunner2.update("", (java.lang.Object[]) propertyDescriptorArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray15, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(propertyDescriptorArray28);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray28, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(dataSource36);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(propertyDescriptorArray47);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray47, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test141");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService1);
        java.sql.Connection connection3 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture7 = asyncQueryRunner2.update(connection3, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1]");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test142");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, false, executorService2);
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = null;
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner7 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService6);
        java.sql.PreparedStatement preparedStatement8 = null;
        java.sql.ParameterMetaData parameterMetaData9 = null;
        javax.sql.DataSource dataSource10 = null;
        java.util.concurrent.ExecutorService executorService11 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner12 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource10, executorService11);
        boolean boolean13 = asyncQueryRunner12.isPmdKnownBroken();
        javax.sql.DataSource dataSource14 = asyncQueryRunner12.getDataSource();
        java.sql.PreparedStatement preparedStatement15 = null;
        java.sql.ParameterMetaData parameterMetaData16 = null;
        java.util.concurrent.ExecutorService executorService18 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner19 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService18);
        java.sql.PreparedStatement preparedStatement20 = null;
        java.util.concurrent.ExecutorService executorService22 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner23 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService22);
        java.lang.Class<?> wildcardClass24 = asyncQueryRunner23.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray25 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner19.fillStatementWithBean(preparedStatement20, (java.lang.Object) wildcardClass24, propertyDescriptorArray25);
        asyncQueryRunner12.fillStatement(preparedStatement15, parameterMetaData16, (java.lang.Object[]) propertyDescriptorArray25);
        asyncQueryRunner7.fillStatement(preparedStatement8, parameterMetaData9, (java.lang.Object[]) propertyDescriptorArray25);
        asyncQueryRunner3.fillStatement(preparedStatement4, parameterMetaData5, (java.lang.Object[]) propertyDescriptorArray25);
        java.util.concurrent.ExecutorService executorService32 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner33 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService32);
        java.util.concurrent.ExecutorService executorService35 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner36 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService35);
        java.sql.PreparedStatement preparedStatement37 = null;
        java.util.concurrent.ExecutorService executorService39 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner40 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService39);
        java.lang.Class<?> wildcardClass41 = asyncQueryRunner40.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray42 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner36.fillStatementWithBean(preparedStatement37, (java.lang.Object) wildcardClass41, propertyDescriptorArray42);
        java.sql.PreparedStatement preparedStatement44 = null;
        java.sql.ParameterMetaData parameterMetaData45 = asyncQueryRunner36.getParameterMetaData(preparedStatement44);
        java.lang.Object[] objArray47 = new java.lang.Object[] { executorService32, parameterMetaData45, 100 };
        java.util.concurrent.ExecutorService executorService49 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner50 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService49);
        java.util.concurrent.ExecutorService executorService52 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner53 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService52);
        java.sql.PreparedStatement preparedStatement54 = null;
        java.util.concurrent.ExecutorService executorService56 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner57 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService56);
        java.lang.Class<?> wildcardClass58 = asyncQueryRunner57.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray59 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner53.fillStatementWithBean(preparedStatement54, (java.lang.Object) wildcardClass58, propertyDescriptorArray59);
        java.sql.PreparedStatement preparedStatement61 = null;
        java.sql.ParameterMetaData parameterMetaData62 = asyncQueryRunner53.getParameterMetaData(preparedStatement61);
        java.lang.Object[] objArray64 = new java.lang.Object[] { executorService49, parameterMetaData62, 100 };
        java.lang.Object[][] objArray65 = new java.lang.Object[][] { objArray47, objArray64 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<int[]> intArrayFuture66 = asyncQueryRunner3.batch("", objArray65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(propertyDescriptorArray25);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray25, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(propertyDescriptorArray42);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray42, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(parameterMetaData45);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[null, null, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[null, null, 100]");
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(propertyDescriptorArray59);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray59, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(parameterMetaData62);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[null, null, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[null, null, 100]");
        org.junit.Assert.assertNotNull(objArray65);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test143");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, false, executorService2);
        java.sql.PreparedStatement preparedStatement4 = null;
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner7 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService6);
        java.sql.PreparedStatement preparedStatement8 = null;
        java.util.concurrent.ExecutorService executorService10 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner11 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService10);
        java.lang.Class<?> wildcardClass12 = asyncQueryRunner11.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner7.fillStatementWithBean(preparedStatement8, (java.lang.Object) wildcardClass12, propertyDescriptorArray13);
        java.util.concurrent.ExecutorService executorService15 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner16 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner17 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService15, queryRunner16);
        boolean boolean18 = asyncQueryRunner17.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement19 = null;
        java.sql.ParameterMetaData parameterMetaData20 = null;
        java.util.concurrent.ExecutorService executorService21 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner22 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService21);
        java.sql.PreparedStatement preparedStatement23 = null;
        java.sql.ParameterMetaData parameterMetaData24 = null;
        javax.sql.DataSource dataSource25 = null;
        java.util.concurrent.ExecutorService executorService26 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner27 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource25, executorService26);
        boolean boolean28 = asyncQueryRunner27.isPmdKnownBroken();
        javax.sql.DataSource dataSource29 = asyncQueryRunner27.getDataSource();
        java.sql.PreparedStatement preparedStatement30 = null;
        java.sql.ParameterMetaData parameterMetaData31 = null;
        java.util.concurrent.ExecutorService executorService33 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner34 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService33);
        java.sql.PreparedStatement preparedStatement35 = null;
        java.util.concurrent.ExecutorService executorService37 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner38 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService37);
        java.lang.Class<?> wildcardClass39 = asyncQueryRunner38.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray40 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner34.fillStatementWithBean(preparedStatement35, (java.lang.Object) wildcardClass39, propertyDescriptorArray40);
        asyncQueryRunner27.fillStatement(preparedStatement30, parameterMetaData31, (java.lang.Object[]) propertyDescriptorArray40);
        asyncQueryRunner22.fillStatement(preparedStatement23, parameterMetaData24, (java.lang.Object[]) propertyDescriptorArray40);
        asyncQueryRunner17.fillStatement(preparedStatement19, parameterMetaData20, (java.lang.Object[]) propertyDescriptorArray40);
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner3.fillStatementWithBean(preparedStatement4, (java.lang.Object) propertyDescriptorArray13, propertyDescriptorArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(propertyDescriptorArray13);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray13, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(dataSource29);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(propertyDescriptorArray40);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray40, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test144");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        java.sql.Connection connection4 = null;
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner7 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService6);
        java.sql.PreparedStatement preparedStatement8 = null;
        java.sql.ParameterMetaData parameterMetaData9 = null;
        javax.sql.DataSource dataSource10 = null;
        java.util.concurrent.ExecutorService executorService11 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner12 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource10, executorService11);
        boolean boolean13 = asyncQueryRunner12.isPmdKnownBroken();
        javax.sql.DataSource dataSource14 = asyncQueryRunner12.getDataSource();
        java.sql.PreparedStatement preparedStatement15 = null;
        java.sql.ParameterMetaData parameterMetaData16 = null;
        java.util.concurrent.ExecutorService executorService18 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner19 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService18);
        java.sql.PreparedStatement preparedStatement20 = null;
        java.util.concurrent.ExecutorService executorService22 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner23 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService22);
        java.lang.Class<?> wildcardClass24 = asyncQueryRunner23.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray25 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner19.fillStatementWithBean(preparedStatement20, (java.lang.Object) wildcardClass24, propertyDescriptorArray25);
        asyncQueryRunner12.fillStatement(preparedStatement15, parameterMetaData16, (java.lang.Object[]) propertyDescriptorArray25);
        asyncQueryRunner7.fillStatement(preparedStatement8, parameterMetaData9, (java.lang.Object[]) propertyDescriptorArray25);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture29 = asyncQueryRunner3.update(connection4, "hi!", (java.lang.Object) propertyDescriptorArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(propertyDescriptorArray25);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray25, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test145");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement4 = null;
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner7 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService6);
        java.sql.PreparedStatement preparedStatement8 = null;
        java.util.concurrent.ExecutorService executorService10 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner11 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService10);
        java.lang.Class<?> wildcardClass12 = asyncQueryRunner11.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner7.fillStatementWithBean(preparedStatement8, (java.lang.Object) wildcardClass12, propertyDescriptorArray13);
        javax.sql.DataSource dataSource15 = null;
        java.util.concurrent.ExecutorService executorService17 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner18 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource15, false, executorService17);
        java.sql.PreparedStatement preparedStatement19 = null;
        java.sql.ParameterMetaData parameterMetaData20 = null;
        java.util.concurrent.ExecutorService executorService21 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner22 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService21);
        java.sql.PreparedStatement preparedStatement23 = null;
        java.sql.ParameterMetaData parameterMetaData24 = null;
        javax.sql.DataSource dataSource25 = null;
        java.util.concurrent.ExecutorService executorService26 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner27 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource25, executorService26);
        boolean boolean28 = asyncQueryRunner27.isPmdKnownBroken();
        javax.sql.DataSource dataSource29 = asyncQueryRunner27.getDataSource();
        java.sql.PreparedStatement preparedStatement30 = null;
        java.sql.ParameterMetaData parameterMetaData31 = null;
        java.util.concurrent.ExecutorService executorService33 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner34 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService33);
        java.sql.PreparedStatement preparedStatement35 = null;
        java.util.concurrent.ExecutorService executorService37 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner38 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService37);
        java.lang.Class<?> wildcardClass39 = asyncQueryRunner38.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray40 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner34.fillStatementWithBean(preparedStatement35, (java.lang.Object) wildcardClass39, propertyDescriptorArray40);
        asyncQueryRunner27.fillStatement(preparedStatement30, parameterMetaData31, (java.lang.Object[]) propertyDescriptorArray40);
        asyncQueryRunner22.fillStatement(preparedStatement23, parameterMetaData24, (java.lang.Object[]) propertyDescriptorArray40);
        asyncQueryRunner18.fillStatement(preparedStatement19, parameterMetaData20, (java.lang.Object[]) propertyDescriptorArray40);
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner2.fillStatementWithBean(preparedStatement4, (java.lang.Object) wildcardClass12, propertyDescriptorArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(propertyDescriptorArray13);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray13, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(dataSource29);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(propertyDescriptorArray40);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray40, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test146");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        java.sql.PreparedStatement preparedStatement3 = null;
        java.util.concurrent.ExecutorService executorService5 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner6 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService5);
        java.lang.Class<?> wildcardClass7 = asyncQueryRunner6.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner2.fillStatementWithBean(preparedStatement3, (java.lang.Object) wildcardClass7, propertyDescriptorArray8);
        java.lang.Class<?> wildcardClass10 = propertyDescriptorArray8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray8, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test147");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.Connection connection4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture6 = asyncQueryRunner2.update(connection4, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test148");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = null;
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner7 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService6);
        java.sql.PreparedStatement preparedStatement8 = null;
        java.sql.ParameterMetaData parameterMetaData9 = null;
        javax.sql.DataSource dataSource10 = null;
        java.util.concurrent.ExecutorService executorService11 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner12 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource10, executorService11);
        boolean boolean13 = asyncQueryRunner12.isPmdKnownBroken();
        javax.sql.DataSource dataSource14 = asyncQueryRunner12.getDataSource();
        java.sql.PreparedStatement preparedStatement15 = null;
        java.sql.ParameterMetaData parameterMetaData16 = null;
        java.util.concurrent.ExecutorService executorService18 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner19 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService18);
        java.sql.PreparedStatement preparedStatement20 = null;
        java.util.concurrent.ExecutorService executorService22 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner23 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService22);
        java.lang.Class<?> wildcardClass24 = asyncQueryRunner23.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray25 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner19.fillStatementWithBean(preparedStatement20, (java.lang.Object) wildcardClass24, propertyDescriptorArray25);
        asyncQueryRunner12.fillStatement(preparedStatement15, parameterMetaData16, (java.lang.Object[]) propertyDescriptorArray25);
        asyncQueryRunner7.fillStatement(preparedStatement8, parameterMetaData9, (java.lang.Object[]) propertyDescriptorArray25);
        asyncQueryRunner2.fillStatement(preparedStatement4, parameterMetaData5, (java.lang.Object[]) propertyDescriptorArray25);
        java.sql.PreparedStatement preparedStatement30 = null;
        java.lang.String[] strArray37 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner2.fillStatementWithBean(preparedStatement30, (java.lang.Object) 100.0f, strArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Couldn't find bean property: class java.lang.Float ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(propertyDescriptorArray25);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray25, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "", "", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test149");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner1 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0);
        java.sql.PreparedStatement preparedStatement2 = null;
        java.sql.ParameterMetaData parameterMetaData3 = null;
        javax.sql.DataSource dataSource4 = null;
        java.util.concurrent.ExecutorService executorService5 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner6 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource4, executorService5);
        boolean boolean7 = asyncQueryRunner6.isPmdKnownBroken();
        javax.sql.DataSource dataSource8 = asyncQueryRunner6.getDataSource();
        java.sql.PreparedStatement preparedStatement9 = null;
        java.sql.ParameterMetaData parameterMetaData10 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService12);
        java.sql.PreparedStatement preparedStatement14 = null;
        java.util.concurrent.ExecutorService executorService16 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner17 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService16);
        java.lang.Class<?> wildcardClass18 = asyncQueryRunner17.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner13.fillStatementWithBean(preparedStatement14, (java.lang.Object) wildcardClass18, propertyDescriptorArray19);
        asyncQueryRunner6.fillStatement(preparedStatement9, parameterMetaData10, (java.lang.Object[]) propertyDescriptorArray19);
        asyncQueryRunner1.fillStatement(preparedStatement2, parameterMetaData3, (java.lang.Object[]) propertyDescriptorArray19);
        java.sql.PreparedStatement preparedStatement23 = null;
        javax.sql.DataSource dataSource24 = null;
        java.util.concurrent.ExecutorService executorService25 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner26 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource24, executorService25);
        boolean boolean27 = asyncQueryRunner26.isPmdKnownBroken();
        javax.sql.DataSource dataSource28 = asyncQueryRunner26.getDataSource();
        java.sql.PreparedStatement preparedStatement29 = null;
        java.sql.ParameterMetaData parameterMetaData30 = null;
        java.util.concurrent.ExecutorService executorService32 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner33 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService32);
        java.sql.PreparedStatement preparedStatement34 = null;
        java.util.concurrent.ExecutorService executorService36 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner37 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService36);
        java.lang.Class<?> wildcardClass38 = asyncQueryRunner37.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray39 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner33.fillStatementWithBean(preparedStatement34, (java.lang.Object) wildcardClass38, propertyDescriptorArray39);
        asyncQueryRunner26.fillStatement(preparedStatement29, parameterMetaData30, (java.lang.Object[]) propertyDescriptorArray39);
        java.sql.PreparedStatement preparedStatement42 = null;
        java.sql.ParameterMetaData parameterMetaData43 = null;
        java.util.concurrent.ExecutorService executorService45 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner46 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService45);
        java.sql.PreparedStatement preparedStatement47 = null;
        java.util.concurrent.ExecutorService executorService49 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner50 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService49);
        java.lang.Class<?> wildcardClass51 = asyncQueryRunner50.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray52 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner46.fillStatementWithBean(preparedStatement47, (java.lang.Object) wildcardClass51, propertyDescriptorArray52);
        asyncQueryRunner26.fillStatement(preparedStatement42, parameterMetaData43, (java.lang.Object[]) propertyDescriptorArray52);
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner1.fillStatement(preparedStatement23, (java.lang.Object[]) propertyDescriptorArray52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray19, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(dataSource28);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(propertyDescriptorArray39);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray39, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(propertyDescriptorArray52);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray52, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test150");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, false, executorService2);
        java.sql.Connection connection4 = null;
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner7 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService6);
        java.sql.PreparedStatement preparedStatement8 = null;
        java.sql.ParameterMetaData parameterMetaData9 = null;
        javax.sql.DataSource dataSource10 = null;
        java.util.concurrent.ExecutorService executorService11 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner12 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource10, executorService11);
        boolean boolean13 = asyncQueryRunner12.isPmdKnownBroken();
        javax.sql.DataSource dataSource14 = asyncQueryRunner12.getDataSource();
        java.sql.PreparedStatement preparedStatement15 = null;
        java.sql.ParameterMetaData parameterMetaData16 = null;
        java.util.concurrent.ExecutorService executorService18 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner19 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService18);
        java.sql.PreparedStatement preparedStatement20 = null;
        java.util.concurrent.ExecutorService executorService22 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner23 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService22);
        java.lang.Class<?> wildcardClass24 = asyncQueryRunner23.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray25 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner19.fillStatementWithBean(preparedStatement20, (java.lang.Object) wildcardClass24, propertyDescriptorArray25);
        asyncQueryRunner12.fillStatement(preparedStatement15, parameterMetaData16, (java.lang.Object[]) propertyDescriptorArray25);
        asyncQueryRunner7.fillStatement(preparedStatement8, parameterMetaData9, (java.lang.Object[]) propertyDescriptorArray25);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture29 = asyncQueryRunner3.update(connection4, "", (java.lang.Object[]) propertyDescriptorArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(propertyDescriptorArray25);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray25, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test151");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        boolean boolean4 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement5 = null;
        javax.sql.DataSource dataSource6 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource6, false, executorService8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService12);
        java.sql.PreparedStatement preparedStatement14 = null;
        java.sql.ParameterMetaData parameterMetaData15 = null;
        javax.sql.DataSource dataSource16 = null;
        java.util.concurrent.ExecutorService executorService17 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner18 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource16, executorService17);
        boolean boolean19 = asyncQueryRunner18.isPmdKnownBroken();
        javax.sql.DataSource dataSource20 = asyncQueryRunner18.getDataSource();
        java.sql.PreparedStatement preparedStatement21 = null;
        java.sql.ParameterMetaData parameterMetaData22 = null;
        java.util.concurrent.ExecutorService executorService24 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner25 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService24);
        java.sql.PreparedStatement preparedStatement26 = null;
        java.util.concurrent.ExecutorService executorService28 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner29 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService28);
        java.lang.Class<?> wildcardClass30 = asyncQueryRunner29.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray31 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner25.fillStatementWithBean(preparedStatement26, (java.lang.Object) wildcardClass30, propertyDescriptorArray31);
        asyncQueryRunner18.fillStatement(preparedStatement21, parameterMetaData22, (java.lang.Object[]) propertyDescriptorArray31);
        asyncQueryRunner13.fillStatement(preparedStatement14, parameterMetaData15, (java.lang.Object[]) propertyDescriptorArray31);
        asyncQueryRunner9.fillStatement(preparedStatement10, parameterMetaData11, (java.lang.Object[]) propertyDescriptorArray31);
        java.lang.String[] strArray39 = new java.lang.String[] { "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner2.fillStatementWithBean(preparedStatement5, (java.lang.Object) parameterMetaData11, strArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"bean\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(propertyDescriptorArray31);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray31, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "", "", "" });
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test152");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        javax.sql.DataSource dataSource3 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement4 = null;
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner7 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService6);
        java.sql.PreparedStatement preparedStatement8 = null;
        java.util.concurrent.ExecutorService executorService10 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner11 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService10);
        java.lang.Class<?> wildcardClass12 = asyncQueryRunner11.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner7.fillStatementWithBean(preparedStatement8, (java.lang.Object) wildcardClass12, propertyDescriptorArray13);
        java.sql.PreparedStatement preparedStatement15 = null;
        java.sql.ParameterMetaData parameterMetaData16 = asyncQueryRunner7.getParameterMetaData(preparedStatement15);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner2.fillStatementWithBean(preparedStatement4, (java.lang.Object) preparedStatement15, strArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"bean\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(propertyDescriptorArray13);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray13, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(parameterMetaData16);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test153");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.Connection connection4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture6 = asyncQueryRunner2.update(connection4, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test154");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        java.sql.PreparedStatement preparedStatement3 = null;
        java.util.concurrent.ExecutorService executorService5 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner6 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService5);
        java.lang.Class<?> wildcardClass7 = asyncQueryRunner6.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner2.fillStatementWithBean(preparedStatement3, (java.lang.Object) wildcardClass7, propertyDescriptorArray8);
        java.lang.Object[] objArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture12 = asyncQueryRunner2.update("", objArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray8, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test155");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, false, executorService2);
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = null;
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner7 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService6);
        java.sql.PreparedStatement preparedStatement8 = null;
        java.sql.ParameterMetaData parameterMetaData9 = null;
        javax.sql.DataSource dataSource10 = null;
        java.util.concurrent.ExecutorService executorService11 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner12 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource10, executorService11);
        boolean boolean13 = asyncQueryRunner12.isPmdKnownBroken();
        javax.sql.DataSource dataSource14 = asyncQueryRunner12.getDataSource();
        java.sql.PreparedStatement preparedStatement15 = null;
        java.sql.ParameterMetaData parameterMetaData16 = null;
        java.util.concurrent.ExecutorService executorService18 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner19 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService18);
        java.sql.PreparedStatement preparedStatement20 = null;
        java.util.concurrent.ExecutorService executorService22 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner23 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService22);
        java.lang.Class<?> wildcardClass24 = asyncQueryRunner23.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray25 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner19.fillStatementWithBean(preparedStatement20, (java.lang.Object) wildcardClass24, propertyDescriptorArray25);
        asyncQueryRunner12.fillStatement(preparedStatement15, parameterMetaData16, (java.lang.Object[]) propertyDescriptorArray25);
        asyncQueryRunner7.fillStatement(preparedStatement8, parameterMetaData9, (java.lang.Object[]) propertyDescriptorArray25);
        asyncQueryRunner3.fillStatement(preparedStatement4, parameterMetaData5, (java.lang.Object[]) propertyDescriptorArray25);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture31 = asyncQueryRunner3.update("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(propertyDescriptorArray25);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray25, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test156");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, false, executorService2);
        java.util.concurrent.ExecutorService executorService5 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner6 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner7 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService5, queryRunner6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture8 = asyncQueryRunner3.update("hi!", (java.lang.Object) executorService5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test157");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, false, executorService2);
        java.sql.PreparedStatement preparedStatement4 = null;
        java.util.concurrent.ExecutorService executorService5 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner6 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService5);
        java.sql.PreparedStatement preparedStatement7 = null;
        java.sql.ParameterMetaData parameterMetaData8 = null;
        javax.sql.DataSource dataSource9 = null;
        java.util.concurrent.ExecutorService executorService10 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner11 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource9, executorService10);
        boolean boolean12 = asyncQueryRunner11.isPmdKnownBroken();
        javax.sql.DataSource dataSource13 = asyncQueryRunner11.getDataSource();
        java.sql.PreparedStatement preparedStatement14 = null;
        java.sql.ParameterMetaData parameterMetaData15 = null;
        java.util.concurrent.ExecutorService executorService17 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner18 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService17);
        java.sql.PreparedStatement preparedStatement19 = null;
        java.util.concurrent.ExecutorService executorService21 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner22 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService21);
        java.lang.Class<?> wildcardClass23 = asyncQueryRunner22.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray24 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner18.fillStatementWithBean(preparedStatement19, (java.lang.Object) wildcardClass23, propertyDescriptorArray24);
        asyncQueryRunner11.fillStatement(preparedStatement14, parameterMetaData15, (java.lang.Object[]) propertyDescriptorArray24);
        asyncQueryRunner6.fillStatement(preparedStatement7, parameterMetaData8, (java.lang.Object[]) propertyDescriptorArray24);
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner3.fillStatement(preparedStatement4, (java.lang.Object[]) propertyDescriptorArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(propertyDescriptorArray24);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray24, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test158");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner1 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0);
        java.util.concurrent.ExecutorService executorService3 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner4 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService3);
        java.sql.PreparedStatement preparedStatement5 = null;
        java.sql.ParameterMetaData parameterMetaData6 = null;
        javax.sql.DataSource dataSource7 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource7, executorService8);
        boolean boolean10 = asyncQueryRunner9.isPmdKnownBroken();
        javax.sql.DataSource dataSource11 = asyncQueryRunner9.getDataSource();
        java.sql.PreparedStatement preparedStatement12 = null;
        java.sql.ParameterMetaData parameterMetaData13 = null;
        java.util.concurrent.ExecutorService executorService15 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner16 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService15);
        java.sql.PreparedStatement preparedStatement17 = null;
        java.util.concurrent.ExecutorService executorService19 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner20 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService19);
        java.lang.Class<?> wildcardClass21 = asyncQueryRunner20.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner16.fillStatementWithBean(preparedStatement17, (java.lang.Object) wildcardClass21, propertyDescriptorArray22);
        asyncQueryRunner9.fillStatement(preparedStatement12, parameterMetaData13, (java.lang.Object[]) propertyDescriptorArray22);
        asyncQueryRunner4.fillStatement(preparedStatement5, parameterMetaData6, (java.lang.Object[]) propertyDescriptorArray22);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture26 = asyncQueryRunner1.update("hi!", (java.lang.Object[]) propertyDescriptorArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(propertyDescriptorArray22);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray22, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test159");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        asyncQueryRunner2.fillStatement(preparedStatement4, parameterMetaData5, objArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture9 = asyncQueryRunner2.update("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test160");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        asyncQueryRunner2.fillStatement(preparedStatement4, parameterMetaData5, objArray6);
        java.sql.Connection connection8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture10 = asyncQueryRunner2.update(connection8, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test161");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, false, executorService2);
        javax.sql.DataSource dataSource4 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner8 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService7);
        boolean boolean9 = asyncQueryRunner8.isPmdKnownBroken();
        boolean boolean10 = asyncQueryRunner8.isPmdKnownBroken();
        java.util.concurrent.ExecutorService executorService11 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner12 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService11);
        java.sql.PreparedStatement preparedStatement13 = null;
        java.sql.ParameterMetaData parameterMetaData14 = null;
        javax.sql.DataSource dataSource15 = null;
        java.util.concurrent.ExecutorService executorService16 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner17 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource15, executorService16);
        boolean boolean18 = asyncQueryRunner17.isPmdKnownBroken();
        javax.sql.DataSource dataSource19 = asyncQueryRunner17.getDataSource();
        java.sql.PreparedStatement preparedStatement20 = null;
        java.sql.ParameterMetaData parameterMetaData21 = null;
        java.util.concurrent.ExecutorService executorService23 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner24 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService23);
        java.sql.PreparedStatement preparedStatement25 = null;
        java.util.concurrent.ExecutorService executorService27 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner28 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService27);
        java.lang.Class<?> wildcardClass29 = asyncQueryRunner28.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray30 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner24.fillStatementWithBean(preparedStatement25, (java.lang.Object) wildcardClass29, propertyDescriptorArray30);
        asyncQueryRunner17.fillStatement(preparedStatement20, parameterMetaData21, (java.lang.Object[]) propertyDescriptorArray30);
        asyncQueryRunner12.fillStatement(preparedStatement13, parameterMetaData14, (java.lang.Object[]) propertyDescriptorArray30);
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner3.fillStatementWithBean(preparedStatement5, (java.lang.Object) asyncQueryRunner8, propertyDescriptorArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(propertyDescriptorArray30);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray30, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test162");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        javax.sql.DataSource dataSource3 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = asyncQueryRunner2.getParameterMetaData(preparedStatement4);
        java.sql.Connection connection6 = null;
        javax.sql.DataSource dataSource8 = null;
        java.util.concurrent.ExecutorService executorService9 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner10 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource8, executorService9);
        boolean boolean11 = asyncQueryRunner10.isPmdKnownBroken();
        javax.sql.DataSource dataSource12 = asyncQueryRunner10.getDataSource();
        java.sql.PreparedStatement preparedStatement13 = null;
        java.sql.ParameterMetaData parameterMetaData14 = null;
        java.util.concurrent.ExecutorService executorService16 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner17 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService16);
        java.sql.PreparedStatement preparedStatement18 = null;
        java.util.concurrent.ExecutorService executorService20 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner21 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService20);
        java.lang.Class<?> wildcardClass22 = asyncQueryRunner21.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner17.fillStatementWithBean(preparedStatement18, (java.lang.Object) wildcardClass22, propertyDescriptorArray23);
        asyncQueryRunner10.fillStatement(preparedStatement13, parameterMetaData14, (java.lang.Object[]) propertyDescriptorArray23);
        java.sql.PreparedStatement preparedStatement26 = null;
        java.sql.ParameterMetaData parameterMetaData27 = null;
        java.util.concurrent.ExecutorService executorService29 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner30 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService29);
        java.sql.PreparedStatement preparedStatement31 = null;
        java.util.concurrent.ExecutorService executorService33 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner34 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService33);
        java.lang.Class<?> wildcardClass35 = asyncQueryRunner34.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray36 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner30.fillStatementWithBean(preparedStatement31, (java.lang.Object) wildcardClass35, propertyDescriptorArray36);
        asyncQueryRunner10.fillStatement(preparedStatement26, parameterMetaData27, (java.lang.Object[]) propertyDescriptorArray36);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture39 = asyncQueryRunner2.update(connection6, "", (java.lang.Object) preparedStatement26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertNull(parameterMetaData5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(propertyDescriptorArray23);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray23, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(propertyDescriptorArray36);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray36, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test163");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture6 = asyncQueryRunner2.update("", (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test164");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        java.util.concurrent.ExecutorService executorService4 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner5 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner6 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService4, queryRunner5);
        boolean boolean7 = asyncQueryRunner6.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement8 = null;
        java.sql.ParameterMetaData parameterMetaData9 = null;
        java.util.concurrent.ExecutorService executorService10 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner11 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService10);
        java.sql.PreparedStatement preparedStatement12 = null;
        java.sql.ParameterMetaData parameterMetaData13 = null;
        javax.sql.DataSource dataSource14 = null;
        java.util.concurrent.ExecutorService executorService15 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner16 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource14, executorService15);
        boolean boolean17 = asyncQueryRunner16.isPmdKnownBroken();
        javax.sql.DataSource dataSource18 = asyncQueryRunner16.getDataSource();
        java.sql.PreparedStatement preparedStatement19 = null;
        java.sql.ParameterMetaData parameterMetaData20 = null;
        java.util.concurrent.ExecutorService executorService22 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner23 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService22);
        java.sql.PreparedStatement preparedStatement24 = null;
        java.util.concurrent.ExecutorService executorService26 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner27 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService26);
        java.lang.Class<?> wildcardClass28 = asyncQueryRunner27.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray29 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner23.fillStatementWithBean(preparedStatement24, (java.lang.Object) wildcardClass28, propertyDescriptorArray29);
        asyncQueryRunner16.fillStatement(preparedStatement19, parameterMetaData20, (java.lang.Object[]) propertyDescriptorArray29);
        asyncQueryRunner11.fillStatement(preparedStatement12, parameterMetaData13, (java.lang.Object[]) propertyDescriptorArray29);
        asyncQueryRunner6.fillStatement(preparedStatement8, parameterMetaData9, (java.lang.Object[]) propertyDescriptorArray29);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture34 = asyncQueryRunner2.update("hi!", (java.lang.Object[]) propertyDescriptorArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(propertyDescriptorArray29);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray29, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test165");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        java.sql.PreparedStatement preparedStatement3 = null;
        java.util.concurrent.ExecutorService executorService5 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner6 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService5);
        java.lang.Class<?> wildcardClass7 = asyncQueryRunner6.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner2.fillStatementWithBean(preparedStatement3, (java.lang.Object) wildcardClass7, propertyDescriptorArray8);
        java.sql.Connection connection10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture12 = asyncQueryRunner2.update(connection10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray8, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test166");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner1 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0);
        java.sql.PreparedStatement preparedStatement2 = null;
        java.sql.ParameterMetaData parameterMetaData3 = null;
        javax.sql.DataSource dataSource4 = null;
        java.util.concurrent.ExecutorService executorService5 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner6 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource4, executorService5);
        boolean boolean7 = asyncQueryRunner6.isPmdKnownBroken();
        javax.sql.DataSource dataSource8 = asyncQueryRunner6.getDataSource();
        java.sql.PreparedStatement preparedStatement9 = null;
        java.sql.ParameterMetaData parameterMetaData10 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService12);
        java.sql.PreparedStatement preparedStatement14 = null;
        java.util.concurrent.ExecutorService executorService16 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner17 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService16);
        java.lang.Class<?> wildcardClass18 = asyncQueryRunner17.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner13.fillStatementWithBean(preparedStatement14, (java.lang.Object) wildcardClass18, propertyDescriptorArray19);
        asyncQueryRunner6.fillStatement(preparedStatement9, parameterMetaData10, (java.lang.Object[]) propertyDescriptorArray19);
        asyncQueryRunner1.fillStatement(preparedStatement2, parameterMetaData3, (java.lang.Object[]) propertyDescriptorArray19);
        java.lang.Class<?> wildcardClass23 = asyncQueryRunner1.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray19, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test167");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.sql.ParameterMetaData parameterMetaData6 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService12);
        java.lang.Class<?> wildcardClass14 = asyncQueryRunner13.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner9.fillStatementWithBean(preparedStatement10, (java.lang.Object) wildcardClass14, propertyDescriptorArray15);
        asyncQueryRunner2.fillStatement(preparedStatement5, parameterMetaData6, (java.lang.Object[]) propertyDescriptorArray15);
        java.sql.PreparedStatement preparedStatement18 = null;
        java.sql.ParameterMetaData parameterMetaData19 = null;
        java.util.concurrent.ExecutorService executorService21 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner22 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService21);
        java.sql.PreparedStatement preparedStatement23 = null;
        java.util.concurrent.ExecutorService executorService25 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner26 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService25);
        java.lang.Class<?> wildcardClass27 = asyncQueryRunner26.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner22.fillStatementWithBean(preparedStatement23, (java.lang.Object) wildcardClass27, propertyDescriptorArray28);
        asyncQueryRunner2.fillStatement(preparedStatement18, parameterMetaData19, (java.lang.Object[]) propertyDescriptorArray28);
        java.sql.PreparedStatement preparedStatement31 = null;
        java.util.concurrent.ExecutorService executorService32 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner33 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner34 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService32, queryRunner33);
        java.beans.PropertyDescriptor[] propertyDescriptorArray35 = new java.beans.PropertyDescriptor[] {};
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner2.fillStatementWithBean(preparedStatement31, (java.lang.Object) asyncQueryRunner34, propertyDescriptorArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray15, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(propertyDescriptorArray28);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray28, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(propertyDescriptorArray35);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray35, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test168");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.Connection connection4 = null;
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner8 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService7);
        boolean boolean9 = asyncQueryRunner8.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] {};
        asyncQueryRunner8.fillStatement(preparedStatement10, parameterMetaData11, objArray12);
        java.util.concurrent.ExecutorService executorService15 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner16 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService15);
        boolean boolean17 = asyncQueryRunner16.isPmdKnownBroken();
        java.util.concurrent.ExecutorService executorService20 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner21 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService20);
        boolean boolean22 = asyncQueryRunner21.isPmdKnownBroken();
        java.lang.Class<?> wildcardClass23 = asyncQueryRunner21.getClass();
        javax.sql.DataSource dataSource25 = null;
        java.util.concurrent.ExecutorService executorService26 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner27 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource25, executorService26);
        boolean boolean28 = asyncQueryRunner27.isPmdKnownBroken();
        javax.sql.DataSource dataSource29 = asyncQueryRunner27.getDataSource();
        java.sql.PreparedStatement preparedStatement30 = null;
        java.sql.ParameterMetaData parameterMetaData31 = null;
        java.util.concurrent.ExecutorService executorService33 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner34 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService33);
        java.sql.PreparedStatement preparedStatement35 = null;
        java.util.concurrent.ExecutorService executorService37 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner38 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService37);
        java.lang.Class<?> wildcardClass39 = asyncQueryRunner38.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray40 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner34.fillStatementWithBean(preparedStatement35, (java.lang.Object) wildcardClass39, propertyDescriptorArray40);
        asyncQueryRunner27.fillStatement(preparedStatement30, parameterMetaData31, (java.lang.Object[]) propertyDescriptorArray40);
        java.sql.PreparedStatement preparedStatement43 = null;
        java.sql.ParameterMetaData parameterMetaData44 = null;
        java.util.concurrent.ExecutorService executorService46 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner47 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService46);
        java.sql.PreparedStatement preparedStatement48 = null;
        java.util.concurrent.ExecutorService executorService50 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner51 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService50);
        java.lang.Class<?> wildcardClass52 = asyncQueryRunner51.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray53 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner47.fillStatementWithBean(preparedStatement48, (java.lang.Object) wildcardClass52, propertyDescriptorArray53);
        asyncQueryRunner27.fillStatement(preparedStatement43, parameterMetaData44, (java.lang.Object[]) propertyDescriptorArray53);
        java.lang.Object[] objArray56 = new java.lang.Object[] { objArray12, boolean17, ' ', asyncQueryRunner21, 1L, propertyDescriptorArray53 };
        java.lang.Object[][] objArray57 = new java.lang.Object[][] { propertyDescriptorArray53 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<int[]> intArrayFuture58 = asyncQueryRunner2.batch(connection4, "", objArray57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(dataSource29);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(propertyDescriptorArray40);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray40, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(propertyDescriptorArray53);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray53, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray57);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test169");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, false, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner8 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService7);
        java.sql.PreparedStatement preparedStatement9 = null;
        java.util.concurrent.ExecutorService executorService11 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner12 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService11);
        java.lang.Class<?> wildcardClass13 = asyncQueryRunner12.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner8.fillStatementWithBean(preparedStatement9, (java.lang.Object) wildcardClass13, propertyDescriptorArray14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture16 = asyncQueryRunner3.update("", (java.lang.Object[]) propertyDescriptorArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(propertyDescriptorArray14);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray14, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test170");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService1);
        javax.sql.DataSource dataSource3 = asyncQueryRunner2.getDataSource();
        java.sql.Connection connection4 = null;
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner8 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService7);
        boolean boolean9 = asyncQueryRunner8.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement10 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService12);
        java.sql.PreparedStatement preparedStatement14 = null;
        java.util.concurrent.ExecutorService executorService16 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner17 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService16);
        java.lang.Class<?> wildcardClass18 = asyncQueryRunner17.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner13.fillStatementWithBean(preparedStatement14, (java.lang.Object) wildcardClass18, propertyDescriptorArray19);
        asyncQueryRunner8.fillStatement(preparedStatement10, (java.lang.Object[]) propertyDescriptorArray19);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture22 = asyncQueryRunner2.update(connection4, "", (java.lang.Object[]) propertyDescriptorArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray19, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test171");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner1 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0);
        java.sql.PreparedStatement preparedStatement2 = null;
        java.sql.ParameterMetaData parameterMetaData3 = null;
        javax.sql.DataSource dataSource4 = null;
        java.util.concurrent.ExecutorService executorService5 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner6 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource4, executorService5);
        boolean boolean7 = asyncQueryRunner6.isPmdKnownBroken();
        javax.sql.DataSource dataSource8 = asyncQueryRunner6.getDataSource();
        java.sql.PreparedStatement preparedStatement9 = null;
        java.sql.ParameterMetaData parameterMetaData10 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService12);
        java.sql.PreparedStatement preparedStatement14 = null;
        java.util.concurrent.ExecutorService executorService16 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner17 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService16);
        java.lang.Class<?> wildcardClass18 = asyncQueryRunner17.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner13.fillStatementWithBean(preparedStatement14, (java.lang.Object) wildcardClass18, propertyDescriptorArray19);
        asyncQueryRunner6.fillStatement(preparedStatement9, parameterMetaData10, (java.lang.Object[]) propertyDescriptorArray19);
        asyncQueryRunner1.fillStatement(preparedStatement2, parameterMetaData3, (java.lang.Object[]) propertyDescriptorArray19);
        boolean boolean23 = asyncQueryRunner1.isPmdKnownBroken();
        java.sql.Connection connection24 = null;
        java.lang.Object obj26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture27 = asyncQueryRunner1.update(connection24, "hi!", obj26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray19, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test172");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        javax.sql.DataSource dataSource3 = asyncQueryRunner2.getDataSource();
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService7, queryRunner8);
        boolean boolean10 = asyncQueryRunner9.isPmdKnownBroken();
        javax.sql.DataSource dataSource11 = asyncQueryRunner9.getDataSource();
        java.lang.Class<?> wildcardClass12 = asyncQueryRunner9.getClass();
        java.util.concurrent.ExecutorService executorService14 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner15 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService14);
        javax.sql.DataSource dataSource16 = asyncQueryRunner15.getDataSource();
        java.lang.Object[] objArray17 = new java.lang.Object[] { ' ', "hi!", wildcardClass12, dataSource16 };
        java.lang.Object[][] objArray18 = new java.lang.Object[][] { objArray17 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<int[]> intArrayFuture19 = asyncQueryRunner2.batch("hi!", objArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[ , hi!, class org.apache.commons.dbutils.AsyncQueryRunner, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[ , hi!, class org.apache.commons.dbutils.AsyncQueryRunner, null]");
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test173");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService1);
        javax.sql.DataSource dataSource3 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement4 = null;
        javax.sql.DataSource dataSource6 = null;
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner8 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource6, executorService7);
        boolean boolean9 = asyncQueryRunner8.isPmdKnownBroken();
        javax.sql.DataSource dataSource10 = asyncQueryRunner8.getDataSource();
        java.sql.PreparedStatement preparedStatement11 = null;
        java.sql.ParameterMetaData parameterMetaData12 = null;
        java.util.concurrent.ExecutorService executorService14 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner15 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService14);
        java.sql.PreparedStatement preparedStatement16 = null;
        java.util.concurrent.ExecutorService executorService18 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner19 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService18);
        java.lang.Class<?> wildcardClass20 = asyncQueryRunner19.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner15.fillStatementWithBean(preparedStatement16, (java.lang.Object) wildcardClass20, propertyDescriptorArray21);
        asyncQueryRunner8.fillStatement(preparedStatement11, parameterMetaData12, (java.lang.Object[]) propertyDescriptorArray21);
        java.lang.Class<?> wildcardClass24 = asyncQueryRunner8.getClass();
        javax.sql.DataSource dataSource25 = null;
        java.util.concurrent.ExecutorService executorService26 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner27 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource25, executorService26);
        javax.sql.DataSource dataSource28 = null;
        java.util.concurrent.ExecutorService executorService30 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner31 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource28, false, executorService30);
        java.sql.PreparedStatement preparedStatement32 = null;
        java.sql.ParameterMetaData parameterMetaData33 = null;
        java.util.concurrent.ExecutorService executorService34 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner35 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService34);
        java.sql.PreparedStatement preparedStatement36 = null;
        java.sql.ParameterMetaData parameterMetaData37 = null;
        javax.sql.DataSource dataSource38 = null;
        java.util.concurrent.ExecutorService executorService39 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner40 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource38, executorService39);
        boolean boolean41 = asyncQueryRunner40.isPmdKnownBroken();
        javax.sql.DataSource dataSource42 = asyncQueryRunner40.getDataSource();
        java.sql.PreparedStatement preparedStatement43 = null;
        java.sql.ParameterMetaData parameterMetaData44 = null;
        java.util.concurrent.ExecutorService executorService46 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner47 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService46);
        java.sql.PreparedStatement preparedStatement48 = null;
        java.util.concurrent.ExecutorService executorService50 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner51 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService50);
        java.lang.Class<?> wildcardClass52 = asyncQueryRunner51.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray53 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner47.fillStatementWithBean(preparedStatement48, (java.lang.Object) wildcardClass52, propertyDescriptorArray53);
        asyncQueryRunner40.fillStatement(preparedStatement43, parameterMetaData44, (java.lang.Object[]) propertyDescriptorArray53);
        asyncQueryRunner35.fillStatement(preparedStatement36, parameterMetaData37, (java.lang.Object[]) propertyDescriptorArray53);
        asyncQueryRunner31.fillStatement(preparedStatement32, parameterMetaData33, (java.lang.Object[]) propertyDescriptorArray53);
        java.util.concurrent.ExecutorService executorService59 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner60 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService59);
        boolean boolean61 = asyncQueryRunner60.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement62 = null;
        java.util.concurrent.ExecutorService executorService64 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner65 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService64);
        java.sql.PreparedStatement preparedStatement66 = null;
        java.util.concurrent.ExecutorService executorService68 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner69 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService68);
        java.lang.Class<?> wildcardClass70 = asyncQueryRunner69.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray71 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner65.fillStatementWithBean(preparedStatement66, (java.lang.Object) wildcardClass70, propertyDescriptorArray71);
        asyncQueryRunner60.fillStatement(preparedStatement62, (java.lang.Object[]) propertyDescriptorArray71);
        java.lang.Object[] objArray75 = new java.lang.Object[] { (byte) 0, wildcardClass24, dataSource25, parameterMetaData33, asyncQueryRunner60, 0L };
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner2.fillStatement(preparedStatement4, objArray75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(propertyDescriptorArray21);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray21, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(dataSource42);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(propertyDescriptorArray53);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray53, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(propertyDescriptorArray71);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray71, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(objArray75);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test174");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        java.sql.Connection connection5 = null;
        javax.sql.DataSource dataSource7 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource7, executorService8);
        boolean boolean10 = asyncQueryRunner9.isPmdKnownBroken();
        javax.sql.DataSource dataSource11 = asyncQueryRunner9.getDataSource();
        java.sql.PreparedStatement preparedStatement12 = null;
        java.sql.ParameterMetaData parameterMetaData13 = null;
        java.util.concurrent.ExecutorService executorService15 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner16 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService15);
        java.sql.PreparedStatement preparedStatement17 = null;
        java.util.concurrent.ExecutorService executorService19 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner20 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService19);
        java.lang.Class<?> wildcardClass21 = asyncQueryRunner20.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner16.fillStatementWithBean(preparedStatement17, (java.lang.Object) wildcardClass21, propertyDescriptorArray22);
        asyncQueryRunner9.fillStatement(preparedStatement12, parameterMetaData13, (java.lang.Object[]) propertyDescriptorArray22);
        java.sql.PreparedStatement preparedStatement25 = null;
        java.sql.ParameterMetaData parameterMetaData26 = null;
        java.util.concurrent.ExecutorService executorService28 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner29 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService28);
        java.sql.PreparedStatement preparedStatement30 = null;
        java.util.concurrent.ExecutorService executorService32 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner33 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService32);
        java.lang.Class<?> wildcardClass34 = asyncQueryRunner33.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray35 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner29.fillStatementWithBean(preparedStatement30, (java.lang.Object) wildcardClass34, propertyDescriptorArray35);
        asyncQueryRunner9.fillStatement(preparedStatement25, parameterMetaData26, (java.lang.Object[]) propertyDescriptorArray35);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture38 = asyncQueryRunner2.update(connection5, "hi!", (java.lang.Object[]) propertyDescriptorArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(propertyDescriptorArray22);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray22, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(propertyDescriptorArray35);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray35, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test175");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        boolean boolean4 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource5 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.sql.ParameterMetaData parameterMetaData7 = asyncQueryRunner2.getParameterMetaData(preparedStatement6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(dataSource5);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test176");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        asyncQueryRunner2.fillStatement(preparedStatement4, parameterMetaData5, objArray6);
        java.sql.Connection connection8 = null;
        java.util.concurrent.ExecutorService executorService11 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner12 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture13 = asyncQueryRunner2.update(connection8, "", (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test177");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        boolean boolean4 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource5 = asyncQueryRunner2.getDataSource();
        java.sql.Connection connection6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture8 = asyncQueryRunner2.update(connection6, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(dataSource5);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test178");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, false, executorService2);
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner7 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService6);
        javax.sql.DataSource dataSource8 = asyncQueryRunner7.getDataSource();
        java.sql.PreparedStatement preparedStatement9 = null;
        java.sql.ParameterMetaData parameterMetaData10 = asyncQueryRunner7.getParameterMetaData(preparedStatement9);
        javax.sql.DataSource dataSource11 = asyncQueryRunner7.getDataSource();
        java.lang.Object[] objArray12 = new java.lang.Object[] { asyncQueryRunner7 };
        java.util.concurrent.ExecutorService executorService14 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner15 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService14);
        javax.sql.DataSource dataSource16 = asyncQueryRunner15.getDataSource();
        java.sql.PreparedStatement preparedStatement17 = null;
        java.sql.ParameterMetaData parameterMetaData18 = asyncQueryRunner15.getParameterMetaData(preparedStatement17);
        javax.sql.DataSource dataSource19 = asyncQueryRunner15.getDataSource();
        java.lang.Object[] objArray20 = new java.lang.Object[] { asyncQueryRunner15 };
        java.util.concurrent.ExecutorService executorService22 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner23 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService22);
        javax.sql.DataSource dataSource24 = asyncQueryRunner23.getDataSource();
        java.sql.PreparedStatement preparedStatement25 = null;
        java.sql.ParameterMetaData parameterMetaData26 = asyncQueryRunner23.getParameterMetaData(preparedStatement25);
        javax.sql.DataSource dataSource27 = asyncQueryRunner23.getDataSource();
        java.lang.Object[] objArray28 = new java.lang.Object[] { asyncQueryRunner23 };
        java.util.concurrent.ExecutorService executorService30 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner31 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService30);
        javax.sql.DataSource dataSource32 = asyncQueryRunner31.getDataSource();
        java.sql.PreparedStatement preparedStatement33 = null;
        java.sql.ParameterMetaData parameterMetaData34 = asyncQueryRunner31.getParameterMetaData(preparedStatement33);
        javax.sql.DataSource dataSource35 = asyncQueryRunner31.getDataSource();
        java.lang.Object[] objArray36 = new java.lang.Object[] { asyncQueryRunner31 };
        java.util.concurrent.ExecutorService executorService38 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner39 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService38);
        javax.sql.DataSource dataSource40 = asyncQueryRunner39.getDataSource();
        java.sql.PreparedStatement preparedStatement41 = null;
        java.sql.ParameterMetaData parameterMetaData42 = asyncQueryRunner39.getParameterMetaData(preparedStatement41);
        javax.sql.DataSource dataSource43 = asyncQueryRunner39.getDataSource();
        java.lang.Object[] objArray44 = new java.lang.Object[] { asyncQueryRunner39 };
        java.lang.Object[][] objArray45 = new java.lang.Object[][] { objArray12, objArray20, objArray28, objArray36, objArray44 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<int[]> intArrayFuture46 = asyncQueryRunner3.batch("", objArray45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(parameterMetaData10);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertNull(parameterMetaData18);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNull(parameterMetaData26);
        org.junit.Assert.assertNull(dataSource27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNull(dataSource32);
        org.junit.Assert.assertNull(parameterMetaData34);
        org.junit.Assert.assertNull(dataSource35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNull(dataSource40);
        org.junit.Assert.assertNull(parameterMetaData42);
        org.junit.Assert.assertNull(dataSource43);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray45);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test179");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner1 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0);
        java.sql.PreparedStatement preparedStatement2 = null;
        java.sql.ParameterMetaData parameterMetaData3 = null;
        javax.sql.DataSource dataSource4 = null;
        java.util.concurrent.ExecutorService executorService5 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner6 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource4, executorService5);
        boolean boolean7 = asyncQueryRunner6.isPmdKnownBroken();
        javax.sql.DataSource dataSource8 = asyncQueryRunner6.getDataSource();
        java.sql.PreparedStatement preparedStatement9 = null;
        java.sql.ParameterMetaData parameterMetaData10 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService12);
        java.sql.PreparedStatement preparedStatement14 = null;
        java.util.concurrent.ExecutorService executorService16 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner17 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService16);
        java.lang.Class<?> wildcardClass18 = asyncQueryRunner17.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner13.fillStatementWithBean(preparedStatement14, (java.lang.Object) wildcardClass18, propertyDescriptorArray19);
        asyncQueryRunner6.fillStatement(preparedStatement9, parameterMetaData10, (java.lang.Object[]) propertyDescriptorArray19);
        asyncQueryRunner1.fillStatement(preparedStatement2, parameterMetaData3, (java.lang.Object[]) propertyDescriptorArray19);
        java.sql.PreparedStatement preparedStatement23 = null;
        java.util.concurrent.ExecutorService executorService26 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner27 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService26);
        java.sql.PreparedStatement preparedStatement28 = null;
        java.util.concurrent.ExecutorService executorService30 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner31 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService30);
        java.lang.Class<?> wildcardClass32 = asyncQueryRunner31.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray33 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner27.fillStatementWithBean(preparedStatement28, (java.lang.Object) wildcardClass32, propertyDescriptorArray33);
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner1.fillStatementWithBean(preparedStatement23, (java.lang.Object) false, propertyDescriptorArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray19, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(propertyDescriptorArray33);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray33, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test180");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner1 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0);
        java.sql.PreparedStatement preparedStatement2 = null;
        java.sql.ParameterMetaData parameterMetaData3 = null;
        javax.sql.DataSource dataSource4 = null;
        java.util.concurrent.ExecutorService executorService5 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner6 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource4, executorService5);
        boolean boolean7 = asyncQueryRunner6.isPmdKnownBroken();
        javax.sql.DataSource dataSource8 = asyncQueryRunner6.getDataSource();
        java.sql.PreparedStatement preparedStatement9 = null;
        java.sql.ParameterMetaData parameterMetaData10 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService12);
        java.sql.PreparedStatement preparedStatement14 = null;
        java.util.concurrent.ExecutorService executorService16 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner17 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService16);
        java.lang.Class<?> wildcardClass18 = asyncQueryRunner17.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner13.fillStatementWithBean(preparedStatement14, (java.lang.Object) wildcardClass18, propertyDescriptorArray19);
        asyncQueryRunner6.fillStatement(preparedStatement9, parameterMetaData10, (java.lang.Object[]) propertyDescriptorArray19);
        asyncQueryRunner1.fillStatement(preparedStatement2, parameterMetaData3, (java.lang.Object[]) propertyDescriptorArray19);
        java.sql.PreparedStatement preparedStatement23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.sql.ParameterMetaData parameterMetaData24 = asyncQueryRunner1.getParameterMetaData(preparedStatement23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray19, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test181");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        asyncQueryRunner2.fillStatement(preparedStatement4, parameterMetaData5, objArray6);
        java.sql.Connection connection8 = null;
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        java.lang.Object[] objArray11 = new java.lang.Object[] {};
        java.lang.Object[] objArray12 = new java.lang.Object[] {};
        java.lang.Object[] objArray13 = new java.lang.Object[] {};
        java.lang.Object[] objArray14 = new java.lang.Object[] {};
        java.lang.Object[] objArray15 = new java.lang.Object[] {};
        java.lang.Object[][] objArray16 = new java.lang.Object[][] { objArray10, objArray11, objArray12, objArray13, objArray14, objArray15 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<int[]> intArrayFuture17 = asyncQueryRunner2.batch(connection8, "hi!", objArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertArrayEquals(objArray13, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test182");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        java.sql.PreparedStatement preparedStatement3 = null;
        java.util.concurrent.ExecutorService executorService5 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner6 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService5);
        java.lang.Class<?> wildcardClass7 = asyncQueryRunner6.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner2.fillStatementWithBean(preparedStatement3, (java.lang.Object) wildcardClass7, propertyDescriptorArray8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = asyncQueryRunner2.getParameterMetaData(preparedStatement10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = parameterMetaData11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray8, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(parameterMetaData11);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test183");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, false, executorService2);
        javax.sql.DataSource dataSource4 = asyncQueryRunner3.getDataSource();
        java.sql.Connection connection5 = null;
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService7, queryRunner8);
        boolean boolean10 = asyncQueryRunner9.isPmdKnownBroken();
        javax.sql.DataSource dataSource11 = asyncQueryRunner9.getDataSource();
        java.lang.Class<?> wildcardClass12 = asyncQueryRunner9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture13 = asyncQueryRunner3.update(connection5, "", (java.lang.Object) wildcardClass12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test184");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture5 = asyncQueryRunner2.update("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test185");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        java.sql.PreparedStatement preparedStatement3 = null;
        java.util.concurrent.ExecutorService executorService5 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner6 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService5);
        java.lang.Class<?> wildcardClass7 = asyncQueryRunner6.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner2.fillStatementWithBean(preparedStatement3, (java.lang.Object) wildcardClass7, propertyDescriptorArray8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = asyncQueryRunner2.getParameterMetaData(preparedStatement10);
        java.sql.PreparedStatement preparedStatement12 = null;
        java.sql.ParameterMetaData parameterMetaData13 = asyncQueryRunner2.getParameterMetaData(preparedStatement12);
        java.sql.PreparedStatement preparedStatement14 = null;
        java.util.concurrent.ExecutorService executorService16 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner17 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService16);
        java.sql.PreparedStatement preparedStatement18 = null;
        java.util.concurrent.ExecutorService executorService20 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner21 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService20);
        java.lang.Class<?> wildcardClass22 = asyncQueryRunner21.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner17.fillStatementWithBean(preparedStatement18, (java.lang.Object) wildcardClass22, propertyDescriptorArray23);
        java.sql.PreparedStatement preparedStatement25 = null;
        java.sql.ParameterMetaData parameterMetaData26 = asyncQueryRunner17.getParameterMetaData(preparedStatement25);
        java.lang.String[] strArray30 = new java.lang.String[] { "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner2.fillStatementWithBean(preparedStatement14, (java.lang.Object) preparedStatement25, strArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"bean\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray8, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(parameterMetaData11);
        org.junit.Assert.assertNull(parameterMetaData13);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(propertyDescriptorArray23);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray23, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(parameterMetaData26);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "hi!", "" });
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test186");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = asyncQueryRunner3.getParameterMetaData(preparedStatement4);
        java.sql.PreparedStatement preparedStatement6 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService8);
        boolean boolean10 = asyncQueryRunner9.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement11 = null;
        java.util.concurrent.ExecutorService executorService13 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner14 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService13);
        java.sql.PreparedStatement preparedStatement15 = null;
        java.util.concurrent.ExecutorService executorService17 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner18 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService17);
        java.lang.Class<?> wildcardClass19 = asyncQueryRunner18.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner14.fillStatementWithBean(preparedStatement15, (java.lang.Object) wildcardClass19, propertyDescriptorArray20);
        asyncQueryRunner9.fillStatement(preparedStatement11, (java.lang.Object[]) propertyDescriptorArray20);
        asyncQueryRunner3.fillStatement(preparedStatement6, (java.lang.Object[]) propertyDescriptorArray20);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture25 = asyncQueryRunner3.update("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameterMetaData5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(propertyDescriptorArray20);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray20, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test187");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.sql.ParameterMetaData parameterMetaData5 = asyncQueryRunner2.getParameterMetaData(preparedStatement4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test188");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        java.sql.PreparedStatement preparedStatement3 = null;
        java.util.concurrent.ExecutorService executorService5 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner6 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService5);
        java.lang.Class<?> wildcardClass7 = asyncQueryRunner6.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner2.fillStatementWithBean(preparedStatement3, (java.lang.Object) wildcardClass7, propertyDescriptorArray8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = asyncQueryRunner2.getParameterMetaData(preparedStatement10);
        java.sql.PreparedStatement preparedStatement12 = null;
        java.sql.ParameterMetaData parameterMetaData13 = asyncQueryRunner2.getParameterMetaData(preparedStatement12);
        javax.sql.DataSource dataSource14 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement15 = null;
        java.util.concurrent.ExecutorService executorService17 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner18 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService17);
        javax.sql.DataSource dataSource19 = asyncQueryRunner18.getDataSource();
        java.sql.PreparedStatement preparedStatement20 = null;
        java.sql.ParameterMetaData parameterMetaData21 = asyncQueryRunner18.getParameterMetaData(preparedStatement20);
        javax.sql.DataSource dataSource22 = asyncQueryRunner18.getDataSource();
        java.lang.String[] strArray23 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner2.fillStatementWithBean(preparedStatement15, (java.lang.Object) dataSource22, strArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"bean\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray8, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(parameterMetaData11);
        org.junit.Assert.assertNull(parameterMetaData13);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertNull(parameterMetaData21);
        org.junit.Assert.assertNull(dataSource22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] {});
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test189");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService1);
        java.util.concurrent.ExecutorService executorService5 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner6 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService5);
        javax.sql.DataSource dataSource7 = asyncQueryRunner6.getDataSource();
        java.sql.PreparedStatement preparedStatement8 = null;
        java.sql.ParameterMetaData parameterMetaData9 = asyncQueryRunner6.getParameterMetaData(preparedStatement8);
        javax.sql.DataSource dataSource10 = asyncQueryRunner6.getDataSource();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture11 = asyncQueryRunner2.update("", (java.lang.Object) asyncQueryRunner6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNull(parameterMetaData9);
        org.junit.Assert.assertNull(dataSource10);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test190");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.sql.ParameterMetaData parameterMetaData6 = null;
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner8 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService7);
        java.sql.PreparedStatement preparedStatement9 = null;
        java.sql.ParameterMetaData parameterMetaData10 = null;
        javax.sql.DataSource dataSource11 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource11, executorService12);
        boolean boolean14 = asyncQueryRunner13.isPmdKnownBroken();
        javax.sql.DataSource dataSource15 = asyncQueryRunner13.getDataSource();
        java.sql.PreparedStatement preparedStatement16 = null;
        java.sql.ParameterMetaData parameterMetaData17 = null;
        java.util.concurrent.ExecutorService executorService19 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner20 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService19);
        java.sql.PreparedStatement preparedStatement21 = null;
        java.util.concurrent.ExecutorService executorService23 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner24 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService23);
        java.lang.Class<?> wildcardClass25 = asyncQueryRunner24.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray26 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner20.fillStatementWithBean(preparedStatement21, (java.lang.Object) wildcardClass25, propertyDescriptorArray26);
        asyncQueryRunner13.fillStatement(preparedStatement16, parameterMetaData17, (java.lang.Object[]) propertyDescriptorArray26);
        asyncQueryRunner8.fillStatement(preparedStatement9, parameterMetaData10, (java.lang.Object[]) propertyDescriptorArray26);
        asyncQueryRunner2.fillStatement(preparedStatement5, parameterMetaData6, (java.lang.Object[]) propertyDescriptorArray26);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture32 = asyncQueryRunner2.update("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(propertyDescriptorArray26);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray26, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test191");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, false, executorService2);
        java.sql.PreparedStatement preparedStatement4 = null;
        javax.sql.DataSource dataSource6 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource6, true, executorService8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = asyncQueryRunner9.getParameterMetaData(preparedStatement10);
        java.sql.PreparedStatement preparedStatement12 = null;
        java.util.concurrent.ExecutorService executorService14 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner15 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService14);
        boolean boolean16 = asyncQueryRunner15.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement17 = null;
        java.util.concurrent.ExecutorService executorService19 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner20 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService19);
        java.sql.PreparedStatement preparedStatement21 = null;
        java.util.concurrent.ExecutorService executorService23 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner24 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService23);
        java.lang.Class<?> wildcardClass25 = asyncQueryRunner24.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray26 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner20.fillStatementWithBean(preparedStatement21, (java.lang.Object) wildcardClass25, propertyDescriptorArray26);
        asyncQueryRunner15.fillStatement(preparedStatement17, (java.lang.Object[]) propertyDescriptorArray26);
        asyncQueryRunner9.fillStatement(preparedStatement12, (java.lang.Object[]) propertyDescriptorArray26);
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner3.fillStatementWithBean(preparedStatement4, (java.lang.Object) 1L, propertyDescriptorArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameterMetaData11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(propertyDescriptorArray26);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray26, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test192");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService1);
        java.sql.PreparedStatement preparedStatement3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.sql.ParameterMetaData parameterMetaData4 = asyncQueryRunner2.getParameterMetaData(preparedStatement3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test193");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = asyncQueryRunner3.getParameterMetaData(preparedStatement4);
        java.sql.PreparedStatement preparedStatement6 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService8);
        boolean boolean10 = asyncQueryRunner9.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement11 = null;
        java.util.concurrent.ExecutorService executorService13 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner14 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService13);
        java.sql.PreparedStatement preparedStatement15 = null;
        java.util.concurrent.ExecutorService executorService17 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner18 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService17);
        java.lang.Class<?> wildcardClass19 = asyncQueryRunner18.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner14.fillStatementWithBean(preparedStatement15, (java.lang.Object) wildcardClass19, propertyDescriptorArray20);
        asyncQueryRunner9.fillStatement(preparedStatement11, (java.lang.Object[]) propertyDescriptorArray20);
        asyncQueryRunner3.fillStatement(preparedStatement6, (java.lang.Object[]) propertyDescriptorArray20);
        java.sql.Connection connection24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture26 = asyncQueryRunner3.update(connection24, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameterMetaData5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(propertyDescriptorArray20);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray20, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test194");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        asyncQueryRunner2.fillStatement(preparedStatement4, parameterMetaData5, objArray6);
        java.sql.Connection connection8 = null;
        java.lang.Object[][] objArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<int[]> intArrayFuture11 = asyncQueryRunner2.batch(connection8, "", objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test195");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        javax.sql.DataSource dataSource3 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = asyncQueryRunner2.getParameterMetaData(preparedStatement4);
        java.sql.Connection connection6 = null;
        javax.sql.DataSource dataSource8 = null;
        java.util.concurrent.ExecutorService executorService9 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner10 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource8, executorService9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture11 = asyncQueryRunner2.update(connection6, "", (java.lang.Object) asyncQueryRunner10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertNull(parameterMetaData5);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test196");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner1 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0);
        java.sql.PreparedStatement preparedStatement2 = null;
        java.sql.ParameterMetaData parameterMetaData3 = null;
        javax.sql.DataSource dataSource4 = null;
        java.util.concurrent.ExecutorService executorService5 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner6 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource4, executorService5);
        boolean boolean7 = asyncQueryRunner6.isPmdKnownBroken();
        javax.sql.DataSource dataSource8 = asyncQueryRunner6.getDataSource();
        java.sql.PreparedStatement preparedStatement9 = null;
        java.sql.ParameterMetaData parameterMetaData10 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService12);
        java.sql.PreparedStatement preparedStatement14 = null;
        java.util.concurrent.ExecutorService executorService16 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner17 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService16);
        java.lang.Class<?> wildcardClass18 = asyncQueryRunner17.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner13.fillStatementWithBean(preparedStatement14, (java.lang.Object) wildcardClass18, propertyDescriptorArray19);
        asyncQueryRunner6.fillStatement(preparedStatement9, parameterMetaData10, (java.lang.Object[]) propertyDescriptorArray19);
        asyncQueryRunner1.fillStatement(preparedStatement2, parameterMetaData3, (java.lang.Object[]) propertyDescriptorArray19);
        java.sql.PreparedStatement preparedStatement23 = null;
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner1.fillStatementWithBean(preparedStatement23, (java.lang.Object) 0, strArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Couldn't find bean property: class java.lang.Integer ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray19, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "hi!", "hi!", "" });
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test197");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        java.sql.PreparedStatement preparedStatement3 = null;
        java.util.concurrent.ExecutorService executorService5 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner6 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService5);
        java.lang.Class<?> wildcardClass7 = asyncQueryRunner6.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner2.fillStatementWithBean(preparedStatement3, (java.lang.Object) wildcardClass7, propertyDescriptorArray8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = asyncQueryRunner2.getParameterMetaData(preparedStatement10);
        java.sql.PreparedStatement preparedStatement12 = null;
        java.sql.ParameterMetaData parameterMetaData13 = asyncQueryRunner2.getParameterMetaData(preparedStatement12);
        java.util.concurrent.ExecutorService executorService16 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner17 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService16);
        boolean boolean18 = asyncQueryRunner17.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement19 = null;
        java.util.concurrent.ExecutorService executorService21 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner22 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService21);
        java.sql.PreparedStatement preparedStatement23 = null;
        java.util.concurrent.ExecutorService executorService25 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner26 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService25);
        java.lang.Class<?> wildcardClass27 = asyncQueryRunner26.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner22.fillStatementWithBean(preparedStatement23, (java.lang.Object) wildcardClass27, propertyDescriptorArray28);
        asyncQueryRunner17.fillStatement(preparedStatement19, (java.lang.Object[]) propertyDescriptorArray28);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture31 = asyncQueryRunner2.update("", (java.lang.Object) asyncQueryRunner17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray8, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(parameterMetaData11);
        org.junit.Assert.assertNull(parameterMetaData13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(propertyDescriptorArray28);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray28, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test198");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        boolean boolean4 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.Connection connection5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture7 = asyncQueryRunner2.update(connection5, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test199");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.sql.ParameterMetaData parameterMetaData6 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService12);
        java.lang.Class<?> wildcardClass14 = asyncQueryRunner13.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner9.fillStatementWithBean(preparedStatement10, (java.lang.Object) wildcardClass14, propertyDescriptorArray15);
        asyncQueryRunner2.fillStatement(preparedStatement5, parameterMetaData6, (java.lang.Object[]) propertyDescriptorArray15);
        java.sql.PreparedStatement preparedStatement18 = null;
        java.sql.ParameterMetaData parameterMetaData19 = null;
        java.util.concurrent.ExecutorService executorService21 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner22 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService21);
        java.sql.PreparedStatement preparedStatement23 = null;
        java.util.concurrent.ExecutorService executorService25 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner26 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService25);
        java.lang.Class<?> wildcardClass27 = asyncQueryRunner26.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner22.fillStatementWithBean(preparedStatement23, (java.lang.Object) wildcardClass27, propertyDescriptorArray28);
        asyncQueryRunner2.fillStatement(preparedStatement18, parameterMetaData19, (java.lang.Object[]) propertyDescriptorArray28);
        boolean boolean31 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.sql.ParameterMetaData parameterMetaData33 = asyncQueryRunner2.getParameterMetaData(preparedStatement32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray15, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(propertyDescriptorArray28);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray28, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test200");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner1 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0);
        java.sql.PreparedStatement preparedStatement2 = null;
        java.sql.ParameterMetaData parameterMetaData3 = null;
        javax.sql.DataSource dataSource4 = null;
        java.util.concurrent.ExecutorService executorService5 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner6 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource4, executorService5);
        boolean boolean7 = asyncQueryRunner6.isPmdKnownBroken();
        javax.sql.DataSource dataSource8 = asyncQueryRunner6.getDataSource();
        java.sql.PreparedStatement preparedStatement9 = null;
        java.sql.ParameterMetaData parameterMetaData10 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService12);
        java.sql.PreparedStatement preparedStatement14 = null;
        java.util.concurrent.ExecutorService executorService16 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner17 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService16);
        java.lang.Class<?> wildcardClass18 = asyncQueryRunner17.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner13.fillStatementWithBean(preparedStatement14, (java.lang.Object) wildcardClass18, propertyDescriptorArray19);
        asyncQueryRunner6.fillStatement(preparedStatement9, parameterMetaData10, (java.lang.Object[]) propertyDescriptorArray19);
        asyncQueryRunner1.fillStatement(preparedStatement2, parameterMetaData3, (java.lang.Object[]) propertyDescriptorArray19);
        java.sql.PreparedStatement preparedStatement23 = null;
        java.lang.String[] strArray27 = new java.lang.String[] { "", "" };
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner1.fillStatementWithBean(preparedStatement23, (java.lang.Object) (byte) 1, strArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Couldn't find bean property: class java.lang.Byte ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray19, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "" });
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test201");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.sql.ParameterMetaData parameterMetaData6 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService12);
        java.lang.Class<?> wildcardClass14 = asyncQueryRunner13.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner9.fillStatementWithBean(preparedStatement10, (java.lang.Object) wildcardClass14, propertyDescriptorArray15);
        asyncQueryRunner2.fillStatement(preparedStatement5, parameterMetaData6, (java.lang.Object[]) propertyDescriptorArray15);
        java.sql.PreparedStatement preparedStatement18 = null;
        java.sql.ParameterMetaData parameterMetaData19 = null;
        java.util.concurrent.ExecutorService executorService21 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner22 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService21);
        java.sql.PreparedStatement preparedStatement23 = null;
        java.util.concurrent.ExecutorService executorService25 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner26 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService25);
        java.lang.Class<?> wildcardClass27 = asyncQueryRunner26.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner22.fillStatementWithBean(preparedStatement23, (java.lang.Object) wildcardClass27, propertyDescriptorArray28);
        asyncQueryRunner2.fillStatement(preparedStatement18, parameterMetaData19, (java.lang.Object[]) propertyDescriptorArray28);
        boolean boolean31 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource32 = asyncQueryRunner2.getDataSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass33 = dataSource32.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray15, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(propertyDescriptorArray28);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray28, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(dataSource32);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test202");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService1);
        javax.sql.DataSource dataSource3 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement4 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner2.fillStatementWithBean(preparedStatement4, (java.lang.Object) (-1.0d), strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Couldn't find bean property: class java.lang.Double ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "", "hi!" });
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test203");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.sql.ParameterMetaData parameterMetaData6 = null;
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner8 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService7);
        java.sql.PreparedStatement preparedStatement9 = null;
        java.sql.ParameterMetaData parameterMetaData10 = null;
        javax.sql.DataSource dataSource11 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource11, executorService12);
        boolean boolean14 = asyncQueryRunner13.isPmdKnownBroken();
        javax.sql.DataSource dataSource15 = asyncQueryRunner13.getDataSource();
        java.sql.PreparedStatement preparedStatement16 = null;
        java.sql.ParameterMetaData parameterMetaData17 = null;
        java.util.concurrent.ExecutorService executorService19 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner20 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService19);
        java.sql.PreparedStatement preparedStatement21 = null;
        java.util.concurrent.ExecutorService executorService23 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner24 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService23);
        java.lang.Class<?> wildcardClass25 = asyncQueryRunner24.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray26 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner20.fillStatementWithBean(preparedStatement21, (java.lang.Object) wildcardClass25, propertyDescriptorArray26);
        asyncQueryRunner13.fillStatement(preparedStatement16, parameterMetaData17, (java.lang.Object[]) propertyDescriptorArray26);
        asyncQueryRunner8.fillStatement(preparedStatement9, parameterMetaData10, (java.lang.Object[]) propertyDescriptorArray26);
        asyncQueryRunner2.fillStatement(preparedStatement5, parameterMetaData6, (java.lang.Object[]) propertyDescriptorArray26);
        java.sql.PreparedStatement preparedStatement31 = null;
        javax.sql.DataSource dataSource32 = null;
        java.util.concurrent.ExecutorService executorService34 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner35 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource32, false, executorService34);
        boolean boolean36 = asyncQueryRunner35.isPmdKnownBroken();
        javax.sql.DataSource dataSource37 = null;
        java.util.concurrent.ExecutorService executorService38 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner39 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource37, executorService38);
        boolean boolean40 = asyncQueryRunner39.isPmdKnownBroken();
        javax.sql.DataSource dataSource41 = asyncQueryRunner39.getDataSource();
        java.sql.PreparedStatement preparedStatement42 = null;
        java.sql.ParameterMetaData parameterMetaData43 = null;
        java.util.concurrent.ExecutorService executorService44 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner45 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService44);
        java.sql.PreparedStatement preparedStatement46 = null;
        java.sql.ParameterMetaData parameterMetaData47 = null;
        javax.sql.DataSource dataSource48 = null;
        java.util.concurrent.ExecutorService executorService49 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner50 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource48, executorService49);
        boolean boolean51 = asyncQueryRunner50.isPmdKnownBroken();
        javax.sql.DataSource dataSource52 = asyncQueryRunner50.getDataSource();
        java.sql.PreparedStatement preparedStatement53 = null;
        java.sql.ParameterMetaData parameterMetaData54 = null;
        java.util.concurrent.ExecutorService executorService56 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner57 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService56);
        java.sql.PreparedStatement preparedStatement58 = null;
        java.util.concurrent.ExecutorService executorService60 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner61 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService60);
        java.lang.Class<?> wildcardClass62 = asyncQueryRunner61.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray63 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner57.fillStatementWithBean(preparedStatement58, (java.lang.Object) wildcardClass62, propertyDescriptorArray63);
        asyncQueryRunner50.fillStatement(preparedStatement53, parameterMetaData54, (java.lang.Object[]) propertyDescriptorArray63);
        asyncQueryRunner45.fillStatement(preparedStatement46, parameterMetaData47, (java.lang.Object[]) propertyDescriptorArray63);
        asyncQueryRunner39.fillStatement(preparedStatement42, parameterMetaData43, (java.lang.Object[]) propertyDescriptorArray63);
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner2.fillStatementWithBean(preparedStatement31, (java.lang.Object) boolean36, propertyDescriptorArray63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(propertyDescriptorArray26);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray26, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(dataSource41);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(dataSource52);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(propertyDescriptorArray63);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray63, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test204");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        java.sql.PreparedStatement preparedStatement3 = null;
        java.sql.ParameterMetaData parameterMetaData4 = null;
        javax.sql.DataSource dataSource5 = null;
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner7 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource5, executorService6);
        boolean boolean8 = asyncQueryRunner7.isPmdKnownBroken();
        javax.sql.DataSource dataSource9 = asyncQueryRunner7.getDataSource();
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = null;
        java.util.concurrent.ExecutorService executorService13 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner14 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService13);
        java.sql.PreparedStatement preparedStatement15 = null;
        java.util.concurrent.ExecutorService executorService17 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner18 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService17);
        java.lang.Class<?> wildcardClass19 = asyncQueryRunner18.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner14.fillStatementWithBean(preparedStatement15, (java.lang.Object) wildcardClass19, propertyDescriptorArray20);
        asyncQueryRunner7.fillStatement(preparedStatement10, parameterMetaData11, (java.lang.Object[]) propertyDescriptorArray20);
        java.sql.PreparedStatement preparedStatement23 = null;
        java.sql.ParameterMetaData parameterMetaData24 = null;
        java.util.concurrent.ExecutorService executorService26 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner27 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService26);
        java.sql.PreparedStatement preparedStatement28 = null;
        java.util.concurrent.ExecutorService executorService30 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner31 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService30);
        java.lang.Class<?> wildcardClass32 = asyncQueryRunner31.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray33 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner27.fillStatementWithBean(preparedStatement28, (java.lang.Object) wildcardClass32, propertyDescriptorArray33);
        asyncQueryRunner7.fillStatement(preparedStatement23, parameterMetaData24, (java.lang.Object[]) propertyDescriptorArray33);
        asyncQueryRunner2.fillStatement(preparedStatement3, parameterMetaData4, (java.lang.Object[]) propertyDescriptorArray33);
        java.sql.Connection connection37 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture39 = asyncQueryRunner2.update(connection37, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(propertyDescriptorArray20);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray20, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(propertyDescriptorArray33);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray33, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test205");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        asyncQueryRunner2.fillStatement(preparedStatement4, parameterMetaData5, objArray6);
        java.sql.PreparedStatement preparedStatement8 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner2.fillStatementWithBean(preparedStatement8, (java.lang.Object) (-1L), propertyDescriptorArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"properties\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test206");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.sql.ParameterMetaData parameterMetaData6 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService12);
        java.lang.Class<?> wildcardClass14 = asyncQueryRunner13.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner9.fillStatementWithBean(preparedStatement10, (java.lang.Object) wildcardClass14, propertyDescriptorArray15);
        asyncQueryRunner2.fillStatement(preparedStatement5, parameterMetaData6, (java.lang.Object[]) propertyDescriptorArray15);
        java.sql.PreparedStatement preparedStatement18 = null;
        java.sql.ParameterMetaData parameterMetaData19 = null;
        java.util.concurrent.ExecutorService executorService21 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner22 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService21);
        java.sql.PreparedStatement preparedStatement23 = null;
        java.util.concurrent.ExecutorService executorService25 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner26 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService25);
        java.lang.Class<?> wildcardClass27 = asyncQueryRunner26.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner22.fillStatementWithBean(preparedStatement23, (java.lang.Object) wildcardClass27, propertyDescriptorArray28);
        asyncQueryRunner2.fillStatement(preparedStatement18, parameterMetaData19, (java.lang.Object[]) propertyDescriptorArray28);
        java.sql.PreparedStatement preparedStatement31 = null;
        java.sql.ParameterMetaData parameterMetaData32 = null;
        java.lang.Object[] objArray33 = null;
        asyncQueryRunner2.fillStatement(preparedStatement31, parameterMetaData32, objArray33);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture37 = asyncQueryRunner2.update("", (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray15, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(propertyDescriptorArray28);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray28, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test207");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.sql.ParameterMetaData parameterMetaData6 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService12);
        java.lang.Class<?> wildcardClass14 = asyncQueryRunner13.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner9.fillStatementWithBean(preparedStatement10, (java.lang.Object) wildcardClass14, propertyDescriptorArray15);
        asyncQueryRunner2.fillStatement(preparedStatement5, parameterMetaData6, (java.lang.Object[]) propertyDescriptorArray15);
        java.sql.PreparedStatement preparedStatement18 = null;
        java.sql.ParameterMetaData parameterMetaData19 = null;
        java.util.concurrent.ExecutorService executorService21 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner22 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService21);
        java.sql.PreparedStatement preparedStatement23 = null;
        java.util.concurrent.ExecutorService executorService25 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner26 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService25);
        java.lang.Class<?> wildcardClass27 = asyncQueryRunner26.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner22.fillStatementWithBean(preparedStatement23, (java.lang.Object) wildcardClass27, propertyDescriptorArray28);
        asyncQueryRunner2.fillStatement(preparedStatement18, parameterMetaData19, (java.lang.Object[]) propertyDescriptorArray28);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture32 = asyncQueryRunner2.update("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray15, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(propertyDescriptorArray28);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray28, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test208");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.sql.ParameterMetaData parameterMetaData6 = null;
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner8 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService7);
        java.sql.PreparedStatement preparedStatement9 = null;
        java.sql.ParameterMetaData parameterMetaData10 = null;
        javax.sql.DataSource dataSource11 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource11, executorService12);
        boolean boolean14 = asyncQueryRunner13.isPmdKnownBroken();
        javax.sql.DataSource dataSource15 = asyncQueryRunner13.getDataSource();
        java.sql.PreparedStatement preparedStatement16 = null;
        java.sql.ParameterMetaData parameterMetaData17 = null;
        java.util.concurrent.ExecutorService executorService19 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner20 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService19);
        java.sql.PreparedStatement preparedStatement21 = null;
        java.util.concurrent.ExecutorService executorService23 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner24 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService23);
        java.lang.Class<?> wildcardClass25 = asyncQueryRunner24.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray26 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner20.fillStatementWithBean(preparedStatement21, (java.lang.Object) wildcardClass25, propertyDescriptorArray26);
        asyncQueryRunner13.fillStatement(preparedStatement16, parameterMetaData17, (java.lang.Object[]) propertyDescriptorArray26);
        asyncQueryRunner8.fillStatement(preparedStatement9, parameterMetaData10, (java.lang.Object[]) propertyDescriptorArray26);
        asyncQueryRunner2.fillStatement(preparedStatement5, parameterMetaData6, (java.lang.Object[]) propertyDescriptorArray26);
        java.sql.PreparedStatement preparedStatement31 = null;
        javax.sql.DataSource dataSource32 = null;
        java.util.concurrent.ExecutorService executorService33 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner34 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource32, executorService33);
        boolean boolean35 = asyncQueryRunner34.isPmdKnownBroken();
        javax.sql.DataSource dataSource36 = asyncQueryRunner34.getDataSource();
        java.sql.PreparedStatement preparedStatement37 = null;
        java.sql.ParameterMetaData parameterMetaData38 = null;
        java.util.concurrent.ExecutorService executorService40 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner41 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService40);
        java.sql.PreparedStatement preparedStatement42 = null;
        java.util.concurrent.ExecutorService executorService44 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner45 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService44);
        java.lang.Class<?> wildcardClass46 = asyncQueryRunner45.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray47 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner41.fillStatementWithBean(preparedStatement42, (java.lang.Object) wildcardClass46, propertyDescriptorArray47);
        asyncQueryRunner34.fillStatement(preparedStatement37, parameterMetaData38, (java.lang.Object[]) propertyDescriptorArray47);
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner2.fillStatement(preparedStatement31, (java.lang.Object[]) propertyDescriptorArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(propertyDescriptorArray26);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray26, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(dataSource36);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(propertyDescriptorArray47);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray47, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test209");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService1);
        javax.sql.DataSource dataSource3 = asyncQueryRunner2.getDataSource();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture6 = asyncQueryRunner2.update("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertNull(dataSource4);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test210");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService1);
        javax.sql.DataSource dataSource3 = asyncQueryRunner2.getDataSource();
        java.sql.Connection connection4 = null;
        javax.sql.DataSource dataSource6 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource6, true, executorService8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = asyncQueryRunner9.getParameterMetaData(preparedStatement10);
        java.sql.PreparedStatement preparedStatement12 = null;
        java.util.concurrent.ExecutorService executorService14 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner15 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService14);
        boolean boolean16 = asyncQueryRunner15.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement17 = null;
        java.util.concurrent.ExecutorService executorService19 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner20 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService19);
        java.sql.PreparedStatement preparedStatement21 = null;
        java.util.concurrent.ExecutorService executorService23 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner24 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService23);
        java.lang.Class<?> wildcardClass25 = asyncQueryRunner24.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray26 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner20.fillStatementWithBean(preparedStatement21, (java.lang.Object) wildcardClass25, propertyDescriptorArray26);
        asyncQueryRunner15.fillStatement(preparedStatement17, (java.lang.Object[]) propertyDescriptorArray26);
        asyncQueryRunner9.fillStatement(preparedStatement12, (java.lang.Object[]) propertyDescriptorArray26);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture30 = asyncQueryRunner2.update(connection4, "", (java.lang.Object[]) propertyDescriptorArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertNull(parameterMetaData11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(propertyDescriptorArray26);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray26, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test211");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.Connection connection4 = null;
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner8 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService7);
        java.sql.PreparedStatement preparedStatement9 = null;
        java.sql.ParameterMetaData parameterMetaData10 = null;
        javax.sql.DataSource dataSource11 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource11, executorService12);
        boolean boolean14 = asyncQueryRunner13.isPmdKnownBroken();
        javax.sql.DataSource dataSource15 = asyncQueryRunner13.getDataSource();
        java.sql.PreparedStatement preparedStatement16 = null;
        java.sql.ParameterMetaData parameterMetaData17 = null;
        java.util.concurrent.ExecutorService executorService19 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner20 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService19);
        java.sql.PreparedStatement preparedStatement21 = null;
        java.util.concurrent.ExecutorService executorService23 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner24 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService23);
        java.lang.Class<?> wildcardClass25 = asyncQueryRunner24.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray26 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner20.fillStatementWithBean(preparedStatement21, (java.lang.Object) wildcardClass25, propertyDescriptorArray26);
        asyncQueryRunner13.fillStatement(preparedStatement16, parameterMetaData17, (java.lang.Object[]) propertyDescriptorArray26);
        java.sql.PreparedStatement preparedStatement29 = null;
        java.sql.ParameterMetaData parameterMetaData30 = null;
        java.util.concurrent.ExecutorService executorService32 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner33 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService32);
        java.sql.PreparedStatement preparedStatement34 = null;
        java.util.concurrent.ExecutorService executorService36 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner37 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService36);
        java.lang.Class<?> wildcardClass38 = asyncQueryRunner37.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray39 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner33.fillStatementWithBean(preparedStatement34, (java.lang.Object) wildcardClass38, propertyDescriptorArray39);
        asyncQueryRunner13.fillStatement(preparedStatement29, parameterMetaData30, (java.lang.Object[]) propertyDescriptorArray39);
        asyncQueryRunner8.fillStatement(preparedStatement9, parameterMetaData10, (java.lang.Object[]) propertyDescriptorArray39);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture43 = asyncQueryRunner2.update(connection4, "hi!", (java.lang.Object[]) propertyDescriptorArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(propertyDescriptorArray26);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray26, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(propertyDescriptorArray39);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray39, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test212");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, false, executorService2);
        javax.sql.DataSource dataSource4 = asyncQueryRunner3.getDataSource();
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner7 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner8 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService6, queryRunner7);
        boolean boolean9 = asyncQueryRunner8.isPmdKnownBroken();
        boolean boolean10 = asyncQueryRunner8.isPmdKnownBroken();
        javax.sql.DataSource dataSource11 = asyncQueryRunner8.getDataSource();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture12 = asyncQueryRunner3.update("", (java.lang.Object) asyncQueryRunner8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dataSource11);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test213");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        java.sql.PreparedStatement preparedStatement3 = null;
        java.util.concurrent.ExecutorService executorService5 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner6 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService5);
        java.lang.Class<?> wildcardClass7 = asyncQueryRunner6.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner2.fillStatementWithBean(preparedStatement3, (java.lang.Object) wildcardClass7, propertyDescriptorArray8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = asyncQueryRunner2.getParameterMetaData(preparedStatement10);
        java.sql.PreparedStatement preparedStatement12 = null;
        java.sql.ParameterMetaData parameterMetaData13 = asyncQueryRunner2.getParameterMetaData(preparedStatement12);
        javax.sql.DataSource dataSource14 = asyncQueryRunner2.getDataSource();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture17 = asyncQueryRunner2.update("hi!", (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray8, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(parameterMetaData11);
        org.junit.Assert.assertNull(parameterMetaData13);
        org.junit.Assert.assertNull(dataSource14);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test214");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, false, executorService2);
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = null;
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner7 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService6);
        java.sql.PreparedStatement preparedStatement8 = null;
        java.sql.ParameterMetaData parameterMetaData9 = null;
        javax.sql.DataSource dataSource10 = null;
        java.util.concurrent.ExecutorService executorService11 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner12 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource10, executorService11);
        boolean boolean13 = asyncQueryRunner12.isPmdKnownBroken();
        javax.sql.DataSource dataSource14 = asyncQueryRunner12.getDataSource();
        java.sql.PreparedStatement preparedStatement15 = null;
        java.sql.ParameterMetaData parameterMetaData16 = null;
        java.util.concurrent.ExecutorService executorService18 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner19 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService18);
        java.sql.PreparedStatement preparedStatement20 = null;
        java.util.concurrent.ExecutorService executorService22 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner23 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService22);
        java.lang.Class<?> wildcardClass24 = asyncQueryRunner23.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray25 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner19.fillStatementWithBean(preparedStatement20, (java.lang.Object) wildcardClass24, propertyDescriptorArray25);
        asyncQueryRunner12.fillStatement(preparedStatement15, parameterMetaData16, (java.lang.Object[]) propertyDescriptorArray25);
        asyncQueryRunner7.fillStatement(preparedStatement8, parameterMetaData9, (java.lang.Object[]) propertyDescriptorArray25);
        asyncQueryRunner3.fillStatement(preparedStatement4, parameterMetaData5, (java.lang.Object[]) propertyDescriptorArray25);
        java.util.concurrent.ExecutorService executorService31 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner32 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner33 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService31, queryRunner32);
        boolean boolean34 = asyncQueryRunner33.isPmdKnownBroken();
        javax.sql.DataSource dataSource35 = asyncQueryRunner33.getDataSource();
        java.lang.Class<?> wildcardClass36 = asyncQueryRunner33.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture37 = asyncQueryRunner3.update("", (java.lang.Object) asyncQueryRunner33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(propertyDescriptorArray25);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray25, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(dataSource35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test215");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        java.sql.PreparedStatement preparedStatement3 = null;
        java.sql.ParameterMetaData parameterMetaData4 = null;
        javax.sql.DataSource dataSource5 = null;
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner7 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource5, executorService6);
        boolean boolean8 = asyncQueryRunner7.isPmdKnownBroken();
        javax.sql.DataSource dataSource9 = asyncQueryRunner7.getDataSource();
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = null;
        java.util.concurrent.ExecutorService executorService13 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner14 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService13);
        java.sql.PreparedStatement preparedStatement15 = null;
        java.util.concurrent.ExecutorService executorService17 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner18 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService17);
        java.lang.Class<?> wildcardClass19 = asyncQueryRunner18.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner14.fillStatementWithBean(preparedStatement15, (java.lang.Object) wildcardClass19, propertyDescriptorArray20);
        asyncQueryRunner7.fillStatement(preparedStatement10, parameterMetaData11, (java.lang.Object[]) propertyDescriptorArray20);
        java.sql.PreparedStatement preparedStatement23 = null;
        java.sql.ParameterMetaData parameterMetaData24 = null;
        java.util.concurrent.ExecutorService executorService26 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner27 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService26);
        java.sql.PreparedStatement preparedStatement28 = null;
        java.util.concurrent.ExecutorService executorService30 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner31 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService30);
        java.lang.Class<?> wildcardClass32 = asyncQueryRunner31.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray33 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner27.fillStatementWithBean(preparedStatement28, (java.lang.Object) wildcardClass32, propertyDescriptorArray33);
        asyncQueryRunner7.fillStatement(preparedStatement23, parameterMetaData24, (java.lang.Object[]) propertyDescriptorArray33);
        asyncQueryRunner2.fillStatement(preparedStatement3, parameterMetaData4, (java.lang.Object[]) propertyDescriptorArray33);
        java.util.concurrent.ExecutorService executorService39 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner40 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService39);
        java.sql.PreparedStatement preparedStatement41 = null;
        java.util.concurrent.ExecutorService executorService43 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner44 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService43);
        java.lang.Class<?> wildcardClass45 = asyncQueryRunner44.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray46 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner40.fillStatementWithBean(preparedStatement41, (java.lang.Object) wildcardClass45, propertyDescriptorArray46);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture48 = asyncQueryRunner2.update("hi!", (java.lang.Object[]) propertyDescriptorArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(propertyDescriptorArray20);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray20, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(propertyDescriptorArray33);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray33, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(propertyDescriptorArray46);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray46, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test216");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner8 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService7);
        java.sql.PreparedStatement preparedStatement9 = null;
        java.sql.ParameterMetaData parameterMetaData10 = null;
        javax.sql.DataSource dataSource11 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource11, executorService12);
        boolean boolean14 = asyncQueryRunner13.isPmdKnownBroken();
        javax.sql.DataSource dataSource15 = asyncQueryRunner13.getDataSource();
        java.sql.PreparedStatement preparedStatement16 = null;
        java.sql.ParameterMetaData parameterMetaData17 = null;
        java.util.concurrent.ExecutorService executorService19 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner20 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService19);
        java.sql.PreparedStatement preparedStatement21 = null;
        java.util.concurrent.ExecutorService executorService23 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner24 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService23);
        java.lang.Class<?> wildcardClass25 = asyncQueryRunner24.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray26 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner20.fillStatementWithBean(preparedStatement21, (java.lang.Object) wildcardClass25, propertyDescriptorArray26);
        asyncQueryRunner13.fillStatement(preparedStatement16, parameterMetaData17, (java.lang.Object[]) propertyDescriptorArray26);
        java.sql.PreparedStatement preparedStatement29 = null;
        java.sql.ParameterMetaData parameterMetaData30 = null;
        java.util.concurrent.ExecutorService executorService32 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner33 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService32);
        java.sql.PreparedStatement preparedStatement34 = null;
        java.util.concurrent.ExecutorService executorService36 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner37 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService36);
        java.lang.Class<?> wildcardClass38 = asyncQueryRunner37.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray39 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner33.fillStatementWithBean(preparedStatement34, (java.lang.Object) wildcardClass38, propertyDescriptorArray39);
        asyncQueryRunner13.fillStatement(preparedStatement29, parameterMetaData30, (java.lang.Object[]) propertyDescriptorArray39);
        asyncQueryRunner8.fillStatement(preparedStatement9, parameterMetaData10, (java.lang.Object[]) propertyDescriptorArray39);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture43 = asyncQueryRunner2.update("", (java.lang.Object) asyncQueryRunner8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(propertyDescriptorArray26);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray26, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(propertyDescriptorArray39);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray39, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test217");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.sql.ParameterMetaData parameterMetaData6 = null;
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner8 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService7);
        java.sql.PreparedStatement preparedStatement9 = null;
        java.sql.ParameterMetaData parameterMetaData10 = null;
        javax.sql.DataSource dataSource11 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource11, executorService12);
        boolean boolean14 = asyncQueryRunner13.isPmdKnownBroken();
        javax.sql.DataSource dataSource15 = asyncQueryRunner13.getDataSource();
        java.sql.PreparedStatement preparedStatement16 = null;
        java.sql.ParameterMetaData parameterMetaData17 = null;
        java.util.concurrent.ExecutorService executorService19 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner20 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService19);
        java.sql.PreparedStatement preparedStatement21 = null;
        java.util.concurrent.ExecutorService executorService23 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner24 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService23);
        java.lang.Class<?> wildcardClass25 = asyncQueryRunner24.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray26 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner20.fillStatementWithBean(preparedStatement21, (java.lang.Object) wildcardClass25, propertyDescriptorArray26);
        asyncQueryRunner13.fillStatement(preparedStatement16, parameterMetaData17, (java.lang.Object[]) propertyDescriptorArray26);
        asyncQueryRunner8.fillStatement(preparedStatement9, parameterMetaData10, (java.lang.Object[]) propertyDescriptorArray26);
        asyncQueryRunner2.fillStatement(preparedStatement5, parameterMetaData6, (java.lang.Object[]) propertyDescriptorArray26);
        java.lang.Class<?> wildcardClass31 = asyncQueryRunner2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(propertyDescriptorArray26);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray26, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test218");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture5 = asyncQueryRunner2.update("", (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test219");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        javax.sql.DataSource dataSource5 = asyncQueryRunner2.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(dataSource5);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test220");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        java.sql.PreparedStatement preparedStatement3 = null;
        java.util.concurrent.ExecutorService executorService5 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner6 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService5);
        java.lang.Class<?> wildcardClass7 = asyncQueryRunner6.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner2.fillStatementWithBean(preparedStatement3, (java.lang.Object) wildcardClass7, propertyDescriptorArray8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = asyncQueryRunner2.getParameterMetaData(preparedStatement10);
        java.sql.PreparedStatement preparedStatement12 = null;
        java.sql.ParameterMetaData parameterMetaData13 = asyncQueryRunner2.getParameterMetaData(preparedStatement12);
        javax.sql.DataSource dataSource14 = asyncQueryRunner2.getDataSource();
        java.sql.Connection connection15 = null;
        java.util.concurrent.ExecutorService executorService18 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner19 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService18);
        javax.sql.DataSource dataSource20 = asyncQueryRunner19.getDataSource();
        java.sql.PreparedStatement preparedStatement21 = null;
        java.sql.ParameterMetaData parameterMetaData22 = asyncQueryRunner19.getParameterMetaData(preparedStatement21);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture23 = asyncQueryRunner2.update(connection15, "", (java.lang.Object) parameterMetaData22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray8, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(parameterMetaData11);
        org.junit.Assert.assertNull(parameterMetaData13);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertNull(parameterMetaData22);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test221");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.sql.ParameterMetaData parameterMetaData6 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService12);
        java.lang.Class<?> wildcardClass14 = asyncQueryRunner13.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner9.fillStatementWithBean(preparedStatement10, (java.lang.Object) wildcardClass14, propertyDescriptorArray15);
        asyncQueryRunner2.fillStatement(preparedStatement5, parameterMetaData6, (java.lang.Object[]) propertyDescriptorArray15);
        java.sql.PreparedStatement preparedStatement18 = null;
        java.sql.ParameterMetaData parameterMetaData19 = null;
        java.util.concurrent.ExecutorService executorService21 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner22 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService21);
        java.sql.PreparedStatement preparedStatement23 = null;
        java.util.concurrent.ExecutorService executorService25 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner26 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService25);
        java.lang.Class<?> wildcardClass27 = asyncQueryRunner26.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner22.fillStatementWithBean(preparedStatement23, (java.lang.Object) wildcardClass27, propertyDescriptorArray28);
        asyncQueryRunner2.fillStatement(preparedStatement18, parameterMetaData19, (java.lang.Object[]) propertyDescriptorArray28);
        boolean boolean31 = asyncQueryRunner2.isPmdKnownBroken();
        java.lang.Object[] objArray36 = new java.lang.Object[] { (short) 0, 0.0d, 'a' };
        java.lang.Object[][] objArray37 = new java.lang.Object[][] { objArray36 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<int[]> intArrayFuture38 = asyncQueryRunner2.batch("hi!", objArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray15, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(propertyDescriptorArray28);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray28, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[0, 0.0, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[0, 0.0, a]");
        org.junit.Assert.assertNotNull(objArray37);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test222");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        java.sql.Connection connection4 = null;
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner8 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService7);
        boolean boolean9 = asyncQueryRunner8.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] {};
        asyncQueryRunner8.fillStatement(preparedStatement10, parameterMetaData11, objArray12);
        java.lang.Object[] objArray14 = new java.lang.Object[] { parameterMetaData11 };
        java.lang.Object[][] objArray15 = new java.lang.Object[][] { objArray14 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<int[]> intArrayFuture16 = asyncQueryRunner3.batch(connection4, "", objArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] { null });
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test223");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = asyncQueryRunner3.getParameterMetaData(preparedStatement4);
        javax.sql.DataSource dataSource6 = asyncQueryRunner3.getDataSource();
        java.sql.Connection connection7 = null;
        java.util.concurrent.ExecutorService executorService10 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner11 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService10);
        javax.sql.DataSource dataSource12 = asyncQueryRunner11.getDataSource();
        java.lang.Class<?> wildcardClass13 = asyncQueryRunner11.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture14 = asyncQueryRunner3.update(connection7, "", (java.lang.Object) asyncQueryRunner11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameterMetaData5);
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test224");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = null;
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner7 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService6);
        java.sql.PreparedStatement preparedStatement8 = null;
        java.sql.ParameterMetaData parameterMetaData9 = null;
        javax.sql.DataSource dataSource10 = null;
        java.util.concurrent.ExecutorService executorService11 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner12 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource10, executorService11);
        boolean boolean13 = asyncQueryRunner12.isPmdKnownBroken();
        javax.sql.DataSource dataSource14 = asyncQueryRunner12.getDataSource();
        java.sql.PreparedStatement preparedStatement15 = null;
        java.sql.ParameterMetaData parameterMetaData16 = null;
        java.util.concurrent.ExecutorService executorService18 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner19 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService18);
        java.sql.PreparedStatement preparedStatement20 = null;
        java.util.concurrent.ExecutorService executorService22 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner23 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService22);
        java.lang.Class<?> wildcardClass24 = asyncQueryRunner23.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray25 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner19.fillStatementWithBean(preparedStatement20, (java.lang.Object) wildcardClass24, propertyDescriptorArray25);
        asyncQueryRunner12.fillStatement(preparedStatement15, parameterMetaData16, (java.lang.Object[]) propertyDescriptorArray25);
        asyncQueryRunner7.fillStatement(preparedStatement8, parameterMetaData9, (java.lang.Object[]) propertyDescriptorArray25);
        asyncQueryRunner2.fillStatement(preparedStatement4, parameterMetaData5, (java.lang.Object[]) propertyDescriptorArray25);
        java.sql.Connection connection30 = null;
        javax.sql.DataSource dataSource32 = null;
        java.util.concurrent.ExecutorService executorService33 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner34 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource32, executorService33);
        boolean boolean35 = asyncQueryRunner34.isPmdKnownBroken();
        javax.sql.DataSource dataSource36 = asyncQueryRunner34.getDataSource();
        java.sql.PreparedStatement preparedStatement37 = null;
        java.sql.ParameterMetaData parameterMetaData38 = null;
        java.util.concurrent.ExecutorService executorService40 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner41 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService40);
        java.sql.PreparedStatement preparedStatement42 = null;
        java.util.concurrent.ExecutorService executorService44 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner45 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService44);
        java.lang.Class<?> wildcardClass46 = asyncQueryRunner45.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray47 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner41.fillStatementWithBean(preparedStatement42, (java.lang.Object) wildcardClass46, propertyDescriptorArray47);
        asyncQueryRunner34.fillStatement(preparedStatement37, parameterMetaData38, (java.lang.Object[]) propertyDescriptorArray47);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture50 = asyncQueryRunner2.update(connection30, "", (java.lang.Object[]) propertyDescriptorArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(propertyDescriptorArray25);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray25, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(dataSource36);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(propertyDescriptorArray47);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray47, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test225");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        java.lang.Object[] objArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture6 = asyncQueryRunner2.update("hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test226");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        java.sql.PreparedStatement preparedStatement3 = null;
        java.util.concurrent.ExecutorService executorService5 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner6 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService5);
        java.lang.Class<?> wildcardClass7 = asyncQueryRunner6.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner2.fillStatementWithBean(preparedStatement3, (java.lang.Object) wildcardClass7, propertyDescriptorArray8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = asyncQueryRunner2.getParameterMetaData(preparedStatement10);
        javax.sql.DataSource dataSource13 = null;
        java.util.concurrent.ExecutorService executorService14 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner15 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource13, executorService14);
        boolean boolean16 = asyncQueryRunner15.isPmdKnownBroken();
        javax.sql.DataSource dataSource17 = asyncQueryRunner15.getDataSource();
        java.sql.PreparedStatement preparedStatement18 = null;
        java.sql.ParameterMetaData parameterMetaData19 = null;
        java.util.concurrent.ExecutorService executorService21 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner22 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService21);
        java.sql.PreparedStatement preparedStatement23 = null;
        java.util.concurrent.ExecutorService executorService25 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner26 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService25);
        java.lang.Class<?> wildcardClass27 = asyncQueryRunner26.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner22.fillStatementWithBean(preparedStatement23, (java.lang.Object) wildcardClass27, propertyDescriptorArray28);
        asyncQueryRunner15.fillStatement(preparedStatement18, parameterMetaData19, (java.lang.Object[]) propertyDescriptorArray28);
        java.sql.PreparedStatement preparedStatement31 = null;
        java.sql.ParameterMetaData parameterMetaData32 = null;
        java.util.concurrent.ExecutorService executorService34 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner35 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService34);
        java.sql.PreparedStatement preparedStatement36 = null;
        java.util.concurrent.ExecutorService executorService38 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner39 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService38);
        java.lang.Class<?> wildcardClass40 = asyncQueryRunner39.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray41 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner35.fillStatementWithBean(preparedStatement36, (java.lang.Object) wildcardClass40, propertyDescriptorArray41);
        asyncQueryRunner15.fillStatement(preparedStatement31, parameterMetaData32, (java.lang.Object[]) propertyDescriptorArray41);
        java.sql.PreparedStatement preparedStatement44 = null;
        java.sql.ParameterMetaData parameterMetaData45 = null;
        java.lang.Object[] objArray46 = null;
        asyncQueryRunner15.fillStatement(preparedStatement44, parameterMetaData45, objArray46);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture48 = asyncQueryRunner2.update("hi!", (java.lang.Object) parameterMetaData45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray8, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(parameterMetaData11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(propertyDescriptorArray28);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray28, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(propertyDescriptorArray41);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray41, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test227");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService1);
        javax.sql.DataSource dataSource3 = asyncQueryRunner2.getDataSource();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        java.lang.Class<?> wildcardClass5 = asyncQueryRunner2.getClass();
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test228");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        java.sql.PreparedStatement preparedStatement3 = null;
        java.util.concurrent.ExecutorService executorService5 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner6 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService5);
        java.lang.Class<?> wildcardClass7 = asyncQueryRunner6.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner2.fillStatementWithBean(preparedStatement3, (java.lang.Object) wildcardClass7, propertyDescriptorArray8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = asyncQueryRunner2.getParameterMetaData(preparedStatement10);
        java.util.concurrent.ExecutorService executorService14 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner15 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService14);
        boolean boolean16 = asyncQueryRunner15.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement17 = null;
        java.sql.ParameterMetaData parameterMetaData18 = null;
        java.lang.Object[] objArray19 = new java.lang.Object[] {};
        asyncQueryRunner15.fillStatement(preparedStatement17, parameterMetaData18, objArray19);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture21 = asyncQueryRunner2.update("hi!", objArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray8, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(parameterMetaData11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertArrayEquals(objArray19, new java.lang.Object[] {});
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test229");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.Connection connection4 = null;
        javax.sql.DataSource dataSource6 = null;
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner8 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource6, executorService7);
        java.lang.Object[] objArray9 = new java.lang.Object[] { dataSource6 };
        javax.sql.DataSource dataSource10 = null;
        java.util.concurrent.ExecutorService executorService11 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner12 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource10, executorService11);
        java.lang.Object[] objArray13 = new java.lang.Object[] { dataSource10 };
        javax.sql.DataSource dataSource14 = null;
        java.util.concurrent.ExecutorService executorService15 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner16 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource14, executorService15);
        java.lang.Object[] objArray17 = new java.lang.Object[] { dataSource14 };
        java.lang.Object[][] objArray18 = new java.lang.Object[][] { objArray9, objArray13, objArray17 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<int[]> intArrayFuture19 = asyncQueryRunner2.batch(connection4, "", objArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] { null });
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertArrayEquals(objArray13, new java.lang.Object[] { null });
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] { null });
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test230");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.sql.ParameterMetaData parameterMetaData6 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService12);
        java.lang.Class<?> wildcardClass14 = asyncQueryRunner13.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner9.fillStatementWithBean(preparedStatement10, (java.lang.Object) wildcardClass14, propertyDescriptorArray15);
        asyncQueryRunner2.fillStatement(preparedStatement5, parameterMetaData6, (java.lang.Object[]) propertyDescriptorArray15);
        java.sql.PreparedStatement preparedStatement18 = null;
        java.sql.ParameterMetaData parameterMetaData19 = null;
        java.util.concurrent.ExecutorService executorService21 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner22 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService21);
        java.sql.PreparedStatement preparedStatement23 = null;
        java.util.concurrent.ExecutorService executorService25 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner26 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService25);
        java.lang.Class<?> wildcardClass27 = asyncQueryRunner26.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner22.fillStatementWithBean(preparedStatement23, (java.lang.Object) wildcardClass27, propertyDescriptorArray28);
        asyncQueryRunner2.fillStatement(preparedStatement18, parameterMetaData19, (java.lang.Object[]) propertyDescriptorArray28);
        java.sql.PreparedStatement preparedStatement31 = null;
        java.sql.ParameterMetaData parameterMetaData32 = null;
        java.lang.Object[] objArray33 = null;
        asyncQueryRunner2.fillStatement(preparedStatement31, parameterMetaData32, objArray33);
        java.sql.PreparedStatement preparedStatement35 = null;
        java.util.concurrent.ExecutorService executorService37 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner38 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService37);
        java.sql.PreparedStatement preparedStatement39 = null;
        java.sql.ParameterMetaData parameterMetaData40 = null;
        java.util.concurrent.ExecutorService executorService42 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner43 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService42);
        java.sql.PreparedStatement preparedStatement44 = null;
        java.util.concurrent.ExecutorService executorService46 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner47 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService46);
        java.lang.Class<?> wildcardClass48 = asyncQueryRunner47.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray49 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner43.fillStatementWithBean(preparedStatement44, (java.lang.Object) wildcardClass48, propertyDescriptorArray49);
        asyncQueryRunner38.fillStatement(preparedStatement39, parameterMetaData40, (java.lang.Object[]) propertyDescriptorArray49);
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner2.fillStatement(preparedStatement35, (java.lang.Object[]) propertyDescriptorArray49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray15, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(propertyDescriptorArray28);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray28, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(propertyDescriptorArray49);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray49, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test231");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = null;
        javax.sql.DataSource dataSource6 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource6, false, executorService8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService12);
        java.sql.PreparedStatement preparedStatement14 = null;
        java.sql.ParameterMetaData parameterMetaData15 = null;
        javax.sql.DataSource dataSource16 = null;
        java.util.concurrent.ExecutorService executorService17 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner18 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource16, executorService17);
        boolean boolean19 = asyncQueryRunner18.isPmdKnownBroken();
        javax.sql.DataSource dataSource20 = asyncQueryRunner18.getDataSource();
        java.sql.PreparedStatement preparedStatement21 = null;
        java.sql.ParameterMetaData parameterMetaData22 = null;
        java.util.concurrent.ExecutorService executorService24 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner25 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService24);
        java.sql.PreparedStatement preparedStatement26 = null;
        java.util.concurrent.ExecutorService executorService28 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner29 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService28);
        java.lang.Class<?> wildcardClass30 = asyncQueryRunner29.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray31 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner25.fillStatementWithBean(preparedStatement26, (java.lang.Object) wildcardClass30, propertyDescriptorArray31);
        asyncQueryRunner18.fillStatement(preparedStatement21, parameterMetaData22, (java.lang.Object[]) propertyDescriptorArray31);
        asyncQueryRunner13.fillStatement(preparedStatement14, parameterMetaData15, (java.lang.Object[]) propertyDescriptorArray31);
        asyncQueryRunner9.fillStatement(preparedStatement10, parameterMetaData11, (java.lang.Object[]) propertyDescriptorArray31);
        asyncQueryRunner2.fillStatement(preparedStatement4, parameterMetaData5, (java.lang.Object[]) propertyDescriptorArray31);
        boolean boolean37 = asyncQueryRunner2.isPmdKnownBroken();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(propertyDescriptorArray31);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray31, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test232");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        boolean boolean4 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.Connection connection5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture7 = asyncQueryRunner2.update(connection5, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test233");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        java.sql.PreparedStatement preparedStatement4 = null;
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner7 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService6);
        boolean boolean8 = asyncQueryRunner7.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement9 = null;
        java.sql.ParameterMetaData parameterMetaData10 = null;
        javax.sql.DataSource dataSource11 = null;
        java.util.concurrent.ExecutorService executorService13 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner14 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource11, false, executorService13);
        java.sql.PreparedStatement preparedStatement15 = null;
        java.sql.ParameterMetaData parameterMetaData16 = null;
        java.util.concurrent.ExecutorService executorService17 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner18 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService17);
        java.sql.PreparedStatement preparedStatement19 = null;
        java.sql.ParameterMetaData parameterMetaData20 = null;
        javax.sql.DataSource dataSource21 = null;
        java.util.concurrent.ExecutorService executorService22 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner23 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource21, executorService22);
        boolean boolean24 = asyncQueryRunner23.isPmdKnownBroken();
        javax.sql.DataSource dataSource25 = asyncQueryRunner23.getDataSource();
        java.sql.PreparedStatement preparedStatement26 = null;
        java.sql.ParameterMetaData parameterMetaData27 = null;
        java.util.concurrent.ExecutorService executorService29 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner30 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService29);
        java.sql.PreparedStatement preparedStatement31 = null;
        java.util.concurrent.ExecutorService executorService33 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner34 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService33);
        java.lang.Class<?> wildcardClass35 = asyncQueryRunner34.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray36 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner30.fillStatementWithBean(preparedStatement31, (java.lang.Object) wildcardClass35, propertyDescriptorArray36);
        asyncQueryRunner23.fillStatement(preparedStatement26, parameterMetaData27, (java.lang.Object[]) propertyDescriptorArray36);
        asyncQueryRunner18.fillStatement(preparedStatement19, parameterMetaData20, (java.lang.Object[]) propertyDescriptorArray36);
        asyncQueryRunner14.fillStatement(preparedStatement15, parameterMetaData16, (java.lang.Object[]) propertyDescriptorArray36);
        asyncQueryRunner7.fillStatement(preparedStatement9, parameterMetaData10, (java.lang.Object[]) propertyDescriptorArray36);
        asyncQueryRunner3.fillStatement(preparedStatement4, (java.lang.Object[]) propertyDescriptorArray36);
        javax.sql.DataSource dataSource44 = null;
        java.util.concurrent.ExecutorService executorService45 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner46 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource44, executorService45);
        boolean boolean47 = asyncQueryRunner46.isPmdKnownBroken();
        javax.sql.DataSource dataSource48 = asyncQueryRunner46.getDataSource();
        java.sql.PreparedStatement preparedStatement49 = null;
        java.sql.ParameterMetaData parameterMetaData50 = null;
        java.util.concurrent.ExecutorService executorService52 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner53 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService52);
        java.sql.PreparedStatement preparedStatement54 = null;
        java.util.concurrent.ExecutorService executorService56 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner57 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService56);
        java.lang.Class<?> wildcardClass58 = asyncQueryRunner57.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray59 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner53.fillStatementWithBean(preparedStatement54, (java.lang.Object) wildcardClass58, propertyDescriptorArray59);
        asyncQueryRunner46.fillStatement(preparedStatement49, parameterMetaData50, (java.lang.Object[]) propertyDescriptorArray59);
        java.sql.PreparedStatement preparedStatement62 = null;
        java.sql.ParameterMetaData parameterMetaData63 = null;
        java.util.concurrent.ExecutorService executorService65 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner66 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService65);
        java.sql.PreparedStatement preparedStatement67 = null;
        java.util.concurrent.ExecutorService executorService69 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner70 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService69);
        java.lang.Class<?> wildcardClass71 = asyncQueryRunner70.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray72 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner66.fillStatementWithBean(preparedStatement67, (java.lang.Object) wildcardClass71, propertyDescriptorArray72);
        asyncQueryRunner46.fillStatement(preparedStatement62, parameterMetaData63, (java.lang.Object[]) propertyDescriptorArray72);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture75 = asyncQueryRunner3.update("", (java.lang.Object[]) propertyDescriptorArray72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(dataSource25);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(propertyDescriptorArray36);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray36, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(dataSource48);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(propertyDescriptorArray59);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray59, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(propertyDescriptorArray72);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray72, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test234");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        java.sql.PreparedStatement preparedStatement3 = null;
        java.util.concurrent.ExecutorService executorService5 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner6 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService5);
        java.lang.Class<?> wildcardClass7 = asyncQueryRunner6.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner2.fillStatementWithBean(preparedStatement3, (java.lang.Object) wildcardClass7, propertyDescriptorArray8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = asyncQueryRunner2.getParameterMetaData(preparedStatement10);
        java.sql.PreparedStatement preparedStatement12 = null;
        javax.sql.DataSource dataSource13 = null;
        java.util.concurrent.ExecutorService executorService15 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner16 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource13, true, executorService15);
        java.sql.PreparedStatement preparedStatement17 = null;
        java.sql.ParameterMetaData parameterMetaData18 = asyncQueryRunner16.getParameterMetaData(preparedStatement17);
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner2.fillStatementWithBean(preparedStatement12, (java.lang.Object) asyncQueryRunner16, strArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Couldn't find bean property: class org.apache.commons.dbutils.AsyncQueryRunner ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray8, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(parameterMetaData11);
        org.junit.Assert.assertNull(parameterMetaData18);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "" });
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test235");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, false, executorService2);
        java.sql.Connection connection4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture6 = asyncQueryRunner3.update(connection4, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test236");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.sql.ParameterMetaData parameterMetaData6 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService12);
        java.lang.Class<?> wildcardClass14 = asyncQueryRunner13.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner9.fillStatementWithBean(preparedStatement10, (java.lang.Object) wildcardClass14, propertyDescriptorArray15);
        asyncQueryRunner2.fillStatement(preparedStatement5, parameterMetaData6, (java.lang.Object[]) propertyDescriptorArray15);
        java.sql.Connection connection18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture20 = asyncQueryRunner2.update(connection18, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray15, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test237");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        asyncQueryRunner2.fillStatement(preparedStatement4, parameterMetaData5, objArray6);
        java.sql.PreparedStatement preparedStatement8 = null;
        java.util.concurrent.ExecutorService executorService10 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner11 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService10);
        boolean boolean12 = asyncQueryRunner11.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement13 = null;
        java.sql.ParameterMetaData parameterMetaData14 = null;
        java.lang.Object[] objArray15 = new java.lang.Object[] {};
        asyncQueryRunner11.fillStatement(preparedStatement13, parameterMetaData14, objArray15);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner2.fillStatementWithBean(preparedStatement8, (java.lang.Object) parameterMetaData14, strArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"bean\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "", "", "", "", "hi!" });
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test238");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        java.sql.Connection connection5 = null;
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<int[]> intArrayFuture8 = asyncQueryRunner2.batch(connection5, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test239");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.Connection connection4 = null;
        javax.sql.DataSource dataSource6 = null;
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner8 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource6, executorService7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture9 = asyncQueryRunner2.update(connection4, "", (java.lang.Object) dataSource6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test240");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        boolean boolean4 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.Connection connection5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture7 = asyncQueryRunner2.update(connection5, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test241");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        javax.sql.DataSource dataSource3 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = null;
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner8 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService7);
        java.sql.PreparedStatement preparedStatement9 = null;
        java.sql.ParameterMetaData parameterMetaData10 = null;
        javax.sql.DataSource dataSource11 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource11, executorService12);
        boolean boolean14 = asyncQueryRunner13.isPmdKnownBroken();
        javax.sql.DataSource dataSource15 = asyncQueryRunner13.getDataSource();
        java.sql.PreparedStatement preparedStatement16 = null;
        java.sql.ParameterMetaData parameterMetaData17 = null;
        java.util.concurrent.ExecutorService executorService19 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner20 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService19);
        java.sql.PreparedStatement preparedStatement21 = null;
        java.util.concurrent.ExecutorService executorService23 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner24 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService23);
        java.lang.Class<?> wildcardClass25 = asyncQueryRunner24.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray26 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner20.fillStatementWithBean(preparedStatement21, (java.lang.Object) wildcardClass25, propertyDescriptorArray26);
        asyncQueryRunner13.fillStatement(preparedStatement16, parameterMetaData17, (java.lang.Object[]) propertyDescriptorArray26);
        java.sql.PreparedStatement preparedStatement29 = null;
        java.sql.ParameterMetaData parameterMetaData30 = null;
        java.util.concurrent.ExecutorService executorService32 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner33 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService32);
        java.sql.PreparedStatement preparedStatement34 = null;
        java.util.concurrent.ExecutorService executorService36 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner37 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService36);
        java.lang.Class<?> wildcardClass38 = asyncQueryRunner37.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray39 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner33.fillStatementWithBean(preparedStatement34, (java.lang.Object) wildcardClass38, propertyDescriptorArray39);
        asyncQueryRunner13.fillStatement(preparedStatement29, parameterMetaData30, (java.lang.Object[]) propertyDescriptorArray39);
        asyncQueryRunner8.fillStatement(preparedStatement9, parameterMetaData10, (java.lang.Object[]) propertyDescriptorArray39);
        asyncQueryRunner2.fillStatement(preparedStatement4, parameterMetaData5, (java.lang.Object[]) propertyDescriptorArray39);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(propertyDescriptorArray26);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray26, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(propertyDescriptorArray39);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray39, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test242");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        java.sql.PreparedStatement preparedStatement3 = null;
        java.sql.ParameterMetaData parameterMetaData4 = null;
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner7 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService6);
        java.sql.PreparedStatement preparedStatement8 = null;
        java.util.concurrent.ExecutorService executorService10 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner11 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService10);
        java.lang.Class<?> wildcardClass12 = asyncQueryRunner11.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner7.fillStatementWithBean(preparedStatement8, (java.lang.Object) wildcardClass12, propertyDescriptorArray13);
        asyncQueryRunner2.fillStatement(preparedStatement3, parameterMetaData4, (java.lang.Object[]) propertyDescriptorArray13);
        java.sql.Connection connection16 = null;
        javax.sql.DataSource dataSource18 = null;
        java.util.concurrent.ExecutorService executorService19 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner20 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource18, executorService19);
        boolean boolean21 = asyncQueryRunner20.isPmdKnownBroken();
        javax.sql.DataSource dataSource22 = asyncQueryRunner20.getDataSource();
        java.lang.Object[] objArray23 = new java.lang.Object[] { asyncQueryRunner20 };
        javax.sql.DataSource dataSource24 = null;
        java.util.concurrent.ExecutorService executorService25 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner26 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource24, executorService25);
        boolean boolean27 = asyncQueryRunner26.isPmdKnownBroken();
        javax.sql.DataSource dataSource28 = asyncQueryRunner26.getDataSource();
        java.lang.Object[] objArray29 = new java.lang.Object[] { asyncQueryRunner26 };
        javax.sql.DataSource dataSource30 = null;
        java.util.concurrent.ExecutorService executorService31 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner32 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource30, executorService31);
        boolean boolean33 = asyncQueryRunner32.isPmdKnownBroken();
        javax.sql.DataSource dataSource34 = asyncQueryRunner32.getDataSource();
        java.lang.Object[] objArray35 = new java.lang.Object[] { asyncQueryRunner32 };
        java.lang.Object[][] objArray36 = new java.lang.Object[][] { objArray23, objArray29, objArray35 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<int[]> intArrayFuture37 = asyncQueryRunner2.batch(connection16, "hi!", objArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(propertyDescriptorArray13);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray13, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(dataSource22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(dataSource28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(dataSource34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test243");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, false, executorService2);
        java.sql.Connection connection4 = null;
        javax.sql.DataSource dataSource6 = null;
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner8 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource6, executorService7);
        boolean boolean9 = asyncQueryRunner8.isPmdKnownBroken();
        javax.sql.DataSource dataSource10 = asyncQueryRunner8.getDataSource();
        java.sql.PreparedStatement preparedStatement11 = null;
        java.sql.ParameterMetaData parameterMetaData12 = null;
        java.util.concurrent.ExecutorService executorService14 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner15 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService14);
        java.sql.PreparedStatement preparedStatement16 = null;
        java.util.concurrent.ExecutorService executorService18 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner19 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService18);
        java.lang.Class<?> wildcardClass20 = asyncQueryRunner19.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner15.fillStatementWithBean(preparedStatement16, (java.lang.Object) wildcardClass20, propertyDescriptorArray21);
        asyncQueryRunner8.fillStatement(preparedStatement11, parameterMetaData12, (java.lang.Object[]) propertyDescriptorArray21);
        java.sql.PreparedStatement preparedStatement24 = null;
        java.sql.ParameterMetaData parameterMetaData25 = null;
        java.util.concurrent.ExecutorService executorService27 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner28 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService27);
        java.sql.PreparedStatement preparedStatement29 = null;
        java.util.concurrent.ExecutorService executorService31 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner32 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService31);
        java.lang.Class<?> wildcardClass33 = asyncQueryRunner32.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray34 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner28.fillStatementWithBean(preparedStatement29, (java.lang.Object) wildcardClass33, propertyDescriptorArray34);
        asyncQueryRunner8.fillStatement(preparedStatement24, parameterMetaData25, (java.lang.Object[]) propertyDescriptorArray34);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture37 = asyncQueryRunner3.update(connection4, "", (java.lang.Object) propertyDescriptorArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(propertyDescriptorArray21);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray21, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(propertyDescriptorArray34);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray34, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test244");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        asyncQueryRunner2.fillStatement(preparedStatement4, parameterMetaData5, objArray6);
        java.lang.Object[] objArray9 = new java.lang.Object[] {};
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        java.lang.Object[] objArray11 = new java.lang.Object[] {};
        java.lang.Object[] objArray12 = new java.lang.Object[] {};
        java.lang.Object[] objArray13 = new java.lang.Object[] {};
        java.lang.Object[][] objArray14 = new java.lang.Object[][] { objArray9, objArray10, objArray11, objArray12, objArray13 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<int[]> intArrayFuture15 = asyncQueryRunner2.batch("hi!", objArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertArrayEquals(objArray13, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test245");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.sql.ParameterMetaData parameterMetaData6 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService12);
        java.lang.Class<?> wildcardClass14 = asyncQueryRunner13.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner9.fillStatementWithBean(preparedStatement10, (java.lang.Object) wildcardClass14, propertyDescriptorArray15);
        asyncQueryRunner2.fillStatement(preparedStatement5, parameterMetaData6, (java.lang.Object[]) propertyDescriptorArray15);
        java.sql.PreparedStatement preparedStatement18 = null;
        java.sql.ParameterMetaData parameterMetaData19 = null;
        java.util.concurrent.ExecutorService executorService21 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner22 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService21);
        java.sql.PreparedStatement preparedStatement23 = null;
        java.util.concurrent.ExecutorService executorService25 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner26 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService25);
        java.lang.Class<?> wildcardClass27 = asyncQueryRunner26.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner22.fillStatementWithBean(preparedStatement23, (java.lang.Object) wildcardClass27, propertyDescriptorArray28);
        asyncQueryRunner2.fillStatement(preparedStatement18, parameterMetaData19, (java.lang.Object[]) propertyDescriptorArray28);
        java.sql.PreparedStatement preparedStatement31 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.sql.ParameterMetaData parameterMetaData32 = asyncQueryRunner2.getParameterMetaData(preparedStatement31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray15, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(propertyDescriptorArray28);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray28, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test246");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        boolean boolean4 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.Connection connection5 = null;
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<int[]> intArrayFuture8 = asyncQueryRunner2.batch(connection5, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test247");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService1);
        java.sql.Connection connection3 = null;
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner7 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService6);
        java.sql.PreparedStatement preparedStatement8 = null;
        java.util.concurrent.ExecutorService executorService10 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner11 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService10);
        java.lang.Class<?> wildcardClass12 = asyncQueryRunner11.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner7.fillStatementWithBean(preparedStatement8, (java.lang.Object) wildcardClass12, propertyDescriptorArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture15 = asyncQueryRunner2.update(connection3, "", (java.lang.Object[]) propertyDescriptorArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(propertyDescriptorArray13);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray13, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test248");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService1);
        javax.sql.DataSource dataSource3 = asyncQueryRunner2.getDataSource();
        javax.sql.DataSource dataSource5 = null;
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner7 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource5, executorService6);
        boolean boolean8 = asyncQueryRunner7.isPmdKnownBroken();
        javax.sql.DataSource dataSource9 = asyncQueryRunner7.getDataSource();
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = null;
        java.util.concurrent.ExecutorService executorService13 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner14 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService13);
        java.sql.PreparedStatement preparedStatement15 = null;
        java.util.concurrent.ExecutorService executorService17 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner18 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService17);
        java.lang.Class<?> wildcardClass19 = asyncQueryRunner18.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner14.fillStatementWithBean(preparedStatement15, (java.lang.Object) wildcardClass19, propertyDescriptorArray20);
        asyncQueryRunner7.fillStatement(preparedStatement10, parameterMetaData11, (java.lang.Object[]) propertyDescriptorArray20);
        java.sql.PreparedStatement preparedStatement23 = null;
        java.sql.ParameterMetaData parameterMetaData24 = null;
        java.util.concurrent.ExecutorService executorService26 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner27 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService26);
        java.sql.PreparedStatement preparedStatement28 = null;
        java.util.concurrent.ExecutorService executorService30 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner31 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService30);
        java.lang.Class<?> wildcardClass32 = asyncQueryRunner31.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray33 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner27.fillStatementWithBean(preparedStatement28, (java.lang.Object) wildcardClass32, propertyDescriptorArray33);
        asyncQueryRunner7.fillStatement(preparedStatement23, parameterMetaData24, (java.lang.Object[]) propertyDescriptorArray33);
        boolean boolean36 = asyncQueryRunner7.isPmdKnownBroken();
        javax.sql.DataSource dataSource37 = asyncQueryRunner7.getDataSource();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture38 = asyncQueryRunner2.update("", (java.lang.Object) dataSource37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(propertyDescriptorArray20);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray20, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(propertyDescriptorArray33);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray33, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(dataSource37);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test249");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner1 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0);
        java.sql.PreparedStatement preparedStatement2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.sql.ParameterMetaData parameterMetaData3 = asyncQueryRunner1.getParameterMetaData(preparedStatement2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test250");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture4 = asyncQueryRunner2.update("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test251");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, false, executorService2);
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = null;
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner7 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService6);
        java.sql.PreparedStatement preparedStatement8 = null;
        java.sql.ParameterMetaData parameterMetaData9 = null;
        javax.sql.DataSource dataSource10 = null;
        java.util.concurrent.ExecutorService executorService11 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner12 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource10, executorService11);
        boolean boolean13 = asyncQueryRunner12.isPmdKnownBroken();
        javax.sql.DataSource dataSource14 = asyncQueryRunner12.getDataSource();
        java.sql.PreparedStatement preparedStatement15 = null;
        java.sql.ParameterMetaData parameterMetaData16 = null;
        java.util.concurrent.ExecutorService executorService18 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner19 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService18);
        java.sql.PreparedStatement preparedStatement20 = null;
        java.util.concurrent.ExecutorService executorService22 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner23 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService22);
        java.lang.Class<?> wildcardClass24 = asyncQueryRunner23.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray25 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner19.fillStatementWithBean(preparedStatement20, (java.lang.Object) wildcardClass24, propertyDescriptorArray25);
        asyncQueryRunner12.fillStatement(preparedStatement15, parameterMetaData16, (java.lang.Object[]) propertyDescriptorArray25);
        asyncQueryRunner7.fillStatement(preparedStatement8, parameterMetaData9, (java.lang.Object[]) propertyDescriptorArray25);
        asyncQueryRunner3.fillStatement(preparedStatement4, parameterMetaData5, (java.lang.Object[]) propertyDescriptorArray25);
        boolean boolean30 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.Connection connection31 = null;
        java.lang.Object[][] objArray33 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<int[]> intArrayFuture34 = asyncQueryRunner3.batch(connection31, "hi!", objArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(propertyDescriptorArray25);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray25, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test252");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService1);
        javax.sql.DataSource dataSource3 = asyncQueryRunner2.getDataSource();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = dataSource4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertNull(dataSource4);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test253");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.sql.ParameterMetaData parameterMetaData6 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService12);
        java.lang.Class<?> wildcardClass14 = asyncQueryRunner13.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner9.fillStatementWithBean(preparedStatement10, (java.lang.Object) wildcardClass14, propertyDescriptorArray15);
        asyncQueryRunner2.fillStatement(preparedStatement5, parameterMetaData6, (java.lang.Object[]) propertyDescriptorArray15);
        javax.sql.DataSource dataSource18 = asyncQueryRunner2.getDataSource();
        java.lang.Class<?> wildcardClass19 = asyncQueryRunner2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray15, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test254");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = null;
        javax.sql.DataSource dataSource6 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource6, false, executorService8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService12);
        java.sql.PreparedStatement preparedStatement14 = null;
        java.sql.ParameterMetaData parameterMetaData15 = null;
        javax.sql.DataSource dataSource16 = null;
        java.util.concurrent.ExecutorService executorService17 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner18 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource16, executorService17);
        boolean boolean19 = asyncQueryRunner18.isPmdKnownBroken();
        javax.sql.DataSource dataSource20 = asyncQueryRunner18.getDataSource();
        java.sql.PreparedStatement preparedStatement21 = null;
        java.sql.ParameterMetaData parameterMetaData22 = null;
        java.util.concurrent.ExecutorService executorService24 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner25 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService24);
        java.sql.PreparedStatement preparedStatement26 = null;
        java.util.concurrent.ExecutorService executorService28 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner29 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService28);
        java.lang.Class<?> wildcardClass30 = asyncQueryRunner29.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray31 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner25.fillStatementWithBean(preparedStatement26, (java.lang.Object) wildcardClass30, propertyDescriptorArray31);
        asyncQueryRunner18.fillStatement(preparedStatement21, parameterMetaData22, (java.lang.Object[]) propertyDescriptorArray31);
        asyncQueryRunner13.fillStatement(preparedStatement14, parameterMetaData15, (java.lang.Object[]) propertyDescriptorArray31);
        asyncQueryRunner9.fillStatement(preparedStatement10, parameterMetaData11, (java.lang.Object[]) propertyDescriptorArray31);
        asyncQueryRunner2.fillStatement(preparedStatement4, parameterMetaData5, (java.lang.Object[]) propertyDescriptorArray31);
        java.sql.PreparedStatement preparedStatement37 = null;
        javax.sql.DataSource dataSource38 = null;
        java.util.concurrent.ExecutorService executorService40 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner41 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource38, false, executorService40);
        java.sql.PreparedStatement preparedStatement42 = null;
        java.sql.ParameterMetaData parameterMetaData43 = null;
        java.util.concurrent.ExecutorService executorService44 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner45 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService44);
        java.sql.PreparedStatement preparedStatement46 = null;
        java.sql.ParameterMetaData parameterMetaData47 = null;
        javax.sql.DataSource dataSource48 = null;
        java.util.concurrent.ExecutorService executorService49 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner50 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource48, executorService49);
        boolean boolean51 = asyncQueryRunner50.isPmdKnownBroken();
        javax.sql.DataSource dataSource52 = asyncQueryRunner50.getDataSource();
        java.sql.PreparedStatement preparedStatement53 = null;
        java.sql.ParameterMetaData parameterMetaData54 = null;
        java.util.concurrent.ExecutorService executorService56 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner57 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService56);
        java.sql.PreparedStatement preparedStatement58 = null;
        java.util.concurrent.ExecutorService executorService60 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner61 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService60);
        java.lang.Class<?> wildcardClass62 = asyncQueryRunner61.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray63 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner57.fillStatementWithBean(preparedStatement58, (java.lang.Object) wildcardClass62, propertyDescriptorArray63);
        asyncQueryRunner50.fillStatement(preparedStatement53, parameterMetaData54, (java.lang.Object[]) propertyDescriptorArray63);
        asyncQueryRunner45.fillStatement(preparedStatement46, parameterMetaData47, (java.lang.Object[]) propertyDescriptorArray63);
        asyncQueryRunner41.fillStatement(preparedStatement42, parameterMetaData43, (java.lang.Object[]) propertyDescriptorArray63);
        boolean boolean68 = asyncQueryRunner41.isPmdKnownBroken();
        java.lang.String[] strArray75 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner2.fillStatementWithBean(preparedStatement37, (java.lang.Object) boolean68, strArray75);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Couldn't find bean property: class java.lang.Boolean ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(propertyDescriptorArray31);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray31, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(dataSource52);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(propertyDescriptorArray63);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray63, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test255");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        java.sql.PreparedStatement preparedStatement3 = null;
        java.util.concurrent.ExecutorService executorService5 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner6 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService5);
        java.lang.Class<?> wildcardClass7 = asyncQueryRunner6.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner2.fillStatementWithBean(preparedStatement3, (java.lang.Object) wildcardClass7, propertyDescriptorArray8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = null;
        javax.sql.DataSource dataSource12 = null;
        java.util.concurrent.ExecutorService executorService14 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner15 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource12, true, executorService14);
        java.sql.PreparedStatement preparedStatement16 = null;
        java.sql.ParameterMetaData parameterMetaData17 = asyncQueryRunner15.getParameterMetaData(preparedStatement16);
        java.sql.PreparedStatement preparedStatement18 = null;
        java.util.concurrent.ExecutorService executorService20 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner21 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService20);
        boolean boolean22 = asyncQueryRunner21.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement23 = null;
        java.util.concurrent.ExecutorService executorService25 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner26 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService25);
        java.sql.PreparedStatement preparedStatement27 = null;
        java.util.concurrent.ExecutorService executorService29 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner30 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService29);
        java.lang.Class<?> wildcardClass31 = asyncQueryRunner30.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray32 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner26.fillStatementWithBean(preparedStatement27, (java.lang.Object) wildcardClass31, propertyDescriptorArray32);
        asyncQueryRunner21.fillStatement(preparedStatement23, (java.lang.Object[]) propertyDescriptorArray32);
        asyncQueryRunner15.fillStatement(preparedStatement18, (java.lang.Object[]) propertyDescriptorArray32);
        asyncQueryRunner2.fillStatement(preparedStatement10, parameterMetaData11, (java.lang.Object[]) propertyDescriptorArray32);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray8, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(parameterMetaData17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(propertyDescriptorArray32);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray32, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test256");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = null;
        javax.sql.DataSource dataSource6 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource6, false, executorService8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService12);
        java.sql.PreparedStatement preparedStatement14 = null;
        java.sql.ParameterMetaData parameterMetaData15 = null;
        javax.sql.DataSource dataSource16 = null;
        java.util.concurrent.ExecutorService executorService17 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner18 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource16, executorService17);
        boolean boolean19 = asyncQueryRunner18.isPmdKnownBroken();
        javax.sql.DataSource dataSource20 = asyncQueryRunner18.getDataSource();
        java.sql.PreparedStatement preparedStatement21 = null;
        java.sql.ParameterMetaData parameterMetaData22 = null;
        java.util.concurrent.ExecutorService executorService24 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner25 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService24);
        java.sql.PreparedStatement preparedStatement26 = null;
        java.util.concurrent.ExecutorService executorService28 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner29 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService28);
        java.lang.Class<?> wildcardClass30 = asyncQueryRunner29.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray31 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner25.fillStatementWithBean(preparedStatement26, (java.lang.Object) wildcardClass30, propertyDescriptorArray31);
        asyncQueryRunner18.fillStatement(preparedStatement21, parameterMetaData22, (java.lang.Object[]) propertyDescriptorArray31);
        asyncQueryRunner13.fillStatement(preparedStatement14, parameterMetaData15, (java.lang.Object[]) propertyDescriptorArray31);
        asyncQueryRunner9.fillStatement(preparedStatement10, parameterMetaData11, (java.lang.Object[]) propertyDescriptorArray31);
        asyncQueryRunner2.fillStatement(preparedStatement4, parameterMetaData5, (java.lang.Object[]) propertyDescriptorArray31);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture38 = asyncQueryRunner2.update("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(propertyDescriptorArray31);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray31, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test257");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        java.sql.PreparedStatement preparedStatement3 = null;
        java.util.concurrent.ExecutorService executorService5 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner6 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService5);
        java.lang.Class<?> wildcardClass7 = asyncQueryRunner6.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner2.fillStatementWithBean(preparedStatement3, (java.lang.Object) wildcardClass7, propertyDescriptorArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture12 = asyncQueryRunner2.update("", (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray8, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test258");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, false, executorService2);
        javax.sql.DataSource dataSource4 = asyncQueryRunner3.getDataSource();
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner7 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner8 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService6, queryRunner7);
        boolean boolean9 = asyncQueryRunner8.isPmdKnownBroken();
        javax.sql.DataSource dataSource10 = asyncQueryRunner8.getDataSource();
        java.lang.Class<?> wildcardClass11 = asyncQueryRunner8.getClass();
        java.lang.Object[] objArray12 = new java.lang.Object[] { wildcardClass11 };
        java.util.concurrent.ExecutorService executorService13 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner14 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner15 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService13, queryRunner14);
        boolean boolean16 = asyncQueryRunner15.isPmdKnownBroken();
        javax.sql.DataSource dataSource17 = asyncQueryRunner15.getDataSource();
        java.lang.Class<?> wildcardClass18 = asyncQueryRunner15.getClass();
        java.lang.Object[] objArray19 = new java.lang.Object[] { wildcardClass18 };
        java.util.concurrent.ExecutorService executorService20 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner21 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner22 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService20, queryRunner21);
        boolean boolean23 = asyncQueryRunner22.isPmdKnownBroken();
        javax.sql.DataSource dataSource24 = asyncQueryRunner22.getDataSource();
        java.lang.Class<?> wildcardClass25 = asyncQueryRunner22.getClass();
        java.lang.Object[] objArray26 = new java.lang.Object[] { wildcardClass25 };
        java.util.concurrent.ExecutorService executorService27 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner28 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner29 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService27, queryRunner28);
        boolean boolean30 = asyncQueryRunner29.isPmdKnownBroken();
        javax.sql.DataSource dataSource31 = asyncQueryRunner29.getDataSource();
        java.lang.Class<?> wildcardClass32 = asyncQueryRunner29.getClass();
        java.lang.Object[] objArray33 = new java.lang.Object[] { wildcardClass32 };
        java.lang.Object[][] objArray34 = new java.lang.Object[][] { objArray12, objArray19, objArray26, objArray33 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<int[]> intArrayFuture35 = asyncQueryRunner3.batch("", objArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[class org.apache.commons.dbutils.AsyncQueryRunner]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[class org.apache.commons.dbutils.AsyncQueryRunner]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[class org.apache.commons.dbutils.AsyncQueryRunner]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[class org.apache.commons.dbutils.AsyncQueryRunner]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[class org.apache.commons.dbutils.AsyncQueryRunner]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[class org.apache.commons.dbutils.AsyncQueryRunner]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(dataSource31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[class org.apache.commons.dbutils.AsyncQueryRunner]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[class org.apache.commons.dbutils.AsyncQueryRunner]");
        org.junit.Assert.assertNotNull(objArray34);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test259");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        java.sql.PreparedStatement preparedStatement3 = null;
        java.util.concurrent.ExecutorService executorService5 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner6 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService5);
        java.lang.Class<?> wildcardClass7 = asyncQueryRunner6.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner2.fillStatementWithBean(preparedStatement3, (java.lang.Object) wildcardClass7, propertyDescriptorArray8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = asyncQueryRunner2.getParameterMetaData(preparedStatement10);
        java.sql.Connection connection12 = null;
        java.util.concurrent.ExecutorService executorService15 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner16 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService15);
        java.sql.PreparedStatement preparedStatement17 = null;
        java.sql.ParameterMetaData parameterMetaData18 = null;
        javax.sql.DataSource dataSource19 = null;
        java.util.concurrent.ExecutorService executorService20 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner21 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource19, executorService20);
        boolean boolean22 = asyncQueryRunner21.isPmdKnownBroken();
        javax.sql.DataSource dataSource23 = asyncQueryRunner21.getDataSource();
        java.sql.PreparedStatement preparedStatement24 = null;
        java.sql.ParameterMetaData parameterMetaData25 = null;
        java.util.concurrent.ExecutorService executorService27 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner28 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService27);
        java.sql.PreparedStatement preparedStatement29 = null;
        java.util.concurrent.ExecutorService executorService31 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner32 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService31);
        java.lang.Class<?> wildcardClass33 = asyncQueryRunner32.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray34 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner28.fillStatementWithBean(preparedStatement29, (java.lang.Object) wildcardClass33, propertyDescriptorArray34);
        asyncQueryRunner21.fillStatement(preparedStatement24, parameterMetaData25, (java.lang.Object[]) propertyDescriptorArray34);
        java.sql.PreparedStatement preparedStatement37 = null;
        java.sql.ParameterMetaData parameterMetaData38 = null;
        java.util.concurrent.ExecutorService executorService40 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner41 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService40);
        java.sql.PreparedStatement preparedStatement42 = null;
        java.util.concurrent.ExecutorService executorService44 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner45 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService44);
        java.lang.Class<?> wildcardClass46 = asyncQueryRunner45.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray47 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner41.fillStatementWithBean(preparedStatement42, (java.lang.Object) wildcardClass46, propertyDescriptorArray47);
        asyncQueryRunner21.fillStatement(preparedStatement37, parameterMetaData38, (java.lang.Object[]) propertyDescriptorArray47);
        asyncQueryRunner16.fillStatement(preparedStatement17, parameterMetaData18, (java.lang.Object[]) propertyDescriptorArray47);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture51 = asyncQueryRunner2.update(connection12, "", (java.lang.Object) propertyDescriptorArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray8, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(parameterMetaData11);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(dataSource23);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(propertyDescriptorArray34);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray34, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(propertyDescriptorArray47);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray47, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test260");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, false, executorService2);
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = null;
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner7 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService6);
        java.sql.PreparedStatement preparedStatement8 = null;
        java.sql.ParameterMetaData parameterMetaData9 = null;
        javax.sql.DataSource dataSource10 = null;
        java.util.concurrent.ExecutorService executorService11 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner12 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource10, executorService11);
        boolean boolean13 = asyncQueryRunner12.isPmdKnownBroken();
        javax.sql.DataSource dataSource14 = asyncQueryRunner12.getDataSource();
        java.sql.PreparedStatement preparedStatement15 = null;
        java.sql.ParameterMetaData parameterMetaData16 = null;
        java.util.concurrent.ExecutorService executorService18 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner19 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService18);
        java.sql.PreparedStatement preparedStatement20 = null;
        java.util.concurrent.ExecutorService executorService22 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner23 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService22);
        java.lang.Class<?> wildcardClass24 = asyncQueryRunner23.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray25 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner19.fillStatementWithBean(preparedStatement20, (java.lang.Object) wildcardClass24, propertyDescriptorArray25);
        asyncQueryRunner12.fillStatement(preparedStatement15, parameterMetaData16, (java.lang.Object[]) propertyDescriptorArray25);
        asyncQueryRunner7.fillStatement(preparedStatement8, parameterMetaData9, (java.lang.Object[]) propertyDescriptorArray25);
        asyncQueryRunner3.fillStatement(preparedStatement4, parameterMetaData5, (java.lang.Object[]) propertyDescriptorArray25);
        boolean boolean30 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement31 = null;
        javax.sql.DataSource dataSource32 = null;
        java.util.concurrent.ExecutorService executorService34 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner35 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource32, true, executorService34);
        java.sql.PreparedStatement preparedStatement36 = null;
        java.util.concurrent.ExecutorService executorService38 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner39 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService38);
        boolean boolean40 = asyncQueryRunner39.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement41 = null;
        java.sql.ParameterMetaData parameterMetaData42 = null;
        javax.sql.DataSource dataSource43 = null;
        java.util.concurrent.ExecutorService executorService45 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner46 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource43, false, executorService45);
        java.sql.PreparedStatement preparedStatement47 = null;
        java.sql.ParameterMetaData parameterMetaData48 = null;
        java.util.concurrent.ExecutorService executorService49 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner50 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService49);
        java.sql.PreparedStatement preparedStatement51 = null;
        java.sql.ParameterMetaData parameterMetaData52 = null;
        javax.sql.DataSource dataSource53 = null;
        java.util.concurrent.ExecutorService executorService54 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner55 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource53, executorService54);
        boolean boolean56 = asyncQueryRunner55.isPmdKnownBroken();
        javax.sql.DataSource dataSource57 = asyncQueryRunner55.getDataSource();
        java.sql.PreparedStatement preparedStatement58 = null;
        java.sql.ParameterMetaData parameterMetaData59 = null;
        java.util.concurrent.ExecutorService executorService61 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner62 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService61);
        java.sql.PreparedStatement preparedStatement63 = null;
        java.util.concurrent.ExecutorService executorService65 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner66 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService65);
        java.lang.Class<?> wildcardClass67 = asyncQueryRunner66.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray68 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner62.fillStatementWithBean(preparedStatement63, (java.lang.Object) wildcardClass67, propertyDescriptorArray68);
        asyncQueryRunner55.fillStatement(preparedStatement58, parameterMetaData59, (java.lang.Object[]) propertyDescriptorArray68);
        asyncQueryRunner50.fillStatement(preparedStatement51, parameterMetaData52, (java.lang.Object[]) propertyDescriptorArray68);
        asyncQueryRunner46.fillStatement(preparedStatement47, parameterMetaData48, (java.lang.Object[]) propertyDescriptorArray68);
        asyncQueryRunner39.fillStatement(preparedStatement41, parameterMetaData42, (java.lang.Object[]) propertyDescriptorArray68);
        asyncQueryRunner35.fillStatement(preparedStatement36, (java.lang.Object[]) propertyDescriptorArray68);
        javax.sql.DataSource dataSource75 = null;
        java.util.concurrent.ExecutorService executorService76 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner77 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource75, executorService76);
        boolean boolean78 = asyncQueryRunner77.isPmdKnownBroken();
        javax.sql.DataSource dataSource79 = asyncQueryRunner77.getDataSource();
        java.sql.PreparedStatement preparedStatement80 = null;
        java.sql.ParameterMetaData parameterMetaData81 = null;
        java.util.concurrent.ExecutorService executorService83 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner84 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService83);
        java.sql.PreparedStatement preparedStatement85 = null;
        java.util.concurrent.ExecutorService executorService87 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner88 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService87);
        java.lang.Class<?> wildcardClass89 = asyncQueryRunner88.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray90 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner84.fillStatementWithBean(preparedStatement85, (java.lang.Object) wildcardClass89, propertyDescriptorArray90);
        asyncQueryRunner77.fillStatement(preparedStatement80, parameterMetaData81, (java.lang.Object[]) propertyDescriptorArray90);
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner3.fillStatementWithBean(preparedStatement31, (java.lang.Object) asyncQueryRunner35, propertyDescriptorArray90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(propertyDescriptorArray25);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray25, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(dataSource57);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(propertyDescriptorArray68);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray68, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(dataSource79);
        org.junit.Assert.assertNotNull(wildcardClass89);
        org.junit.Assert.assertNotNull(propertyDescriptorArray90);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray90, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test261");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        java.sql.Connection connection4 = null;
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner8 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService7);
        boolean boolean9 = asyncQueryRunner8.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement10 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService12);
        java.sql.PreparedStatement preparedStatement14 = null;
        java.util.concurrent.ExecutorService executorService16 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner17 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService16);
        java.lang.Class<?> wildcardClass18 = asyncQueryRunner17.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner13.fillStatementWithBean(preparedStatement14, (java.lang.Object) wildcardClass18, propertyDescriptorArray19);
        asyncQueryRunner8.fillStatement(preparedStatement10, (java.lang.Object[]) propertyDescriptorArray19);
        java.sql.PreparedStatement preparedStatement22 = null;
        java.util.concurrent.ExecutorService executorService25 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner26 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService25);
        boolean boolean27 = asyncQueryRunner26.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement28 = null;
        java.sql.ParameterMetaData parameterMetaData29 = null;
        javax.sql.DataSource dataSource30 = null;
        java.util.concurrent.ExecutorService executorService32 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner33 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource30, false, executorService32);
        java.sql.PreparedStatement preparedStatement34 = null;
        java.sql.ParameterMetaData parameterMetaData35 = null;
        java.util.concurrent.ExecutorService executorService36 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner37 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService36);
        java.sql.PreparedStatement preparedStatement38 = null;
        java.sql.ParameterMetaData parameterMetaData39 = null;
        javax.sql.DataSource dataSource40 = null;
        java.util.concurrent.ExecutorService executorService41 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner42 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource40, executorService41);
        boolean boolean43 = asyncQueryRunner42.isPmdKnownBroken();
        javax.sql.DataSource dataSource44 = asyncQueryRunner42.getDataSource();
        java.sql.PreparedStatement preparedStatement45 = null;
        java.sql.ParameterMetaData parameterMetaData46 = null;
        java.util.concurrent.ExecutorService executorService48 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner49 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService48);
        java.sql.PreparedStatement preparedStatement50 = null;
        java.util.concurrent.ExecutorService executorService52 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner53 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService52);
        java.lang.Class<?> wildcardClass54 = asyncQueryRunner53.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray55 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner49.fillStatementWithBean(preparedStatement50, (java.lang.Object) wildcardClass54, propertyDescriptorArray55);
        asyncQueryRunner42.fillStatement(preparedStatement45, parameterMetaData46, (java.lang.Object[]) propertyDescriptorArray55);
        asyncQueryRunner37.fillStatement(preparedStatement38, parameterMetaData39, (java.lang.Object[]) propertyDescriptorArray55);
        asyncQueryRunner33.fillStatement(preparedStatement34, parameterMetaData35, (java.lang.Object[]) propertyDescriptorArray55);
        asyncQueryRunner26.fillStatement(preparedStatement28, parameterMetaData29, (java.lang.Object[]) propertyDescriptorArray55);
        asyncQueryRunner8.fillStatementWithBean(preparedStatement22, (java.lang.Object) 10, propertyDescriptorArray55);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture62 = asyncQueryRunner3.update(connection4, "", (java.lang.Object) preparedStatement22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray19, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(dataSource44);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(propertyDescriptorArray55);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray55, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test262");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        java.sql.Connection connection4 = null;
        javax.sql.DataSource dataSource6 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource6, false, executorService8);
        boolean boolean10 = asyncQueryRunner9.isPmdKnownBroken();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture11 = asyncQueryRunner3.update(connection4, "hi!", (java.lang.Object) asyncQueryRunner9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test263");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.sql.ParameterMetaData parameterMetaData6 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService12);
        java.lang.Class<?> wildcardClass14 = asyncQueryRunner13.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner9.fillStatementWithBean(preparedStatement10, (java.lang.Object) wildcardClass14, propertyDescriptorArray15);
        asyncQueryRunner2.fillStatement(preparedStatement5, parameterMetaData6, (java.lang.Object[]) propertyDescriptorArray15);
        java.sql.PreparedStatement preparedStatement18 = null;
        java.sql.ParameterMetaData parameterMetaData19 = null;
        java.util.concurrent.ExecutorService executorService21 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner22 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService21);
        java.sql.PreparedStatement preparedStatement23 = null;
        java.util.concurrent.ExecutorService executorService25 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner26 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService25);
        java.lang.Class<?> wildcardClass27 = asyncQueryRunner26.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner22.fillStatementWithBean(preparedStatement23, (java.lang.Object) wildcardClass27, propertyDescriptorArray28);
        asyncQueryRunner2.fillStatement(preparedStatement18, parameterMetaData19, (java.lang.Object[]) propertyDescriptorArray28);
        boolean boolean31 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement32 = null;
        java.sql.ParameterMetaData parameterMetaData33 = null;
        java.lang.Object[] objArray34 = new java.lang.Object[] {};
        asyncQueryRunner2.fillStatement(preparedStatement32, parameterMetaData33, objArray34);
        java.sql.PreparedStatement preparedStatement36 = null;
        java.lang.String[] strArray38 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner2.fillStatementWithBean(preparedStatement36, (java.lang.Object) (-1.0f), strArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray15, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(propertyDescriptorArray28);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray28, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertArrayEquals(objArray34, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] {});
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test264");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        asyncQueryRunner2.fillStatement(preparedStatement4, parameterMetaData5, objArray6);
        javax.sql.DataSource dataSource9 = null;
        java.util.concurrent.ExecutorService executorService10 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner11 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource9, executorService10);
        boolean boolean12 = asyncQueryRunner11.isPmdKnownBroken();
        javax.sql.DataSource dataSource13 = asyncQueryRunner11.getDataSource();
        java.sql.PreparedStatement preparedStatement14 = null;
        java.sql.ParameterMetaData parameterMetaData15 = null;
        java.util.concurrent.ExecutorService executorService17 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner18 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService17);
        java.sql.PreparedStatement preparedStatement19 = null;
        java.util.concurrent.ExecutorService executorService21 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner22 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService21);
        java.lang.Class<?> wildcardClass23 = asyncQueryRunner22.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray24 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner18.fillStatementWithBean(preparedStatement19, (java.lang.Object) wildcardClass23, propertyDescriptorArray24);
        asyncQueryRunner11.fillStatement(preparedStatement14, parameterMetaData15, (java.lang.Object[]) propertyDescriptorArray24);
        java.lang.Class<?> wildcardClass27 = asyncQueryRunner11.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture28 = asyncQueryRunner2.update("", (java.lang.Object) asyncQueryRunner11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(propertyDescriptorArray24);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray24, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test265");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        boolean boolean4 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner8 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService7);
        boolean boolean9 = asyncQueryRunner8.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement10 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService12);
        java.sql.PreparedStatement preparedStatement14 = null;
        java.util.concurrent.ExecutorService executorService16 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner17 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService16);
        java.lang.Class<?> wildcardClass18 = asyncQueryRunner17.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner13.fillStatementWithBean(preparedStatement14, (java.lang.Object) wildcardClass18, propertyDescriptorArray19);
        asyncQueryRunner8.fillStatement(preparedStatement10, (java.lang.Object[]) propertyDescriptorArray19);
        java.util.concurrent.ExecutorService executorService23 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner24 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService23);
        boolean boolean25 = asyncQueryRunner24.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement26 = null;
        java.sql.ParameterMetaData parameterMetaData27 = null;
        javax.sql.DataSource dataSource28 = null;
        java.util.concurrent.ExecutorService executorService30 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner31 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource28, false, executorService30);
        java.sql.PreparedStatement preparedStatement32 = null;
        java.sql.ParameterMetaData parameterMetaData33 = null;
        java.util.concurrent.ExecutorService executorService34 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner35 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService34);
        java.sql.PreparedStatement preparedStatement36 = null;
        java.sql.ParameterMetaData parameterMetaData37 = null;
        javax.sql.DataSource dataSource38 = null;
        java.util.concurrent.ExecutorService executorService39 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner40 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource38, executorService39);
        boolean boolean41 = asyncQueryRunner40.isPmdKnownBroken();
        javax.sql.DataSource dataSource42 = asyncQueryRunner40.getDataSource();
        java.sql.PreparedStatement preparedStatement43 = null;
        java.sql.ParameterMetaData parameterMetaData44 = null;
        java.util.concurrent.ExecutorService executorService46 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner47 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService46);
        java.sql.PreparedStatement preparedStatement48 = null;
        java.util.concurrent.ExecutorService executorService50 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner51 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService50);
        java.lang.Class<?> wildcardClass52 = asyncQueryRunner51.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray53 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner47.fillStatementWithBean(preparedStatement48, (java.lang.Object) wildcardClass52, propertyDescriptorArray53);
        asyncQueryRunner40.fillStatement(preparedStatement43, parameterMetaData44, (java.lang.Object[]) propertyDescriptorArray53);
        asyncQueryRunner35.fillStatement(preparedStatement36, parameterMetaData37, (java.lang.Object[]) propertyDescriptorArray53);
        asyncQueryRunner31.fillStatement(preparedStatement32, parameterMetaData33, (java.lang.Object[]) propertyDescriptorArray53);
        asyncQueryRunner24.fillStatement(preparedStatement26, parameterMetaData27, (java.lang.Object[]) propertyDescriptorArray53);
        java.sql.PreparedStatement preparedStatement59 = null;
        java.sql.ParameterMetaData parameterMetaData60 = null;
        javax.sql.DataSource dataSource61 = null;
        java.util.concurrent.ExecutorService executorService63 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner64 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource61, true, executorService63);
        java.sql.PreparedStatement preparedStatement65 = null;
        java.sql.ParameterMetaData parameterMetaData66 = asyncQueryRunner64.getParameterMetaData(preparedStatement65);
        java.sql.PreparedStatement preparedStatement67 = null;
        java.util.concurrent.ExecutorService executorService69 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner70 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService69);
        boolean boolean71 = asyncQueryRunner70.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement72 = null;
        java.util.concurrent.ExecutorService executorService74 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner75 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService74);
        java.sql.PreparedStatement preparedStatement76 = null;
        java.util.concurrent.ExecutorService executorService78 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner79 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService78);
        java.lang.Class<?> wildcardClass80 = asyncQueryRunner79.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray81 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner75.fillStatementWithBean(preparedStatement76, (java.lang.Object) wildcardClass80, propertyDescriptorArray81);
        asyncQueryRunner70.fillStatement(preparedStatement72, (java.lang.Object[]) propertyDescriptorArray81);
        asyncQueryRunner64.fillStatement(preparedStatement67, (java.lang.Object[]) propertyDescriptorArray81);
        asyncQueryRunner24.fillStatement(preparedStatement59, parameterMetaData60, (java.lang.Object[]) propertyDescriptorArray81);
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner2.fillStatementWithBean(preparedStatement5, (java.lang.Object) propertyDescriptorArray19, propertyDescriptorArray81);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray19, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(dataSource42);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(propertyDescriptorArray53);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray53, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(parameterMetaData66);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertNotNull(propertyDescriptorArray81);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray81, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test266");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = asyncQueryRunner3.getParameterMetaData(preparedStatement4);
        java.sql.PreparedStatement preparedStatement6 = null;
        javax.sql.DataSource dataSource7 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource7, executorService8);
        boolean boolean10 = asyncQueryRunner9.isPmdKnownBroken();
        javax.sql.DataSource dataSource11 = asyncQueryRunner9.getDataSource();
        java.sql.PreparedStatement preparedStatement12 = null;
        java.sql.ParameterMetaData parameterMetaData13 = null;
        java.util.concurrent.ExecutorService executorService15 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner16 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService15);
        java.sql.PreparedStatement preparedStatement17 = null;
        java.util.concurrent.ExecutorService executorService19 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner20 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService19);
        java.lang.Class<?> wildcardClass21 = asyncQueryRunner20.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner16.fillStatementWithBean(preparedStatement17, (java.lang.Object) wildcardClass21, propertyDescriptorArray22);
        asyncQueryRunner9.fillStatement(preparedStatement12, parameterMetaData13, (java.lang.Object[]) propertyDescriptorArray22);
        java.lang.String[] strArray25 = new java.lang.String[] {};
        asyncQueryRunner3.fillStatementWithBean(preparedStatement6, (java.lang.Object) asyncQueryRunner9, strArray25);
        java.sql.PreparedStatement preparedStatement27 = null;
        java.sql.ParameterMetaData parameterMetaData28 = null;
        javax.sql.DataSource dataSource29 = null;
        java.util.concurrent.ExecutorService executorService30 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner31 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource29, executorService30);
        boolean boolean32 = asyncQueryRunner31.isPmdKnownBroken();
        javax.sql.DataSource dataSource33 = asyncQueryRunner31.getDataSource();
        java.sql.PreparedStatement preparedStatement34 = null;
        java.sql.ParameterMetaData parameterMetaData35 = null;
        java.util.concurrent.ExecutorService executorService37 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner38 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService37);
        java.sql.PreparedStatement preparedStatement39 = null;
        java.util.concurrent.ExecutorService executorService41 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner42 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService41);
        java.lang.Class<?> wildcardClass43 = asyncQueryRunner42.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray44 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner38.fillStatementWithBean(preparedStatement39, (java.lang.Object) wildcardClass43, propertyDescriptorArray44);
        asyncQueryRunner31.fillStatement(preparedStatement34, parameterMetaData35, (java.lang.Object[]) propertyDescriptorArray44);
        java.sql.PreparedStatement preparedStatement47 = null;
        java.sql.ParameterMetaData parameterMetaData48 = null;
        java.util.concurrent.ExecutorService executorService50 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner51 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService50);
        java.sql.PreparedStatement preparedStatement52 = null;
        java.util.concurrent.ExecutorService executorService54 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner55 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService54);
        java.lang.Class<?> wildcardClass56 = asyncQueryRunner55.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray57 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner51.fillStatementWithBean(preparedStatement52, (java.lang.Object) wildcardClass56, propertyDescriptorArray57);
        asyncQueryRunner31.fillStatement(preparedStatement47, parameterMetaData48, (java.lang.Object[]) propertyDescriptorArray57);
        asyncQueryRunner3.fillStatement(preparedStatement27, parameterMetaData28, (java.lang.Object[]) propertyDescriptorArray57);
        org.junit.Assert.assertNull(parameterMetaData5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(propertyDescriptorArray22);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray22, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(dataSource33);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(propertyDescriptorArray44);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray44, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(propertyDescriptorArray57);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray57, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test267");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement4 = null;
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner7 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService6);
        boolean boolean8 = asyncQueryRunner7.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement9 = null;
        java.util.concurrent.ExecutorService executorService11 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner12 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService11);
        java.sql.PreparedStatement preparedStatement13 = null;
        java.util.concurrent.ExecutorService executorService15 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner16 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService15);
        java.lang.Class<?> wildcardClass17 = asyncQueryRunner16.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner12.fillStatementWithBean(preparedStatement13, (java.lang.Object) wildcardClass17, propertyDescriptorArray18);
        asyncQueryRunner7.fillStatement(preparedStatement9, (java.lang.Object[]) propertyDescriptorArray18);
        java.sql.PreparedStatement preparedStatement21 = null;
        java.util.concurrent.ExecutorService executorService24 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner25 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService24);
        boolean boolean26 = asyncQueryRunner25.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement27 = null;
        java.sql.ParameterMetaData parameterMetaData28 = null;
        javax.sql.DataSource dataSource29 = null;
        java.util.concurrent.ExecutorService executorService31 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner32 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource29, false, executorService31);
        java.sql.PreparedStatement preparedStatement33 = null;
        java.sql.ParameterMetaData parameterMetaData34 = null;
        java.util.concurrent.ExecutorService executorService35 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner36 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService35);
        java.sql.PreparedStatement preparedStatement37 = null;
        java.sql.ParameterMetaData parameterMetaData38 = null;
        javax.sql.DataSource dataSource39 = null;
        java.util.concurrent.ExecutorService executorService40 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner41 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource39, executorService40);
        boolean boolean42 = asyncQueryRunner41.isPmdKnownBroken();
        javax.sql.DataSource dataSource43 = asyncQueryRunner41.getDataSource();
        java.sql.PreparedStatement preparedStatement44 = null;
        java.sql.ParameterMetaData parameterMetaData45 = null;
        java.util.concurrent.ExecutorService executorService47 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner48 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService47);
        java.sql.PreparedStatement preparedStatement49 = null;
        java.util.concurrent.ExecutorService executorService51 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner52 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService51);
        java.lang.Class<?> wildcardClass53 = asyncQueryRunner52.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray54 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner48.fillStatementWithBean(preparedStatement49, (java.lang.Object) wildcardClass53, propertyDescriptorArray54);
        asyncQueryRunner41.fillStatement(preparedStatement44, parameterMetaData45, (java.lang.Object[]) propertyDescriptorArray54);
        asyncQueryRunner36.fillStatement(preparedStatement37, parameterMetaData38, (java.lang.Object[]) propertyDescriptorArray54);
        asyncQueryRunner32.fillStatement(preparedStatement33, parameterMetaData34, (java.lang.Object[]) propertyDescriptorArray54);
        asyncQueryRunner25.fillStatement(preparedStatement27, parameterMetaData28, (java.lang.Object[]) propertyDescriptorArray54);
        asyncQueryRunner7.fillStatementWithBean(preparedStatement21, (java.lang.Object) 10, propertyDescriptorArray54);
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner2.fillStatement(preparedStatement4, (java.lang.Object[]) propertyDescriptorArray54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(propertyDescriptorArray18);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray18, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(dataSource43);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(propertyDescriptorArray54);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray54, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test268");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        boolean boolean4 = asyncQueryRunner2.isPmdKnownBroken();
        boolean boolean5 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource8 = null;
        java.util.concurrent.ExecutorService executorService9 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner10 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource8, executorService9);
        boolean boolean11 = asyncQueryRunner10.isPmdKnownBroken();
        javax.sql.DataSource dataSource12 = asyncQueryRunner10.getDataSource();
        java.sql.PreparedStatement preparedStatement13 = null;
        java.sql.ParameterMetaData parameterMetaData14 = null;
        java.util.concurrent.ExecutorService executorService16 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner17 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService16);
        java.sql.PreparedStatement preparedStatement18 = null;
        java.util.concurrent.ExecutorService executorService20 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner21 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService20);
        java.lang.Class<?> wildcardClass22 = asyncQueryRunner21.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner17.fillStatementWithBean(preparedStatement18, (java.lang.Object) wildcardClass22, propertyDescriptorArray23);
        asyncQueryRunner10.fillStatement(preparedStatement13, parameterMetaData14, (java.lang.Object[]) propertyDescriptorArray23);
        java.sql.PreparedStatement preparedStatement26 = null;
        java.sql.ParameterMetaData parameterMetaData27 = null;
        java.util.concurrent.ExecutorService executorService29 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner30 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService29);
        java.sql.PreparedStatement preparedStatement31 = null;
        java.util.concurrent.ExecutorService executorService33 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner34 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService33);
        java.lang.Class<?> wildcardClass35 = asyncQueryRunner34.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray36 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner30.fillStatementWithBean(preparedStatement31, (java.lang.Object) wildcardClass35, propertyDescriptorArray36);
        asyncQueryRunner10.fillStatement(preparedStatement26, parameterMetaData27, (java.lang.Object[]) propertyDescriptorArray36);
        boolean boolean39 = asyncQueryRunner10.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement40 = null;
        java.sql.ParameterMetaData parameterMetaData41 = null;
        java.lang.Object[] objArray42 = new java.lang.Object[] {};
        asyncQueryRunner10.fillStatement(preparedStatement40, parameterMetaData41, objArray42);
        javax.sql.DataSource dataSource44 = null;
        java.util.concurrent.ExecutorService executorService46 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner47 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource44, false, executorService46);
        javax.sql.DataSource dataSource48 = asyncQueryRunner47.getDataSource();
        boolean boolean49 = asyncQueryRunner47.isPmdKnownBroken();
        java.util.concurrent.ExecutorService executorService52 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner53 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService52);
        boolean boolean54 = asyncQueryRunner53.isPmdKnownBroken();
        boolean boolean55 = asyncQueryRunner53.isPmdKnownBroken();
        boolean boolean56 = asyncQueryRunner53.isPmdKnownBroken();
        javax.sql.DataSource dataSource57 = null;
        java.util.concurrent.ExecutorService executorService58 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner59 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource57, executorService58);
        boolean boolean60 = asyncQueryRunner59.isPmdKnownBroken();
        javax.sql.DataSource dataSource61 = asyncQueryRunner59.getDataSource();
        java.sql.PreparedStatement preparedStatement62 = null;
        java.sql.ParameterMetaData parameterMetaData63 = null;
        java.util.concurrent.ExecutorService executorService65 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner66 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService65);
        java.sql.PreparedStatement preparedStatement67 = null;
        java.util.concurrent.ExecutorService executorService69 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner70 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService69);
        java.lang.Class<?> wildcardClass71 = asyncQueryRunner70.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray72 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner66.fillStatementWithBean(preparedStatement67, (java.lang.Object) wildcardClass71, propertyDescriptorArray72);
        asyncQueryRunner59.fillStatement(preparedStatement62, parameterMetaData63, (java.lang.Object[]) propertyDescriptorArray72);
        java.lang.Object[] objArray75 = new java.lang.Object[] { 100.0f, preparedStatement40, asyncQueryRunner47, 100, asyncQueryRunner53, asyncQueryRunner59 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture76 = asyncQueryRunner2.update("", objArray75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(propertyDescriptorArray23);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray23, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(propertyDescriptorArray36);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray36, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertArrayEquals(objArray42, new java.lang.Object[] {});
        org.junit.Assert.assertNull(dataSource48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(dataSource61);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(propertyDescriptorArray72);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray72, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(objArray75);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test269");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner1);
        java.sql.PreparedStatement preparedStatement3 = null;
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner7 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService6);
        java.sql.PreparedStatement preparedStatement8 = null;
        java.util.concurrent.ExecutorService executorService10 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner11 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService10);
        java.lang.Class<?> wildcardClass12 = asyncQueryRunner11.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner7.fillStatementWithBean(preparedStatement8, (java.lang.Object) wildcardClass12, propertyDescriptorArray13);
        java.sql.PreparedStatement preparedStatement15 = null;
        java.sql.ParameterMetaData parameterMetaData16 = asyncQueryRunner7.getParameterMetaData(preparedStatement15);
        java.sql.PreparedStatement preparedStatement17 = null;
        java.sql.ParameterMetaData parameterMetaData18 = asyncQueryRunner7.getParameterMetaData(preparedStatement17);
        java.sql.PreparedStatement preparedStatement19 = null;
        java.lang.String[] strArray21 = new java.lang.String[] {};
        asyncQueryRunner7.fillStatementWithBean(preparedStatement19, (java.lang.Object) (byte) 100, strArray21);
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner2.fillStatementWithBean(preparedStatement3, (java.lang.Object) (byte) -1, strArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(propertyDescriptorArray13);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray13, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(parameterMetaData16);
        org.junit.Assert.assertNull(parameterMetaData18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] {});
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test270");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.sql.ParameterMetaData parameterMetaData6 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService12);
        java.lang.Class<?> wildcardClass14 = asyncQueryRunner13.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner9.fillStatementWithBean(preparedStatement10, (java.lang.Object) wildcardClass14, propertyDescriptorArray15);
        asyncQueryRunner2.fillStatement(preparedStatement5, parameterMetaData6, (java.lang.Object[]) propertyDescriptorArray15);
        java.sql.PreparedStatement preparedStatement18 = null;
        java.sql.ParameterMetaData parameterMetaData19 = null;
        java.util.concurrent.ExecutorService executorService21 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner22 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService21);
        java.sql.PreparedStatement preparedStatement23 = null;
        java.util.concurrent.ExecutorService executorService25 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner26 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService25);
        java.lang.Class<?> wildcardClass27 = asyncQueryRunner26.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner22.fillStatementWithBean(preparedStatement23, (java.lang.Object) wildcardClass27, propertyDescriptorArray28);
        asyncQueryRunner2.fillStatement(preparedStatement18, parameterMetaData19, (java.lang.Object[]) propertyDescriptorArray28);
        boolean boolean31 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.Connection connection32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture34 = asyncQueryRunner2.update(connection32, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray15, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(propertyDescriptorArray28);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray28, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test271");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.sql.ParameterMetaData parameterMetaData6 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService12);
        java.lang.Class<?> wildcardClass14 = asyncQueryRunner13.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner9.fillStatementWithBean(preparedStatement10, (java.lang.Object) wildcardClass14, propertyDescriptorArray15);
        asyncQueryRunner2.fillStatement(preparedStatement5, parameterMetaData6, (java.lang.Object[]) propertyDescriptorArray15);
        java.sql.PreparedStatement preparedStatement18 = null;
        java.sql.ParameterMetaData parameterMetaData19 = null;
        java.util.concurrent.ExecutorService executorService21 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner22 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService21);
        java.sql.PreparedStatement preparedStatement23 = null;
        java.util.concurrent.ExecutorService executorService25 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner26 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService25);
        java.lang.Class<?> wildcardClass27 = asyncQueryRunner26.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner22.fillStatementWithBean(preparedStatement23, (java.lang.Object) wildcardClass27, propertyDescriptorArray28);
        asyncQueryRunner2.fillStatement(preparedStatement18, parameterMetaData19, (java.lang.Object[]) propertyDescriptorArray28);
        boolean boolean31 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource32 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement33 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.sql.ParameterMetaData parameterMetaData34 = asyncQueryRunner2.getParameterMetaData(preparedStatement33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray15, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(propertyDescriptorArray28);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray28, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(dataSource32);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test272");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.sql.ParameterMetaData parameterMetaData6 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService12);
        java.lang.Class<?> wildcardClass14 = asyncQueryRunner13.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner9.fillStatementWithBean(preparedStatement10, (java.lang.Object) wildcardClass14, propertyDescriptorArray15);
        asyncQueryRunner2.fillStatement(preparedStatement5, parameterMetaData6, (java.lang.Object[]) propertyDescriptorArray15);
        java.sql.PreparedStatement preparedStatement18 = null;
        java.sql.ParameterMetaData parameterMetaData19 = null;
        java.util.concurrent.ExecutorService executorService21 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner22 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService21);
        java.sql.PreparedStatement preparedStatement23 = null;
        java.util.concurrent.ExecutorService executorService25 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner26 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService25);
        java.lang.Class<?> wildcardClass27 = asyncQueryRunner26.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner22.fillStatementWithBean(preparedStatement23, (java.lang.Object) wildcardClass27, propertyDescriptorArray28);
        asyncQueryRunner2.fillStatement(preparedStatement18, parameterMetaData19, (java.lang.Object[]) propertyDescriptorArray28);
        boolean boolean31 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement32 = null;
        java.sql.ParameterMetaData parameterMetaData33 = null;
        java.lang.Object[] objArray34 = new java.lang.Object[] {};
        asyncQueryRunner2.fillStatement(preparedStatement32, parameterMetaData33, objArray34);
        boolean boolean36 = asyncQueryRunner2.isPmdKnownBroken();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray15, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(propertyDescriptorArray28);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray28, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertArrayEquals(objArray34, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test273");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        java.sql.PreparedStatement preparedStatement3 = null;
        java.sql.ParameterMetaData parameterMetaData4 = null;
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner7 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService6);
        java.sql.PreparedStatement preparedStatement8 = null;
        java.util.concurrent.ExecutorService executorService10 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner11 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService10);
        java.lang.Class<?> wildcardClass12 = asyncQueryRunner11.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner7.fillStatementWithBean(preparedStatement8, (java.lang.Object) wildcardClass12, propertyDescriptorArray13);
        asyncQueryRunner2.fillStatement(preparedStatement3, parameterMetaData4, (java.lang.Object[]) propertyDescriptorArray13);
        java.lang.Class<?> wildcardClass16 = asyncQueryRunner2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(propertyDescriptorArray13);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray13, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test274");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, false, executorService2);
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = null;
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner7 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService6);
        java.sql.PreparedStatement preparedStatement8 = null;
        java.sql.ParameterMetaData parameterMetaData9 = null;
        javax.sql.DataSource dataSource10 = null;
        java.util.concurrent.ExecutorService executorService11 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner12 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource10, executorService11);
        boolean boolean13 = asyncQueryRunner12.isPmdKnownBroken();
        javax.sql.DataSource dataSource14 = asyncQueryRunner12.getDataSource();
        java.sql.PreparedStatement preparedStatement15 = null;
        java.sql.ParameterMetaData parameterMetaData16 = null;
        java.util.concurrent.ExecutorService executorService18 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner19 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService18);
        java.sql.PreparedStatement preparedStatement20 = null;
        java.util.concurrent.ExecutorService executorService22 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner23 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService22);
        java.lang.Class<?> wildcardClass24 = asyncQueryRunner23.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray25 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner19.fillStatementWithBean(preparedStatement20, (java.lang.Object) wildcardClass24, propertyDescriptorArray25);
        asyncQueryRunner12.fillStatement(preparedStatement15, parameterMetaData16, (java.lang.Object[]) propertyDescriptorArray25);
        asyncQueryRunner7.fillStatement(preparedStatement8, parameterMetaData9, (java.lang.Object[]) propertyDescriptorArray25);
        asyncQueryRunner3.fillStatement(preparedStatement4, parameterMetaData5, (java.lang.Object[]) propertyDescriptorArray25);
        boolean boolean30 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.Connection connection31 = null;
        javax.sql.DataSource dataSource33 = null;
        java.util.concurrent.ExecutorService executorService34 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner35 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource33, executorService34);
        boolean boolean36 = asyncQueryRunner35.isPmdKnownBroken();
        javax.sql.DataSource dataSource37 = asyncQueryRunner35.getDataSource();
        java.sql.PreparedStatement preparedStatement38 = null;
        java.sql.ParameterMetaData parameterMetaData39 = null;
        java.util.concurrent.ExecutorService executorService41 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner42 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService41);
        java.sql.PreparedStatement preparedStatement43 = null;
        java.util.concurrent.ExecutorService executorService45 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner46 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService45);
        java.lang.Class<?> wildcardClass47 = asyncQueryRunner46.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray48 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner42.fillStatementWithBean(preparedStatement43, (java.lang.Object) wildcardClass47, propertyDescriptorArray48);
        asyncQueryRunner35.fillStatement(preparedStatement38, parameterMetaData39, (java.lang.Object[]) propertyDescriptorArray48);
        java.sql.PreparedStatement preparedStatement51 = null;
        java.sql.ParameterMetaData parameterMetaData52 = null;
        java.util.concurrent.ExecutorService executorService54 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner55 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService54);
        java.sql.PreparedStatement preparedStatement56 = null;
        java.util.concurrent.ExecutorService executorService58 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner59 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService58);
        java.lang.Class<?> wildcardClass60 = asyncQueryRunner59.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray61 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner55.fillStatementWithBean(preparedStatement56, (java.lang.Object) wildcardClass60, propertyDescriptorArray61);
        asyncQueryRunner35.fillStatement(preparedStatement51, parameterMetaData52, (java.lang.Object[]) propertyDescriptorArray61);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture64 = asyncQueryRunner3.update(connection31, "", (java.lang.Object) preparedStatement51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(propertyDescriptorArray25);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray25, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(dataSource37);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(propertyDescriptorArray48);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray48, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(propertyDescriptorArray61);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray61, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test275");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = asyncQueryRunner3.getParameterMetaData(preparedStatement4);
        java.sql.PreparedStatement preparedStatement6 = null;
        java.sql.ParameterMetaData parameterMetaData7 = asyncQueryRunner3.getParameterMetaData(preparedStatement6);
        java.sql.Connection connection8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture10 = asyncQueryRunner3.update(connection8, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameterMetaData5);
        org.junit.Assert.assertNull(parameterMetaData7);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test276");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        javax.sql.DataSource dataSource3 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = asyncQueryRunner2.getParameterMetaData(preparedStatement4);
        javax.sql.DataSource dataSource6 = asyncQueryRunner2.getDataSource();
        boolean boolean7 = asyncQueryRunner2.isPmdKnownBroken();
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertNull(parameterMetaData5);
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test277");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.sql.ParameterMetaData parameterMetaData6 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService12);
        java.lang.Class<?> wildcardClass14 = asyncQueryRunner13.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner9.fillStatementWithBean(preparedStatement10, (java.lang.Object) wildcardClass14, propertyDescriptorArray15);
        asyncQueryRunner2.fillStatement(preparedStatement5, parameterMetaData6, (java.lang.Object[]) propertyDescriptorArray15);
        java.sql.PreparedStatement preparedStatement18 = null;
        java.sql.ParameterMetaData parameterMetaData19 = null;
        java.util.concurrent.ExecutorService executorService21 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner22 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService21);
        java.sql.PreparedStatement preparedStatement23 = null;
        java.util.concurrent.ExecutorService executorService25 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner26 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService25);
        java.lang.Class<?> wildcardClass27 = asyncQueryRunner26.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner22.fillStatementWithBean(preparedStatement23, (java.lang.Object) wildcardClass27, propertyDescriptorArray28);
        asyncQueryRunner2.fillStatement(preparedStatement18, parameterMetaData19, (java.lang.Object[]) propertyDescriptorArray28);
        java.sql.PreparedStatement preparedStatement31 = null;
        javax.sql.DataSource dataSource32 = null;
        java.util.concurrent.ExecutorService executorService34 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner35 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource32, true, executorService34);
        java.sql.PreparedStatement preparedStatement36 = null;
        java.sql.ParameterMetaData parameterMetaData37 = asyncQueryRunner35.getParameterMetaData(preparedStatement36);
        java.sql.PreparedStatement preparedStatement38 = null;
        javax.sql.DataSource dataSource39 = null;
        java.util.concurrent.ExecutorService executorService40 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner41 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource39, executorService40);
        boolean boolean42 = asyncQueryRunner41.isPmdKnownBroken();
        javax.sql.DataSource dataSource43 = asyncQueryRunner41.getDataSource();
        java.sql.PreparedStatement preparedStatement44 = null;
        java.sql.ParameterMetaData parameterMetaData45 = null;
        java.util.concurrent.ExecutorService executorService47 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner48 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService47);
        java.sql.PreparedStatement preparedStatement49 = null;
        java.util.concurrent.ExecutorService executorService51 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner52 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService51);
        java.lang.Class<?> wildcardClass53 = asyncQueryRunner52.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray54 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner48.fillStatementWithBean(preparedStatement49, (java.lang.Object) wildcardClass53, propertyDescriptorArray54);
        asyncQueryRunner41.fillStatement(preparedStatement44, parameterMetaData45, (java.lang.Object[]) propertyDescriptorArray54);
        java.lang.String[] strArray57 = new java.lang.String[] {};
        asyncQueryRunner35.fillStatementWithBean(preparedStatement38, (java.lang.Object) asyncQueryRunner41, strArray57);
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner2.fillStatement(preparedStatement31, (java.lang.Object[]) strArray57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray15, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(propertyDescriptorArray28);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray28, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(parameterMetaData37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(dataSource43);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(propertyDescriptorArray54);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray54, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] {});
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test278");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        java.sql.PreparedStatement preparedStatement3 = null;
        java.sql.ParameterMetaData parameterMetaData4 = null;
        javax.sql.DataSource dataSource5 = null;
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner7 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource5, executorService6);
        boolean boolean8 = asyncQueryRunner7.isPmdKnownBroken();
        javax.sql.DataSource dataSource9 = asyncQueryRunner7.getDataSource();
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = null;
        java.util.concurrent.ExecutorService executorService13 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner14 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService13);
        java.sql.PreparedStatement preparedStatement15 = null;
        java.util.concurrent.ExecutorService executorService17 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner18 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService17);
        java.lang.Class<?> wildcardClass19 = asyncQueryRunner18.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner14.fillStatementWithBean(preparedStatement15, (java.lang.Object) wildcardClass19, propertyDescriptorArray20);
        asyncQueryRunner7.fillStatement(preparedStatement10, parameterMetaData11, (java.lang.Object[]) propertyDescriptorArray20);
        java.sql.PreparedStatement preparedStatement23 = null;
        java.sql.ParameterMetaData parameterMetaData24 = null;
        java.util.concurrent.ExecutorService executorService26 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner27 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService26);
        java.sql.PreparedStatement preparedStatement28 = null;
        java.util.concurrent.ExecutorService executorService30 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner31 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService30);
        java.lang.Class<?> wildcardClass32 = asyncQueryRunner31.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray33 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner27.fillStatementWithBean(preparedStatement28, (java.lang.Object) wildcardClass32, propertyDescriptorArray33);
        asyncQueryRunner7.fillStatement(preparedStatement23, parameterMetaData24, (java.lang.Object[]) propertyDescriptorArray33);
        asyncQueryRunner2.fillStatement(preparedStatement3, parameterMetaData4, (java.lang.Object[]) propertyDescriptorArray33);
        java.sql.Connection connection37 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture39 = asyncQueryRunner2.update(connection37, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(propertyDescriptorArray20);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray20, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(propertyDescriptorArray33);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray33, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test279");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.sql.ParameterMetaData parameterMetaData6 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService12);
        java.lang.Class<?> wildcardClass14 = asyncQueryRunner13.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner9.fillStatementWithBean(preparedStatement10, (java.lang.Object) wildcardClass14, propertyDescriptorArray15);
        asyncQueryRunner2.fillStatement(preparedStatement5, parameterMetaData6, (java.lang.Object[]) propertyDescriptorArray15);
        java.sql.PreparedStatement preparedStatement18 = null;
        java.sql.ParameterMetaData parameterMetaData19 = null;
        java.util.concurrent.ExecutorService executorService21 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner22 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService21);
        java.sql.PreparedStatement preparedStatement23 = null;
        java.util.concurrent.ExecutorService executorService25 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner26 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService25);
        java.lang.Class<?> wildcardClass27 = asyncQueryRunner26.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner22.fillStatementWithBean(preparedStatement23, (java.lang.Object) wildcardClass27, propertyDescriptorArray28);
        asyncQueryRunner2.fillStatement(preparedStatement18, parameterMetaData19, (java.lang.Object[]) propertyDescriptorArray28);
        java.lang.Object[] objArray32 = new java.lang.Object[] {};
        java.lang.Object[] objArray33 = new java.lang.Object[] {};
        java.lang.Object[][] objArray34 = new java.lang.Object[][] { objArray32, objArray33 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<int[]> intArrayFuture35 = asyncQueryRunner2.batch("hi!", objArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray15, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(propertyDescriptorArray28);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray28, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertArrayEquals(objArray32, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertArrayEquals(objArray33, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray34);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test280");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, false, executorService2);
        java.sql.Connection connection4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture7 = asyncQueryRunner3.update(connection4, "hi!", (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test281");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.sql.ParameterMetaData parameterMetaData6 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService12);
        java.lang.Class<?> wildcardClass14 = asyncQueryRunner13.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner9.fillStatementWithBean(preparedStatement10, (java.lang.Object) wildcardClass14, propertyDescriptorArray15);
        asyncQueryRunner2.fillStatement(preparedStatement5, parameterMetaData6, (java.lang.Object[]) propertyDescriptorArray15);
        java.sql.PreparedStatement preparedStatement18 = null;
        java.sql.ParameterMetaData parameterMetaData19 = null;
        java.util.concurrent.ExecutorService executorService21 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner22 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService21);
        java.sql.PreparedStatement preparedStatement23 = null;
        java.util.concurrent.ExecutorService executorService25 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner26 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService25);
        java.lang.Class<?> wildcardClass27 = asyncQueryRunner26.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner22.fillStatementWithBean(preparedStatement23, (java.lang.Object) wildcardClass27, propertyDescriptorArray28);
        asyncQueryRunner2.fillStatement(preparedStatement18, parameterMetaData19, (java.lang.Object[]) propertyDescriptorArray28);
        java.sql.PreparedStatement preparedStatement31 = null;
        java.sql.ParameterMetaData parameterMetaData32 = null;
        java.lang.Object[] objArray33 = null;
        asyncQueryRunner2.fillStatement(preparedStatement31, parameterMetaData32, objArray33);
        boolean boolean35 = asyncQueryRunner2.isPmdKnownBroken();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray15, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(propertyDescriptorArray28);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray28, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test282");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.sql.ParameterMetaData parameterMetaData6 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService12);
        java.lang.Class<?> wildcardClass14 = asyncQueryRunner13.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner9.fillStatementWithBean(preparedStatement10, (java.lang.Object) wildcardClass14, propertyDescriptorArray15);
        asyncQueryRunner2.fillStatement(preparedStatement5, parameterMetaData6, (java.lang.Object[]) propertyDescriptorArray15);
        java.sql.PreparedStatement preparedStatement18 = null;
        java.sql.ParameterMetaData parameterMetaData19 = null;
        java.util.concurrent.ExecutorService executorService21 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner22 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService21);
        java.sql.PreparedStatement preparedStatement23 = null;
        java.util.concurrent.ExecutorService executorService25 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner26 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService25);
        java.lang.Class<?> wildcardClass27 = asyncQueryRunner26.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner22.fillStatementWithBean(preparedStatement23, (java.lang.Object) wildcardClass27, propertyDescriptorArray28);
        asyncQueryRunner2.fillStatement(preparedStatement18, parameterMetaData19, (java.lang.Object[]) propertyDescriptorArray28);
        java.sql.PreparedStatement preparedStatement31 = null;
        java.sql.ParameterMetaData parameterMetaData32 = null;
        java.lang.Object[] objArray33 = null;
        asyncQueryRunner2.fillStatement(preparedStatement31, parameterMetaData32, objArray33);
        javax.sql.DataSource dataSource36 = null;
        java.util.concurrent.ExecutorService executorService38 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner39 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource36, true, executorService38);
        java.sql.PreparedStatement preparedStatement40 = null;
        java.util.concurrent.ExecutorService executorService42 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner43 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService42);
        boolean boolean44 = asyncQueryRunner43.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement45 = null;
        java.sql.ParameterMetaData parameterMetaData46 = null;
        javax.sql.DataSource dataSource47 = null;
        java.util.concurrent.ExecutorService executorService49 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner50 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource47, false, executorService49);
        java.sql.PreparedStatement preparedStatement51 = null;
        java.sql.ParameterMetaData parameterMetaData52 = null;
        java.util.concurrent.ExecutorService executorService53 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner54 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService53);
        java.sql.PreparedStatement preparedStatement55 = null;
        java.sql.ParameterMetaData parameterMetaData56 = null;
        javax.sql.DataSource dataSource57 = null;
        java.util.concurrent.ExecutorService executorService58 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner59 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource57, executorService58);
        boolean boolean60 = asyncQueryRunner59.isPmdKnownBroken();
        javax.sql.DataSource dataSource61 = asyncQueryRunner59.getDataSource();
        java.sql.PreparedStatement preparedStatement62 = null;
        java.sql.ParameterMetaData parameterMetaData63 = null;
        java.util.concurrent.ExecutorService executorService65 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner66 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService65);
        java.sql.PreparedStatement preparedStatement67 = null;
        java.util.concurrent.ExecutorService executorService69 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner70 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService69);
        java.lang.Class<?> wildcardClass71 = asyncQueryRunner70.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray72 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner66.fillStatementWithBean(preparedStatement67, (java.lang.Object) wildcardClass71, propertyDescriptorArray72);
        asyncQueryRunner59.fillStatement(preparedStatement62, parameterMetaData63, (java.lang.Object[]) propertyDescriptorArray72);
        asyncQueryRunner54.fillStatement(preparedStatement55, parameterMetaData56, (java.lang.Object[]) propertyDescriptorArray72);
        asyncQueryRunner50.fillStatement(preparedStatement51, parameterMetaData52, (java.lang.Object[]) propertyDescriptorArray72);
        asyncQueryRunner43.fillStatement(preparedStatement45, parameterMetaData46, (java.lang.Object[]) propertyDescriptorArray72);
        asyncQueryRunner39.fillStatement(preparedStatement40, (java.lang.Object[]) propertyDescriptorArray72);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture79 = asyncQueryRunner2.update("hi!", (java.lang.Object[]) propertyDescriptorArray72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray15, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(propertyDescriptorArray28);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray28, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(dataSource61);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(propertyDescriptorArray72);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray72, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test283");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = null;
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner8 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService7);
        java.sql.PreparedStatement preparedStatement9 = null;
        java.util.concurrent.ExecutorService executorService11 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner12 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService11);
        java.lang.Class<?> wildcardClass13 = asyncQueryRunner12.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner8.fillStatementWithBean(preparedStatement9, (java.lang.Object) wildcardClass13, propertyDescriptorArray14);
        asyncQueryRunner2.fillStatement(preparedStatement4, parameterMetaData5, (java.lang.Object[]) propertyDescriptorArray14);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(propertyDescriptorArray14);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray14, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test284");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.sql.ParameterMetaData parameterMetaData6 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService12);
        java.lang.Class<?> wildcardClass14 = asyncQueryRunner13.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner9.fillStatementWithBean(preparedStatement10, (java.lang.Object) wildcardClass14, propertyDescriptorArray15);
        asyncQueryRunner2.fillStatement(preparedStatement5, parameterMetaData6, (java.lang.Object[]) propertyDescriptorArray15);
        java.sql.PreparedStatement preparedStatement18 = null;
        java.sql.ParameterMetaData parameterMetaData19 = null;
        java.util.concurrent.ExecutorService executorService21 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner22 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService21);
        java.sql.PreparedStatement preparedStatement23 = null;
        java.util.concurrent.ExecutorService executorService25 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner26 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService25);
        java.lang.Class<?> wildcardClass27 = asyncQueryRunner26.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner22.fillStatementWithBean(preparedStatement23, (java.lang.Object) wildcardClass27, propertyDescriptorArray28);
        asyncQueryRunner2.fillStatement(preparedStatement18, parameterMetaData19, (java.lang.Object[]) propertyDescriptorArray28);
        boolean boolean31 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource32 = asyncQueryRunner2.getDataSource();
        java.sql.Connection connection33 = null;
        java.util.concurrent.ExecutorService executorService36 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner37 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService36);
        boolean boolean38 = asyncQueryRunner37.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement39 = null;
        java.sql.ParameterMetaData parameterMetaData40 = null;
        javax.sql.DataSource dataSource41 = null;
        java.util.concurrent.ExecutorService executorService43 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner44 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource41, false, executorService43);
        java.sql.PreparedStatement preparedStatement45 = null;
        java.sql.ParameterMetaData parameterMetaData46 = null;
        java.util.concurrent.ExecutorService executorService47 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner48 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService47);
        java.sql.PreparedStatement preparedStatement49 = null;
        java.sql.ParameterMetaData parameterMetaData50 = null;
        javax.sql.DataSource dataSource51 = null;
        java.util.concurrent.ExecutorService executorService52 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner53 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource51, executorService52);
        boolean boolean54 = asyncQueryRunner53.isPmdKnownBroken();
        javax.sql.DataSource dataSource55 = asyncQueryRunner53.getDataSource();
        java.sql.PreparedStatement preparedStatement56 = null;
        java.sql.ParameterMetaData parameterMetaData57 = null;
        java.util.concurrent.ExecutorService executorService59 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner60 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService59);
        java.sql.PreparedStatement preparedStatement61 = null;
        java.util.concurrent.ExecutorService executorService63 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner64 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService63);
        java.lang.Class<?> wildcardClass65 = asyncQueryRunner64.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray66 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner60.fillStatementWithBean(preparedStatement61, (java.lang.Object) wildcardClass65, propertyDescriptorArray66);
        asyncQueryRunner53.fillStatement(preparedStatement56, parameterMetaData57, (java.lang.Object[]) propertyDescriptorArray66);
        asyncQueryRunner48.fillStatement(preparedStatement49, parameterMetaData50, (java.lang.Object[]) propertyDescriptorArray66);
        asyncQueryRunner44.fillStatement(preparedStatement45, parameterMetaData46, (java.lang.Object[]) propertyDescriptorArray66);
        asyncQueryRunner37.fillStatement(preparedStatement39, parameterMetaData40, (java.lang.Object[]) propertyDescriptorArray66);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture72 = asyncQueryRunner2.update(connection33, "hi!", (java.lang.Object[]) propertyDescriptorArray66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray15, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(propertyDescriptorArray28);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray28, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(dataSource32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(dataSource55);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(propertyDescriptorArray66);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray66, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test285");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = asyncQueryRunner3.getParameterMetaData(preparedStatement4);
        java.sql.PreparedStatement preparedStatement6 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService8);
        boolean boolean10 = asyncQueryRunner9.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement11 = null;
        java.util.concurrent.ExecutorService executorService13 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner14 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService13);
        java.sql.PreparedStatement preparedStatement15 = null;
        java.util.concurrent.ExecutorService executorService17 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner18 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService17);
        java.lang.Class<?> wildcardClass19 = asyncQueryRunner18.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner14.fillStatementWithBean(preparedStatement15, (java.lang.Object) wildcardClass19, propertyDescriptorArray20);
        asyncQueryRunner9.fillStatement(preparedStatement11, (java.lang.Object[]) propertyDescriptorArray20);
        asyncQueryRunner3.fillStatement(preparedStatement6, (java.lang.Object[]) propertyDescriptorArray20);
        java.util.concurrent.ExecutorService executorService25 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner26 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService25);
        java.sql.PreparedStatement preparedStatement27 = null;
        java.sql.ParameterMetaData parameterMetaData28 = null;
        javax.sql.DataSource dataSource29 = null;
        java.util.concurrent.ExecutorService executorService30 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner31 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource29, executorService30);
        boolean boolean32 = asyncQueryRunner31.isPmdKnownBroken();
        javax.sql.DataSource dataSource33 = asyncQueryRunner31.getDataSource();
        java.sql.PreparedStatement preparedStatement34 = null;
        java.sql.ParameterMetaData parameterMetaData35 = null;
        java.util.concurrent.ExecutorService executorService37 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner38 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService37);
        java.sql.PreparedStatement preparedStatement39 = null;
        java.util.concurrent.ExecutorService executorService41 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner42 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService41);
        java.lang.Class<?> wildcardClass43 = asyncQueryRunner42.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray44 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner38.fillStatementWithBean(preparedStatement39, (java.lang.Object) wildcardClass43, propertyDescriptorArray44);
        asyncQueryRunner31.fillStatement(preparedStatement34, parameterMetaData35, (java.lang.Object[]) propertyDescriptorArray44);
        asyncQueryRunner26.fillStatement(preparedStatement27, parameterMetaData28, (java.lang.Object[]) propertyDescriptorArray44);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture48 = asyncQueryRunner3.update("", (java.lang.Object[]) propertyDescriptorArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameterMetaData5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(propertyDescriptorArray20);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray20, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(dataSource33);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(propertyDescriptorArray44);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray44, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test286");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = asyncQueryRunner3.getParameterMetaData(preparedStatement4);
        java.sql.PreparedStatement preparedStatement6 = null;
        java.sql.ParameterMetaData parameterMetaData7 = asyncQueryRunner3.getParameterMetaData(preparedStatement6);
        java.sql.PreparedStatement preparedStatement8 = null;
        javax.sql.DataSource dataSource9 = null;
        java.util.concurrent.ExecutorService executorService10 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner11 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource9, executorService10);
        javax.sql.DataSource dataSource12 = null;
        java.util.concurrent.ExecutorService executorService14 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner15 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource12, true, executorService14);
        java.sql.PreparedStatement preparedStatement16 = null;
        java.sql.ParameterMetaData parameterMetaData17 = asyncQueryRunner15.getParameterMetaData(preparedStatement16);
        java.sql.PreparedStatement preparedStatement18 = null;
        javax.sql.DataSource dataSource19 = null;
        java.util.concurrent.ExecutorService executorService20 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner21 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource19, executorService20);
        boolean boolean22 = asyncQueryRunner21.isPmdKnownBroken();
        javax.sql.DataSource dataSource23 = asyncQueryRunner21.getDataSource();
        java.sql.PreparedStatement preparedStatement24 = null;
        java.sql.ParameterMetaData parameterMetaData25 = null;
        java.util.concurrent.ExecutorService executorService27 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner28 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService27);
        java.sql.PreparedStatement preparedStatement29 = null;
        java.util.concurrent.ExecutorService executorService31 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner32 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService31);
        java.lang.Class<?> wildcardClass33 = asyncQueryRunner32.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray34 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner28.fillStatementWithBean(preparedStatement29, (java.lang.Object) wildcardClass33, propertyDescriptorArray34);
        asyncQueryRunner21.fillStatement(preparedStatement24, parameterMetaData25, (java.lang.Object[]) propertyDescriptorArray34);
        java.lang.String[] strArray37 = new java.lang.String[] {};
        asyncQueryRunner15.fillStatementWithBean(preparedStatement18, (java.lang.Object) asyncQueryRunner21, strArray37);
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner3.fillStatementWithBean(preparedStatement8, (java.lang.Object) dataSource9, strArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"bean\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameterMetaData5);
        org.junit.Assert.assertNull(parameterMetaData7);
        org.junit.Assert.assertNull(parameterMetaData17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(dataSource23);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(propertyDescriptorArray34);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray34, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] {});
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test287");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        boolean boolean4 = asyncQueryRunner2.isPmdKnownBroken();
        boolean boolean5 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement6 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService12);
        java.lang.Class<?> wildcardClass14 = asyncQueryRunner13.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner9.fillStatementWithBean(preparedStatement10, (java.lang.Object) wildcardClass14, propertyDescriptorArray15);
        java.sql.PreparedStatement preparedStatement17 = null;
        java.sql.ParameterMetaData parameterMetaData18 = asyncQueryRunner9.getParameterMetaData(preparedStatement17);
        javax.sql.DataSource dataSource19 = null;
        java.util.concurrent.ExecutorService executorService21 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner22 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource19, true, executorService21);
        java.sql.PreparedStatement preparedStatement23 = null;
        java.sql.ParameterMetaData parameterMetaData24 = asyncQueryRunner22.getParameterMetaData(preparedStatement23);
        java.sql.PreparedStatement preparedStatement25 = null;
        javax.sql.DataSource dataSource26 = null;
        java.util.concurrent.ExecutorService executorService27 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner28 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource26, executorService27);
        boolean boolean29 = asyncQueryRunner28.isPmdKnownBroken();
        javax.sql.DataSource dataSource30 = asyncQueryRunner28.getDataSource();
        java.sql.PreparedStatement preparedStatement31 = null;
        java.sql.ParameterMetaData parameterMetaData32 = null;
        java.util.concurrent.ExecutorService executorService34 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner35 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService34);
        java.sql.PreparedStatement preparedStatement36 = null;
        java.util.concurrent.ExecutorService executorService38 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner39 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService38);
        java.lang.Class<?> wildcardClass40 = asyncQueryRunner39.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray41 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner35.fillStatementWithBean(preparedStatement36, (java.lang.Object) wildcardClass40, propertyDescriptorArray41);
        asyncQueryRunner28.fillStatement(preparedStatement31, parameterMetaData32, (java.lang.Object[]) propertyDescriptorArray41);
        java.lang.String[] strArray44 = new java.lang.String[] {};
        asyncQueryRunner22.fillStatementWithBean(preparedStatement25, (java.lang.Object) asyncQueryRunner28, strArray44);
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner2.fillStatementWithBean(preparedStatement6, (java.lang.Object) preparedStatement17, strArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"bean\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray15, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(parameterMetaData18);
        org.junit.Assert.assertNull(parameterMetaData24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(dataSource30);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(propertyDescriptorArray41);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray41, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] {});
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test288");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        java.sql.Connection connection4 = null;
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner8 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService7);
        boolean boolean9 = asyncQueryRunner8.isPmdKnownBroken();
        boolean boolean10 = asyncQueryRunner8.isPmdKnownBroken();
        boolean boolean11 = asyncQueryRunner8.isPmdKnownBroken();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture12 = asyncQueryRunner3.update(connection4, "hi!", (java.lang.Object) boolean11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test289");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.sql.ParameterMetaData parameterMetaData6 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService12);
        java.lang.Class<?> wildcardClass14 = asyncQueryRunner13.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner9.fillStatementWithBean(preparedStatement10, (java.lang.Object) wildcardClass14, propertyDescriptorArray15);
        asyncQueryRunner2.fillStatement(preparedStatement5, parameterMetaData6, (java.lang.Object[]) propertyDescriptorArray15);
        java.sql.PreparedStatement preparedStatement18 = null;
        java.sql.ParameterMetaData parameterMetaData19 = null;
        java.util.concurrent.ExecutorService executorService21 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner22 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService21);
        java.sql.PreparedStatement preparedStatement23 = null;
        java.util.concurrent.ExecutorService executorService25 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner26 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService25);
        java.lang.Class<?> wildcardClass27 = asyncQueryRunner26.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner22.fillStatementWithBean(preparedStatement23, (java.lang.Object) wildcardClass27, propertyDescriptorArray28);
        asyncQueryRunner2.fillStatement(preparedStatement18, parameterMetaData19, (java.lang.Object[]) propertyDescriptorArray28);
        boolean boolean31 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement32 = null;
        java.sql.ParameterMetaData parameterMetaData33 = null;
        java.lang.Object[] objArray34 = new java.lang.Object[] {};
        asyncQueryRunner2.fillStatement(preparedStatement32, parameterMetaData33, objArray34);
        java.sql.Connection connection36 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture38 = asyncQueryRunner2.update(connection36, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray15, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(propertyDescriptorArray28);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray28, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertArrayEquals(objArray34, new java.lang.Object[] {});
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test290");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, false, executorService2);
        javax.sql.DataSource dataSource4 = asyncQueryRunner3.getDataSource();
        boolean boolean5 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement6 = null;
        java.sql.ParameterMetaData parameterMetaData7 = null;
        java.util.concurrent.ExecutorService executorService9 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner10 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService9);
        boolean boolean11 = asyncQueryRunner10.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement12 = null;
        java.sql.ParameterMetaData parameterMetaData13 = null;
        javax.sql.DataSource dataSource14 = null;
        java.util.concurrent.ExecutorService executorService16 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner17 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource14, false, executorService16);
        java.sql.PreparedStatement preparedStatement18 = null;
        java.sql.ParameterMetaData parameterMetaData19 = null;
        java.util.concurrent.ExecutorService executorService20 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner21 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService20);
        java.sql.PreparedStatement preparedStatement22 = null;
        java.sql.ParameterMetaData parameterMetaData23 = null;
        javax.sql.DataSource dataSource24 = null;
        java.util.concurrent.ExecutorService executorService25 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner26 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource24, executorService25);
        boolean boolean27 = asyncQueryRunner26.isPmdKnownBroken();
        javax.sql.DataSource dataSource28 = asyncQueryRunner26.getDataSource();
        java.sql.PreparedStatement preparedStatement29 = null;
        java.sql.ParameterMetaData parameterMetaData30 = null;
        java.util.concurrent.ExecutorService executorService32 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner33 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService32);
        java.sql.PreparedStatement preparedStatement34 = null;
        java.util.concurrent.ExecutorService executorService36 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner37 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService36);
        java.lang.Class<?> wildcardClass38 = asyncQueryRunner37.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray39 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner33.fillStatementWithBean(preparedStatement34, (java.lang.Object) wildcardClass38, propertyDescriptorArray39);
        asyncQueryRunner26.fillStatement(preparedStatement29, parameterMetaData30, (java.lang.Object[]) propertyDescriptorArray39);
        asyncQueryRunner21.fillStatement(preparedStatement22, parameterMetaData23, (java.lang.Object[]) propertyDescriptorArray39);
        asyncQueryRunner17.fillStatement(preparedStatement18, parameterMetaData19, (java.lang.Object[]) propertyDescriptorArray39);
        asyncQueryRunner10.fillStatement(preparedStatement12, parameterMetaData13, (java.lang.Object[]) propertyDescriptorArray39);
        java.sql.PreparedStatement preparedStatement45 = null;
        java.sql.ParameterMetaData parameterMetaData46 = null;
        javax.sql.DataSource dataSource47 = null;
        java.util.concurrent.ExecutorService executorService49 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner50 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource47, true, executorService49);
        java.sql.PreparedStatement preparedStatement51 = null;
        java.sql.ParameterMetaData parameterMetaData52 = asyncQueryRunner50.getParameterMetaData(preparedStatement51);
        java.sql.PreparedStatement preparedStatement53 = null;
        java.util.concurrent.ExecutorService executorService55 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner56 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService55);
        boolean boolean57 = asyncQueryRunner56.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement58 = null;
        java.util.concurrent.ExecutorService executorService60 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner61 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService60);
        java.sql.PreparedStatement preparedStatement62 = null;
        java.util.concurrent.ExecutorService executorService64 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner65 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService64);
        java.lang.Class<?> wildcardClass66 = asyncQueryRunner65.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray67 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner61.fillStatementWithBean(preparedStatement62, (java.lang.Object) wildcardClass66, propertyDescriptorArray67);
        asyncQueryRunner56.fillStatement(preparedStatement58, (java.lang.Object[]) propertyDescriptorArray67);
        asyncQueryRunner50.fillStatement(preparedStatement53, (java.lang.Object[]) propertyDescriptorArray67);
        asyncQueryRunner10.fillStatement(preparedStatement45, parameterMetaData46, (java.lang.Object[]) propertyDescriptorArray67);
        asyncQueryRunner3.fillStatement(preparedStatement6, parameterMetaData7, (java.lang.Object[]) propertyDescriptorArray67);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(dataSource28);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(propertyDescriptorArray39);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray39, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(parameterMetaData52);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertNotNull(propertyDescriptorArray67);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray67, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test291");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        java.sql.PreparedStatement preparedStatement3 = null;
        java.sql.ParameterMetaData parameterMetaData4 = null;
        javax.sql.DataSource dataSource5 = null;
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner7 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource5, executorService6);
        boolean boolean8 = asyncQueryRunner7.isPmdKnownBroken();
        javax.sql.DataSource dataSource9 = asyncQueryRunner7.getDataSource();
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = null;
        java.util.concurrent.ExecutorService executorService13 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner14 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService13);
        java.sql.PreparedStatement preparedStatement15 = null;
        java.util.concurrent.ExecutorService executorService17 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner18 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService17);
        java.lang.Class<?> wildcardClass19 = asyncQueryRunner18.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner14.fillStatementWithBean(preparedStatement15, (java.lang.Object) wildcardClass19, propertyDescriptorArray20);
        asyncQueryRunner7.fillStatement(preparedStatement10, parameterMetaData11, (java.lang.Object[]) propertyDescriptorArray20);
        java.sql.PreparedStatement preparedStatement23 = null;
        java.sql.ParameterMetaData parameterMetaData24 = null;
        java.util.concurrent.ExecutorService executorService26 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner27 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService26);
        java.sql.PreparedStatement preparedStatement28 = null;
        java.util.concurrent.ExecutorService executorService30 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner31 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService30);
        java.lang.Class<?> wildcardClass32 = asyncQueryRunner31.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray33 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner27.fillStatementWithBean(preparedStatement28, (java.lang.Object) wildcardClass32, propertyDescriptorArray33);
        asyncQueryRunner7.fillStatement(preparedStatement23, parameterMetaData24, (java.lang.Object[]) propertyDescriptorArray33);
        asyncQueryRunner2.fillStatement(preparedStatement3, parameterMetaData4, (java.lang.Object[]) propertyDescriptorArray33);
        javax.sql.DataSource dataSource37 = asyncQueryRunner2.getDataSource();
        javax.sql.DataSource dataSource39 = null;
        java.util.concurrent.ExecutorService executorService40 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner41 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource39, executorService40);
        boolean boolean42 = asyncQueryRunner41.isPmdKnownBroken();
        javax.sql.DataSource dataSource43 = asyncQueryRunner41.getDataSource();
        java.sql.PreparedStatement preparedStatement44 = null;
        java.sql.ParameterMetaData parameterMetaData45 = null;
        java.util.concurrent.ExecutorService executorService47 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner48 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService47);
        java.sql.PreparedStatement preparedStatement49 = null;
        java.util.concurrent.ExecutorService executorService51 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner52 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService51);
        java.lang.Class<?> wildcardClass53 = asyncQueryRunner52.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray54 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner48.fillStatementWithBean(preparedStatement49, (java.lang.Object) wildcardClass53, propertyDescriptorArray54);
        asyncQueryRunner41.fillStatement(preparedStatement44, parameterMetaData45, (java.lang.Object[]) propertyDescriptorArray54);
        java.sql.PreparedStatement preparedStatement57 = null;
        java.sql.ParameterMetaData parameterMetaData58 = null;
        java.util.concurrent.ExecutorService executorService60 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner61 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService60);
        java.sql.PreparedStatement preparedStatement62 = null;
        java.util.concurrent.ExecutorService executorService64 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner65 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService64);
        java.lang.Class<?> wildcardClass66 = asyncQueryRunner65.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray67 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner61.fillStatementWithBean(preparedStatement62, (java.lang.Object) wildcardClass66, propertyDescriptorArray67);
        asyncQueryRunner41.fillStatement(preparedStatement57, parameterMetaData58, (java.lang.Object[]) propertyDescriptorArray67);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture70 = asyncQueryRunner2.update("hi!", (java.lang.Object[]) propertyDescriptorArray67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(propertyDescriptorArray20);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray20, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(propertyDescriptorArray33);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray33, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(dataSource43);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(propertyDescriptorArray54);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray54, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertNotNull(propertyDescriptorArray67);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray67, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test292");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        java.sql.PreparedStatement preparedStatement3 = null;
        java.util.concurrent.ExecutorService executorService5 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner6 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService5);
        java.lang.Class<?> wildcardClass7 = asyncQueryRunner6.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner2.fillStatementWithBean(preparedStatement3, (java.lang.Object) wildcardClass7, propertyDescriptorArray8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = asyncQueryRunner2.getParameterMetaData(preparedStatement10);
        java.sql.Connection connection12 = null;
        java.lang.Object[] objArray14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture15 = asyncQueryRunner2.update(connection12, "hi!", objArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray8, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(parameterMetaData11);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test293");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        boolean boolean4 = asyncQueryRunner2.isPmdKnownBroken();
        boolean boolean5 = asyncQueryRunner2.isPmdKnownBroken();
        boolean boolean6 = asyncQueryRunner2.isPmdKnownBroken();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test294");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        boolean boolean4 = asyncQueryRunner2.isPmdKnownBroken();
        java.lang.Class<?> wildcardClass5 = asyncQueryRunner2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test295");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = null;
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner7 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService6);
        java.sql.PreparedStatement preparedStatement8 = null;
        java.sql.ParameterMetaData parameterMetaData9 = null;
        javax.sql.DataSource dataSource10 = null;
        java.util.concurrent.ExecutorService executorService11 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner12 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource10, executorService11);
        boolean boolean13 = asyncQueryRunner12.isPmdKnownBroken();
        javax.sql.DataSource dataSource14 = asyncQueryRunner12.getDataSource();
        java.sql.PreparedStatement preparedStatement15 = null;
        java.sql.ParameterMetaData parameterMetaData16 = null;
        java.util.concurrent.ExecutorService executorService18 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner19 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService18);
        java.sql.PreparedStatement preparedStatement20 = null;
        java.util.concurrent.ExecutorService executorService22 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner23 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService22);
        java.lang.Class<?> wildcardClass24 = asyncQueryRunner23.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray25 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner19.fillStatementWithBean(preparedStatement20, (java.lang.Object) wildcardClass24, propertyDescriptorArray25);
        asyncQueryRunner12.fillStatement(preparedStatement15, parameterMetaData16, (java.lang.Object[]) propertyDescriptorArray25);
        asyncQueryRunner7.fillStatement(preparedStatement8, parameterMetaData9, (java.lang.Object[]) propertyDescriptorArray25);
        asyncQueryRunner2.fillStatement(preparedStatement4, parameterMetaData5, (java.lang.Object[]) propertyDescriptorArray25);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture31 = asyncQueryRunner2.update("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(propertyDescriptorArray25);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray25, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test296");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, false, executorService2);
        javax.sql.DataSource dataSource4 = asyncQueryRunner3.getDataSource();
        boolean boolean5 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.sql.ParameterMetaData parameterMetaData7 = asyncQueryRunner3.getParameterMetaData(preparedStatement6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test297");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement5 = null;
        javax.sql.DataSource dataSource6 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource6, true, executorService8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = asyncQueryRunner9.getParameterMetaData(preparedStatement10);
        java.sql.PreparedStatement preparedStatement12 = null;
        java.sql.ParameterMetaData parameterMetaData13 = asyncQueryRunner9.getParameterMetaData(preparedStatement12);
        javax.sql.DataSource dataSource14 = null;
        java.util.concurrent.ExecutorService executorService16 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner17 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource14, true, executorService16);
        java.sql.PreparedStatement preparedStatement18 = null;
        java.sql.ParameterMetaData parameterMetaData19 = asyncQueryRunner17.getParameterMetaData(preparedStatement18);
        java.sql.PreparedStatement preparedStatement20 = null;
        javax.sql.DataSource dataSource21 = null;
        java.util.concurrent.ExecutorService executorService22 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner23 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource21, executorService22);
        boolean boolean24 = asyncQueryRunner23.isPmdKnownBroken();
        javax.sql.DataSource dataSource25 = asyncQueryRunner23.getDataSource();
        java.sql.PreparedStatement preparedStatement26 = null;
        java.sql.ParameterMetaData parameterMetaData27 = null;
        java.util.concurrent.ExecutorService executorService29 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner30 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService29);
        java.sql.PreparedStatement preparedStatement31 = null;
        java.util.concurrent.ExecutorService executorService33 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner34 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService33);
        java.lang.Class<?> wildcardClass35 = asyncQueryRunner34.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray36 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner30.fillStatementWithBean(preparedStatement31, (java.lang.Object) wildcardClass35, propertyDescriptorArray36);
        asyncQueryRunner23.fillStatement(preparedStatement26, parameterMetaData27, (java.lang.Object[]) propertyDescriptorArray36);
        java.lang.String[] strArray39 = new java.lang.String[] {};
        asyncQueryRunner17.fillStatementWithBean(preparedStatement20, (java.lang.Object) asyncQueryRunner23, strArray39);
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner2.fillStatementWithBean(preparedStatement5, (java.lang.Object) preparedStatement12, strArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"bean\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(parameterMetaData11);
        org.junit.Assert.assertNull(parameterMetaData13);
        org.junit.Assert.assertNull(parameterMetaData19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(dataSource25);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(propertyDescriptorArray36);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray36, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] {});
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test298");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner1 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0);
        java.sql.PreparedStatement preparedStatement2 = null;
        java.sql.ParameterMetaData parameterMetaData3 = null;
        javax.sql.DataSource dataSource4 = null;
        java.util.concurrent.ExecutorService executorService5 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner6 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource4, executorService5);
        boolean boolean7 = asyncQueryRunner6.isPmdKnownBroken();
        javax.sql.DataSource dataSource8 = asyncQueryRunner6.getDataSource();
        java.sql.PreparedStatement preparedStatement9 = null;
        java.sql.ParameterMetaData parameterMetaData10 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService12);
        java.sql.PreparedStatement preparedStatement14 = null;
        java.util.concurrent.ExecutorService executorService16 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner17 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService16);
        java.lang.Class<?> wildcardClass18 = asyncQueryRunner17.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner13.fillStatementWithBean(preparedStatement14, (java.lang.Object) wildcardClass18, propertyDescriptorArray19);
        asyncQueryRunner6.fillStatement(preparedStatement9, parameterMetaData10, (java.lang.Object[]) propertyDescriptorArray19);
        asyncQueryRunner1.fillStatement(preparedStatement2, parameterMetaData3, (java.lang.Object[]) propertyDescriptorArray19);
        boolean boolean23 = asyncQueryRunner1.isPmdKnownBroken();
        javax.sql.DataSource dataSource25 = null;
        java.util.concurrent.ExecutorService executorService27 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner28 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource25, true, executorService27);
        java.sql.PreparedStatement preparedStatement29 = null;
        java.sql.ParameterMetaData parameterMetaData30 = asyncQueryRunner28.getParameterMetaData(preparedStatement29);
        java.sql.PreparedStatement preparedStatement31 = null;
        java.util.concurrent.ExecutorService executorService33 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner34 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService33);
        boolean boolean35 = asyncQueryRunner34.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement36 = null;
        java.util.concurrent.ExecutorService executorService38 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner39 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService38);
        java.sql.PreparedStatement preparedStatement40 = null;
        java.util.concurrent.ExecutorService executorService42 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner43 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService42);
        java.lang.Class<?> wildcardClass44 = asyncQueryRunner43.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray45 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner39.fillStatementWithBean(preparedStatement40, (java.lang.Object) wildcardClass44, propertyDescriptorArray45);
        asyncQueryRunner34.fillStatement(preparedStatement36, (java.lang.Object[]) propertyDescriptorArray45);
        asyncQueryRunner28.fillStatement(preparedStatement31, (java.lang.Object[]) propertyDescriptorArray45);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture49 = asyncQueryRunner1.update("hi!", (java.lang.Object[]) propertyDescriptorArray45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable)\" because \"this.executorService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray19, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(parameterMetaData30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(propertyDescriptorArray45);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray45, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test299");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.sql.ParameterMetaData parameterMetaData6 = null;
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner8 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService7);
        java.sql.PreparedStatement preparedStatement9 = null;
        java.sql.ParameterMetaData parameterMetaData10 = null;
        javax.sql.DataSource dataSource11 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource11, executorService12);
        boolean boolean14 = asyncQueryRunner13.isPmdKnownBroken();
        javax.sql.DataSource dataSource15 = asyncQueryRunner13.getDataSource();
        java.sql.PreparedStatement preparedStatement16 = null;
        java.sql.ParameterMetaData parameterMetaData17 = null;
        java.util.concurrent.ExecutorService executorService19 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner20 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService19);
        java.sql.PreparedStatement preparedStatement21 = null;
        java.util.concurrent.ExecutorService executorService23 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner24 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService23);
        java.lang.Class<?> wildcardClass25 = asyncQueryRunner24.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray26 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner20.fillStatementWithBean(preparedStatement21, (java.lang.Object) wildcardClass25, propertyDescriptorArray26);
        asyncQueryRunner13.fillStatement(preparedStatement16, parameterMetaData17, (java.lang.Object[]) propertyDescriptorArray26);
        asyncQueryRunner8.fillStatement(preparedStatement9, parameterMetaData10, (java.lang.Object[]) propertyDescriptorArray26);
        asyncQueryRunner2.fillStatement(preparedStatement5, parameterMetaData6, (java.lang.Object[]) propertyDescriptorArray26);
        java.sql.PreparedStatement preparedStatement31 = null;
        java.sql.ParameterMetaData parameterMetaData32 = null;
        java.util.concurrent.ExecutorService executorService34 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner35 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService34);
        boolean boolean36 = asyncQueryRunner35.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement37 = null;
        java.util.concurrent.ExecutorService executorService39 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner40 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService39);
        java.sql.PreparedStatement preparedStatement41 = null;
        java.util.concurrent.ExecutorService executorService43 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner44 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService43);
        java.lang.Class<?> wildcardClass45 = asyncQueryRunner44.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray46 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner40.fillStatementWithBean(preparedStatement41, (java.lang.Object) wildcardClass45, propertyDescriptorArray46);
        asyncQueryRunner35.fillStatement(preparedStatement37, (java.lang.Object[]) propertyDescriptorArray46);
        java.sql.PreparedStatement preparedStatement49 = null;
        java.util.concurrent.ExecutorService executorService52 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner53 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService52);
        boolean boolean54 = asyncQueryRunner53.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement55 = null;
        java.sql.ParameterMetaData parameterMetaData56 = null;
        javax.sql.DataSource dataSource57 = null;
        java.util.concurrent.ExecutorService executorService59 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner60 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource57, false, executorService59);
        java.sql.PreparedStatement preparedStatement61 = null;
        java.sql.ParameterMetaData parameterMetaData62 = null;
        java.util.concurrent.ExecutorService executorService63 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner64 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService63);
        java.sql.PreparedStatement preparedStatement65 = null;
        java.sql.ParameterMetaData parameterMetaData66 = null;
        javax.sql.DataSource dataSource67 = null;
        java.util.concurrent.ExecutorService executorService68 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner69 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource67, executorService68);
        boolean boolean70 = asyncQueryRunner69.isPmdKnownBroken();
        javax.sql.DataSource dataSource71 = asyncQueryRunner69.getDataSource();
        java.sql.PreparedStatement preparedStatement72 = null;
        java.sql.ParameterMetaData parameterMetaData73 = null;
        java.util.concurrent.ExecutorService executorService75 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner76 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService75);
        java.sql.PreparedStatement preparedStatement77 = null;
        java.util.concurrent.ExecutorService executorService79 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner80 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService79);
        java.lang.Class<?> wildcardClass81 = asyncQueryRunner80.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray82 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner76.fillStatementWithBean(preparedStatement77, (java.lang.Object) wildcardClass81, propertyDescriptorArray82);
        asyncQueryRunner69.fillStatement(preparedStatement72, parameterMetaData73, (java.lang.Object[]) propertyDescriptorArray82);
        asyncQueryRunner64.fillStatement(preparedStatement65, parameterMetaData66, (java.lang.Object[]) propertyDescriptorArray82);
        asyncQueryRunner60.fillStatement(preparedStatement61, parameterMetaData62, (java.lang.Object[]) propertyDescriptorArray82);
        asyncQueryRunner53.fillStatement(preparedStatement55, parameterMetaData56, (java.lang.Object[]) propertyDescriptorArray82);
        asyncQueryRunner35.fillStatementWithBean(preparedStatement49, (java.lang.Object) 10, propertyDescriptorArray82);
        asyncQueryRunner2.fillStatement(preparedStatement31, parameterMetaData32, (java.lang.Object[]) propertyDescriptorArray82);
        boolean boolean90 = asyncQueryRunner2.isPmdKnownBroken();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(propertyDescriptorArray26);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray26, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(propertyDescriptorArray46);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray46, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(dataSource71);
        org.junit.Assert.assertNotNull(wildcardClass81);
        org.junit.Assert.assertNotNull(propertyDescriptorArray82);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray82, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.dbutils.RegressionTest0.test300");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.sql.ParameterMetaData parameterMetaData6 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService12);
        java.lang.Class<?> wildcardClass14 = asyncQueryRunner13.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner9.fillStatementWithBean(preparedStatement10, (java.lang.Object) wildcardClass14, propertyDescriptorArray15);
        asyncQueryRunner2.fillStatement(preparedStatement5, parameterMetaData6, (java.lang.Object[]) propertyDescriptorArray15);
        javax.sql.DataSource dataSource18 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement19 = null;
        javax.sql.DataSource dataSource20 = null;
        java.util.concurrent.ExecutorService executorService21 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner22 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource20, executorService21);
        boolean boolean23 = asyncQueryRunner22.isPmdKnownBroken();
        javax.sql.DataSource dataSource24 = asyncQueryRunner22.getDataSource();
        java.sql.PreparedStatement preparedStatement25 = null;
        java.sql.ParameterMetaData parameterMetaData26 = null;
        java.util.concurrent.ExecutorService executorService28 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner29 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService28);
        java.sql.PreparedStatement preparedStatement30 = null;
        java.util.concurrent.ExecutorService executorService32 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner33 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService32);
        java.lang.Class<?> wildcardClass34 = asyncQueryRunner33.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray35 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner29.fillStatementWithBean(preparedStatement30, (java.lang.Object) wildcardClass34, propertyDescriptorArray35);
        asyncQueryRunner22.fillStatement(preparedStatement25, parameterMetaData26, (java.lang.Object[]) propertyDescriptorArray35);
        java.sql.PreparedStatement preparedStatement38 = null;
        java.sql.ParameterMetaData parameterMetaData39 = null;
        java.util.concurrent.ExecutorService executorService41 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner42 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService41);
        java.sql.PreparedStatement preparedStatement43 = null;
        java.util.concurrent.ExecutorService executorService45 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner46 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService45);
        java.lang.Class<?> wildcardClass47 = asyncQueryRunner46.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray48 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner42.fillStatementWithBean(preparedStatement43, (java.lang.Object) wildcardClass47, propertyDescriptorArray48);
        asyncQueryRunner22.fillStatement(preparedStatement38, parameterMetaData39, (java.lang.Object[]) propertyDescriptorArray48);
        boolean boolean51 = asyncQueryRunner22.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement52 = null;
        java.sql.ParameterMetaData parameterMetaData53 = null;
        java.lang.Object[] objArray54 = new java.lang.Object[] {};
        asyncQueryRunner22.fillStatement(preparedStatement52, parameterMetaData53, objArray54);
        java.util.concurrent.ExecutorService executorService57 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner58 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService57);
        boolean boolean59 = asyncQueryRunner58.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement60 = null;
        java.sql.ParameterMetaData parameterMetaData61 = null;
        javax.sql.DataSource dataSource62 = null;
        java.util.concurrent.ExecutorService executorService64 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner65 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource62, false, executorService64);
        java.sql.PreparedStatement preparedStatement66 = null;
        java.sql.ParameterMetaData parameterMetaData67 = null;
        java.util.concurrent.ExecutorService executorService68 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner69 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService68);
        java.sql.PreparedStatement preparedStatement70 = null;
        java.sql.ParameterMetaData parameterMetaData71 = null;
        javax.sql.DataSource dataSource72 = null;
        java.util.concurrent.ExecutorService executorService73 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner74 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource72, executorService73);
        boolean boolean75 = asyncQueryRunner74.isPmdKnownBroken();
        javax.sql.DataSource dataSource76 = asyncQueryRunner74.getDataSource();
        java.sql.PreparedStatement preparedStatement77 = null;
        java.sql.ParameterMetaData parameterMetaData78 = null;
        java.util.concurrent.ExecutorService executorService80 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner81 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService80);
        java.sql.PreparedStatement preparedStatement82 = null;
        java.util.concurrent.ExecutorService executorService84 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner85 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService84);
        java.lang.Class<?> wildcardClass86 = asyncQueryRunner85.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray87 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner81.fillStatementWithBean(preparedStatement82, (java.lang.Object) wildcardClass86, propertyDescriptorArray87);
        asyncQueryRunner74.fillStatement(preparedStatement77, parameterMetaData78, (java.lang.Object[]) propertyDescriptorArray87);
        asyncQueryRunner69.fillStatement(preparedStatement70, parameterMetaData71, (java.lang.Object[]) propertyDescriptorArray87);
        asyncQueryRunner65.fillStatement(preparedStatement66, parameterMetaData67, (java.lang.Object[]) propertyDescriptorArray87);
        asyncQueryRunner58.fillStatement(preparedStatement60, parameterMetaData61, (java.lang.Object[]) propertyDescriptorArray87);
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner2.fillStatementWithBean(preparedStatement19, (java.lang.Object) preparedStatement52, propertyDescriptorArray87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.PreparedStatement.getParameterMetaData()\" because \"stmt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray15, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(propertyDescriptorArray35);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray35, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(propertyDescriptorArray48);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray48, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertArrayEquals(objArray54, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNull(dataSource76);
        org.junit.Assert.assertNotNull(wildcardClass86);
        org.junit.Assert.assertNotNull(propertyDescriptorArray87);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray87, new java.beans.PropertyDescriptor[] {});
    }
}

