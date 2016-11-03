FROM openjdk:8u102-jdk
ADD *.jar /root/microservice-user.jar
WORKDIR /root
EXPOSE 80
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","microservice-user.jar"]