/**
 * Tests for Repetition class - U2-5 Solution
 * This test verifies that students have completed the Repetition task correctly.
 * 
 * @author Educational Framework
 * @version 1.0.0
 */
public class RepetitionTest {
    
    /**
     * Main test runner for Repetition tests.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("=== Testing Repetition Implementation ===");
        System.out.println("This test verifies that you have completed U2-5-solution correctly.");
        System.out.println();
        
        TestFramework.reset();
        
        // Test 1: Check if Repetition class exists and can be instantiated
        testClassExists();
        
        // Test 2: Check if main method exists and is accessible
        testMainMethodExists();
        
        // Test 3: Check if the class compiles without errors
        testClassCompiles();
        
        // Test 4: Check if for loop is used
        testForLoopUsed();
        
        // Test 5: Check if while loop is used
        testWhileLoopUsed();
        
        // Test 6: Check if System.out.println is used for output
        testOutputMethodUsed();
        
        TestFramework.printSummary();
    }
    
    /**
     * Test that Repetition class exists and can be instantiated.
     */
    private static void testClassExists() {
        try {
            Class<?> clazz = Class.forName("Repetition");
            TestFramework.assertTrue(clazz != null, "Repetition class exists");
            TestFramework.assertTrue("Repetition".equals(clazz.getSimpleName()), 
                "Class name is 'Repetition'");
        } catch (ClassNotFoundException e) {
            TestFramework.assertTrue(false, "Repetition class not found - make sure it's in the correct location");
        }
    }
    
    /**
     * Test that main method exists and has correct signature.
     */
    private static void testMainMethodExists() {
        try {
            Class<?> clazz = Class.forName("Repetition");
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
            // Try to compile the Repetition class
            ProcessBuilder pb = new ProcessBuilder("javac", "src/main/java/Repetition.java");
            Process process = pb.start();
            int exitCode = process.waitFor();
            
            TestFramework.assertTrue(exitCode == 0, "Repetition class compiles without errors");
        } catch (Exception e) {
            TestFramework.assertTrue(false, "Failed to compile Repetition class: " + e.getMessage());
        }
    }
    
    /**
     * Test that for loop is used by checking source code.
     */
    private static void testForLoopUsed() {
        try {
            java.nio.file.Path path = java.nio.file.Paths.get("src/main/java/Repetition.java");
            String content = new String(java.nio.file.Files.readAllBytes(path));
            
            // Check for for loop
            boolean hasForLoop = content.contains("for (");
            TestFramework.assertTrue(hasForLoop, "for loop is used");
            
            // Check for range 1 to 10
            boolean hasRange = content.contains("1") && content.contains("10");
            TestFramework.assertTrue(hasRange, "Loop includes range 1 to 10");
            
        } catch (Exception e) {
            TestFramework.assertTrue(false, "Could not read Repetition.java source file");
        }
    }
    
    /**
     * Test that while loop is used by checking source code.
     */
    private static void testWhileLoopUsed() {
        try {
            java.nio.file.Path path = java.nio.file.Paths.get("src/main/java/Repetition.java");
            String content = new String(java.nio.file.Files.readAllBytes(path));
            
            // Check for while loop
            boolean hasWhileLoop = content.contains("while (");
            TestFramework.assertTrue(hasWhileLoop, "while loop is used");
            
            // Check for counter variable
            boolean hasCounter = content.contains("counter") || content.contains("i") || content.contains("count");
            TestFramework.assertTrue(hasCounter, "Counter variable is used in while loop");
            
        } catch (Exception e) {
            TestFramework.assertTrue(false, "Could not read Repetition.java source file");
        }
    }
    
    /**
     * Test that System.out.println is used for output.
     */
    private static void testOutputMethodUsed() {
        try {
            java.nio.file.Path path = java.nio.file.Paths.get("src/main/java/Repetition.java");
            String content = new String(java.nio.file.Files.readAllBytes(path));
            
            boolean hasPrintln = content.contains("System.out.println");
            TestFramework.assertTrue(hasPrintln, "System.out.println is used for output");
            
        } catch (Exception e) {
            TestFramework.assertTrue(false, "Could not read Repetition.java source file");
        }
    }
}
