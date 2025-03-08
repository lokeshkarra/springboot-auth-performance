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
Modify `application.properties` for database and security settings.

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

## 💡 Performance and Load Testing
### **Overview**
Performance and load testing were conducted on the **/signup** endpoint to evaluate response times, error rates, and system behavior under concurrent requests.

### **Testing Tool**
- **JMeter** was used for simulating multiple concurrent users and measuring performance metrics.

### **Test Scenario**
- **Endpoint Tested:** `/signup`
- **Total Requests:** 6000
- **Request Type:** HTTP POST
- **Database Connection:** HikariCP (Connection Pooling)

### **Performance Metrics**
| Metric | Value |
|--------|-------|
| **Total Samples** | 6000 |
| **Average Response Time** | 5465 ms |
| **Min Response Time** | 78 ms |
| **Max Response Time** | 18915 ms |
| **Standard Deviation** | 3809.88 ms |
| **Error Rate** | 0.00% |
| **Throughput** | 84.3 requests/sec |
| **Received KB/sec** | 29.63 KB |
| **Sent KB/sec** | 24.17 KB |
| **Average Bytes** | 360.0 bytes |

### **Key Observations**
1. **High Response Time:** The average response time is relatively high, which may indicate potential bottlenecks in database queries or backend processing.
2. **Large Variability in Response Time:** The high standard deviation suggests inconsistent performance due to load spikes or inefficient resource allocation.
3. **No Errors Recorded:** The error rate is 0.00%, meaning all requests were processed successfully.
4. **Throughput Limitations:** The system processes 84.3 requests per second, which may not be sufficient for high-traffic applications.

### **Potential Performance Bottlenecks & Recommendations**
- **Optimize Database Queries:** Use indexing and optimize JOIN operations.
- **Enhance Connection Pooling:** Properly configure HikariCP pool size and fix JDBC URL issues.
- **Improve API Scalability:** Implement caching and consider asynchronous processing.
- **Conduct Further Testing:** Perform stress testing and analyze heap memory usage.





## 🤝 Contributing
Pull requests are welcome! Feel free to submit issues for improvements.

---
🚀 **Happy Coding!**

