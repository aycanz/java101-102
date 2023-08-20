import java.util.Scanner;
public class daire {
     public static void main(String[] args) {
        int r, a;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz: ");
        r = input.nextInt();

        System.out.print("Daire diliminin açısını giriniz: ");
        a = input.nextInt();

        double alan = (pi * r * r * a) / 360;
        System.out.println("Daire diliminin alanı: " + alan);
    }

}
