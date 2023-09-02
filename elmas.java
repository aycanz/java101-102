import java.util.Scanner;

public class elmas {
    public static void main(String[] args) {

           Scanner input= new Scanner(System.in);
            System.out.println("bir n sayısı girin");
            int num= input.nextInt();

        for (int i = 1; i <= num; i++) {
            // Boşlukları yazdırın
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }

            // Yıldızları yazdırın
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = num - 1; i >= 1; i--) {
            // Boşlukları yazdırın
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }

            // Yıldızları yazdırın
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println(); // Yeni satıra geçin
        }


        }
}

/* * 1    2
  *** 2
 ***** 3      0
  ***  2 1          3
   *  1   2           1
   *      i boş      2i-1 yıldız
 */