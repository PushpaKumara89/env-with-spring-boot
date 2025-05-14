## 1) create Dockerfile 
## 2) create .env file name .env.dev
## 3) Setup port in application.yaml file
     server:
       port: ${PORT:8080}
## 4) build Docker image
      - docker build -t test-env 

## 5) Your EndPoints in many stages 
### - when you run in local or by docker without .env file
      - docker run -d --name test-container test-env 
      Tomcat started on port <span style="color:green;">8080</span> (http) with context path '/'
### - when you run docker with .env file
      - docker run -d --name --env-file ".env.dev" test-env-container test-env 
      Tomcat started on port 8081 (http) with context path '/'