FROM openjdk:11

ADD target/userservice-0.0.1-SNAPSHOT.jar  /src/app/user/userservice-0.0.1-SNAPSHOT.jar

WORKDIR /src/app/user

ENTRYPOINT ["java","-jar", "userservice-0.0.1-SNAPSHOT.jar"]