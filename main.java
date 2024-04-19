import java.util.Scanner;

public class calculator {
    
    public static double num1, num2, result;
    
    public static void main(String[] args) {
        Scanner num_input = new Scanner(System.in); // creates Scanner object to collect user input
        System.out.println("Simple Calculator V1.0");
        System.out.println("Enter your first number:");
        num1 = num_input.nextFloat();
        System.out.println("Enter your second number:");
        num2 = num_input.nextFloat();
        menu(); // calls menu method for the user to pick which operation they want performed
    }
    
    public static void menu() {
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("Enter the operation you would like to perform: ");
        Scanner input = new Scanner(System.in); // creates Scanner object to collect user input
        int menu_input = input.nextInt();
        switch (menu_input) {
            case 1:
                add(num1, num2);
                break;
            case 2:
                subtract(num1, num2);
                break;
        }
    }
    
    public static void add(double x, double y) {
        result = x + y;
        System.out.print("Answer: ");
        System.out.print(result);
    }
    
    public static void subtract(double x, double y) {
        result = x - y;
        System.out.print("Answer: ");
        System.out.print(result);
    }
    
    public static void multiply(double x, double y) {
        result = x * y;
        System.out.print("Answer: ");
        System.out.print(result);
    }
    
    public static void Divide(double x, double y) {
        result = x / y;
        System.out.print("Answer: ");
        System.out.print(result);
    }
    
}