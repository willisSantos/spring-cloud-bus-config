FROM gradle:8.10.0-jdk17 AS builder
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN curl -o /home/gradle/src/aspectjweaver.jar https://repo1.maven.org/maven2/org/aspectj/aspectjweaver/1.9.22.1/aspectjweaver-1.9.22.1.jar
RUN curl -o /home/gradle/src/spring-instrument.jar https://repo1.maven.org/maven2/org/springframework/spring-instrument/6.1.12/spring-instrument-6.1.12.jar

RUN gradle :spring-rest-api:build --no-daemon

FROM amazoncorretto:17-alpine AS runner
EXPOSE 8888
RUN mkdir /app
RUN mkdir /app/libs
COPY --from=builder /home/gradle/src/spring-rest-api/build/libs/*.jar /app/rest-api.jar
COPY --from=builder /home/gradle/src/aspectjweaver.jar /app/libs/aspectjweaver.jar
COPY --from=builder /home/gradle/src/spring-instrument.jar /app/libs/spring-instrument.jar
WORKDIR /app
ENTRYPOINT ["java","-javaagent:/app/libs/aspectjweaver.jar","-javaagent:/app/libs/spring-instrument.jar", "-jar", "rest-api.jar"]
