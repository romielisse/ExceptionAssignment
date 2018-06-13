import java.util.Scanner;

class Division {
    public static void main(String[] args) {

        int a, b, result;

        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Input two integers");

            a = input.nextInt();
            b = input.nextInt();

            result = a / b;

            System.out.println("Result = " + result);
        }
        catch(Exception e) {
            System.out.println("Cannot divide by zero.");
        }
        finally {

        }
    }
}