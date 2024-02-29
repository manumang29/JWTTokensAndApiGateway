FROM openjdk:17-jdk-slim as build

# Add the application's jar to the container
COPY target/EmployeeAttendaceSystem-0.0.1-SNAPSHOT.jar employeeAttendaceSystem-0.0.1-SNAPSHOT.jar

#execute the application
ENTRYPOINT ["java","-jar","/employeeAttendaceSystem-0.0.1-SNAPSHOT.jar"]