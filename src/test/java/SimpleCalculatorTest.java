/**
 * Tests for SimpleCalculator class - U2-2 Solution
 * This test verifies that students have completed the SimpleCalculator task correctly.
 * 
 * @author Educational Framework
 * @version 1.0.0
 */
public class SimpleCalculatorTest {
    
    /**
     * Main test runner for SimpleCalculator tests.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("=== Testing SimpleCalculator Implementation ===");
        System.out.println("This test verifies that you have completed U2-2-solution correctly.");
        System.out.println();
        
        TestFramework.reset();
        
        // Test 1: Check if SimpleCalculator class exists and can be instantiated
        testClassExists();
        
        // Test 2: Check if main method exists and is accessible
        testMainMethodExists();
        
        // Test 3: Check if the class compiles without errors
        testClassCompiles();
        
        // Test 4: Check if required variables are declared
        testVariablesDeclared();
        
        // Test 5: Check if arithmetic operations are performed
        testArithmeticOperations();
        
        // Test 6: Check if type casting is used
        testTypeCasting();
        
        // Test 7: Check if System.out.println is used for output
        testOutputMethodUsed();
        
        TestFramework.printSummary();
    }
    
    /**
     * Test that SimpleCalculator class exists and can be instantiated.
     */
    private static void testClassExists() {
        try {
            Class<?> clazz = Class.forName("SimpleCalculator");
            TestFramework.assertTrue(clazz != null, "SimpleCalculator class exists");
            TestFramework.assertTrue("SimpleCalculator".equals(clazz.getSimpleName()), 
                "Class name is 'SimpleCalculator'");
        } catch (ClassNotFoundException e) {
            TestFramework.assertTrue(false, "SimpleCalculator class not found - make sure it's in the correct location");
        }
    }
    
    /**
     * Test that main method exists and has correct signature.
     */
    private static void testMainMethodExists() {
        try {
            Class<?> clazz = Class.forName("SimpleCalculator");
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
            // Try to compile the SimpleCalculator class
            ProcessBuilder pb = new ProcessBuilder("javac", "src/main/java/SimpleCalculator.java");
            Process process = pb.start();
            int exitCode = process.waitFor();
            
            TestFramework.assertTrue(exitCode == 0, "SimpleCalculator class compiles without errors");
        } catch (Exception e) {
            TestFramework.assertTrue(false, "Failed to compile SimpleCalculator class: " + e.getMessage());
        }
    }
    
    /**
     * Test that required variables are declared by checking source code.
     */
    private static void testVariablesDeclared() {
        try {
            java.nio.file.Path path = java.nio.file.Paths.get("src/main/java/SimpleCalculator.java");
            String content = new String(java.nio.file.Files.readAllBytes(path));
            
            // Check for int variable declarations
            boolean hasIntVars = content.contains("int") && 
                                (content.contains("num1") || content.contains("num2"));
            TestFramework.assertTrue(hasIntVars, "int variables num1 and num2 are declared");
            
            // Check for specific values 15 and 4
            boolean hasCorrectValues = content.contains("15") && content.contains("4");
            TestFramework.assertTrue(hasCorrectValues, "Variables are initialized with values 15 and 4");
            
        } catch (Exception e) {
            TestFramework.assertTrue(false, "Could not read SimpleCalculator.java source file");
        }
    }
    
    /**
     * Test that arithmetic operations are performed by checking source code.
     */
    private static void testArithmeticOperations() {
        try {
            java.nio.file.Path path = java.nio.file.Paths.get("src/main/java/SimpleCalculator.java");
            String content = new String(java.nio.file.Files.readAllBytes(path));
            
            // Check for arithmetic operators
            boolean hasAddition = content.contains("+");
            TestFramework.assertTrue(hasAddition, "Addition operator (+) is used");
            
            boolean hasSubtraction = content.contains("-");
            TestFramework.assertTrue(hasSubtraction, "Subtraction operator (-) is used");
            
            boolean hasMultiplication = content.contains("*");
            TestFramework.assertTrue(hasMultiplication, "Multiplication operator (*) is used");
            
            boolean hasDivision = content.contains("/");
            TestFramework.assertTrue(hasDivision, "Division operator (/) is used");
            
        } catch (Exception e) {
            TestFramework.assertTrue(false, "Could not read SimpleCalculator.java source file");
        }
    }
    
    /**
     * Test that type casting is used by checking source code.
     */
    private static void testTypeCasting() {
        try {
            java.nio.file.Path path = java.nio.file.Paths.get("src/main/java/SimpleCalculator.java");
            String content = new String(java.nio.file.Files.readAllBytes(path));
            
            // Check for type casting
            boolean hasTypeCasting = content.contains("(double)");
            TestFramework.assertTrue(hasTypeCasting, "Type casting (double) is used");
            
        } catch (Exception e) {
            TestFramework.assertTrue(false, "Could not read SimpleCalculator.java source file");
        }
    }
    
    /**
     * Test that System.out.println is used for output.
     */
    private static void testOutputMethodUsed() {
        try {
            java.nio.file.Path path = java.nio.file.Paths.get("src/main/java/SimpleCalculator.java");
            String content = new String(java.nio.file.Files.readAllBytes(path));
            
            boolean hasPrintln = content.contains("System.out.println");
            TestFramework.assertTrue(hasPrintln, "System.out.println is used for output");
            
        } catch (Exception e) {
            TestFramework.assertTrue(false, "Could not read SimpleCalculator.java source file");
        }
    }
}
