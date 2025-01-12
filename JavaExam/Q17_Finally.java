import java.util.Scanner;

public class Q17_Finally {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number to divide 100: ");
            int num = scanner.nextInt();

            int result = 100 / num;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");

        } finally {
            System.out.println("Cleaning up resources...");
            scanner.close();
        }

        System.out.println("Program execution completed.");
    }
}
