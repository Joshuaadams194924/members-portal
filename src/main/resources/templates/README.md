# Members Portal

A fullstack Spring Boot application that allows users to be added, edited, and deleted using both REST API and a Thymeleaf-based UI.

## Features
- Spring Boot with JPA
- PostgreSQL database
- Docker support
- Thymeleaf frontend
- REST API (Testable via Postman)
- Deployed on Render

## API Endpoints
- `GET /api/users` – List users
- `POST /api/users` – Add user
- `PUT /api/users/{id}` – Update user
- `DELETE /api/users/{id}` – Delete user

## How to Run
1. Clone the repo
2. Build the project:
   ```bash
   mvn clean package
