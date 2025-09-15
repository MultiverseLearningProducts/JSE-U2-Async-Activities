/**
 * Test runner for U2-1-solution branch.
 * This runs all tests to verify U2-2-solution completion.
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
        System.out.println("=== U2-1 Solution Test Suite ===");
        System.out.println("Testing if U2-2-solution (SimpleCalculator) has been completed correctly.");
        System.out.println();
        
        // Run SimpleCalculator tests
        SimpleCalculatorTest.main(args);
        
        System.out.println("\n=== Instructions ===");
        System.out.println("If all tests pass, you have successfully completed U2-2-solution!");
        System.out.println("If tests fail, please review the SimpleCalculator.java requirements:");
        System.out.println("1. Create a public class SimpleCalculator");
        System.out.println("2. Add a public static void main(String[] args) method");
        System.out.println("3. Declare int num1 = 15 and int num2 = 4");
        System.out.println("4. Calculate and print sum, product, difference");
        System.out.println("5. Print integer division result");
        System.out.println("6. Cast num1 to double and print division result");
        System.out.println("7. Use System.out.println for all output");
    }
}
