FROM openjdk:17
EXPOSE 8080
ADD target/profilesPOC.jar profilesPOC.jar
ENTRYPOINT ["java","-jar","/profilesPOC.jar"]
