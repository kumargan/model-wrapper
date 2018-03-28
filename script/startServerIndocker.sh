#!bin bash

echo "copying models from S3"
aws s3 cp --recursive  s3://<some bucket>/models/ .

echo "starting shiney server"
Rscript rserver.R &

#allow the shiney server to start
echo " sleeping for 5 min"
sleep 5s

echo "starting web server"
/usr/bin/java -Xmx1000M -Xms256M -jar app.jar