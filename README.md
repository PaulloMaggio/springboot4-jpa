Spring Boot Sales System (Demo)
This is a backend RESTful API application built with Spring Boot 3. It implements a complete domain model for an e-commerce platform, featuring user management, product categorization, order processing, and payment status tracking.

🚀 Technologies & Tools
Java 21
Spring Boot 3.4.2
Spring Data JPA (Hibernate)
MySQL (Local server via XAMPP)
H2 Database (Used for the test profile)Maven (Dependency Management)
Postman (API Testing and Documentation)

🏗️ Domain ModelThe application follows a robust relational structure to handle complex e-commerce logic:

User: Handles client information and authentication data.

Order: Manages purchase history and statuses (WAINTING_PAYMENT, PAID, SHIPPED, etc.).

Product & Category: A Many-to-Many relationship allowing products to belong to multiple categories.

OrderItem: An association class (using an @EmbeddedId for composite primary keys) that links Orders and Products with specific quantities and prices.

Payment: A One-to-One relationship linked to the Order through a shared primary key.

🛠️ Key Features

Full CRUD Operations: Create, Read, Update, and Delete for the User resource.

Custom Exception Handling: Standardized error responses using @ControllerAdvice for "Resource Not Found" and "Database Integrity" issues.

Automated Data Seeding: A TestConfig class that automatically populates the database with initial categories, products, users, and orders when running the test profile.

Recursive Prevention: Used @JsonIgnore to handle bi-directional relationships, preventing infinite loops during JSON serialization.

🚦 How to Run the Project

Prerequisites

Java 21 or higher.
XAMPP (to run the MySQL server).
Maven (optional if using the provided mvnw wrapper).
