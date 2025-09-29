# Mini Java OOP Project: Encapsulation & Inheritance (Person → Student → College)

## Table of Contents
1. [Project Overview](#project-overview)  
2. [Key Concepts](#key-concepts)  
3. [Class Hierarchy](#class-hierarchy)  
4. [Technologies Used](#technologies-used)  
5. [Project Structure](#project-structure)  
6. [How to Compile and Run](#how-to-compile-and-run)  
7. [Sample Output](#sample-output)  
8. [Future Enhancements](#future-enhancements)  
9. [Author](#author)  

## Project Overview
This mini-project demonstrates **Object-Oriented Programming (OOP)** principles in Java, focusing specifically on **Encapsulation** – using private fields and public getters to protect data, and **Inheritance** – implementing **multilevel inheritance** with `Person → Student → College`. The project models a simple academic system with three classes: **Person** (base class with personal attributes and static constants), **Student** (inherits from Person and adds academic attributes), and **College** (inherits from Student and adds location and behavior methods).  

## Key Concepts
- **Encapsulation**: All class fields are `private` and accessed via public getters to protect object data.  
- **Inheritance**: Demonstrates multilevel inheritance (Person → Student → College), constructor chaining with `super()`, and method overriding (`toString()`).  

## Class Hierarchy
markdown
Copy code
    Person
      │
    Student
      │
    College
markdown
Copy code
- **Person**: Fields – `name`, `height`, `weight`, `EYES`, `EARS`, `HANDS`, `LEGS`; Methods – getters, `toString()`.  
- **Student**: Fields – `course`, `roll`, `collegeName`; Methods – getters, `study()`, `write()`, `toString()`.  
- **College**: Fields – `location`; Methods – `getLocation()`, `conductClasses()`, `toString()`.  

## Technologies Used
- Java SE 8+  
- Standard Java IDE (Eclipse, IntelliJ, NetBeans) or Command Line  

## Project Structure
```text
MiniJavaOOPProject/
├── src/
│ ├── Person.java
│ ├── Student.java
│ └── College.java
├── README.md
```


## How to Compile and Run
1. Open a terminal in the `src` folder.  
2. Compile all classes:  
```bash
javac Person.java Student.java College.java
Run the College class:


java College
The output will display student and college details.

Sample Output

Name: Aditya, Height: 5.8, Weight: 50.0, College Name: St Peters Engineering College, Course Name: CSD, Roll: 1, College Location: MaisammaGuda
Aditya Attending CSD At St Peters Engineering College Which Is Located In MaisammaGuda Bearing Roll Number: 1
Future Enhancements
Add more behaviors for students and college administration.

Store multiple students in a List to simulate a full classroom.

Introduce interfaces to demonstrate multiple inheritance via Java interfaces.

Add input functionality to dynamically create Student/College objects.

Author
Name: Adhithya
GitHub: https://github.com/AdhithyaLakshmivarapu
