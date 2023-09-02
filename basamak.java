import java.util.Scanner;

public class basamak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı girin: ");
        int num = input.nextInt();
        int tempnum = num;
        int sum = 0,remaind;

        while (tempnum != 0) {
             remaind = tempnum % 10;
            sum += remaind;
            tempnum = tempnum / 10;
        }

        System.out.println("Rakamların toplamı: " + sum);
    }
}





