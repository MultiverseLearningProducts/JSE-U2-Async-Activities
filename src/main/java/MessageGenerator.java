/**
 * MessageGenerator class demonstrates method creation and usage in Java.
 * This class showcases how to build reusable tools by creating custom methods
 * that can be called from the main method or other parts of the program.
 * 
 * @author Student Developer
 * @version 1.0.0
 */
public class MessageGenerator {
    
    /**
     * Main method - demonstrates calling custom methods and using their return values.
     * This method shows how methods help organize code and make it reusable.
     * 
     * @param args command line arguments (not used in this example)
     */
    public static void main(String[] args) {
        System.out.println("=== Message Generator Demo ===");
        System.out.println();
        
        // Call the createWelcomeMessage method with different names
        String welcomeMessage1 = createWelcomeMessage("Alice");
        String welcomeMessage2 = createWelcomeMessage("Bob");
        String welcomeMessage3 = createWelcomeMessage("Charlie");
        
        // Print the returned messages
        System.out.println(welcomeMessage1);
        System.out.println(welcomeMessage2);
        System.out.println(welcomeMessage3);
        
        System.out.println();
        System.out.println("=== Additional Method Demonstrations ===");
        
        // Demonstrate other custom methods
        String goodbyeMessage = createGoodbyeMessage("Alice");
        String infoMessage = createInfoMessage("Java Programming", 2024);
        String personalizedMessage = createPersonalizedMessage("Alice", 25, "Student");
        
        System.out.println(goodbyeMessage);
        System.out.println(infoMessage);
        System.out.println(personalizedMessage);
        
        System.out.println();
        System.out.println("=== Method Benefits ===");
        System.out.println("1. Code Reusability: Write once, use many times");
        System.out.println("2. Organization: Break large problems into small pieces");
        System.out.println("3. Maintainability: Change code in one place");
        System.out.println("4. Readability: Method names describe what they do");
    }
    
    /**
     * Creates a welcome message for the given name.
     * This method demonstrates the basic structure of a custom method:
     * - public static: accessible from anywhere, belongs to the class
     * - String: return type (what the method gives back)
     * - createWelcomeMessage: method name (describes what it does)
     * - String name: parameter (input the method receives)
     * 
     * @param name the name to include in the welcome message
     * @return a formatted welcome message string
     */
    public static String createWelcomeMessage(String name) {
        return "Welcome, " + name + "!";
    }
    
    /**
     * Creates a goodbye message for the given name.
     * This demonstrates method overloading and different return patterns.
     * 
     * @param name the name to include in the goodbye message
     * @return a formatted goodbye message string
     */
    public static String createGoodbyeMessage(String name) {
        return "Goodbye, " + name + "! Have a great day!";
    }
    
    /**
     * Creates an informational message with a topic and year.
     * This demonstrates methods with multiple parameters.
     * 
     * @param topic the topic to include in the message
     * @param year the year to include in the message
     * @return a formatted informational message string
     */
    public static String createInfoMessage(String topic, int year) {
        return "Learning " + topic + " in " + year + "!";
    }
    
    /**
     * Creates a personalized message with multiple details.
     * This demonstrates complex method logic and multiple parameters.
     * 
     * @param name the person's name
     * @param age the person's age
     * @param occupation the person's occupation
     * @return a formatted personalized message string
     */
    public static String createPersonalizedMessage(String name, int age, String occupation) {
        return "Hello " + name + "! You are " + age + " years old and work as a " + occupation + ".";
    }
    
    /**
     * Demonstrates a method that performs calculations and returns a result.
     * This shows how methods can encapsulate complex logic.
     * 
     * @param a the first number
     * @param b the second number
     * @return the sum of the two numbers as a formatted string
     */
    public static String calculateSum(int a, int b) {
        int result = a + b;
        return "The sum of " + a + " and " + b + " is " + result;
    }
    
    /**
     * Demonstrates a method that returns a boolean value.
     * This shows different return types and conditional logic.
     * 
     * @param age the age to check
     * @return true if the age is 18 or older, false otherwise
     */
    public static boolean isAdult(int age) {
        return age >= 18;
    }
}
