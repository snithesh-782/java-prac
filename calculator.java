
import java.util.Scanner;

class Calculator {

    int a, b;

    // Instance method for addition
    void add() {
        System.out.println("Addition = " + (a + b));
    }

    // Instance method for subtraction
    void subtract() {
        System.out.println("Subtraction = " + (a - b));
    }

    // Instance method for multiplication
    void multiply() {
        System.out.println("Multiplication = " + (a * b));
    }

    // Instance method for division
    void divide() {
        System.out.println("Division = " + (a / b));
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Calculator obj = new Calculator();

        System.out.print("Enter first number: ");
        obj.a = sc.nextInt();

        System.out.print("Enter second number: ");
        obj.b = sc.nextInt();

        obj.add();
        obj.subtract();
        obj.multiply();
        obj.divide();

        sc.close();
    }
}
