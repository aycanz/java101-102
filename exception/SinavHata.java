package Hata;

public class SinavHata {

    public static void kontrol(int sayi) throws BinaryException{
        int basamak =sayi%10;
        if(basamak==0|| basamak==1){
            throw new BinaryException("0 ve 1 hatası");
        }
    }


    public static void main(String[] args) throws BinaryException{
        int sayi=101;

        try{
            kontrol(sayi);
        }
        catch (BinaryException e){
            System.out.println("Hata: " + e.getMessage());
        }
    }
}
