# Hnet-CandidateManagementSystem

The Candidate Management System is a Java-based application that allows users to manage candidate records. It uses Hibernate for database operations and follows the MVC architecture with a Service Layer to separate business logic.

## Structure
com.client         -> Client application (Console-based)
com.controller     -> Handles requests and interacts with service layer
com.service        -> Business logic layer (CandidateService)
com.dao            -> Data access layer using Hibernate (CandidateDAO)
com.entity         -> Entity class representing database table (Candidate)


## Features
CRUD Operations for managing candidates.
Uses Hibernate ORM for database operations.
Implements DAO Pattern for database abstraction.
Console-based UI for user interaction.
Supports Hibernate Configuration with MySQL.


## Technologies Used
Java SE 8+
Hibernate ORM
MySQL Database
MVC Architecture
DAO Pattern
JPA (Java Persistence API)
Serializable (for object persistence)
