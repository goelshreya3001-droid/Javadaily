import java.util.Scanner;
import java.util.InputMismatchException;  

public class MultipleCatchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int result = a / b;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input! Please enter integers.");
        } catch (Exception e) {
            System.out.println("General Exception occurred.");
        } finally {
            System.out.println("Finally block executed.");
        }

        sc.close();
    }
}