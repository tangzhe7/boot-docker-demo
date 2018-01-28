FROM openjdk:8-jdk-alpine
VOLUME /tmp
#编译传入的参数
ARG JAR_FILE
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["sh","-c","java $JAVA_OPTS -jar /app.jar"]
