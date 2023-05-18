import java.util.Scanner;

public class ucgeninAlani {
    public static void main(String[] args) {
        int a, b, c, u;
        float alan;
        Scanner input = new Scanner(System.in);
        System.out.println("Kenarlardan a'yı giriniz:");
        a = input.nextInt();
        System.out.println("Kenarlardan b'yi giriniz:");
        b = input.nextInt();
        System.out.println("Kenarlardan c'yi giriniz:");
        c = input.nextInt();

        u = (a + b + c) / 2;

        alan = (float) Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgenin Alanı: " + alan);
    }
}