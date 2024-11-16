# Documentation: Setting Up and Running the Assignment Submission Portal
This document explains how to set up and run the Assignment Submission Portal backend system built with Spring Boot and MongoDB. Follow the steps below to get started.

## Prerequisites
Java Development Kit (JDK) 17 or higher
Ensure Java is installed and added to your system's PATH.

## Verify installation:

java -version

## MongoDB
Install and run MongoDB Community Edition or Atlas Cloud.

## Default MongoDB port: 27017
If using Atlas, ensure connection credentials are configured.

##


## Steps to Set Up the Project

For building the Assignment Submission Portal using Spring Boot, selecting dependencies via Spring Initializr is essential to support core functionalities. Here's a breakdown of the dependencies you should include and their purposes:

### 1. Core Dependencies
#### 1. Spring Boot Starter Web
Required for building web applications and RESTful APIs.
Provides:
Spring MVC for handling HTTP requests and responses.
Embedded Tomcat server for local development.
Spring Boot Starter Validation
Adds support for validating user input in requests (e.g., validating user registration or assignment data).

#### 2. Database Dependencies
Spring Data MongoDB
To connect and interact with MongoDB, the chosen database for the portal.
Supports defining repositories and performing CRUD operations on MongoDB collections.

#### 3. Security Dependencies
Spring Security
Enables authentication and authorization for Users and Admins.
Provides a robust framework for implementing:
Role-based access control (e.g., Admins vs. Users).
Secure login/logout mechanisms.

#### 4. Testing Dependencies
Spring Boot Starter Test
Provides testing support for:
Unit tests with JUnit 5.
Integration tests for APIs.
Mocking objects using Mockito.
#### 5. Additional Dependencies
Lombok
Reduces boilerplate code by generating getters, setters, constructors, and more.
Makes the code cleaner and easier to maintain.

### Recommended Configuration in Spring Initializr
Project: Maven.

Language: Java.

Spring Boot Version: Latest stable release.

Dependencies:
Spring Boot Starter Web,
Spring Data MongoDB,
Spring Security,
Spring Boot Starter Test,
Lombok.

### 3. Configure MongoDB
Open the application.properties file located in src/main/resources/.
Update the following MongoDB properties:
spring.data.mongodb.uri=<>


## Endpoints
### User Endpoints

HTTP Method	Endpoint	Description:

POST	/user/register	Register a new user

POST	/user/login	User login

POST	/user/upload	Upload an assignment

GET	/user/admins	Fetch all admins

### Admin Endpoints

HTTP Method	Endpoint	Description:

POST	/admin/register	Register a new admin

POST	/admin/login	Admin login

GET	/admin/assignments	View assignments tagged to admin

POST	/admin/assignments/{id}/accept	Accept an assignment

POST	/admin/assignments/{id}/reject	Reject an assignment

### Testing the Application

**Postman** or API Testing Tools

Import the API documentation (if available as a file) into Postman.

Use the provided endpoints for testing:

Create users and admins.

Upload and manage assignments.

Troubleshooting

### MongoDB Connection Issue

Ensure MongoDB is running on the configured port.

If using Atlas, verify your IP is whitelisted.

### Maven Build Issues

Ensure Maven and JDK versions are compatible.

Port Conflicts

If the default port (8080) is busy, change the server port in application.properties:
server.port=8081
Additional Notes
Security Configuration:
The application uses Spring Security for user authentication and role-based access.

Database Schema Initialization:
MongoDB automatically handles schema generation based on the models defined in the project.
