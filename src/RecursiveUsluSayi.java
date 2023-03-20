import java.util.Scanner;
public class RecursiveUsluSayi {
    static int power(int n,int k) {

        if (n == 1 || k == 0) {
            return 1;
        }
        return n * power(n,k - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.print("Tabanı Giriniz : ");
        a = input.nextInt();
        System.out.print("Üssü Giriniz : ");
        b = input.nextInt();
        System.out.println( "SONUÇ : "+power(a,b));
    }
}