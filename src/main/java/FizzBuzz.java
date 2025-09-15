/**
 * FizzBuzz class demonstrates the classic FizzBuzz programming challenge.
 * This class showcases how to combine loops, conditional logic, and the
 * modulo operator to solve a foundational programming problem.
 * 
 * @author Student Developer
 * @version 1.0.0
 */
public class FizzBuzz {
    
    /**
     * Main method - implements the classic FizzBuzz challenge.
     * Prints numbers 1 to 100 with special rules:
     * - Numbers divisible by 3: "Fizz"
     * - Numbers divisible by 5: "Buzz" 
     * - Numbers divisible by both 3 and 5: "FizzBuzz"
     * - All other numbers: the number itself
     * 
     * @param args command line arguments (not used in this example)
     */
    public static void main(String[] args) {
        System.out.println("=== The FizzBuzz Challenge ===");
        System.out.println("Printing numbers 1 to 100 with FizzBuzz rules:");
        System.out.println("- Divisible by 3: Fizz");
        System.out.println("- Divisible by 5: Buzz");
        System.out.println("- Divisible by both 3 and 5: FizzBuzz");
        System.out.println("- All other numbers: the number itself");
        System.out.println();
        
        // Implement the FizzBuzz logic
        fizzBuzzBasic();
        
        System.out.println();
        System.out.println("=== Challenge Complete! ===");
    }
    
    /**
     * Basic FizzBuzz implementation using a for loop and conditional logic.
     * This method demonstrates the core FizzBuzz algorithm using:
     * - A for loop to iterate through numbers 1 to 100
     * - The modulo operator (%) to check divisibility
     * - if-else if-else structure for decision making
     * - String concatenation and output formatting
     */
    public static void fizzBuzzBasic() {
        System.out.println("--- Basic FizzBuzz Implementation ---");
        
        for (int i = 1; i <= 100; i++) {
            // Check for FizzBuzz first (divisible by both 3 and 5)
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            // Check for Fizz (divisible by 3)
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // Check for Buzz (divisible by 5)
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // Print the number itself for all other cases
            else {
                System.out.println(i);
            }
        }
    }
    
    /**
     * Alternative FizzBuzz implementation using a while loop.
     * This demonstrates that the same logic can be implemented
     * using different loop structures.
     */
    public static void fizzBuzzWithWhile() {
        System.out.println("--- FizzBuzz with While Loop ---");
        
        int i = 1;
        while (i <= 100) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
            i++; // Increment the counter
        }
    }
    
    /**
     * FizzBuzz implementation with custom range.
     * This method allows you to specify the start and end numbers
     * for the FizzBuzz sequence.
     * 
     * @param start the starting number (inclusive)
     * @param end the ending number (inclusive)
     */
    public static void fizzBuzzRange(int start, int end) {
        System.out.println("--- FizzBuzz from " + start + " to " + end + " ---");
        
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
    
    /**
     * FizzBuzz implementation with statistics.
     * This version counts and displays how many times each
     * Fizz, Buzz, and FizzBuzz occur.
     */
    public static void fizzBuzzWithStats() {
        System.out.println("--- FizzBuzz with Statistics ---");
        
        int fizzCount = 0;
        int buzzCount = 0;
        int fizzBuzzCount = 0;
        int numberCount = 0;
        
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
                fizzBuzzCount++;
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
                fizzCount++;
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
                buzzCount++;
            } else {
                System.out.println(i);
                numberCount++;
            }
        }
        
        System.out.println();
        System.out.println("=== FizzBuzz Statistics ===");
        System.out.println("Fizz: " + fizzCount + " times");
        System.out.println("Buzz: " + buzzCount + " times");
        System.out.println("FizzBuzz: " + fizzBuzzCount + " times");
        System.out.println("Numbers: " + numberCount + " times");
        System.out.println("Total: " + (fizzCount + buzzCount + fizzBuzzCount + numberCount) + " items");
    }
}
