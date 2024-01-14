FROM openjdk:17-alpine

COPY target/SampleApp.jar SampleApp.jar

EXPOSE 8081

ENTRYPOINT ["java","-jar","/SampleApp.jar"]