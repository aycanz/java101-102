import java.util.Scanner;

public class Siralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("3 sayı giriniz");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a < b && b < c) {
            System.out.println("a < b < c");
        } else if (a < c && c < b) {
            System.out.println("a < c < b");
        } else if (b < a && a < c) {
            System.out.println("b < a < c");
        } else if (b < c && c < a) {
            System.out.println("b < c < a");
        } else if (c < a && a < b) {
            System.out.println("c < a < b");
        } else {
            System.out.println("c < b < a");
        }

        input.close();
    }
}
5