# Spring Framework Projects

This repository contains two Java applications developed using the Spring Framework as part of the university curriculum. The projects demonstrate core Spring functionalities, including security, database integration, and API documentation.

## Features
- **Task 1 & Task 2**: Functional Spring Boot applications.
- **Spring Security**: Integrated authentication system.
- **H2 Console**: In-memory database management.
- **Swagger UI**: Interactive API documentation for testing endpoints.

## Project Screenshots

### 1. User Authentication (Login)
The application is secured with Spring Security. Below is the login interface at localhost:8080/login.
![Login Screen](localhost-login.png)

### 2. H2 Database Console
The in-memory database management tool used to verify data persistence.
![H2 Console](h2-console-login.png)

### 3. Swagger UI Documentation
Interactive API documentation used for testing REST endpoints (GET, POST, PUT, DELETE).
![Swagger UI](swagger-ui.png.png)

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- Spring Security
- H2 Database
- Swagger / OpenAPI

# API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| POST | /api/v1/products | Create new product |
| GET | /api/v1/products/{id} | Get product by ID |
| GET | /api/v1/products | Get all products |
| PUT | /api/v1/products/{id} | Update product |
| DELETE | /api/v1/products/{id} | Delete product |

## How to Run
1. Clone the repository:
   ```bash
   git clone [https://github.com/your-username/your-repo-name.git](https://github.com/your-username/your-repo-name.git)
