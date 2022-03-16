FROM maven:3.8.4-openjdk-11
RUN apt-get update
COPY . ./data
WORKDIR ./data
RUN mvn clean package -DskipTests=true
EXPOSE 80
WORKDIR ./target
CMD ["java", "-jar", "projetecoleensitech-0.0.1-SNAPSHOT.jar"]