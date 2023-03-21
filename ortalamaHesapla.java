import java.util.Scanner;
public class ortalamaHesapla {
    public static void main(String[] args) {
        int mat, fizik,turkce;
        Scanner inp = new Scanner(System.in);
        System.out.print("matematik notunuz: ");
        mat= inp.nextInt();

        System.out.print("fizik notunuz :");
        fizik= inp.nextInt();
        System.out.print("turkce notunuz: ");
        turkce=inp.nextInt();
           float toplam = mat+fizik +turkce ;
       float ortalama = toplam/3;
       System.out.println("ortalamanız:  " + ortalama );

        String sonuc= ortalama>60 ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız";
        System.out.println("durumunuz = " +sonuc);

    }
}
