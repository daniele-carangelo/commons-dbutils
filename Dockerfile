
 # Licensed to the Apache Software Foundation (ASF) under one or more
 # contributor license agreements.  See the NOTICE file distributed with
 # this work for additional information regarding copyright ownership.
 # The ASF licenses this file to You under the Apache License, Version 2.0
 # (the "License"); you may not use this file except in compliance with
 # the License.  You may obtain a copy of the License at
 #
 #      http://www.apache.org/licenses/LICENSE-2.0
 #
 # Unless required by applicable law or agreed to in writing, software
 # distributed under the License is distributed on an "AS IS" BASIS,
 # WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 # See the License for the specific language governing permissions and
 # limitations under the License.

# immagine base con Java 17, eclipse e Maven pre-installato
FROM maven:3.8.6-eclipse-temurin-17 AS build
# Imposta la working directory
WORKDIR /app

# Copia i file di progetto
COPY . .

# Compila il progetto usando Maven
RUN mvn clean package -DskipTests

# Seconda fase: esecuzione del container con l'applicazione Java
FROM eclipse-temurin:17-jre

WORKDIR /app

# Copia il JAR generato dalla fase precedente
COPY --from=build /app/target/*.jar app.jar

# Specifica il comando per eseguire il JAR
CMD ["java", "-jar", "app.jar"]

