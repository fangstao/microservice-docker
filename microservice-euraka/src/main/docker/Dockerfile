FROM openjdk:8u102-jdk
ADD *.jar /root/microservice-eureka.jar
WORKDIR /root
EXPOSE 80
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","microservice-eureka.jar"]