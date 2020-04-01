# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine
VOLUME /tmp
# Add Maintainer Info
LABEL maintainer="trial"

# Make port 8080 available to the world outside this container
EXPOSE 8080

COPY dependencies /dependencies

 # The application's jar file
ARG JAR_FILE=target/gov.knart2fhir.transformation.service.jar

# Add the application's jar to the container
ADD ${JAR_FILE} gov.knart2fhir.transformation.service.jar

COPY transformation /transformation

ENV CLASSPATH .:/dependencies/*.jar:/transformation

# Run the jar file 
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom","-jar","/gov.knart2fhir.transformation.service.jar"]

