import java.util.Scanner;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}

public class RunApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        
        while (true) {
            System.out.println("Enter the first number: ");
            int number1 = scanner.nextInt();

            System.out.println("Enter the operator (+, -, * or q/Q to quit): ");
            char operator = scanner.next().charAt(0);

            if (operator == 'q' || operator == 'Q') {
                System.out.println("Exiting the calculator.");
                break;
            }

            System.out.println("Enter the second number: ");
            int number2 = scanner.nextInt();
            
            int result;
            switch (operator) {
                case '+':
                    result = calculator.add(number1, number2);
                    break;
                case '-':
                    result = calculator.subtract(number1, number2);
                    break;
                case '*':
                    result = calculator.multiply(number1, number2);
                    break;
                default:
                    System.out.println("Invalid operator.");
                    continue;
            }

            System.out.println("The result is: " + result);
        }

        scanner.close();
    }
}
