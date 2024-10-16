# Etapa de construcción
FROM maven:3.8.6 AS build

# Establecer el directorio de trabajo
WORKDIR /app

# Copiar solo el pom.xml y construir las dependencias
COPY pom.xml .
RUN mvn dependency:go-offline

# Copiar el código fuente
COPY src ./src

# Construir la aplicación
RUN mvn clean package -DskipTests

# Etapa de producción
FROM openjdk:21-jdk

# Establecer el directorio de trabajo en la etapa de producción
WORKDIR /app

# Copiar el archivo JAR desde la etapa de construcción
COPY --from=build /app/target/educcom-0.0.1-SNAPSHOT.jar app.jar

# Exponer el puerto que usará la aplicación
EXPOSE 8080

# Comando para ejecutar la aplicación
CMD ["java", "-Dserver.port=8080", "-jar", "app.jar"]
