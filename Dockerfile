FROM azul/zulu-openjdk-centos:11

# Environment variables
ENV PORT 8080
ENV JVM_XMS 128m
ENV JVM_XMX 256m

# Add file to image on build
ADD target/*.jar /app/app.jar

# Expose port
EXPOSE ${PORT}

# Start application
CMD /usr/lib/jvm/zulu11/bin/java -Xms${JVM_XMS} \
                  -Xmx${JVM_XMX} \
                  -Dcom.sun.management.jmxremote=true \
                  -Dcom.sun.management.jmxremote.ssl=false \
                  -Dcom.sun.management.jmxremote.authenticate=false \
                  -jar /app/app.jar \
                  --server.port=${PORT}
