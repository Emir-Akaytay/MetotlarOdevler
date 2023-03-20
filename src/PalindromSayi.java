import java.util.Scanner;
public class PalindromSayi {

    static boolean isPolindrom(int number) {
        int tempNumber , reverseNumber = 0 , lastDigit;
        tempNumber = number ;
        while(0 != tempNumber) {
            lastDigit = tempNumber % 10 ;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            tempNumber /= 10 ;
        }
        return reverseNumber == number;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int a = input.nextInt();

        if(isPolindrom(a)){
            System.out.println(a+" Bir Polindrom Sayıdır !!!");
        } else {
            System.out.println(a+" Bir Polindrom Sayı Değildir !!!");
        }
    }
}
