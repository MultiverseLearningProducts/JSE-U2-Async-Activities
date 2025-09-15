# Personal Profile Project - U1-2 Solution

## Overview
This project demonstrates the fundamental building blocks of Java programming through two key exercises:
1. **PersonalProfile.java** - Understanding class structure and variables
2. **SimpleCalculator.java** - Practicing arithmetic operators and type casting

## Learning Objectives

### Task 1: Anatomy of a Java Class
- Understand the fundamental building blocks of a Java program
- Learn class declaration and main method structure
- Practice variable declaration and initialization
- Explore different data types (String, int, boolean)

### Task 2: The Simple Calculator
- Practice using arithmetic operators (+, -, *, /, %)
- Understand integer vs floating-point division
- Learn type casting and its importance
- See how Java handles calculations with different number types

## Project Structure
```
personal-profile-project/
├── src/
│   └── main/
│       └── java/
│           ├── PersonalProfile.java
│           └── SimpleCalculator.java
└── README.md
```

## Key Concepts Demonstrated

### PersonalProfile.java
- **Class Declaration**: `public class PersonalProfile`
- **Main Method**: `public static void main(String[] args)`
- **Variable Declaration**: `String name = "Alex Johnson";`
- **Data Types**: String, int, boolean
- **Console Output**: `System.out.println()`

### SimpleCalculator.java
- **Arithmetic Operators**: +, -, *, /, %
- **Integer Division**: Truncates decimal part (15/4 = 3)
- **Type Casting**: `(double) num1 / num2` preserves precision (15/4 = 3.75)
- **Mixed-Type Operations**: Automatic type promotion
- **Data Type Precision**: Understanding when to use int vs double

## How to Run

### Compile Both Programs
```bash
javac src/main/java/PersonalProfile.java
javac src/main/java/SimpleCalculator.java
```

### Run PersonalProfile
```bash
java -cp src/main/java PersonalProfile
```

### Run SimpleCalculator
```bash
java -cp src/main/java SimpleCalculator
```

## Expected Output

### PersonalProfile Output
```
=== Personal Profile ===
Name: Alex Johnson
Age: 25
Student: true
========================
```

### SimpleCalculator Output
```
=== Simple Calculator ===
Number 1: 15
Number 2: 4

Sum: 15 + 4 = 19
Product: 15 * 4 = 60
Difference: 15 - 4 = 11

Integer Division: 15 / 4 = 3
Notice: The decimal part is truncated in integer division!
Double Division: (double) 15 / 4 = 3.75
Notice: Type casting preserves the decimal precision!
```

## Why This Matters

### Class Structure
Every line of Java code you write will live inside a class. This structure is the non-negotiable starting point for any Java application, big or small.

### Arithmetic Operations
Programs constantly perform calculations. Understanding how operators and data types interact is crucial for getting accurate results and avoiding subtle bugs.

## Learning Progression
- **U1-1**: Basic class structure and variables
- **U1-2**: Arithmetic operations and type casting
- **Next**: More advanced Java concepts...

This project provides a solid foundation for understanding Java fundamentals!
