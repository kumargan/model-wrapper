## Model Wrapper

	This is a container that wraps a Shiney R server ( to get probability numbers from model) and a java application server ( to receive requests for probability number from shiney server ). Java app server caches the numbers in memory for a particular request (LRU cache) for faster consecutive response. Since this is container it can be deployed in ECS and it becomes very reliable without requiring any maintenence.

	It is general practice to deploy model servers on stand-alone instances behind a python server. For each request the python server loads the .rda file and gets the probability. ( There might be another hacks around this )
	
	Drawbacks : 
		1. It will be relatively slow s the model is loaded in memory per request.
		2. In case the server handles multiple requests then there will be multiple loading of the model and hence the reliability of the system becomes questionable. After 10-20 parallel requests the instance may run out of resources ( mostly memory ).
		3. It needs maintenance since the server might stop due to any reasons mentioned above as well as reliability problems when application servers are running on instances direclty rather than services.
		
## Steps to deploy locally.

	1. sh run-docker.sh