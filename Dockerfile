FROM openjdk:8-jre-alpine
WORKDIR /usr/src/app
COPY ./target/Todo-0.0.1-SNAPSHOT.war .
EXPOSE 8080
CMD ["java", "-jar", "Todo-0.0.1-SNAPSHOT.war"]