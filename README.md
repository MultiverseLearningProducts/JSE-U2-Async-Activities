# Personal Profile Project - U1-4 Solution

## Overview
This project demonstrates the fundamental building blocks of Java programming through four key exercises:
1. **PersonalProfile.java** - Understanding class structure and variables
2. **SimpleCalculator.java** - Practicing arithmetic operators and type casting
3. **MessageGenerator.java** - Creating and using custom methods
4. **SecurityCheck.java** - Using conditional logic and boolean operators

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

### Task 4: The Security Check
- Use if-else statements to control program flow
- Understand boolean operators (&&, ||, !)
- Learn conditional logic and decision-making
- Practice complex condition evaluation

## Project Structure
```
personal-profile-project/
├── src/
│   └── main/
│       └── java/
│           ├── PersonalProfile.java
│           ├── SimpleCalculator.java
│           ├── MessageGenerator.java
│           └── SecurityCheck.java
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

### SecurityCheck.java
- **If-Else Statements**: `if (condition) { } else if (condition) { } else { }`
- **Boolean Operators**: `&&` (AND), `||` (OR), `!` (NOT)
- **Conditional Logic**: `userAge >= 18 && hasID`
- **Decision Making**: Dynamic program behavior based on conditions
- **Edge Cases**: Testing boundary conditions (exactly 18 years old)

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

# Security Check
java -cp src/main/java SecurityCheck
```

## Expected Output

### SecurityCheck Output
```
=== Security Check System ===

--- Scenario 1: Adult with ID ---
Age: 25, Has ID: true
Access Granted

--- Scenario 2: Adult without ID ---
Age: 22, Has ID: false
ID Check Required

--- Scenario 3: Minor with ID ---
Age: 16, Has ID: true
Access Denied

--- Scenario 4: Minor without ID ---
Age: 17, Has ID: false
Access Denied

--- Scenario 5: Edge case - exactly 18 with ID ---
Age: 18, Has ID: true
Access Granted

--- Scenario 6: Edge case - exactly 18 without ID ---
Age: 18, Has ID: false
ID Check Required
```

## Why This Matters

### Class Structure
Every line of Java code you write will live inside a class. This structure is the non-negotiable starting point for any Java application, big or small.

### Arithmetic Operations
Programs constantly perform calculations. Understanding how operators and data types interact is crucial for getting accurate results and avoiding subtle bugs.

### Method Organization
Methods are the key to organized programming. They let you break large problems into small, logical pieces and prevent you from writing the same code over and over again.

### Decision-Making Logic
Decision-making logic is the brain of any application. It allows your program to respond dynamically to different inputs and situations.

## Learning Progression
- **U1-1**: Basic class structure and variables
- **U1-2**: Arithmetic operations and type casting
- **U1-3**: Method creation and code organization
- **U1-4**: Conditional logic and decision-making
- **Next**: More advanced Java concepts...

This project provides a comprehensive foundation for understanding Java fundamentals!
