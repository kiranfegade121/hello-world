FROM openjdk:8-jdk-alpine
COPY target/hello-world.jar hello-world.jar
ENTRYPOINT ["sh", "-c", "java -jar /hello-world.jar"]