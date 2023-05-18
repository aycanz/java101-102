import java.util.Scanner ;
public class kdvhesap {
    public static void main(String[] args){
        double tutar,kdvliTutar,kdv;
        Scanner input= new Scanner(System.in);
        System.out.print("Tutarı giriniz :");
        tutar= input.nextDouble();

        kdv = tutar<= 1000 ? 0.18 : 0.08;
                kdvliTutar = tutar +(tutar*kdv);
        System.out.println(" Tutarın kdv tutarı:" + kdv);
        System.out.println("kdv dahil tutarı :" + kdvliTutar );

    }
}
