import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {

        System.out.println("Yapmak istediğiniz işlemi seçiniz.");
        System.out.println("1-Toplama \n 2-Çıkarma \n 3-Çaprma \n 4-Bölme ");
        Scanner input = new Scanner(System.in);
        int select = input.nextInt();

        switch (select){
            case 1:

                System.out.println("toplamak istediğiniz 2 sayı girin");
                int a = input.nextInt();
                int b= input.nextInt();

                System.out.println( a +"+" + b+"="+(a+b));

            case 2:

                System.out.println("çıkarmak istediğiniz 2 sayı girin");
                int c = input.nextInt();
                int d= input.nextInt();

                System.out.println( c +"-" + d+"="+( c-d));

            case 3:
                System.out.println("çarpmak istediğiniz 2 sayı girin");
                int g = input.nextInt();
                int h= input.nextInt();

                System.out.println( g +"*" + h+"="+( g*h));


            case 4:
                System.out.println("bölmek istediğiniz 2 sayı girin");
                int e = input.nextInt();
                int f= input.nextInt();

                System.out.println( e +"/" + f+"="+( e/f));

        }


    }
}
