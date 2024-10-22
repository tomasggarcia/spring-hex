# Getting Started


mvn clean compile

mvn spring-boot:run


### Ejecutar estos comandos para probar la app


➜ curl http://localhost:8080/demo/add -d name=Pedro -d email=pedroa@someemailprovider.com

Saved



➜ curl http://localhost:8080/demo/all
[{"id":1,"name":"Pedro","email":"pedroa@someemailprovider.com"}]


