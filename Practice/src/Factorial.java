import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter Number: ");

        int num = reader.nextInt();
        long factorial = 1;

        for (int i = 1; i<=num; i++)
        {
            factorial *=i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}
