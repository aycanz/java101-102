package Hata;

public class BankaApp {
    public static void main(String[] args) {

        try {
            VadeliHesap h1 = new VadeliHesap("112", 100,10);

            System.out.println(h1.hesapBilgileri());
            h1.parayatir(500);
            h1.paraCek(211);

        }
        catch (BankaException e) {
            throw new RuntimeException(e);
        }

    }
}
