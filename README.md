# Task Management App - Backend

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

2. Update konfigurasi database di `src/main/resources/application.properties` bila perlu:

   ```properties
   spring.datasource.username=postgres
   spring.datasource.password=postgres
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
