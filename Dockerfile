FROM eclipse-temurin:17-jdk-alpine
EXPOSE 8080
ADD target/demo-github-actions.jar demo-github-actions.jar
ENTRYPOINT ["java" , "-jar" , "/demo-github-actions.jar"]