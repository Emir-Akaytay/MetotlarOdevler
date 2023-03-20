import java.util.Scanner;
public class GelismisHesapMakinesi {
    static void plus() {
        int choose;
        do {
            Scanner input = new Scanner(System.in);
            double number , result = 0 ;
            int howMany;
            System.out.print("Kaç Adet Sayı Gireceksiniz ? : ");
            howMany = input.nextInt();
            for(int i = 1 ; i <= howMany ; i++ ) {
                System.out.print(i+". Sayıyı Giriniz : ");
                number = input.nextDouble();
                result += number;
            }
            System.out.println("Sonuç : "+result);
            System.out.print("\nToplama İşlemi Yapmaya Devam Etmek İstiyor Musunuz ? Evet:1  Hayır:0 =====> ");
            choose = input.nextInt();
        } while (choose == 1);
    }
    static void minus() {
        int choose;
        do {
            Scanner input = new Scanner(System.in);
            double number1 , number2 , result1 = 0 , realResult;
            int howMany ;
            System.out.print("Çıkarma İşlemi Uygulayacağınız Sayıyı Yazınız : ");
            number1 = input.nextDouble();
            System.out.print("Kaç Adet Sayı Çıkaracaksınız ? : ");
            howMany = input.nextInt();
            for (int i = 1 ; i <= howMany ; i++) {
                System.out.print(i+". Sayıyı Giriniz : ");
                number2 = input.nextDouble();
                result1 += number2;
            }
            realResult = number1 - result1 ;
            System.out.println("Sonuç : "+realResult);
            System.out.print("\nÇıkarma İşlemi Yapmaya Devam Etmek İstiyor Musunuz ? Evet:1  Hayır:0 =====> ");
            choose = input.nextInt();
        } while (choose == 1);
    }
    static void times() {
        int choose;
        do {
            Scanner input = new Scanner(System.in);
            double number, result = 1;
            int howMany;
            System.out.print("Kaç Adet Sayı Gireceksiniz ? : ");
            howMany = input.nextInt();
            for (int i = 1; i <= howMany; i++) {
                System.out.print(i + ". Sayıyı Giriniz : ");
                number = input.nextDouble();
                result *= number;
            }
            System.out.println("Sonuç : " + result);
            System.out.print("\nÇarpma İşlemi Yapmaya Devam Etmek İstiyor Musunuz ? Evet:1  Hayır:0 =====> ");
            choose = input.nextInt();
        }while(choose == 1);
    }
    static void divide() {
        int choose = 1;
        do {
            Scanner input = new Scanner(System.in);
            double number1, number2, result, remainder;
            System.out.print("\nBölünecek Sayıyı Yazınız : ");
            number1 = input.nextDouble();
            System.out.print("Bölen Sayıyı Yazınız : ");
            number2 = input.nextDouble();
            if (number2 == 0) {
                System.out.println("0'a Bölüm Belirsizliği !!! Lütfen Bölen'e Başka Sayı Giriniz !!!");
                continue;
            }
            result = number1 / number2;
            remainder = number1 % number2;
            System.out.println("Sonuç : " + result);
            System.out.println("Kalan : " + remainder);
            System.out.print("\nBölme İşlemi Yapmaya Devam Etmek İstiyor Musunuz ? Evet:1  Hayır:0 =====> ");
            choose = input.nextInt();
        } while (choose == 1);
    }
    static void power() {
        int choose;
        do {

            Scanner input = new Scanner(System.in);
            int total = 1, n, k, i = 1;
            System.out.print("Tabanı Giriniz: ");
            n = input.nextInt();
            System.out.print("Üssü Giriniz: ");
            k = input.nextInt();

            if (0 < n && 0 < k) {
                while (i <= k) {
                    total *= n;
                    i++;
                }
                System.out.println("Sonuç: " + total);

            } else if (0 < n && k < 0) {
                while (k <= i - 2) {
                    total *= n;
                    k++;
                }
                System.out.println("Sonuç: 1/" + total);

            } else if (n < 0 && 0 < k) {
                if (k % 2 != 0) {
                    while (i <= k) {
                        total *= -n;
                        i++;
                    }
                    System.out.print("Sonuç: -" + total);
                } else {
                    while (i <= k) {
                        total *= -n;
                        i++;
                    }
                    System.out.println("Sonuç: " + total);
                }
            } else if (n < 0 && k < 0) {
                if (k % 2 != 0) {
                    while (k <= i - 2) {
                        total *= -n;
                        k++;
                    }
                    System.out.print("Sonuç: -1/" + total);
                } else {
                    while (k <= i - 2) {
                        total *= -n;
                        k++;
                    }
                    System.out.print("Sonuç: 1/" + total);
                }

            } else if (0 == n) {
                System.out.print("Sonuç: "+1);
            }
            System.out.print("\nÜs Alma İşlemi Yapmaya Devam Etmek İstiyor Musunuz ? Evet:1  Hayır:0 =====> ");
            choose = input.nextInt();
        } while (choose == 1);
    }
    static void factorial() {
        int choose;
        do {
            Scanner input = new Scanner(System.in);
            int n,result = 1 ;
            System.out.print("Sayı Giriniz : ");
            n = input.nextInt();
            if (n == 0) {
                System.out.println("Sonuç : "+1);
            } else if (0 < n) {
                for (int i = 1; i <= n; n--) {
                    result *= n;
                }
                System.out.println("Sonuç : "+result);
            } else {
                System.out.println("Hatalı Giriş Yaptınız !!!");
            }
            System.out.print("\nFaktöriyel İşlemi Yapmaya Devam Etmek İstiyor Musunuz ? Evet:1  Hayır:0 =====> ");
            choose = input.nextInt();
        } while (choose == 1);
    }
    static void modding() {
        int choose;
        do {
            Scanner input = new Scanner(System.in);
            double n1 , n2 , result;
            System.out.print("Bölünen : ");
            n1 = input.nextDouble();
            System.out.print("Bölen : ");
            n2 = input.nextDouble();
            result = n1 % n2 ;
            System.out.println("Mod : "+result);
            System.out.print("\nMod Alma İşlemi Yapmaya Devam Etmek İstiyor Musunuz ? Evet:1  Hayır:0 =====> ");
            choose = input.nextInt();
        } while (choose == 1);
    }
    static void rectangle() {
        int choose = 1;
        do {
            Scanner input = new Scanner(System.in);
            double n1 , n2, area , circumference;
            System.out.print("Kısa Kenarı Giriniz : ");
            n1 = input.nextDouble();
            System.out.print("Uzun Kenarı Giriniz : ");
            n2 = input.nextDouble();
            if (n1 < 0  || n2 < 0) {
                System.out.println("Hatalı Giriş Yaptınız !!! Lütfen Negatif Sayı Girmeyiniz !!!");
                continue;
            }
            area = n1 * n2;
            circumference = 2 * (n1 + n2);
            System.out.println("Çevre : "+circumference);
            System.out.println("Alan : "+area);
            System.out.print("\nDikdörtgen İşlemi Yapmaya Devam Etmek İstiyor Musunuz ? Evet:1  Hayır:0 =====> ");
            choose = input.nextInt();
        } while (choose == 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String menu = """
                1- Toplama İşlemi
                2- Çıkarma İşlemi
                3- Çarpma İşlemi
                4- Bölme işlemi
                5- Üslü Sayı Hesaplama
                6- Faktoriyel Hesaplama
                7- Mod Alma
                8- Dikdörtgen Alan ve Çevre Hesabı
                0- Çıkış Yap""";

        int choose;
        do {
            System.out.println(menu);
            System.out.print("\nSeçiminiz : ");
            choose = input.nextInt();
            switch (choose) {
                case 1 -> plus();
                case 2 -> minus();
                case 3 -> times();
                case 4 -> divide();
                case 5 -> power();
                case 6 -> factorial();
                case 7 -> modding();
                case 8 -> rectangle();
                default -> System.out.println("Lütfen İşlemlerden Birisini Seçiniz !!!");
            }
        }while(choose != 0);
        System.out.println("Çıkış Yapılıyor...");
    }
}
