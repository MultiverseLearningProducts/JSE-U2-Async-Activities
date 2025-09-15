/**
 * Tests for SecurityCheck class - U2-4 Solution
 * This test verifies that students have completed the SecurityCheck task correctly.
 * 
 * @author Educational Framework
 * @version 1.0.0
 */
public class SecurityCheckTest {
    
    /**
     * Main test runner for SecurityCheck tests.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("=== Testing SecurityCheck Implementation ===");
        System.out.println("This test verifies that you have completed U2-4-solution correctly.");
        System.out.println();
        
        TestFramework.reset();
        
        // Test 1: Check if SecurityCheck class exists and can be instantiated
        testClassExists();
        
        // Test 2: Check if main method exists and is accessible
        testMainMethodExists();
        
        // Test 3: Check if the class compiles without errors
        testClassCompiles();
        
        // Test 4: Check if required variables are declared
        testVariablesDeclared();
        
        // Test 5: Check if conditional logic is used
        testConditionalLogic();
        
        // Test 6: Check if boolean operators are used
        testBooleanOperators();
        
        // Test 7: Check if System.out.println is used for output
        testOutputMethodUsed();
        
        TestFramework.printSummary();
    }
    
    /**
     * Test that SecurityCheck class exists and can be instantiated.
     */
    private static void testClassExists() {
        try {
            Class<?> clazz = Class.forName("SecurityCheck");
            TestFramework.assertTrue(clazz != null, "SecurityCheck class exists");
            TestFramework.assertTrue("SecurityCheck".equals(clazz.getSimpleName()), 
                "Class name is 'SecurityCheck'");
        } catch (ClassNotFoundException e) {
            TestFramework.assertTrue(false, "SecurityCheck class not found - make sure it's in the correct location");
        }
    }
    
    /**
     * Test that main method exists and has correct signature.
     */
    private static void testMainMethodExists() {
        try {
            Class<?> clazz = Class.forName("SecurityCheck");
            java.lang.reflect.Method mainMethod = clazz.getMethod("main", String[].class);
            TestFramework.assertTrue(mainMethod != null, "main method exists");
            TestFramework.assertTrue(java.lang.reflect.Modifier.isStatic(mainMethod.getModifiers()), 
                "main method is static");
            TestFramework.assertTrue(java.lang.reflect.Modifier.isPublic(mainMethod.getModifiers()), 
                "main method is public");
        } catch (Exception e) {
            TestFramework.assertTrue(false, "main method not found or has incorrect signature");
        }
    }
    
    /**
     * Test that the class compiles without errors.
     */
    private static void testClassCompiles() {
        try {
            // Try to compile the SecurityCheck class
            ProcessBuilder pb = new ProcessBuilder("javac", "src/main/java/SecurityCheck.java");
            Process process = pb.start();
            int exitCode = process.waitFor();
            
            TestFramework.assertTrue(exitCode == 0, "SecurityCheck class compiles without errors");
        } catch (Exception e) {
            TestFramework.assertTrue(false, "Failed to compile SecurityCheck class: " + e.getMessage());
        }
    }
    
    /**
     * Test that required variables are declared by checking source code.
     */
    private static void testVariablesDeclared() {
        try {
            java.nio.file.Path path = java.nio.file.Paths.get("src/main/java/SecurityCheck.java");
            String content = new String(java.nio.file.Files.readAllBytes(path));
            
            // Check for int variable declaration
            boolean hasIntVar = content.contains("int") && 
                               (content.contains("userAge") || content.contains("age"));
            TestFramework.assertTrue(hasIntVar, "int variable for userAge is declared");
            
            // Check for boolean variable declaration
            boolean hasBooleanVar = content.contains("boolean") && 
                                   (content.contains("hasID") || content.contains("hasId"));
            TestFramework.assertTrue(hasBooleanVar, "boolean variable for hasID is declared");
            
        } catch (Exception e) {
            TestFramework.assertTrue(false, "Could not read SecurityCheck.java source file");
        }
    }
    
    /**
     * Test that conditional logic is used by checking source code.
     */
    private static void testConditionalLogic() {
        try {
            java.nio.file.Path path = java.nio.file.Paths.get("src/main/java/SecurityCheck.java");
            String content = new String(java.nio.file.Files.readAllBytes(path));
            
            // Check for if-else if-else structure
            boolean hasIf = content.contains("if");
            TestFramework.assertTrue(hasIf, "if statement is used");
            
            boolean hasElseIf = content.contains("else if");
            TestFramework.assertTrue(hasElseIf, "else if statement is used");
            
            boolean hasElse = content.contains("else");
            TestFramework.assertTrue(hasElse, "else statement is used");
            
        } catch (Exception e) {
            TestFramework.assertTrue(false, "Could not read SecurityCheck.java source file");
        }
    }
    
    /**
     * Test that boolean operators are used by checking source code.
     */
    private static void testBooleanOperators() {
        try {
            java.nio.file.Path path = java.nio.file.Paths.get("src/main/java/SecurityCheck.java");
            String content = new String(java.nio.file.Files.readAllBytes(path));
            
            // Check for boolean operators
            boolean hasAnd = content.contains("&&");
            TestFramework.assertTrue(hasAnd, "AND operator (&&) is used");
            
            boolean hasOr = content.contains("||");
            TestFramework.assertTrue(hasOr, "OR operator (||) is used");
            
        } catch (Exception e) {
            TestFramework.assertTrue(false, "Could not read SecurityCheck.java source file");
        }
    }
    
    /**
     * Test that System.out.println is used for output.
     */
    private static void testOutputMethodUsed() {
        try {
            java.nio.file.Path path = java.nio.file.Paths.get("src/main/java/SecurityCheck.java");
            String content = new String(java.nio.file.Files.readAllBytes(path));
            
            boolean hasPrintln = content.contains("System.out.println");
            TestFramework.assertTrue(hasPrintln, "System.out.println is used for output");
            
        } catch (Exception e) {
            TestFramework.assertTrue(false, "Could not read SecurityCheck.java source file");
        }
    }
}
