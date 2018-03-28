FROM rocker/hadleyverse

RUN R -e "install.packages('bnlearn', repos = 'http://cran.us.r-project.org')"

RUN wget https://bootstrap.pypa.io/get-pip.py && \
	python get-pip.py && \
	pip install --upgrade awscli

#COPY ./model/model.rda /model.rda
COPY rserver.R  /rserver.R
COPY ./script/startServerIndocker.sh  /startServerIndocker.sh
RUN chmod +x startServerIndocker.sh

COPY target/ModelWrapper-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080 

CMD ["sh","startServerIndocker.sh"]  
