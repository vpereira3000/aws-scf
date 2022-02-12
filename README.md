# aws-scf
Examples of Spring Cloud Functions with AWS

Step by Step installing create planet

Show how to persist an entity in DynamoDb using Spring Cloud Function with AWS Lambda.
Login into AWS Console
Click top right arrow - Credentials - Get Secret kay and Secret Access Id

Local
Import planetc as Maven Project
Project Clean
Edit file application.properties located in src/main/resources putting secret key and access id. 
and set the value 
spring.cloud.function.scan.packages=com.solar.planetc.functions
Right click on project - Run as - Maven - Build - Clean Package
Look the generated jar in the folder target

Open AWS Console
Service - DynamoDB - Create table planet - items id, name, distance
Service - Lambda Functions - Create function (any name) - Code - Upload jar - Edit Handler and put value com.solar.planetc.PlanetcHandler - Test 
- New Test with template Hello-World and replace withe the payload:
{
"id": "",
"name": "Planet-1",
"distance": "1000000"
}
Add all two or more planets (Check the response and Take note of the automatic generated ids for use in reading planet)

Step by step read planet

Show how to persist an entity in DynamoDb using Spring Cloud Function with AWS Lambda.
Login into AWS Console
Click top right arrow - Credentials - Get Secret kay and Secret Access Id

Local
Import planetrd as Maven Project
Project Clean
Edit file application.properties located in src/main/resources putting secret key and access id. 
and set the value 
spring.cloud.function.scan.packages=com.solar.planetrd.functions
Right click on project - Run as - Maven - Build - Clean Package
Look the generated jar in the folder target

Open AWS Console
Service - Lambda Functions - Create function (any name) - Code - Upload jar - Edit Handler and put value com.solar.planetrd.PlanetrdHandler - Test 
- New Test with template Hello-World and replace withe the payload:
{
  "planetRequest": {"id": "PUT SOME ID EXISTING IN YOUR DynamoDB Table planet", "name": "", "distance": ""}
}
Play changing valid ids
