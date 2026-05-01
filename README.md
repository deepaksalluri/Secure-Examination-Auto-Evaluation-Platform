# 📝 Secure Examination & Auto-Evaluation Platform

A full-stack Online Examination System built using Spring Boot that allows users to register, login, and participate in online exams. The system is designed to simulate real-world examination platforms with secure authentication, efficient data handling, and scalable architecture.

---

## 📌 Overview

This application provides a platform where users can:
- Register and authenticate securely
- Attempt online exams
- Store and manage exam-related data
- Interact with backend services via REST APIs

The system follows a layered architecture ensuring clean separation of concerns between controller, service, and data access layers.

---

## ✨ Features

- 🔐 User Registration & Login
- 🔑 Secure Password Handling (BCrypt Encryption)
- 🧾 RESTful API Architecture
- 📊 Exam Data Management
- ⚡ Fast In-Memory Database (H2)
- 🏗️ Clean Layered Backend Design
- 🔄 Scalable and Maintainable Code Structure

---

## 🖥️ Tech Stack

### Backend
- Java 17 :contentReference[oaicite:0]{index=0}
- Spring Boot 3.x
- Spring Data JPA
- Spring Web

### Database
- H2 Database (In-Memory)

### Security
- BCrypt Password Encryption

### Build Tool
- Maven

---

## 📁 Project Structure


online-exam-system/
├── src/main/java/com/exam/
│ ├── controller/ # REST Controllers
│ ├── service/ # Business Logic
│ ├── repository/ # Data Access Layer
│ ├── model/ # Entity Classes
│
├── src/main/resources/
│ ├── application.properties
│
├── pom.xml # Maven Configuration
├── .gitignore # Ignored Files


---

## ⚙️ Installation & Setup

### 1️⃣ Clone Repository

```bash
git clone https://github.com/your-username/online-exam-system.git
cd online-exam-system
2️⃣ Build the Project
mvn clean install
3️⃣ Run the Application
mvn spring-boot:run

Application will start at:

http://localhost:8080
``` id="c4d2sm"

---

## 🔗 API Overview

| Method | Endpoint | Description |
|--------|---------|------------|
| POST   | /auth/register | Register new user |
| POST   | /auth/login | Authenticate user |
| GET    | /exam | Get exam data |
| POST   | /exam | Submit exam |

---

## 💡 Key Highlights

- ✔️ RESTful API design
- ✔️ Layered architecture (Controller → Service → Repository)
- ✔️ Secure password encryption using BCrypt
- ✔️ Lightweight and fast H2 database
- ✔️ Clean and modular codebase
- ✔️ Easy to extend for advanced features

---

## 🚀 Future Enhancements

- 🔐 JWT-based authentication & authorization
- 🧑‍🏫 Admin panel for managing exams
- 📊 Result analytics dashboard
- 📱 Responsive frontend UI integration
- 🧾 Exam timer functionality
- 📧 Email notifications

---

## ⚠️ Important Notes

- H2 database is used for development (data resets on restart)
- Database files are ignored in version control for security :contentReference[oaicite:1]{index=1}
- Ensure Java 17+ is installed

---

## 👨‍💻 Author

Deepak Salluri
B.Tech Computer Science Engineering  
Aspiring Java Full Stack Developer  
