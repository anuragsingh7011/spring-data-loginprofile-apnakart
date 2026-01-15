# SPRING MVC CREATE USING HIBERNATE

Hi, I’m **Anurag**, and I built this project to understand how **Spring MVC integrates with Hibernate ORM**, focusing purely on the **CREATE operation** using a clean and layered architecture.

This project demonstrates how data flows from the **UI layer to the database** without writing any manual SQL queries, using **Hibernate ORM** with annotation-based configuration.

The main purpose of this project is **learning and clarity**, not building a full-featured application.

<br>

## Project Overview

This is a simple **Spring MVC web application** integrated with **Hibernate ORM** that supports **only CREATE functionality**.

The objective of this project is to:
- Understand Spring MVC request handling
- Learn Hibernate ORM integration
- Observe layered architecture in action

This project is intentionally **not a full CRUD application**.

<br>

## Technologies Used

- Java  
- Spring MVC  
- Hibernate ORM  
- JSP  
- MySQL  
- Maven  
- Apache Tomcat  

<br>

## What I Learned From This Project

- Spring MVC request–response lifecycle  
- Proper separation of Controller, Service, and DAO layers  
- Hibernate entity mapping using annotations  
- Automatic database table creation using Hibernate  
- How ORM removes the need for manual SQL  
- End-to-end data flow from UI to database  

<br>

## Application Architecture

The project follows a standard **layered architecture**:

- Controller Layer – Handles HTTP requests  
- Service Layer – Contains business logic  
- Repository (DAO) Layer – Handles persistence  
- Entity Layer – Represents database tables  

<br>

## Application Flow

UI → Controller → Service → Repository → Hibernate → Database

This flow ensures:
- Clear separation of concerns  
- Loose coupling between layers  
- Better maintainability and scalability  

<br>

## Configuration Details

- Database and Hibernate configuration is defined in `hibernate.cfg.xml`  
- Entity mapping is done using Hibernate annotations  
- Hibernate automatically generates database tables  
- No manual SQL queries are written  

<br>

## How to Run the Project

1. Import the project into **Eclipse** or **IntelliJ IDEA**
2. Configure database credentials in `hibernate.cfg.xml`
3. Run `mvn clean install` to build the project
4. Deploy the application on **Apache Tomcat**
5. Access the application URL and submit the form

<br>

## Important Note

This project supports only the **CREATE** operation.

Read, Update, and Delete functionalities are intentionally not implemented to keep the learning focused on understanding **Spring MVC and Hibernate integration**.

<br>

## Future Improvements

- Add Read, Update, and Delete operations  
- Add validation and global exception handling  
- Improve UI design  
- Migrate to Spring Boot  
- Expose REST APIs  

<br>

## Author

**Anurag**  
Java Developer | Spring MVC | Hibernate | Spring Framework  

---

⭐ If you find this project helpful, feel free to star the repository.
