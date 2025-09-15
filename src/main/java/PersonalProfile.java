/**
 * PersonalProfile class demonstrates the fundamental building blocks of a Java program.
 * This class showcases the anatomy of a Java class including the main method and variables.
 * 
 * @author Student Developer
 * @version 1.0.0
 */
public class PersonalProfile {
    
    /**
     * Main method - the entry point of the Java application.
     * This method demonstrates variable declaration, initialization, and console output.
     * 
     * @param args command line arguments (not used in this example)
     */
    public static void main(String[] args) {
        // Variable declarations and initialization
        String name = "Alex Johnson";           // String variable for name
        int age = 25;                           // int variable for age
        boolean isStudent = true;               // boolean variable for student status
        
        // Print each variable to the console
        System.out.println("=== Personal Profile ===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student: " + isStudent);
        System.out.println("========================");
        
        // Additional demonstration of variable usage
        System.out.println();
        System.out.println("Variable Details:");
        System.out.println("- Name is a String: " + name.getClass().getSimpleName());
        System.out.println("- Age is an int: " + ((Object)age).getClass().getSimpleName());
        System.out.println("- Student status is a boolean: " + ((Object)isStudent).getClass().getSimpleName());
    }
}
