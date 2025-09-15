/**
 * SecurityCheck class demonstrates conditional logic and boolean operators in Java.
 * This class showcases how to use if-else statements and logical operators
 * to control program flow based on different conditions.
 * 
 * @author Student Developer
 * @version 1.0.0
 */
public class SecurityCheck {
    
    /**
     * Main method - demonstrates conditional logic and decision-making in programs.
     * This method shows how if-else statements and boolean operators work together
     * to create dynamic program behavior.
     * 
     * @param args command line arguments (not used in this example)
     */
    public static void main(String[] args) {
        System.out.println("=== Security Check System ===");
        System.out.println();
        
        // Test different scenarios
        System.out.println("--- Scenario 1: Adult with ID ---");
        testSecurityCheck(25, true);
        
        System.out.println("\n--- Scenario 2: Adult without ID ---");
        testSecurityCheck(22, false);
        
        System.out.println("\n--- Scenario 3: Minor with ID ---");
        testSecurityCheck(16, true);
        
        System.out.println("\n--- Scenario 4: Minor without ID ---");
        testSecurityCheck(17, false);
        
        System.out.println("\n--- Scenario 5: Edge case - exactly 18 with ID ---");
        testSecurityCheck(18, true);
        
        System.out.println("\n--- Scenario 6: Edge case - exactly 18 without ID ---");
        testSecurityCheck(18, false);
        
        System.out.println("\n=== Interactive Security Check ===");
        System.out.println("Testing all possible combinations:");
        System.out.println();
        
        // Test all combinations systematically
        testAllCombinations();
        
        System.out.println("\n=== Boolean Operators Explained ===");
        explainBooleanOperators();
    }
    
    /**
     * Tests the security check logic with given age and ID status.
     * This method demonstrates the core if-else if-else structure.
     * 
     * @param userAge the age of the user
     * @param hasID whether the user has a valid ID
     */
    public static void testSecurityCheck(int userAge, boolean hasID) {
        System.out.println("Age: " + userAge + ", Has ID: " + hasID);
        
        // Core if-else if-else structure as required
        if (userAge >= 18 && hasID) {
            System.out.println("Access Granted");
        } else if (userAge >= 18 && !hasID) {
            System.out.println("ID Check Required");
        } else {
            System.out.println("Access Denied");
        }
    }
    
    /**
     * Tests all possible combinations of age and ID status.
     * This demonstrates comprehensive testing of conditional logic.
     */
    public static void testAllCombinations() {
        int[] ages = {16, 17, 18, 19, 20, 25};
        boolean[] idStatuses = {true, false};
        
        for (int age : ages) {
            for (boolean hasID : idStatuses) {
                System.out.print("Age " + age + ", ID " + hasID + ": ");
                testSecurityCheck(age, hasID);
            }
        }
    }
    
    /**
     * Explains how boolean operators work in conditional statements.
     * This provides educational content about logical operators.
     */
    public static void explainBooleanOperators() {
        System.out.println("Boolean Operators in Java:");
        System.out.println();
        
        System.out.println("1. && (AND operator):");
        System.out.println("   - Both conditions must be true for the result to be true");
        System.out.println("   - Example: userAge >= 18 && hasID");
        System.out.println("   - True only if BOTH age >= 18 AND hasID is true");
        System.out.println();
        
        System.out.println("2. || (OR operator):");
        System.out.println("   - At least one condition must be true for the result to be true");
        System.out.println("   - Example: userAge >= 18 || hasID");
        System.out.println("   - True if EITHER age >= 18 OR hasID is true (or both)");
        System.out.println();
        
        System.out.println("3. ! (NOT operator):");
        System.out.println("   - Reverses the boolean value");
        System.out.println("   - Example: !hasID means 'does not have ID'");
        System.out.println("   - If hasID is true, !hasID is false");
        System.out.println("   - If hasID is false, !hasID is true");
        System.out.println();
        
        System.out.println("4. Operator Precedence:");
        System.out.println("   - ! (NOT) has highest precedence");
        System.out.println("   - && (AND) has higher precedence than || (OR)");
        System.out.println("   - Use parentheses () to control evaluation order");
        System.out.println();
        
        // Demonstrate operator precedence
        System.out.println("=== Operator Precedence Examples ===");
        boolean a = true;
        boolean b = false;
        boolean c = true;
        
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("a && b || c = " + (a && b || c));
        System.out.println("a && (b || c) = " + (a && (b || c)));
        System.out.println("(a && b) || c = " + ((a && b) || c));
    }
    
    /**
     * Demonstrates additional conditional logic patterns.
     * This shows more complex decision-making scenarios.
     */
    public static void demonstrateAdvancedConditionals() {
        System.out.println("\n=== Advanced Conditional Examples ===");
        
        int age = 20;
        boolean hasID = true;
        boolean isVIP = false;
        boolean hasSpecialAccess = false;
        
        System.out.println("Age: " + age + ", Has ID: " + hasID + ", Is VIP: " + isVIP);
        
        // Complex conditional with multiple operators
        if ((age >= 18 && hasID) || isVIP || hasSpecialAccess) {
            System.out.println("Access Granted - Multiple conditions met");
        } else if (age >= 18 && !hasID) {
            System.out.println("ID Check Required - Age OK but no ID");
        } else if (age < 18 && hasID) {
            System.out.println("Access Denied - Too young despite having ID");
        } else {
            System.out.println("Access Denied - No valid access conditions met");
        }
    }
}
