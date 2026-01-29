# 📦 A-Magia
## Inventory control - Spring Boot REST API

## Description
API for managing products, categories, and inventory movements.
Allows you to register entries and exits, check inventory levels, generate alerts, and maintain a complete history of operations.

⚠️ Project Status: In development — some features listed below are not implemented yet.


## ✨ Features (current & planned)

- ✔ Category registration
- ✔ Product registration
- ⏳ Inventory movements (in/out)
- ⏳ Stock level reports
- ⏳ Low-stock alerts
- ⏳ Full operations history

## 🛠 Technologies Used

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Lombok
- Maven

## 🧱 Architecture Overview

```
Controller → Service → Repository → Database
         ↑                         ↓
       DTOs                      Entities
```
A clean layered architecture ensuring maintainability and scalability.

## 📂 Project Structure (simplified)
```
src/
 ├── main/
 │    ├── java/com/example/magia/
 │    │       ├── controller
 │    │       ├── dto/
 │    │       │     ├── request
 │    │       │     └── response
 │    │       ├── model
 │    │       ├── repository
 │    │       └── service
 │    └── resources/
 │          ├── application.properties
 │          └── notes
 └── test/

```

## ▶️ How to Run the Project
### 1. Clone the repository
`git clone https://github.com/Kaique-ms27/A-Magia.git`

### 2. Open the project in a Spring-compatible IDE
(IntelliJ IDEA recommended)

### 3. Run the aplication

Execute:
```
MagiaApplication.java
```

### 4. Database Connection (H2 In-Memory)

- URL: jdbc:h2:mem:magia 
- Username: sa 
- Password: password

H2-Consle (Optional)
```
http://localhost:8080/h2-console
```

## 📌 Available Endpoints (in development)

### Post /category
Creates a new product category.

Request Body:
```
{
    "categoryName": "String"
}
```

### Post /product

Creates a new product.

Request Body:

```
{
    "productName": "String",
    "productDescription": "String",
    "productCategory": int,
    "currentQuantity": int,
    "minimumQuantity": int,
    "productStatus": boolean
}
```

## 📌 Upcoming Endpoints

- POST /movement — register inventory in/out
- PATCH /product/{id}/status — activate/deactivate a product
- GET /alerts — list products below minimum quantity
- GET /reports — general stock report

## Author
_Kaique Magalhães Santos_ <br>
_Linkedin: https://www.linkedin.com/in/kaique-magalhães-santos/_ <br>
_GitHub: https://github.com/Kaique-ms27_


## Observation
This is the first project where I'm applying a professional architecture, including layers, DTOs, manual validations, and a structured README.

