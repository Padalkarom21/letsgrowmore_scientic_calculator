 import java.util.Scanner;

class scical {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2;
        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        System.out.println("Select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Sin");
        System.out.println("6. Cos");
        System.out.println("7. Tan");
        System.out.println("8. Logarithm (base 10)");
        System.out.println("9. Natural Logarithm (ln)");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        double result = 0.0;

        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                result = num1 / num2;
                break;
            case 5:
                result = Math.sin(num1);
                break;
            case 6:
                result = Math.cos(num1);
                break;
            case 7:
                result = Math.tan(num1);
                break;
            case 8:
                result = Math.log10(num1);
                break;
            case 9:
                result = Math.log(num1);
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.println("Result: " + result);
    }
}
