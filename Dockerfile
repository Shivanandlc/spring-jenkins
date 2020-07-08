FROM openjdk:8
#ADD target/spring-kube.jar spring-kube.jar
#EXPOSE 9091
VOLUME /tmp
ARG JAR_FILE
ADD target/jenkinsPipeline.jar jenkinsPipeline.jar
ENTRYPOINT ["java", "-jar", "jenkinsPipeline.jar"]