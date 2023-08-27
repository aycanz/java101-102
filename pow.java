import java.util.Scanner;

public class pow {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("üs sayi:");
        int n= input.nextInt();
        System.out.println("taban sayi:");
        int r= input.nextInt();
        int total=1;
        for(int i=1;i<=n;i++){

             total *=r;

        }

        System.out.println(total);
    }
}

