# Personal Profile Project - U2-1 Starter

## Overview
This is the starter branch for U2-1-solution. Your task is to complete the PersonalProfile implementation.

## Task: Anatomy of a Java Class
**Objective**: Understand the fundamental building blocks of a Java program: the class, the main method, and variables.

### Your Task
Create a new Java file named `PersonalProfile.java` in the `src/main/java/` directory.

Inside, define a public class `PersonalProfile`.

Within this class, create a `public static void main(String[] args)` method.

Inside main, declare and initialize three variables:
- A `String` for your name
- An `int` for your age  
- A `boolean` to represent if you are a student

Print each variable to the console using `System.out.println()`.

### Why This Matters
Every line of Java code you write will live inside a class. This structure is the non-negotiable starting point for any Java application, big or small.

## Testing Your Solution
Once you've completed your PersonalProfile.java implementation, run the tests to verify your solution:

```bash
# Compile the test framework
javac src/test/java/*.java

# Run the tests
java -cp src/test/java TestRunner
```

## Expected Output
Your PersonalProfile.java should output something like:
```
Alex Johnson
25
true
```

## Success Criteria
- ✅ PersonalProfile class exists and compiles
- ✅ main method has correct signature
- ✅ String, int, and boolean variables are declared
- ✅ System.out.println is used for output
- ✅ All tests pass

## Next Steps
After completing this task and passing all tests, you'll be ready for U2-2-solution (SimpleCalculator).

---

*This project is designed for educational purposes and follows Java best practices for beginners.*
