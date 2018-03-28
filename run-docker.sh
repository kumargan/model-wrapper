#!bin bash
# Required in old versions of mac.
unset DOCKER_HOST

javapath=`which java`

if [ -z != $javapath ] 
	then
		echo "java already installed"
	else
		echo " install java and continue, exiting "
		exit
fi

mavenpath=`which mvn`	

if [ -z != $mavenpath ] 
	then
		echo "maven already installed"
	else
		echo " install maven and continue, exiting "
		exit
	fi

dockerpath=`which docker`
 
 if [ -z != $dockerpath ] 
 then
 		echo "docker already installed"
 else
 		echo "please install docker and continue, exiting "
 		exit
 fi


rm -rf target

mvn package >> docker-build.logs
if [ $? -eq 0 ]; then
	echo "packaging successful "
	echo "**********************************************************************************"
	file="docker.imgid"
		if [ -f "$file" ]
		then
       	docker stop `cat docker.imgid`
		fi
	cp /dev/null docker.imgid
	echo "**********************************************************************************"
	echo "deleting dangling images from docker engine"
	docker rmi -f `docker images --filter 'dangling=true' -q --no-trunc`
	docker rm -v $(docker ps --filter status=exited -q 2>/dev/null) 2>/dev/null	
	echo "**********************************************************************************"
	echo "building docker image"
	docker build -t model-wrapper:latest .
	echo "docker image build successful "
	echo "starting docker "
	docker run -d -p 8080:8080 -e AWS_ACCESS_KEY_ID=${AWS_ACCESS_KEY_ID} -e AWS_SECRET_ACCESS_KEY=${AWS_SECRET_ACCESS_KEY} model-wrapper:latest > docker.imgid
	echo "started docker successfully, image id : " `cat docker.imgid`
else
	echo "packaging failed, check docker-build.logs"
fi

