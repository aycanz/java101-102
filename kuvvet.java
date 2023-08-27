import java.util.Scanner;

public class kuvvet {
    public static void main(String[] args) {
        int n;

        System.out.println("sayi giriniz:");
        Scanner input=new Scanner(System.in);
        n= input.nextInt();
        for (int i =1;i<n;i*=4 ){
            System.out.println(i);
        }
        for (int i =1;i<n;i*=5 ){
            System.out.println(i);
        }

    }
}
