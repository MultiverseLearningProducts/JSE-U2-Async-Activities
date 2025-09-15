/**
 * Tests for MessageGenerator class - U2-3 Solution
 * This test verifies that students have completed the MessageGenerator task correctly.
 * 
 * @author Educational Framework
 * @version 1.0.0
 */
public class MessageGeneratorTest {
    
    /**
     * Main test runner for MessageGenerator tests.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("=== Testing MessageGenerator Implementation ===");
        System.out.println("This test verifies that you have completed U2-3-solution correctly.");
        System.out.println();
        
        TestFramework.reset();
        
        // Test 1: Check if MessageGenerator class exists and can be instantiated
        testClassExists();
        
        // Test 2: Check if main method exists and is accessible
        testMainMethodExists();
        
        // Test 3: Check if the class compiles without errors
        testClassCompiles();
        
        // Test 4: Check if createWelcomeMessage method exists
        testCreateWelcomeMessageMethod();
        
        // Test 5: Check if method is called from main
        testMethodCalledFromMain();
        
        // Test 6: Check if System.out.println is used for output
        testOutputMethodUsed();
        
        TestFramework.printSummary();
    }
    
    /**
     * Test that MessageGenerator class exists and can be instantiated.
     */
    private static void testClassExists() {
        try {
            Class<?> clazz = Class.forName("MessageGenerator");
            TestFramework.assertTrue(clazz != null, "MessageGenerator class exists");
            TestFramework.assertTrue("MessageGenerator".equals(clazz.getSimpleName()), 
                "Class name is 'MessageGenerator'");
        } catch (ClassNotFoundException e) {
            TestFramework.assertTrue(false, "MessageGenerator class not found - make sure it's in the correct location");
        }
    }
    
    /**
     * Test that main method exists and has correct signature.
     */
    private static void testMainMethodExists() {
        try {
            Class<?> clazz = Class.forName("MessageGenerator");
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
            // Try to compile the MessageGenerator class
            ProcessBuilder pb = new ProcessBuilder("javac", "src/main/java/MessageGenerator.java");
            Process process = pb.start();
            int exitCode = process.waitFor();
            
            TestFramework.assertTrue(exitCode == 0, "MessageGenerator class compiles without errors");
        } catch (Exception e) {
            TestFramework.assertTrue(false, "Failed to compile MessageGenerator class: " + e.getMessage());
        }
    }
    
    /**
     * Test that createWelcomeMessage method exists with correct signature.
     */
    private static void testCreateWelcomeMessageMethod() {
        try {
            Class<?> clazz = Class.forName("MessageGenerator");
            java.lang.reflect.Method method = clazz.getMethod("createWelcomeMessage", String.class);
            TestFramework.assertTrue(method != null, "createWelcomeMessage method exists");
            TestFramework.assertTrue(java.lang.reflect.Modifier.isStatic(method.getModifiers()), 
                "createWelcomeMessage method is static");
            TestFramework.assertTrue(java.lang.reflect.Modifier.isPublic(method.getModifiers()), 
                "createWelcomeMessage method is public");
            TestFramework.assertTrue(method.getReturnType() == String.class, 
                "createWelcomeMessage method returns String");
        } catch (Exception e) {
            TestFramework.assertTrue(false, "createWelcomeMessage method not found or has incorrect signature");
        }
    }
    
    /**
     * Test that createWelcomeMessage method is called from main by checking source code.
     */
    private static void testMethodCalledFromMain() {
        try {
            java.nio.file.Path path = java.nio.file.Paths.get("src/main/java/MessageGenerator.java");
            String content = new String(java.nio.file.Files.readAllBytes(path));
            
            // Check if createWelcomeMessage is called in main method
            boolean methodCalled = content.contains("createWelcomeMessage(");
            TestFramework.assertTrue(methodCalled, "createWelcomeMessage method is called from main");
            
            // Check if result is stored in a variable
            boolean resultStored = content.contains("=") && content.contains("createWelcomeMessage");
            TestFramework.assertTrue(resultStored, "Method result is stored in a variable");
            
        } catch (Exception e) {
            TestFramework.assertTrue(false, "Could not read MessageGenerator.java source file");
        }
    }
    
    /**
     * Test that System.out.println is used for output.
     */
    private static void testOutputMethodUsed() {
        try {
            java.nio.file.Path path = java.nio.file.Paths.get("src/main/java/MessageGenerator.java");
            String content = new String(java.nio.file.Files.readAllBytes(path));
            
            boolean hasPrintln = content.contains("System.out.println");
            TestFramework.assertTrue(hasPrintln, "System.out.println is used for output");
            
        } catch (Exception e) {
            TestFramework.assertTrue(false, "Could not read MessageGenerator.java source file");
        }
    }
}
