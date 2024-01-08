FROM openjdk:17
EXPOSE 8080
ADD target/producer.jar producer.jar
ENTRYPOINT ["java","-jar","/producer.jar"]