FROM centos:centos7
MAINTAINER sravan

USER root

COPY jdk-8u211-linux-x64.tar.gz /opt

RUN mkdir /opt/java_install

RUN tar -xvzf /opt/jdk-8u211-linux-x64.tar.gz -C /opt/java_install

RUN cd /opt/java_install

RUN ls

RUN /opt/java_install/jdk1.8.0_211/bin/java -version

ENV JAVA_HOME /opt/java_install/jdk1.8.0_211/

ENV PATH=$PATH:$JAVA_HOME/bin

CMD [“echo”,”Tomcat installation”]

COPY apache-tomcat-9.0.20.tar.gz /opt

RUN mkdir /opt/tomcat_install

RUN tar -xvzf /opt/apache-tomcat-9.0.20.tar.gz -C /opt/tomcat_install

RUN cd /opt/tomcat_install

RUN ls

ENV CATALINA_HOME /opt/tomcat_install/apache-tomcat-9.0.20

ENV PATH=$PATH:$CATALINA_HOME/bin

CMD [“echo”,”Image created”]
