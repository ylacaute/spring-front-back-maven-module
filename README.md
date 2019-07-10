

**Proof of Concept** 
 - A single Spring Boot application, serving an API and a frontend 
 - Frontend with Angular
 - Packaged with Maven
 - 2 modules maven, front and back


```shell
mvn clean
cd backend
mvn spring-boot:run
```

The backend build will force the frontend build and copy the generated static assets each time you start the application.


**HOT RELOAD:**

```shell
#In frontend
npm run watch
#In backend
mvn  spring-boot:run -P watch 
```

Frontend & backend modifications are now reloaded in the browser (F5).
