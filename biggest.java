import java.util.Scanner;

public class biggest {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("kaç sayı gireceksiniz ? ");
        int n= input.nextInt();
        int num,top=Integer.MIN_VALUE,min=Integer.MAX_VALUE;;
        for(int i =1;i<=n;i++){
            num=input.nextInt();

            if(num>=top)
                top=num;

            if(num<=min)
                min=num;
        }

        System.out.println("en büyük sayı "+top);
        System.out.println("en küçük sayı "+min);
    }
}
