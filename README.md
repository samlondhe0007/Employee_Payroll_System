# Employee Payroll System (Java OOP Project)

A simple Java project built to understand and practice **Object-Oriented Programming (OOP)** concepts in a practical way.

This project is specially made for **beginners** who want to learn how to implement OOP principles by building a real-world style application.

---

## Why This Project?

Many beginners learn OOP theory (like Inheritance, Abstraction, etc.) but find it difficult to apply these concepts in real code.

This project helps you understand:
- How to design classes properly
- How different OOP concepts work together
- How to manage multiple types of objects using a single system

By building this **Employee Payroll System**, you will learn how companies basically manage different types of employees (Full-time & Part-time) and calculate their salaries.

---

## OOP Concepts Covered

### 1. Abstraction
- Used `abstract class Employee`
- Declared an abstract method `calculateSalary()`
- Hides unnecessary details and forces child classes to implement their own salary calculation logic

### 2. Inheritance
- `FullTimeEmployee` and `PartTimeEmployee` classes inherit from the `Employee` class
- Common properties (`name`, `id`) are defined in the parent class
- Child classes only add their specific details

### 3. Encapsulation
- All important data members are kept `private`
- Accessed only through getter methods
- Protects data from direct modification

### 4. Polymorphism
- Same method `calculateSalary()` behaves differently in `FullTimeEmployee` and `PartTimeEmployee`
- We can store different types of employees in a single list using parent class reference (`Employee`)

### 5. Class & Object
- Created multiple employee objects
- Used `PayrollSystem` class to manage all employees

### 6. Method Overriding
- `calculateSalary()` method is overridden in both child classes
- `toString()` method is also overridden for better output

---

## Features

- Add Full-time Employee
- Add Part-time Employee
- View all employees
- Remove employee by ID
- Calculate salary based on employee type
- Display employee details using `toString()`

---

## Project Structure

Employee-Payroll-System
│
├── Employee.java              (Abstract class)
├── FullTimeEmployee.java      (Inherits Employee)
├── PartTimeEmployee.java      (Inherits Employee)
├── PayrollSystem.java         (Manages employees)
└── Main.java                  (Driver class)


---

## How to Run

1. Clone the repository
2. Open the project in any Java IDE (IntelliJ, Eclipse, VS Code)
3. Run the `Main.java` file

---

## Learning Benefits

By completing this project, you will understand:

- How to apply **Abstraction** in real code
- How **Inheritance** helps in code reusability
- How **Polymorphism** allows flexibility
- How **Encapsulation** protects data
- How to design a small system using multiple classes

This project is a very good starting point before moving to advanced topics like:
- Interfaces
- Exception Handling
- Collections Framework
- Spring Boot

---

## Future Improvements (Optional)

- Add Interface
- Search employee by ID
- Calculate total payroll
- Update employee details
- Save data in file or database

---

## Author

Created for beginners who want to learn **Object-Oriented Programming** by building practical projects.
