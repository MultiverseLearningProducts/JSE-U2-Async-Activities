/**
 * SimpleCalculator class demonstrates arithmetic operators and type casting in Java.
 * This class showcases how Java handles calculations with different number types
 * and the importance of understanding data type interactions.
 * 
 * @author Student Developer
 * @version 1.0.0
 */
public class SimpleCalculator {
    
    /**
     * Main method - demonstrates arithmetic operations and type casting.
     * This method shows the difference between integer and floating-point division.
     * 
     * @param args command line arguments (not used in this example)
     */
    public static void main(String[] args) {
        // Declare and initialize two integer variables
        int num1 = 15;
        int num2 = 4;
        
        System.out.println("=== Simple Calculator ===");
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println();
        
        // Calculate and print sum
        int sum = num1 + num2;
        System.out.println("Sum: " + num1 + " + " + num2 + " = " + sum);
        
        // Calculate and print product
        int product = num1 * num2;
        System.out.println("Product: " + num1 + " * " + num2 + " = " + product);
        
        // Calculate and print difference
        int difference = num1 - num2;
        System.out.println("Difference: " + num1 + " - " + num2 + " = " + difference);
        
        System.out.println();
        
        // Integer division (truncates the decimal part)
        int integerDivision = num1 / num2;
        System.out.println("Integer Division: " + num1 + " / " + num2 + " = " + integerDivision);
        System.out.println("Notice: The decimal part is truncated in integer division!");
        
        // Type casting: cast num1 to double before dividing
        double doubleDivision = (double) num1 / num2;
        System.out.println("Double Division: (double) " + num1 + " / " + num2 + " = " + doubleDivision);
        System.out.println("Notice: Type casting preserves the decimal precision!");
        
        System.out.println();
        System.out.println("=== Key Learning Points ===");
        System.out.println("1. Integer division truncates the decimal part");
        System.out.println("2. Type casting (double) converts int to double");
        System.out.println("3. Mixed-type operations promote to the higher precision type");
        System.out.println("4. Understanding data types prevents calculation errors");
        
        // Additional demonstrations
        System.out.println();
        System.out.println("=== Additional Examples ===");
        
        // Modulus operator (remainder)
        int remainder = num1 % num2;
        System.out.println("Remainder: " + num1 + " % " + num2 + " = " + remainder);
        
        // Mixed arithmetic with different types
        double mixedResult = num1 + 3.5;
        System.out.println("Mixed types: " + num1 + " + 3.5 = " + mixedResult);
        
        // Explicit casting examples
        System.out.println();
        System.out.println("=== Type Casting Examples ===");
        System.out.println("num1 as int: " + num1);
        System.out.println("num1 as double: " + (double) num1);
        System.out.println("num1 as float: " + (float) num1);
        System.out.println("num1 as long: " + (long) num1);
    }
}
