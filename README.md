# Spring Boot REST API - Student Management System

This project is a simple **RESTful API** built using **Spring Boot**, **Spring Data JPA**, and **MySQL**, designed to manage student records. It supports CRUD operations and is connected to a MySQL database hosted at a custom IP.

---

## 📦 Features

- Add a new student
- Get all students
- Get a student by ID
- Update student information
- Delete a student
- Integrated with MySQL using JPA/Hibernate
- Automatically generates schema using `ddl-auto=create`

---

## 🛠️ Tech Stack

- Java 17+
- Spring Boot 3.5.x
- Spring Data JPA
- MySQL 8.x
- Maven
- Postman (for testing)

---

## ⚙️ Configuration

Update `application.properties` in `src/main/resources`:

```properties
spring.datasource.url=jdbc:mysql:localhost:(portnumber)/studentDatabase
spring.datasource.username=root
spring.datasource.password=*password*

spring.jpa.hibernate.ddl-auto=create
spring.jpa.show-sql=true
