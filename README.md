Example Spring Boot REST Service

Quick start 
-----------
Traditionally, the Dockerfile is called Dockerfile and located in the root of the context. You use the -f flag with docker build to point to a Dockerfile anywhere in your file system.

$ docker build -f /path/to/a/Dockerfile .

You can specify a repository and tag at which to save the new image if the build succeeds:

$ docker build -t rcherara/rest-example .
To tag the image into multiple repositories after the build, add multiple -t parameters when you run the build command:

$ docker build -t rcherara/rest-example:1.0.2 -t shykes/rest-example .



http://localhost:7680/swagger-ui.html
http://localhost:7680/v2/api-docs


curl -X POST "http://localhost:7680/books" -H "accept: */*" -H "Content-Type: application/json" -d "{ \"author\": \"Reddah Cherara\", \"id\": 0, \"title\": \"docker book\"}"


http://localhost:7680/books

curl -X GET "http://localhost:7680/books" -H "accept: application/json"

minikube dashboard 
    
Opening http://127.0.0.1:52943/api/v1/namespaces/kube-system/services/http:kubernetes-dashboard:/proxy/ in your default browser


