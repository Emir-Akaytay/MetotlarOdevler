import java.util.Scanner;
public class RecursiveFibonacci {
    static int fibonacci(int number) {
        if (number == 0 ) {
            return 0;
        }
        if (number == 1 || number == 2) {
            return 1;
        }
        return fibonacci(number - 2) + fibonacci(number - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç Sayılık Bir Fibonacci Serisi İstiyorsunuz ? : ");
        int number = input.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}