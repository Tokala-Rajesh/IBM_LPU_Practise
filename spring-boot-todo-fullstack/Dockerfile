 FROM openjdk:8-jdk-alpine
 EXPOSE  8080
 ADD target/todo-api.jar todo-api.jar 
 ENTRYPOINT ["java","-jar","/todo-api.jar"]