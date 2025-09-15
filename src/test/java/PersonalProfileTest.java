/**
 * Tests for PersonalProfile class - U2-1 Solution
 * This test verifies that students have completed the PersonalProfile task correctly.
 * 
 * @author Educational Framework
 * @version 1.0.0
 */
public class PersonalProfileTest {
    
    /**
     * Main test runner for PersonalProfile tests.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("=== Testing PersonalProfile Implementation ===");
        System.out.println("This test verifies that you have completed U2-1-solution correctly.");
        System.out.println();
        
        TestFramework.reset();
        
        // Test 1: Check if PersonalProfile class exists and can be instantiated
        testClassExists();
        
        // Test 2: Check if main method exists and is accessible
        testMainMethodExists();
        
        // Test 3: Check if the class compiles without errors
        testClassCompiles();
        
        // Test 4: Check if variables are declared (by examining source code)
        testVariablesDeclared();
        
        // Test 5: Check if System.out.println is used for output
        testOutputMethodUsed();
        
        TestFramework.printSummary();
    }
    
    /**
     * Test that PersonalProfile class exists and can be instantiated.
     */
    private static void testClassExists() {
        try {
            Class<?> clazz = Class.forName("PersonalProfile");
            TestFramework.assertTrue(clazz != null, "PersonalProfile class exists");
            TestFramework.assertTrue("PersonalProfile".equals(clazz.getSimpleName()), 
                "Class name is 'PersonalProfile'");
        } catch (ClassNotFoundException e) {
            TestFramework.assertTrue(false, "PersonalProfile class not found - make sure it's in the correct location");
        }
    }
    
    /**
     * Test that main method exists and has correct signature.
     */
    private static void testMainMethodExists() {
        try {
            Class<?> clazz = Class.forName("PersonalProfile");
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
            // Try to compile the PersonalProfile class
            ProcessBuilder pb = new ProcessBuilder("javac", "src/main/java/PersonalProfile.java");
            Process process = pb.start();
            int exitCode = process.waitFor();
            
            TestFramework.assertTrue(exitCode == 0, "PersonalProfile class compiles without errors");
        } catch (Exception e) {
            TestFramework.assertTrue(false, "Failed to compile PersonalProfile class: " + e.getMessage());
        }
    }
    
    /**
     * Test that required variables are declared by checking source code.
     */
    private static void testVariablesDeclared() {
        try {
            java.nio.file.Path path = java.nio.file.Paths.get("src/main/java/PersonalProfile.java");
            String content = new String(java.nio.file.Files.readAllBytes(path));
            
            // Check for String variable declaration
            boolean hasStringVar = content.contains("String") && 
                                 (content.contains("name") || content.contains("Name"));
            TestFramework.assertTrue(hasStringVar, "String variable for name is declared");
            
            // Check for int variable declaration
            boolean hasIntVar = content.contains("int") && 
                               (content.contains("age") || content.contains("Age"));
            TestFramework.assertTrue(hasIntVar, "int variable for age is declared");
            
            // Check for boolean variable declaration
            boolean hasBooleanVar = content.contains("boolean") && 
                                   (content.contains("student") || content.contains("Student") || 
                                    content.contains("isStudent") || content.contains("isStudent"));
            TestFramework.assertTrue(hasBooleanVar, "boolean variable for student status is declared");
            
        } catch (Exception e) {
            TestFramework.assertTrue(false, "Could not read PersonalProfile.java source file");
        }
    }
    
    /**
     * Test that System.out.println is used for output.
     */
    private static void testOutputMethodUsed() {
        try {
            java.nio.file.Path path = java.nio.file.Paths.get("src/main/java/PersonalProfile.java");
            String content = new String(java.nio.file.Files.readAllBytes(path));
            
            boolean hasPrintln = content.contains("System.out.println");
            TestFramework.assertTrue(hasPrintln, "System.out.println is used for output");
            
        } catch (Exception e) {
            TestFramework.assertTrue(false, "Could not read PersonalProfile.java source file");
        }
    }
}
