# 📦 Spring Batch – Employee CSV Processing

This project demonstrates how to use **Spring Batch** with **Spring Boot** to process employee data from CSV files. It reads records, applies transformations (like salary calculations), and writes results to a database or another output format.

---

## ✨ Features
- Read employee data from CSV (`id, name, designation, salary, etc.`)  
- Transform and calculate fields like **gross salary** and **net salary**  
- Write processed data to a relational database (H2/MySQL/PostgreSQL)  
- Handle large file uploads with configurable limits  
- Demonstrates error handling for cases like `MaxUploadSizeExceededException`  

---

## 📂 Project Structure
- `src/main/java` – Batch configuration, readers, processors, writers  
- `src/main/resources` – Application properties and sample CSV  
- `employees.csv` – Example input file with 100 records  
- `pom.xml` – Maven build configuration  

---

## ⚙️ Prerequisites
- Java 17+  
- Maven 3.8+  
- Spring Boot 3.x  
- A relational database (H2 in-memory by default)  

---

## 🚀 Getting Started

### 1. Clone the repository
```bash
git clone https://github.com/GokulakrishnanMuthan/spring-batch.git
cd spring-batch
