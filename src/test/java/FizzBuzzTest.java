/**
 * Tests for FizzBuzz class - U2-6 Solution
 * This test verifies that students have completed the FizzBuzz task correctly.
 * 
 * @author Educational Framework
 * @version 1.0.0
 */
public class FizzBuzzTest {
    
    /**
     * Main test runner for FizzBuzz tests.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("=== Testing FizzBuzz Implementation ===");
        System.out.println("This test verifies that you have completed U2-6-solution correctly.");
        System.out.println();
        
        TestFramework.reset();
        
        // Test 1: Check if FizzBuzz class exists and can be instantiated
        testClassExists();
        
        // Test 2: Check if main method exists and is accessible
        testMainMethodExists();
        
        // Test 3: Check if the class compiles without errors
        testClassCompiles();
        
        // Test 4: Check if for loop is used
        testForLoopUsed();
        
        // Test 5: Check if modulo operator is used
        testModuloOperatorUsed();
        
        // Test 6: Check if conditional logic is used
        testConditionalLogic();
        
        // Test 7: Check if System.out.println is used for output
        testOutputMethodUsed();
        
        TestFramework.printSummary();
    }
    
    /**
     * Test that FizzBuzz class exists and can be instantiated.
     */
    private static void testClassExists() {
        try {
            Class<?> clazz = Class.forName("FizzBuzz");
            TestFramework.assertTrue(clazz != null, "FizzBuzz class exists");
            TestFramework.assertTrue("FizzBuzz".equals(clazz.getSimpleName()), 
                "Class name is 'FizzBuzz'");
        } catch (ClassNotFoundException e) {
            TestFramework.assertTrue(false, "FizzBuzz class not found - make sure it's in the correct location");
        }
    }
    
    /**
     * Test that main method exists and has correct signature.
     */
    private static void testMainMethodExists() {
        try {
            Class<?> clazz = Class.forName("FizzBuzz");
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
            // Try to compile the FizzBuzz class
            ProcessBuilder pb = new ProcessBuilder("javac", "src/main/java/FizzBuzz.java");
            Process process = pb.start();
            int exitCode = process.waitFor();
            
            TestFramework.assertTrue(exitCode == 0, "FizzBuzz class compiles without errors");
        } catch (Exception e) {
            TestFramework.assertTrue(false, "Failed to compile FizzBuzz class: " + e.getMessage());
        }
    }
    
    /**
     * Test that for loop is used by checking source code.
     */
    private static void testForLoopUsed() {
        try {
            java.nio.file.Path path = java.nio.file.Paths.get("src/main/java/FizzBuzz.java");
            String content = new String(java.nio.file.Files.readAllBytes(path));
            
            // Check for for loop
            boolean hasForLoop = content.contains("for (");
            TestFramework.assertTrue(hasForLoop, "for loop is used");
            
            // Check for range 1 to 100
            boolean hasRange = content.contains("1") && content.contains("100");
            TestFramework.assertTrue(hasRange, "Loop includes range 1 to 100");
            
        } catch (Exception e) {
            TestFramework.assertTrue(false, "Could not read FizzBuzz.java source file");
        }
    }
    
    /**
     * Test that modulo operator is used by checking source code.
     */
    private static void testModuloOperatorUsed() {
        try {
            java.nio.file.Path path = java.nio.file.Paths.get("src/main/java/FizzBuzz.java");
            String content = new String(java.nio.file.Files.readAllBytes(path));
            
            // Check for modulo operator
            boolean hasModulo = content.contains("%");
            TestFramework.assertTrue(hasModulo, "Modulo operator (%) is used");
            
            // Check for divisibility checks
            boolean hasDivisibility = content.contains("% 3") && content.contains("% 5");
            TestFramework.assertTrue(hasDivisibility, "Divisibility checks for 3 and 5 are used");
            
        } catch (Exception e) {
            TestFramework.assertTrue(false, "Could not read FizzBuzz.java source file");
        }
    }
    
    /**
     * Test that conditional logic is used by checking source code.
     */
    private static void testConditionalLogic() {
        try {
            java.nio.file.Path path = java.nio.file.Paths.get("src/main/java/FizzBuzz.java");
            String content = new String(java.nio.file.Files.readAllBytes(path));
            
            // Check for if-else if-else structure
            boolean hasIf = content.contains("if");
            TestFramework.assertTrue(hasIf, "if statement is used");
            
            boolean hasElseIf = content.contains("else if");
            TestFramework.assertTrue(hasElseIf, "else if statement is used");
            
            boolean hasElse = content.contains("else");
            TestFramework.assertTrue(hasElse, "else statement is used");
            
        } catch (Exception e) {
            TestFramework.assertTrue(false, "Could not read FizzBuzz.java source file");
        }
    }
    
    /**
     * Test that System.out.println is used for output.
     */
    private static void testOutputMethodUsed() {
        try {
            java.nio.file.Path path = java.nio.file.Paths.get("src/main/java/FizzBuzz.java");
            String content = new String(java.nio.file.Files.readAllBytes(path));
            
            boolean hasPrintln = content.contains("System.out.println");
            TestFramework.assertTrue(hasPrintln, "System.out.println is used for output");
            
        } catch (Exception e) {
            TestFramework.assertTrue(false, "Could not read FizzBuzz.java source file");
        }
    }
}
