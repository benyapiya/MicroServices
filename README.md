## Packaging the application
` $ mvn install`

## Running the application
` $ java -jar bp-microservice-0.0.1-SNAPSHOT.jar --sa.logic.api.url=http://localhost:5000 `

## Building the container
` $ docker build -f Dockerfile -t $DOCKER_USER_ID/bp-microservice . `

## Running the container
```
$ docker run -d -p 8080:8080 -e SA_LOGIC_API_URL='http://<container_ip or docker machine ip>:5050' $DOCKER_USER_ID/bp-microservice  
```

## Pushing the container.
` $ docker push $DOCKER_USER_ID/bp-microservice `
