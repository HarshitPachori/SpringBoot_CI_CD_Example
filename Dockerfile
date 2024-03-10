FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY target/spring_cd_example-0.0.1-SNAPSHOT.jar /app/spring_ci_cd_example.jar
EXPOSE 8080
CMD [ "java", "-jar","spring_ci_cd_example.jar" ]