FROM java:8
VOLUME /tmp
ADD target/ProductRecord*.jar ProductRecord.jar
RUN sh -c 'touch /ProductRecord.jar'
ENV JAVA_OPTS="-Xmx256m -Xms128m"
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /ProductRecord.jar"]
