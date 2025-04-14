# Sample Springboot project for Hibernate 6 Dialect for InterSystems
This is the Hibernate 6 Dialect for InterSystems IRIS. 

# How to run the sample

From STS, click right project > Run As > Spring Boot App


# To learn more: 
- Tutorial: https://community.intersystems.com/post/using-new-intersystems-iris-hibernate-6-dialect-springboot-project 
- Video: https://youtu.be/-8ureaF7wZQ
- Github: https://github.com/yurimarx/iris-java-tools/tree/main/springboot-sample
- 

# Postman
GET
http://localhost:8080/api/patients?page=0&perPage=2

POST
http://localhost:8080/api/patients
    RAW
        {
        "active": "Y",
        "gender": "male",
        "birthDate": "1976-09-12",
        "deceasedBoolean": "N",
        "nameFamily": "Rios",
        "nameGiven": "Marcelo"
        }

