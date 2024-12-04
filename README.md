# Chat Application

A real-time chat application built with **Spring Boot**, **WebSocket**, and **MySQL**. This chat app allows users to join a chat room, send messages, and view messages in real-time.

## Features

- Real-time message broadcasting using WebSocket and **STOMP** protocol.
- Stores messages in a MySQL database.
- Users can send and view messages instantly.
- Simple front-end with **Bootstrap** and **jQuery** for a clean user interface.

## Technologies Used

- **Backend:**
  - Spring Boot
  - Spring WebSocket
  - Spring Data JPA
  - MySQL
  - Hibernate

- **Frontend:**
  - HTML
  - Bootstrap
  - jQuery
  - SockJS
  - STOMP

## Requirements

- **Java 16** or higher
- **MySQL Database** for storing messages
- **Maven** for dependency management

## Setup Instructions

### 1. Clone the repository

```bash
git clone https://github.com/yourusername/chatapp.git
cd chatapp
```

### 2. Configure the Database

1. Ensure you have **MySQL** installed and running.
2. Create a new database named `chatapp`:

```sql
CREATE DATABASE chatapp;
```

3. Update the `application.properties` file with your MySQL credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/chatapp
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
```

### 3. Build and Run the Application

1. Install the required dependencies:

```bash
mvn clean install
```

2. Run the application:

```bash
mvn spring-boot:run
```

### 4. Access the Chat Room

Once the application is running, open a web browser and go to:

```
http://localhost:8080
```

### 5. Use the Application

- Enter your name to join the chat room.
- Send and receive messages in real-time.
- Click "Logout" to disconnect and return to the login screen.

## Directory Structure

```
.
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── chatapp/
│   │   │               ├── ChatappApplication.java
│   │   │               ├── controllers/
│   │   │               │   └── MessageController.java
│   │   │               ├── models/
│   │   │               │   └── Message.java
│   │   │               ├── repositories/
│   │   │               │   └── MessageRepository.java
│   │   │               └── config/
│   │   │                   └── Config.java
│   │   ├── resources/
│   │   │   ├── application.properties
│   │   │   └── static/
│   │   │       ├── index.html
│   │   │       ├── script.js
│   │   │       ├── style.css
│   │   │       └── webjars/
│   │   │           ├── bootstrap/
│   │   │           ├── jquery/
│   │   │           ├── sockjs-client/
│   │   │           └── stomp-websocket/
│   │   └── pom.xml
```


This README provides a comprehensive guide for setting up and using your chat application. You can replace the placeholders with your actual GitHub username and customize further if needed.
