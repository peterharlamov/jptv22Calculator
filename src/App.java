import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Test the calculator functions
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        String n1 = scanner.nextLine();
        System.out.println("Enter second number: ");
        String n2 = scanner.nextLine();
        double num1 = Double.parseDouble(n1);
        double num2 = Double.parseDouble(n2);

        double resultAdd = calculator.add(num1, num2);
        double resultSubtract = calculator.subtract(num1, num2);
        double resultMultiply = calculator.multiply(num1, num2);
        double resultDivide = calculator.divide(num1, num2);

        // Print the results
        System.out.println("Сложение: " + Math.round(resultAdd));
        System.out.println("Вычитание: " + Math.round(resultSubtract));
        System.out.println("Умножение: " + Math.round(resultMultiply));
        System.out.println("Деление: " + Math.round(resultDivide));
    }
}