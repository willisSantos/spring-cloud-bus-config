FROM gradle:8.10.0-jdk21 AS builder
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle :spring-config-server:build --no-daemon

FROM amazoncorretto:21-alpine AS runner
EXPOSE 8888
RUN mkdir /app
COPY --from=builder /home/gradle/src/spring-config-server/build/libs/*.jar /app/config-server.jar
WORKDIR /app
ENTRYPOINT ["java", "-jar", "config-server.jar"]
