import java.util.Scanner;

public class solve {
    public static void main(String[] args) {


        int n, sum = 0, counter = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                counter++;
            }
        }

        if (counter > 0) {
            double average = (double) sum / counter;
            System.out.println("Girdiğiniz sayılardan 3 ve 4 ile bölünen sayıların ortalaması: " + average);
        } else {
            System.out.println("Girdiğiniz aralıkta 3 ve 4 ile bölünen sayı bulunmuyor.");
        }

        }
    }

