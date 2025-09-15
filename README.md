# Quiz and Exam Management System

A **Java OOP desktop application** built with **NetBeans GUI** and **MySQL database** for managing quizzes and exams.  
It allows **admins** to create and manage quizzes/exams, while **students** can participate in exams and view their results.
## 🚀 Features

**Admin Panel**
  - Secure login for admin 
  - Add, edit, and delete questions  
  - Timer-based quiz system setup  
  - Automatic result calculation  
  - Student performance tracking  
  - Save results as PDF for record-keeping    

**Student Panel** 
  - Attend available quizzes/exams  
  - View exam results and scores 


## 🛠️ Tech Stack  

- **Language:** Java (OOP)  
- **IDE:** NetBeans  
- **Database:** MySQL  
- **UI:** Java Swing (NetBeans GUI) 

## Screenshots

![App Screenshot](https://via.placeholder.com/468x300?text=App+Screenshot+Here)


## ⚙️ Installation & Setup

1. Clone the repository
   ```bash
   git clone https://github.com/AmmarHamim/Quiz-Management-System.git

2. Open the project in NetBeans IDE

3. Import the database file (quems.sql) into MySQL

4. Update database connection settings in the code (JDBC URL, username, password)

5. Run the project from NetBeans    

## 🗄️ Database

The MySQL database file is included in the repository.

[Download qems.sql](https://raw.githubusercontent.com/AmmarHamim/Quiz-Management-System/refs/heads/main/Database/quems.sql)

### Import using MySQL Workbench

1. Open **MySQL Workbench** and connect to your server.  
2. Go to **Server → Data Import**.  
3. Choose **Import from Self-Contained File** and select `qems.sql` from the `Database` folder.  
4. Select your target schema (or create a new one).  
5. Click **Start Import**.

### Import using phpMyAdmin (optional)

1. Open phpMyAdmin (`http://localhost/phpmyadmin/`)  
2. Click on **Import**  
3. Select `qems.sql` from the `Database` folder  
4. Click **Go**

### Import using MySQL command line

```bash
mysql -u root -p < Database/qems.sql

```

## 👥 Credits
This project was developed by:

- **Ammar Hamim**
- **Tahrima Afrin**
- **Maruf Hassan**
- **Sumaiya Akter**

