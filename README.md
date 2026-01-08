# Java Inventory Management System

A Core Java–based inventory management application built using both
**Command-Line Interface (CLI)** and **Java Swing GUI**.
This project is developed from scratch to strengthen Java fundamentals
and demonstrate real-world usage of object-oriented programming,
collections, file handling, and exception handling.

---

## 📌 Project Overview

The Java Inventory Management System allows users to manage products
through a menu-driven CLI and a graphical desktop interface.
Users can add, view, update, and delete products, and all data is stored
persistently using the file system so that inventory is retained even
after the program is closed.

This project is designed for **entry-level software engineering roles**
and focuses on **clean logic and core Java concepts**, without using any
external frameworks.

---

## ✨ Features

- Add new products to inventory
- View all products
- Update product quantity
- Delete products
- Prevent duplicate product IDs
- Persistent storage using file handling
- Clean and modular code structure
- Menu-driven CLI
- Java Swing–based graphical interface (GUI)

---

## 🛠 Technologies Used

- **Language:** Core Java  
- **Java Concepts:**
  - Object-Oriented Programming (OOP)
  - Encapsulation
  - Constructors
  - Collections (`ArrayList`)
  - File Handling (`BufferedReader`, `BufferedWriter`)
  - Exception Handling
- **Tools & Environment:**
  - Java JDK 17
  - Visual Studio Code
  - Command Line / Terminal

---

## 📂 Project Structure

```
Java-Based-Inventory-Management-System/
│
├── src/
│   ├── Main.java                # CLI entry point
│   ├── InventoryGUI.java        # Swing GUI entry point
│   ├── Product.java             # Product model (OOP)
│   ├── InventoryService.java    # Business logic
│   └── FileUtil.java            # File persistence utility
│
├── data/
│   └── inventory.txt            # Stores inventory data
│
└── README.md
```

---

## ▶️ How to Run the Project

### Prerequisites

- Java JDK 17 or above
- VS Code with Java Extension Pack (recommended)

### ▶️ Run CLI Version

```bash
javac src/*.java
java -cp src Main
```

### ▶️ Run GUI Version (Recommended)

```bash
javac src/*.java
java -cp src InventoryGUI
```

---

## 🎯 Learning Outcomes

- Strengthened Core Java fundamentals
- Practical understanding of OOP and collections
- Implemented file-based data persistence
- Built both CLI and GUI versions of the same application
- Improved debugging and exception handling skills

---

## 🎤 Interview Explanation (One Line)

> “I built a Core Java inventory management system with both CLI and Swing-based GUI, focusing on OOP, collections, file handling, and clean program structure.”

---

## 👨‍💻 Author

**Shyam Barua**  
B.Tech Computer Science & Engineering (2026)  
Kalinga Institute of Industrial Technology, Bhubaneswar  

- GitHub: https://github.com/Shyambarua  
- LinkedIn: https://www.linkedin.com/in/shyam-barua  

---

## 📌 Notes

- This project does not use any frameworks like Spring Boot.
- It focuses purely on Core Java fundamentals.
- Suitable for academic learning.
