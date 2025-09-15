# Personal Profile Project - U1-3 Solution

## Overview
This project demonstrates the fundamental building blocks of Java programming through three key exercises:
1. **PersonalProfile.java** - Understanding class structure and variables
2. **SimpleCalculator.java** - Practicing arithmetic operators and type casting
3. **MessageGenerator.java** - Creating and using custom methods

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

### Task 3: Building Reusable Tools
- Create custom methods with proper signatures
- Learn method parameters and return types
- Understand the benefits of method organization
- Practice calling methods and using return values

## Project Structure
```
personal-profile-project/
├── src/
│   └── main/
│       └── java/
│           ├── PersonalProfile.java
│           ├── SimpleCalculator.java
│           └── MessageGenerator.java
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

### MessageGenerator.java
- **Method Declaration**: `public static String createWelcomeMessage(String name)`
- **Method Parameters**: Input values passed to methods
- **Return Types**: What methods give back (String, boolean, etc.)
- **Method Calls**: Using methods from main method
- **Code Organization**: Breaking problems into logical pieces

## How to Run

### Compile All Programs
```bash
javac src/main/java/*.java
```

### Run Individual Programs
```bash
# Personal Profile
java -cp src/main/java PersonalProfile

# Simple Calculator
java -cp src/main/java SimpleCalculator

# Message Generator
java -cp src/main/java MessageGenerator
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

### MessageGenerator Output
```
=== Message Generator Demo ===

Welcome, Alice!
Welcome, Bob!
Welcome, Charlie!

=== Additional Method Demonstrations ===
Goodbye, Alice! Have a great day!
Learning Java Programming in 2024!
Hello Alice! You are 25 years old and work as a Student.

=== Method Benefits ===
1. Code Reusability: Write once, use many times
2. Organization: Break large problems into small pieces
3. Maintainability: Change code in one place
4. Readability: Method names describe what they do
```

## Why This Matters

### Class Structure
Every line of Java code you write will live inside a class. This structure is the non-negotiable starting point for any Java application, big or small.

### Arithmetic Operations
Programs constantly perform calculations. Understanding how operators and data types interact is crucial for getting accurate results and avoiding subtle bugs.

### Method Organization
Methods are the key to organized programming. They let you break large problems into small, logical pieces and prevent you from writing the same code over and over again.

## Learning Progression
- **U1-1**: Basic class structure and variables
- **U1-2**: Arithmetic operations and type casting
- **U1-3**: Method creation and code organization
- **Next**: More advanced Java concepts...

This project provides a comprehensive foundation for understanding Java fundamentals!
