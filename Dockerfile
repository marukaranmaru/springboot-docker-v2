FROM openjdk:17
EXPOSE 8080
ADD target/spring-boot-docker-v2.jar spring-boot-docker-v2.jar
ENTRYPOINT [ "java", "-jar" , "/spring-boot-docker-v2.jar" ]