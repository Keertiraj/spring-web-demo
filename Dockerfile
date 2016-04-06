#Ubuntu based Web Container
FROM ubuntu:15.04
FROM jamesdbloom/docker-java7-maven
MAINTAINER keerti4p@gmail.com
EXPOSE 80
RUN cd /tmp;git clone https://github.com/Keertiraj/spring-web-demo.git;cd spring-web-demo; mvn clean install; cd /tmp/spring-web-demo/target; touch /tmp/logfile.log
RUN sh -c 'touch /tmp/spring-web-demo/target/webdemo.war'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/tmp/spring-web-demo/target/webdemo.war", "2>&1","/tmp/logfile.log","&"]

