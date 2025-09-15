/**
 * Test runner for U2-1-starter branch.
 * This runs all tests to verify U2-1-solution completion.
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
        System.out.println("=== U2-1 Starter Test Suite ===");
        System.out.println("Testing if U2-1-solution (PersonalProfile) has been completed correctly.");
        System.out.println();
        
        // Run PersonalProfile tests
        PersonalProfileTest.main(args);
        
        System.out.println("\n=== Instructions ===");
        System.out.println("If all tests pass, you have successfully completed U2-1-solution!");
        System.out.println("If tests fail, please review the PersonalProfile.java requirements:");
        System.out.println("1. Create a public class PersonalProfile");
        System.out.println("2. Add a public static void main(String[] args) method");
        System.out.println("3. Declare String name, int age, and boolean student variables");
        System.out.println("4. Print each variable to the console using System.out.println");
    }
}
