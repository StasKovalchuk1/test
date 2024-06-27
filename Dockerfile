FROM openjdk:22
WORKDIR /app
COPY FreelancePlatform/target/FreelancePlatform-0.0.1-SNAPSHOT.jar /app/FreelancePlatform.jar
ENTRYPOINT ["java", "-jar", "FreelancePlatform.jar"]