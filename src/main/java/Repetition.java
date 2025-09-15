/**
 * Repetition class demonstrates for and while loops in Java.
 * This class showcases how to use loops to automate repetitive actions
 * and process data efficiently.
 * 
 * @author Student Developer
 * @version 1.0.0
 */
public class Repetition {
    
    /**
     * Main method - demonstrates different types of loops and their applications.
     * This method shows how loops are essential for processing data and
     * automating repetitive tasks.
     * 
     * @param args command line arguments (not used in this example)
     */
    public static void main(String[] args) {
        System.out.println("=== The Repetition Engine ===");
        System.out.println();
        
        // Task 1: For loop to print squares of numbers 1 to 10
        System.out.println("--- Task 1: Squares of Numbers 1 to 10 (For Loop) ---");
        printSquaresWithForLoop();
        
        System.out.println();
        
        // Task 2: While loop to simulate a process with counter
        System.out.println("--- Task 2: Counter Process (While Loop) ---");
        simulateProcessWithWhileLoop();
        
        System.out.println();
        
        // Additional demonstrations
        System.out.println("--- Additional Loop Examples ---");
        demonstrateDifferentLoops();
        
        System.out.println();
        System.out.println("--- Loop Applications ---");
        demonstrateLoopApplications();
    }
    
    /**
     * Uses a for loop to print the squares of all numbers from 1 to 10.
     * This demonstrates the basic for loop structure and mathematical operations.
     */
    public static void printSquaresWithForLoop() {
        System.out.println("Printing squares using for loop:");
        
        // For loop: initialize, condition, increment
        for (int i = 1; i <= 10; i++) {
            int square = i * i;
            System.out.println("Square of " + i + " = " + square);
        }
        
        System.out.println();
        System.out.println("Squares in a single line: ");
        for (int i = 1; i <= 10; i++) {
            System.out.print((i * i) + " ");
        }
        System.out.println();
    }
    
    /**
     * Uses a while loop to simulate a process that runs as long as counter < 5.
     * This demonstrates the while loop structure and counter management.
     */
    public static void simulateProcessWithWhileLoop() {
        System.out.println("Simulating a process with while loop:");
        
        int counter = 0; // Initialize counter
        
        // While loop: condition check, then execution
        while (counter < 5) {
            System.out.println("Process step " + (counter + 1) + " - Counter value: " + counter);
            counter++; // Increment counter (very important!)
        }
        
        System.out.println("Process completed! Final counter value: " + counter);
    }
    
    /**
     * Demonstrates different types of loops and their variations.
     * This provides additional learning examples beyond the basic requirements.
     */
    public static void demonstrateDifferentLoops() {
        System.out.println("1. Countdown with for loop:");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("Blast off!");
        
        System.out.println();
        System.out.println("2. Even numbers with for loop:");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        System.out.println();
        System.out.println("3. Do-while loop example:");
        int count = 0;
        do {
            System.out.println("Do-while iteration: " + count);
            count++;
        } while (count < 3);
        
        System.out.println();
        System.out.println("4. Nested loops (multiplication table):");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i + "x" + j + "=" + (i * j) + " ");
            }
            System.out.println();
        }
    }
    
    /**
     * Demonstrates practical applications of loops in programming.
     * This shows how loops are used in real-world scenarios.
     */
    public static void demonstrateLoopApplications() {
        System.out.println("1. Processing a list of names:");
        String[] names = {"Alice", "Bob", "Charlie", "Diana", "Eve"};
        for (int i = 0; i < names.length; i++) {
            System.out.println("Hello, " + names[i] + "!");
        }
        
        System.out.println();
        System.out.println("2. Calculating sum of numbers 1 to 10:");
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers 1 to 10 = " + sum);
        
        System.out.println();
        System.out.println("3. Finding factorial of 5:");
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        System.out.println("5! = " + factorial);
        
        System.out.println();
        System.out.println("4. Simulating a loading process:");
        int progress = 0;
        while (progress < 100) {
            progress += 20;
            System.out.println("Loading... " + progress + "%");
        }
        System.out.println("Loading complete!");
    }
    
    /**
     * Demonstrates loop control statements (break and continue).
     * This shows advanced loop techniques for controlling execution flow.
     */
    public static void demonstrateLoopControl() {
        System.out.println();
        System.out.println("--- Loop Control Statements ---");
        
        System.out.println("1. Break statement (stop at 5):");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Breaking at " + i);
                break; // Exit the loop immediately
            }
            System.out.print(i + " ");
        }
        System.out.println();
        
        System.out.println();
        System.out.println("2. Continue statement (skip even numbers):");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // Skip the rest of this iteration
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    /**
     * Explains the key differences between for and while loops.
     * This provides educational content about loop selection.
     */
    public static void explainLoopDifferences() {
        System.out.println();
        System.out.println("=== For vs While Loops ===");
        System.out.println();
        
        System.out.println("FOR LOOP:");
        System.out.println("- Use when you know exactly how many times to repeat");
        System.out.println("- All loop control (init, condition, increment) in one place");
        System.out.println("- Good for: counting, iterating through arrays, fixed iterations");
        System.out.println("- Example: for (int i = 0; i < 10; i++)");
        System.out.println();
        
        System.out.println("WHILE LOOP:");
        System.out.println("- Use when you don't know how many times to repeat");
        System.out.println("- Condition is checked before each iteration");
        System.out.println("- Good for: user input validation, file reading, condition-based loops");
        System.out.println("- Example: while (userInput != 'quit')");
        System.out.println();
        
        System.out.println("DO-WHILE LOOP:");
        System.out.println("- Use when you need to execute at least once");
        System.out.println("- Condition is checked after each iteration");
        System.out.println("- Good for: menu systems, user confirmation, at-least-once execution");
        System.out.println("- Example: do { ... } while (userWantsToContinue);");
    }
}
