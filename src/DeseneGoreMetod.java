import java.util.Scanner;
public class DeseneGoreMetod {
    static int pattern(int a,int b) {

        if(a > 0) {
            System.out.print(a+" ");
            a -= 5;
            return pattern(a,b);
        }
        return pattern2(a,b);
    }

    static int pattern2(int a,int b) {
        if (a <= b) {
            System.out.print(a + " ");
            a += 5;
            return pattern2(a, b);
        }
        return 1; // Buraya yazdığımız parametre ya da sayı bişey farketmez çünkü dönecek değerle işimiz yok.
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı Giriniz : ");
        int a = input.nextInt();
        pattern(a,a);
    }
}