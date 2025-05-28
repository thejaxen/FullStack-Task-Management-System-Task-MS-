# ⚙️Internal Audit Backend

A Spring Boot–based microservices backend designed for an internal audit and task management platform. It provides secure user authentication, task lifecycle management, and submission tracking via RESTful APIs.

---

## 🧩 Microservice Architecture

The backend is composed of the following independent services:

| Service Name             | Port  | Description                                      |
|--------------------------|-------|--------------------------------------------------|
| `eureka-server`          | 8070  | Service discovery using Netflix Eureka          |
| `gateway`                | 5000  | API Gateway for routing and CORS control        |
| `task-user-service`      | 5001  | User auth, registration and role management     |
| `task-service`           | 5002  | Task creation, assignment, and update workflow  |
| `task-submission-service`| 5003  | Submission handling and admin approval system   |

---

## 🛠 Tech Stack

- 🧪 **Spring Boot 3**
- 🧠 **Spring Security (JWT based)**
- 🗃 **PostgreSQL** (via Spring Data JPA)
- 🔄 **OpenFeign** for inter-service communication
- 🛰 **Eureka** for service registration/discovery
- 🌐 **Spring Cloud Gateway** for centralized routing
- 🔐 **JWT (JJwt library)** for stateless authentication

---

## 🔐 Authentication Flow

1. Users sign in using `/auth/signIn` or register via `/auth/signUp`.
2. A JWT token is issued on successful authentication.
3. JWT is validated via a custom `JwtTokenValidator` filter.
4. Token carries user email and roles, used for authorization.

---

## 📁 Project Structure Overview

```plaintext
.
├── eureka-server/
├── gateway/
├── task-user-service/
│   ├── controller/
│   ├── config/              # JWT, security, CORS
│   ├── modal/               # User entity
│   ├── service/             # Auth and user profile logic
│   └── repository/          # UserRepository
├── task-service/
│   ├── controller/
│   ├── modal/               # Task, TaskStatus
│   ├── service/             # TaskServiceImplementation
│   └── repository/
├── task-submission-service/
│   ├── controller/
│   ├── modal/               # Submission entity
│   ├── service/             # Submission logic + Feign clients
│   └── repository/
```

---

## 🔗 Key Endpoints

### 🔑 Auth & User
```
POST   /auth/signIn              # Login
POST   /auth/signUp              # Register
GET    /api/users/profile        # Get authenticated user profile
GET    /api/users                # Admin list all users
```

### 📋 Tasks
```
POST   /api/tasks/createTask     # Create a new task
PUT    /api/tasks/update/{id}    # Edit task details
GET    /api/tasks/all-tasks      # Admin fetch all tasks
GET    /api/tasks/user           # User fetch their assigned tasks
```

### 📤 Submissions
```
POST   /api/submission/submit                  # Submit a task
GET    /api/submission/get-all-submissions     # Admin view all
PUT    /api/submission/acc-dec/{id}?status=... # Accept or decline
```

---

## 🔐 Security Configuration

- Stateless session with JWT header validation.
- Custom CORS settings for local frontend (localhost:3000).
- Secure password storage with `BCryptPasswordEncoder`.

---

## 🧪 Local Setup Instructions

> Prerequisites:
> - Java 17+
> - Maven
> - PostgreSQL running and configured

```bash
# Clone the repository
git clone https://github.com/YOUR_USERNAME/internal-audit-backend.git

# Navigate to each service directory and run:
mvn spring-boot:run
```

---

## 📌 Future Enhancements

- 📈 Add Prometheus & Grafana monitoring
- 🛡️ Refresh token mechanism
- 📧 Email notifications via SMTP integration
- 📊 Admin dashboard with analytics support

---

## 👨‍💻 Developer

**Mert Duyar** – Backend Developer  
GitHub: [@thejaxen](https://github.com/thejaxen)

---

## 📄 License

Licensed under the MIT License.
