import java.util.Scanner;

public class kombinasyon {
    public static void main(String[] args) {
        /*N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır.
         N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

Java ile kombinasyon hesaplayan program yazınız.

Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!)

*/
        Scanner input=new Scanner(System.in);

        int n= input.nextInt();
        int r= input.nextInt();
        int fak=1,fak2=1,fak3=1,result;

        for (int i=1;i<=n;i++){
            fak*=i;
        }
        for (int i=1;i<=r;i++){
            fak2*=i;
        }
        for (int i=1;i<=n-r;i++){
            fak3*=i;
        }
        result= fak/(fak2*fak3);
        System.out.println(result);
    }
}
