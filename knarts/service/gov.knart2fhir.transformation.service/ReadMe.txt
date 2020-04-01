
Create Docker Image

docker ps stop -a
mvn clean install
docker build -t knart2fhir-transformation-service .
docker run -d -p 5000:8080 knart2fhir-transformation-service
docker log -a


for instance

docker run -d -p 5000:8080  knart2fhir-transformation-service

http://localhost:5000/v3/api-docs

http://localhost:5000/swagger-ui.html


docker exec -it knart2fhir-transformation-service /bin/bash

 

docker exec -i -t 360e398168f4 /bin/sh


java -cp=".:/Users/seanmuir/runtime-EclipseApplicationKNART02032020/gov.knart2fhir.transformation.service/dependencies/*.jar:" -jar 

java -cp '.:/Users/seanmuir/runtime-EclipseApplicationKNART02032020/gov.knart2fhir.transformation.service/dependencies/*.jar:'  -jar  gov.knart2fhir.transformation.service.jar
 