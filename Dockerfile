FROM openjdk:17-jdk-slim as build

# Add the application's jar to the container
COPY target/employeeService-0.0.1-SNAPSHOT.jar employeeService-0.0.1-SNAPSHOT.jar

#execute the application
ENTRYPOINT ["java","-jar","/employeeService-0.0.1-SNAPSHOT.jar"]

EXPOSE 9090