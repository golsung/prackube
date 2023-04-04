FROM openjdk:11
COPY healthy /tmp/
ADD build/libs/kubedemo-v0-0.0.1-SNAPSHOT.jar kubedemo.jar
ENTRYPOINT [ "java", "-jar", "kubedemo.jar" ]