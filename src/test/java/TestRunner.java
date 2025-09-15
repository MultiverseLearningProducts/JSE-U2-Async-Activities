/**
 * Test runner for U2-4-solution branch.
 * This runs all tests to verify U2-5-solution completion.
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
        System.out.println("=== U2-4 Solution Test Suite ===");
        System.out.println("Testing if U2-5-solution (Repetition) has been completed correctly.");
        System.out.println();
        
        // Run Repetition tests
        RepetitionTest.main(args);
        
        System.out.println("\n=== Instructions ===");
        System.out.println("If all tests pass, you have successfully completed U2-5-solution!");
        System.out.println("If tests fail, please review the Repetition.java requirements:");
        System.out.println("1. Create a public class Repetition");
        System.out.println("2. Add a public static void main(String[] args) method");
        System.out.println("3. Use a for loop to print squares of numbers 1 to 10");
        System.out.println("4. Use a while loop with a counter less than 5");
        System.out.println("5. Print counter value and increment it in while loop");
        System.out.println("6. Use System.out.println for all output");
    }
}
