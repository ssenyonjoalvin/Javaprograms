import java.util.Scanner;

public class Caculator {
    public int add(int x, int y) {
        return x + y;
    }

    public int sub(int x, int y) {
        return x - y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public int divide(int x, int y) {
        if (y == 0) {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
        return x / y;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Caculator calc = new Caculator();
        
        System.out.println("Enter two numbers and the operation (+, -, *, /) to perform:");
        int x = scan.nextInt();
        int y = scan.nextInt();
        String operation = scan.next();

        switch (operation) {
            case "+":
                System.out.println("Result: " + calc.add(x, y));
                break;
            case "-":
                System.out.println("Result: " + calc.sub(x, y));
                break;
            case "*":
                System.out.println("Result: " + calc.multiply(x, y));
                break;
            case "/":
                System.out.println("Result: " + calc.divide(x, y));
                break;
            default:
                System.out.println("Invalid operation!");
        }
    }
}
