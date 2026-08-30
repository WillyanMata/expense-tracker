# Expense Tracker API

> RESTful API developed in Java with Spring Boot, structured with a focus on clean architecture, maintainability, and high scalability for backend systems.

---

## 🛠️ Tech Stack

| Component | Technology / Version | Purpose |
| :--- | :--- | :--- |
| **Language** | Java 17 | Object-oriented foundation and modern features |
| **Framework** | Spring Boot 3.2+ | Dependency injection and web ecosystem |
| **Persistence** | Spring Data JPA / Hibernate | ORM and relational mapping |
| **Database** | H2 Database | In-memory relational storage for testing |
| **Connection Pool** | HikariCP | High-performance connection management |
| **Utilities** | Lombok | Boilerplate code reduction |

---

## 🏛️ Architecture and Engineering Decisions

The project was conceived simulating a **Modular Monolith**, ensuring low coupling, high cohesion, and a clear division of responsibilities:

```text
src/main/java/com/expensetracker/
├── user/       # User Domain Module (Controller, Service, Repository, Model)
├── category/   # Category Domain Module (Controller, Service, Repository, Model)
└── expense/    # Expense Domain Module (Controller, Service, Repository, Model)
```
🔒 Engineering Considerations and Production-Ready
N+1 Prevention: Relational mappings (@ManyToOne / @OneToMany) structured with lazy loading and JSON serialization control to prevent infinite recursion and performance bottlenecks.

Connection Pool: Efficient connection management via Spring's native HikariCP.

Exception Handling: Standardized HTTP responses for validation failures and business rule violations.

## ⚙️ How to Run the Project
1 - Clone the repository:
> git clone https://github.com/WillyanMata/expense-tracker.git

2 - Access the project folder:
> cd expense-tracker

3 - Run via Maven Wrapper:
> ./mvnw spring-boot:run

## 📡 API Endpoints

POST ```/api/users``` — Register a new user.

GET ```/api/users``` — List all registered users.

DELETE ```/api/users/{id}``` — Remove a user by unique identifier.

POST ```/api/categories``` — Register a new expense category.

GET ```/api/categories``` — List all categories.

POST ```/api/expenses``` — Register a new expense transaction.

GET ```/api/expenses/filter``` — Filter expenses by user and date range.

GET ```/api/expenses/summary``` — Get total sum of expenses by user and date range.

## 👨‍💻 Author

Developed by **Willyan Da Mata.**
