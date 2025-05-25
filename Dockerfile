# Dockerfile
FROM eclipse-temurin:17-jdk-alpine

# Diretório dentro do container
WORKDIR /app

# Copia o JAR já construído
COPY target/kafka-splunk-poc.jar app.jar

# Expõe a porta da aplicação
EXPOSE 8080

# Comando para rodar a app
ENTRYPOINT ["java", "-jar", "app.jar"]
