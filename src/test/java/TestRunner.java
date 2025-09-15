/**
 * Test runner for U2-3-solution branch.
 * This runs all tests to verify U2-4-solution completion.
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
        System.out.println("=== U2-3 Solution Test Suite ===");
        System.out.println("Testing if U2-4-solution (SecurityCheck) has been completed correctly.");
        System.out.println();
        
        // Run SecurityCheck tests
        SecurityCheckTest.main(args);
        
        System.out.println("\n=== Instructions ===");
        System.out.println("If all tests pass, you have successfully completed U2-4-solution!");
        System.out.println("If tests fail, please review the SecurityCheck.java requirements:");
        System.out.println("1. Create a public class SecurityCheck");
        System.out.println("2. Add a public static void main(String[] args) method");
        System.out.println("3. Declare int userAge and boolean hasID variables");
        System.out.println("4. Use if-else if-else structure for decision making");
        System.out.println("5. Use && and || boolean operators");
        System.out.println("6. Print 'Access Granted', 'ID Check Required', or 'Access Denied'");
        System.out.println("7. Use System.out.println for all output");
    }
}
