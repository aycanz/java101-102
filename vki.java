import java.util.Scanner;
public class vki {
    public static void main(String[] args) {
             int weight;
        double height,index ;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen kilonuzu giriniz:");
        weight= input.nextInt();

        System.out.print("Lütfen boyunuzu giriniz(m): ");
        height= input.nextDouble();


        index = (weight)/(height*height);

        System.out.println("vücut kitle indexiniz :"+index);



    }
}
