FROM openjdk:8
EXPOSE 8090
ADD target/student-github-actions.jar student-github-actions.jar
ENTRYPOINT ["java", "-jar", "/student-github-actions.jar"]