package Hata;

public class AtamaHatasi extends Exception{
    public AtamaHatasi(String message) {
        super(message);
        System.out.println("atama hatasi oluştu");
    }
}
