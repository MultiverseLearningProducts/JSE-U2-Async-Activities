# Personal Profile Project

## Overview
This project demonstrates the fundamental building blocks of a Java program: the class, the main method, and variables.

## Learning Objectives
- Understand the anatomy of a Java class
- Learn how to declare and initialize variables
- Practice using the main method as the entry point
- Explore different data types (String, int, boolean)

## Project Structure
```
personal-profile-project/
├── src/
│   └── main/
│       └── java/
│           └── PersonalProfile.java
└── README.md
```

## How to Run
1. Compile the Java file:
   ```bash
   javac src/main/java/PersonalProfile.java
   ```

2. Run the program:
   ```bash
   java -cp src/main/java PersonalProfile
   ```

## Expected Output
```
=== Personal Profile ===
Name: Alex Johnson
Age: 25
Student: true
========================

Variable Details:
- Name is a String: String
- Age is an int: Integer
- Student status is a boolean: Boolean
```

## Key Concepts Demonstrated
- **Class Declaration**: `public class PersonalProfile`
- **Main Method**: `public static void main(String[] args)`
- **Variable Declaration**: `String name = "Alex Johnson";`
- **Data Types**: String, int, boolean
- **Console Output**: `System.out.println()`

## Why This Matters
Every line of Java code you write will live inside a class. This structure is the non-negotiable starting point for any Java application, big or small.
