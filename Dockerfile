FROM eclipse-temurin:17
WORKDIR /app
EXPOSE 8080
COPY build/libs/calculator-0.0.1-SNAPSHOT.jar /app/calculator.jar
ENTRYPOINT ["java","-jar","/app/calculator.jar"]