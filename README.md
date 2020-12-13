Welcome to the Stack-Example wiki!

Rest End points
POST : /api/add-emp (Add new Employee) {"firstName":"Anirban","lastName":"Deb"}

GET : /api/retrieve-emp (get last added Employee)

DB Connection
Uncomment and add valid dataSource details in application.properties

For MySql spring.jpa.hibernate.ddl-auto=update spring.datasource.url=jdbc:mysql://${MYSQL_HOST:localhost}:3306/db_example spring.datasource.username=springuser spring.datasource.password=ThePassword

For Oracle spring.datasource.url=jdbc:h2:mem:testdb spring.datasource.driverClassName=org.h2.Driver spring.datasource.username=sa spring.datasource.password=password spring.jpa.database-platform=org.hibernate.dialect.H2Dialect spring.h2.console.enabled=true

Build Docker docker build -f Dockerfile -t stack-boot

Run Docker docker run -p 8080:8080 stack-boot
