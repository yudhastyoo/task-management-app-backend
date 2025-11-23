# Task Management App - Backend (Spring Boot)

Backend untuk Task Management App.

## Tech Stack

- Java 17
- Spring Boot 3
- PostgreSQL
- Json Web Token (JWT)

## Cara Menjalankan

1. Pastikan PostgreSQL berjalan dan buat database:

   ```sql
   CREATE DATABASE task_management;
   ```

2. Didalam folder `src/main`, buat folder dan file dengan nama `/resources/application.properties` dan isi config seperti dibawah ini:

   ```properties
    spring.application.name=task_management_app

    spring.datasource.url=jdbc:postgresql://localhost:5432/task_management
    spring.datasource.username=postgres
    spring.datasource.password=postgres

    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    spring.jpa.properties.hibernate.format_sql=true
    spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect

    jwt.secret=random-secret-key-12345qwerty67890
    jwt.expiration=3600000

    server.port=8080
   ```

3. Jalankan aplikasi:

   ```bash
   mvn spring-boot:run
   ```

4. Endpoint yang tersedia:

   ### Auth

   - `POST /api/auth/login`

     Body:

     ```json
     {
       "username": "admin",
       "password": "admin123"
     }
     ```

     Response:

     ```json
     {
       "token": "..."
     }
     ```

   Header yang digunakan di request lain:

   ```http
   Authorization: Bearer <token>
   ```

   ### Task

   - `GET /api/tasks`
   - `GET /api/tasks/{id}`
   - `POST /api/tasks`
   - `PUT /api/tasks/{id}`
   - `DELETE /api/tasks/{id}`

   Contoh body create / update:

   ```json
   {
     "title": "Task 1",
     "description": "Deskripsi task",
     "status": "TODO"
   }
   ```

> Aplikasi Task Management ini dibuat oleh **Yudha Papua Setyo Atmaji**.
