import java.util.Scanner;

public class ebobEKOK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = scanner.nextInt();

        int ebob = 1;
        int ekok = 1;
        int minSayi = Math.min(sayi1, sayi2);
        int i = 2;

        while (i <= minSayi) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
                sayi1 /= i;
                sayi2 /= i;
            } else {
                i++;
            }
        }

        ekok = sayi1 * sayi2 *ebob;

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }
}