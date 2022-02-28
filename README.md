<p align="center">
  <h1>REST API Mini OMS</h1>
</p>
<br />

## About the Proyect

This REST API is an Order Management System.

## Get started

### Prerequisites

* Java 8 - [Download and Install](https://www.oracle.com/mx/java/technologies/javase/javase8-archive-downloads.html)
* Maven - [Download and Install](https://maven.apache.org/)
* Git - [Download and Install](https://git-scm.com/download/win)

### Clone the repo

```shell
git clone https://github.com/rosaso010292/MiniOMS.git
cd MiniOMS
```

### Install Rest Api

```shell
cd MiniOMS
```
```shell
mvn package
```
```shell
java -jar target/MiniOMS-0.0.1-SNAPSHOT.jar
```

The `java -jar` command builds and run the application on http://localhost:8080

![image](https://user-images.githubusercontent.com/15036089/155169851-c2718618-8cb8-474c-8bfc-2468f35b0d8e.png)

Shut it down manually with `Ctrl-C`.

## EndPoints
### Get List Portfolies
#### Request 
```bash
GET /api/v1/portfolies
```
```bash
curl -i -H 'Accept: application/json' http://localhost:8080/api/v1/porfolies
```
#### Response
```bash
HTTP/1.1 200
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
Content-Type: application/json
Transfer-Encoding: chunked
Date: Tue, 22 Feb 2022 15:43:32 GMT

[{"idPortfolio":0,"description":"zero2hero","experienceSummary":"the most experiece","id":null,"imageUrl":"ewrqw","lastNames":"qewrqew","names":"rqewrqwe","tittle":"qweqweqw","twitterUserId":n
ull,"twitterUserName":"qewrqewr","userId":null,"address":null,"email":null,"experience":null,"imagePath":null,"name":null,"phone":null,"twitterUser":null,"zipCode":null},{"idPortfolio":1,"desc
ription":"Senior Java Developer","experienceSummary":"I´m a Senior Java Developer","id":null,"imageUrl":"https://www.jquery-az.com/html/images/banana.jpg","lastNames":"Rosas Guerrero","names":
"Omar Alejandro","tittle":"Senior Java Developer","twitterUserId":"1493641344220291075","twitterUserName":"EdPastranaM","userId":"1992","address":"Queretaro","email":"nbaand10@gmail.com","expe
rience":"8 year ","imagePath":"https://www.jquery-az.com/html/images/banana.jpg","name":"Omar Rosas","phone":"4421973150","twitterUser":"451","zipCode":"76125"},{"idPortfolio":2,"description":
"Fabian Gomez","experienceSummary":"experience_summary","id":null,"imageUrl":"https://modaellos.com//wp-content/uploads/2020/05/peinado-corto-hombre-600x560.jpg","lastNames":"Ortiz","names":"J
ose","tittle":"prueba","twitterUserId":"twitter_user_id","twitterUserName":"TTA","userId":null,"address":null,"email":null,"experience":null,"imagePath":null,"name":null,"phone":null,"twitterU
ser":null,"zipCode":null},{"idPortfolio":4,"description":"I am Jack","experienceSummary":"I have two years of experience","id":1010101,"imageUrl":"http=//kingdomhearts.fandom.com/es/wiki/Jack_
Skeleton?fil=Jack_Skeleton_KHII.png","lastNames":"Gordon","names":"Jack","tittle":"manager","twitterUserId":"JackGordon","twitterUserName":"@JackGordon","userId":"123","address":null,"email":n
ull,"experience":null,"imagePath":null,"name":null,"phone":null,"twitterUser":null,"zipCode":null},{"idPortfolio":5,"description":"I am Leonardo","experienceSummary":"I have four years of expe
rience","id":111111,"imageUrl":"https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/evolucion-leonardo-dicaprio-principal-1573497722.jpg?crop=1.00xw:0.747xh;0,0.0811xh&resize=980:*","
lastNames":"Leonardo","names":"DiCaprio","tittle":"actor","twitterUserId":"Leonardo DiCaprio","twitterUserName":"@LeoDiCaprio","userId":"456","address":null,"email":null,"experience":null,"ima
gePath":null,"name":null,"phone":null,"twitterUser":null,"zipCode":null},{"idPortfolio":6,"description":"I am Husseyn","experienceSummary":"I have eleven years of experience","id":null,"imageU
rl":"https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/evolucion-leonardo-dicaprio-principal-1573497722.jpg?crop=1.00xw:0.747xh;0,0.0811xh&resize=980:*","lastNames":"Despaigne","nam
es":"Husseyn","tittle":"actor","twitterUserId":"Leonardo DiCaprio","twitterUserName":"@LeoDiCaprio","userId":"458","address":null,"email":null,"experience":null,"imagePath":null,"name":null,"p
hone":null,"twitterUser":null,"zipCode":null},{"idPortfolio":7,"description":"mcalla1","experienceSummary":"mcallamcalla1111","id":10,"imageUrl":"url","lastNames":"Calla111","names":"MC111","t
ittle":"SR111","twitterUserId":"1245411111","twitterUserName":"user_name1","userId":"1111","address":null,"email":null,"experience":null,"imagePath":null,"name":null,"phone":null,"twitterUser"
:null,"zipCode":null},{"idPortfolio":8,"description":"I am a systems engineer ","experienceSummary":"I have experience in Oracle database and Java programming language.","id":11,"imageUrl":"ht
tps://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/evolucion-leonardo-dicaprio-principal-1573497722.jpg?crop=1.00xw:0.747xh;0,0.0811xh&resize=980:*","lastNames":"Moreira","names":"Virl
is","tittle":"Desarrollador","twitterUserId":"VirlisMoreira","twitterUserName":"VirlisMoreira","userId":"2222","address":null,"email":null,"experience":"una prueba","imagePath":null,"name":nul
l,"phone":null,"twitterUser":null,"zipCode":null},{"idPortfolio":9,"description":"I am Bolivar Espin","experienceSummary":"Highly dependable Software Engineer and enthusiastic team player dedi
cated to streamlining processes and efficiently \r\nresolving project issues. Meticulous Software Engineer with 22 years of experience in the Software development \r\nindustry, with In-depth",
"id":12,"imageUrl":"avatar-be.png","lastNames":"Espin Alarcon","names":"Edgar Bolivar","tittle":"Developer","twitterUserId":"@bolivar","twitterUserName":"@bolivar","userId":"1212","address":nu
ll,"email":null,"experience":null,"imagePath":null,"name":null,"phone":null,"twitterUser":null,"zipCode":null},{"idPortfolio":10,"description":"I am Jon Snow and work as Software Engineer at W
interfell","experienceSummary":"I have 10 years in software development","id":null,"imageUrl":"opt/jon.jpg","lastNames":"Targaryen Stark","names":"Jon","tittle":"","twitterUserId":"","twitterU
serName":"","userId":"666","address":"Londres Avenue #2009","email":"jonsnow@gmail.com","experience":null,"imagePath":null,"name":"Jon Snow","phone":"054999888777","twitterUser":"@kitharington
com","zipCode":"02002"},{"idPortfolio":71,"description":"Senior Java Developer","experienceSummary":"I´m a professional with most than 8 years of experience specialized in Web, ERP, Mobile and
 Web Services application development. ","id":30,"imageUrl":"https://www.universal-rights.org/wp-content/uploads/2019/09/30212411048_2a1d7200e2_z-1.jpg","lastNames":"Rosas Guerrero","names":"O
mar Alejandro","tittle":"Senior Java Developer","twitterUserId":"1495115477420548097","twitterUserName":"michaelb4jordan","userId":"1495115477420548097","address":"Querétaro, México","email":"
nbaand10@gmail.com","experience":"A lot of experiense in java development.","imagePath":"https://www.universal-rights.org/wp-content/uploads/2019/09/30212411048_2a1d7200e2_z-1.jpg","name":"Oma
r Rosas","phone":"4421973150","twitterUser":"Omar Rosas Guerrero","zipCode":"76125"},{"idPortfolio":77,"description":"Java Developer","experienceSummary":"I´m Java Developer","id":0,"imageUrl"
:"https://i.blogs.es/53044d/java/1366_2000.jpg","lastNames":"Alejandro ","names":"Guerrero","tittle":"Java Developer","twitterUserId":"","twitterUserName":"juanrocha","userId":"","address":"",
"email":"","experience":"","imagePath":"","name":"","phone":"","twitterUser":"","zipCode":""},{"idPortfolio":79,"description":"Software Java Developer","experienceSummary":null,"id":null,"imag
eUrl":null,"lastNames":null,"names":null,"tittle":null,"twitterUserId":null,"twitterUserName":null,"userId":null,"address":null,"email":null,"experience":null,"imagePath":null,"name":null,"pho
ne":null,"twitterUser":null,"zipCode":null}]

```
### Create Portfolio
#### Request 
```bash
POST /api/v1/
```
```bash
curl -i -X POST -H 'Content-Type: application/json' -d '{"description":"Software Developer","experienceSummary":"8 year of experience in the software development","imageUrl":"url","lastNames":"John","names":"Connor","tittle":"Software Dev","twitterUserName":"juanp"}' http://localhost:8080/api/v1/
```
#### Response
```bash
HTTP/1.1 201
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
Content-Type: application/json
Transfer-Encoding: chunked
Date: Tue, 22 Feb 2022 15:01:17 GMT

{"idPortfolio":79,"description":"Software Developer","experienceSummary":"8 year of experience in the software development","id":null,"imageUrl":"url","lastNames":"John","names":"Connor","titt
le":"Software Dev","twitterUserId":null,"twitterUserName":"juanp","userId":null,"address":null,"email":null,"experience":null,"imagePath":null,"name":null,"phone":null,"twitterUser":null,"zipCode":null}
```
### Update Portfolio
#### Request 
```bash
PUT /api/v1/
```
```bash
curl -i -X PUT -H "Content-Type: application/json" -d '{"description":"Software Java Developer"}' http://localhost:8080/api/v1/79
```
#### Response
```bash
HTTP/1.1 201
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
Content-Type: application/json
Transfer-Encoding: chunked
Date: Tue, 22 Feb 2022 15:06:06 GMT

{"idPortfolio":79,"description":"Software Java Developer","experienceSummary":null,"id":null,"imageUrl":null,"lastNames":null,"names":null,"tittle":null,"twitterUserId":null,"twitterUserName":
null,"userId":null,"address":null,"email":null,"experience":null,"imagePath":null,"name":null,"phone":null,"twitterUser":null,"zipCode":null}
```
### Get Portfolio By Id
#### Request 
```bash
GET /api/v1/
```
```bash
curl -i -H 'Accept: application/json' http://localhost:8080/api/v1/79
```
#### Response
```bash
HTTP/1.1 200
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
Content-Type: application/json
Transfer-Encoding: chunked
Date: Tue, 22 Feb 2022 15:09:07 GMT

{"idPortfolio":79,"description":"Software Java Developer","experienceSummary":null,"id":null,"imageUrl":null,"lastNames":null,"names":null,"tittle":null,"twitterUserId":null,"twitterUserName":
null,"userId":null,"address":null,"email":null,"experience":null,"imagePath":null,"name":null,"phone":null,"twitterUser":null,"zipCode":null}
```
### Get Portfolio By Tittle
#### Request 
```bash
GET /api/v1/
```
```bash
curl -i -H 'Accept: application/json' http://localhost:8080/api/v1/?tittle=Java Developer
```
#### Response
```bash
HTTP/1.1 200
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
Content-Type: application/json
Transfer-Encoding: chunked
Date: Tue, 22 Feb 2022 15:48:31 GMT

[{"idPortfolio":1,"description":"Senior Java Developer","experienceSummary":"I´m a Senior Java Developer","id":null,"imageUrl":"https://www.jquery-az.com/html/images/banana.jpg","lastNames":"R
osas Guerrero","names":"Omar Alejandro","tittle":"Senior Java Developer","twitterUserId":"1493641344220291075","twitterUserName":"EdPastranaM","userId":"1992","address":"Queretaro","email":"nb
aand10@gmail.com","experience":"8 year ","imagePath":"https://www.jquery-az.com/html/images/banana.jpg","name":"Omar Rosas","phone":"4421973150","twitterUser":"451","zipCode":"76125"},{"idPort
folio":71,"description":"Senior Java Developer","experienceSummary":"I´m a professional with most than 8 years of experience specialized in Web, ERP, Mobile and Web Services application develo
pment. ","id":30,"imageUrl":"https://www.universal-rights.org/wp-content/uploads/2019/09/30212411048_2a1d7200e2_z-1.jpg","lastNames":"Rosas Guerrero","names":"Omar Alejandro","tittle":"Senior
Java Developer","twitterUserId":"1495115477420548097","twitterUserName":"michaelb4jordan","userId":"1495115477420548097","address":"Querétaro, México","email":"nbaand10@gmail.com","experience"
:"A lot of experiense in java development.","imagePath":"https://www.universal-rights.org/wp-content/uploads/2019/09/30212411048_2a1d7200e2_z-1.jpg","name":"Omar Rosas","phone":"4421973150","t
witterUser":"Omar Rosas Guerrero","zipCode":"76125"},{"idPortfolio":77,"description":"Java Developer","experienceSummary":"I´m Java Developer","id":0,"imageUrl":"https://i.blogs.es/53044d/java
/1366_2000.jpg","lastNames":"Alejandro ","names":"Guerrero","tittle":"Java Developer","twitterUserId":"","twitterUserName":"juanrocha","userId":"","address":"","email":"","experience":"","imag
ePath":"","name":"","phone":"","twitterUser":"","zipCode":""}]curl: (6) Could not resolve host: Developer
```
### Get Tweets By UserName
#### Request 
```bash
GET /api/v1/tweets
```
```bash
curl -i -H 'Accept: application/json' http://localhost:8080/api/v1/tweets?userName=michaelb4jordan
```
#### Response
```bash
HTTP/1.1 200
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
Content-Type: application/json
Transfer-Encoding: chunked
Date: Tue, 22 Feb 2022 15:13:20 GMT

[{"fullName":"Michael B. Jordan","userName":"michaelb4jordan","content":"We’ve learned a lot about personal well-being this past year. That’s why it’s so important for our favorite places to p
ut our health and safety first. Just look for the #WELLHealthSafety seal and feel confident whenever you step inside.https://t.co/yD5w5FqGZL https://t.co/2KVuRSAhNM","profileImageUrl":"http://
pbs.twimg.com/profile_images/832679643291512833/q2p9YNOt_normal.jpg"},{"fullName":"Michael B. Jordan","userName":"michaelb4jordan","content":"@DBChillin \uD83D\uDC40","profileImageUrl":"http:/
/pbs.twimg.com/profile_images/832679643291512833/q2p9YNOt_normal.jpg"},{"fullName":"Michael B. Jordan","userName":"michaelb4jordan","content":"@ajournal4Jordan is NOW PLAYING exclusively in mo
vie theaters. Take the family out to experience a true story of love and family this Holiday season! https://t.co/sLG25Hh0sg","profileImageUrl":"http://pbs.twimg.com/profile_images/83267964329
1512833/q2p9YNOt_normal.jpg"},{"fullName":"Michael B. Jordan","userName":"michaelb4jordan","content":"RT @AJournal4Jordan: Christmas came early! Enjoy the gift of @MichaelB4Jordan answering yo
ur questions below. \uD83C\uDF81 ✨ #AskAJournalForJordan","profileImageUrl":"http://pbs.twimg.com/profile_images/832679643291512833/q2p9YNOt_normal.jpg"},{"fullName":"Michael B. Jordan","userN
ame":"michaelb4jordan","content":"Working with @chanteaadams was such a fantastic experience. Don’t miss us in @AJournal4Jordan  on the big screen. Exclusively in movie theaters FRIDAY! https:
//t.co/Uibc119Oj0 https://t.co/hzRi9aDgwq","profileImageUrl":"http://pbs.twimg.com/profile_images/832679643291512833/q2p9YNOt_normal.jpg"}]
```

## Built With

* [Java 11](https://www.oracle.com/mx/java/technologies/javase/jdk11-archive-downloads.html)
* [Spring Boot 2.2.2.RELEASE](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot/2.2.2.RELEASE)
* [Spring JPA 2.2.2.RELEASE](https://mvnrepository.com/artifact/org.springframework.data/spring-data-jpa/2.2.2.RELEASE)
* [MySQL Driver 8.0.18](https://dev.mysql.com/blog-archive/mysql-connector-odbc-8-0-18/)
* [Log4j 1.2.17](https://logging.apache.org/log4j/1.2/download.html)
* [Twitter4J 4.0.7](https://twitter4j.org/en/index.html)

## Creators

**Omar Rosas**

- <https://github.com/rosaso010292>

## Total Hours Worked

10 hours
