import java.util.Scanner;

public class basiccalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to enter two numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        // Ask the user to choose an operation
        System.out.println("Choose an operation: +, -, *, /");
        char operation = scanner.next().charAt(0);
        
        double result;
        
        // Perform the chosen operation
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2!= 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation!");
                return;
        }
        
        // Display the result
        System.out.println("The result is: " + result);
        
        // Close the scanner
        scanner.close();
    }
}