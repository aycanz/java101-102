import java.util.Scanner;

public class tempature {
    public static void main(String[] args) {
       /* Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.*/

        System.out.println("sıcaklık değerini giriniz:");

        Scanner input= new Scanner(System.in);
        int heat= input.nextInt();

        if(heat<5){

            System.out.println("kayak yapabilirsiniz");

        } else if (heat>=5 && heat<15) {

            System.out.println("sinemaya gidebilirsiniz");

        } else if (heat>=15&& heat<25) {

            System.out.println("pikniğe gidebilirsiniz");
        }
        else {
            System.out.println("So hot babe, yüzmeye git.");
        }
    }
}
