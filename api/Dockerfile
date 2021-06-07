FROM openjdk:11

ARG ADDITIONAL_OPTS

ENV ADDITIONAL_OPTS=${ADDITIONAL_OPTS}

WORKDIR /app

COPY target/api-*.jar /app/api.jar

EXPOSE 5005
EXPOSE 8080

ENTRYPOINT [ "java", "-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005","-jar", "api.jar" ]

# docker run -i -p 3306:3306 -e MYSQL_ROOT_PASSWORD=123456 -e MYSQL_DATABASE=api -d mysql:5.6
# docker build -t api .
# docker run -p 8080:8080 api