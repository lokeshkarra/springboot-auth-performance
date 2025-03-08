# Spring Security REST API

## 📌 Overview
This is a **Spring Boot REST API** secured with **Spring Security**, implementing user authentication and authorization using `UsernamePasswordAuthenticationToken`. The API provides both **public** and **protected** endpoints, enforcing security measures like password hashing and session management.

## ✨ Features
- ✅  User authentication with **Spring Security**
- ✅  **BCrypt password encoding** for secure storage
- ✅  Role-based access control (**RBAC**) for API endpoints
- ✅  JWT authentication (future enhancement possible)
- ✅  Stateless session management with **SessionCreationPolicy**
- ✅  Custom authentication entry point


## 🏗️ Tech Stack
- ☕ **Java 17+**
- 🏗 **Spring Boot**
- 🔐 **Spring Security**
- 🗄 **Spring Data JPA**
- 🛢 **Postgres Database**
- 🐘 **Hibernate**
- 🛠 **Maven**


## 🚀 Getting Started
### 1️⃣ Clone the Repository
```sh
 git clone https://github.com/your-username/spring-security-rest-api.git
 cd spring-security-rest-api
```

### 2️⃣ Configure the Application
Modify `application.properties` (if needed) for database and security settings.

### 3️⃣ Build & Run the Project
```sh
mvn clean install
java -jar target/SpringSecurityRestAPI-0.0.1-SNAPSHOT.ja
```

## 🔑 API Endpoints
### **Authentication**
| Method | Endpoint | Description |
|--------|-------------|------------------------------|
| `POST` | `/api/auth/signup` | Registers a new user |
| `POST` | `/api/auth/login` | Authenticates and returns token |

### **Public Endpoints**
| Method | Endpoint | Access |
|--------|-------------|-------------|
| `GET`  | `/public_resource` | ✅ Open to all |

### **Protected Endpoints**
| Method | Endpoint | Access |
|--------|----------------|----------------------|
| `GET`  | `/secret_resource` | 🔒 Requires authentication |

## 🔥 Security Configuration
Spring Security is configured in `SecurityConfig.java` to:
- **Allow public access** to `/public_resource` & `/api/auth/**`
- **Secure all other endpoints**, requiring authentication
- **Encrypt passwords** using `BCryptPasswordEncoder`
- **Manage sessions** as per security best practices

## 🤝 Contributing
Pull requests are welcome! Feel free to submit issues for improvements.

---
🚀 **Happy Coding!**

