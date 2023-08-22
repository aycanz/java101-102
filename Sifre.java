import java.util.Scanner;

public class Sifre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String correctPassword = "dog123";

        System.out.print("Şifrenizi giriniz: ");
        String enteredPassword = input.next();

        if (!enteredPassword.equals(correctPassword)) {
            System.out.print("Şifrenizi sıfırlamak ister misiniz? (evet/hayır): ");
            String resetChoice = input.next();

            if (resetChoice.equalsIgnoreCase("evet")) {
                System.out.print("Yeni şifrenizi giriniz: ");
                String newPassword = input.next();

                if (!newPassword.equals(correctPassword) && !newPassword.equals(enteredPassword)) {
                    System.out.println("Şifre oluşturuldu.");
                } else {
                    System.out.println("Şifre oluşturulamadı, lütfen başka bir şifre giriniz.");
                    String newPasswordNew = input.next();
                    System.out.println("Şifre oluşturuldu.");
                }
            } else {
                System.out.println("İşlem iptal edildi.");
            }
        }


    }
}
