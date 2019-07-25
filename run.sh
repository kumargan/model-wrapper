#!bin bash
mvn package
java -Xmx1000M -Xms256M -jar target/ModelWrapper-1.0.jar  --server.port=8086