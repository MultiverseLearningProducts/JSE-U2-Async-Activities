/**
 * Test runner for U2-5-solution branch.
 * This runs all tests to verify U2-6-solution completion.
 * 
 * @author Educational Framework
 * @version 1.0.0
 */
public class TestRunner {
    
    /**
     * Main method to run all tests.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("=== U2-5 Solution Test Suite ===");
        System.out.println("Testing if U2-6-solution (FizzBuzz) has been completed correctly.");
        System.out.println();
        
        // Run FizzBuzz tests
        FizzBuzzTest.main(args);
        
        System.out.println("\n=== Instructions ===");
        System.out.println("If all tests pass, you have successfully completed U2-6-solution!");
        System.out.println("If tests fail, please review the FizzBuzz.java requirements:");
        System.out.println("1. Create a public class FizzBuzz");
        System.out.println("2. Add a public static void main(String[] args) method");
        System.out.println("3. Use a for loop to iterate from 1 to 100");
        System.out.println("4. Use modulo operator (%) to check divisibility");
        System.out.println("5. Use if-else if-else for Fizz, Buzz, FizzBuzz logic");
        System.out.println("6. Print 'Fizz' for numbers divisible by 3");
        System.out.println("7. Print 'Buzz' for numbers divisible by 5");
        System.out.println("8. Print 'FizzBuzz' for numbers divisible by both 3 and 5");
        System.out.println("9. Print the number for all other cases");
        System.out.println("10. Use System.out.println for all output");
    }
}
