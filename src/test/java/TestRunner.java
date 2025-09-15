/**
 * Test runner for U2-2-solution branch.
 * This runs all tests to verify U2-3-solution completion.
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
        System.out.println("=== U2-2 Solution Test Suite ===");
        System.out.println("Testing if U2-3-solution (MessageGenerator) has been completed correctly.");
        System.out.println();
        
        // Run MessageGenerator tests
        MessageGeneratorTest.main(args);
        
        System.out.println("\n=== Instructions ===");
        System.out.println("If all tests pass, you have successfully completed U2-3-solution!");
        System.out.println("If tests fail, please review the MessageGenerator.java requirements:");
        System.out.println("1. Create a public class MessageGenerator");
        System.out.println("2. Add a public static void main(String[] args) method");
        System.out.println("3. Create public static String createWelcomeMessage(String name) method");
        System.out.println("4. Method should return 'Welcome, [name]!'");
        System.out.println("5. Call the method from main and store the result");
        System.out.println("6. Print the result using System.out.println");
    }
}
