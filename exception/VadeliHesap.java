package Hata;

public class VadeliHesap extends BankaHesabi{
    public double faizOrani;

    public VadeliHesap(String hesapno, double bakiye, double faizOrani ) {
        super(hesapno, bakiye);
        this.faizOrani = faizOrani;
    }

    @Override
    public void parayatir(double miktar)throws BankaException {
        if(miktar<=0){
            throw new BankaException("geçersiz tutar");

        }
        bakiye += miktar;
        System.out.println("Para yatırıldı. Yeni bakiye: " + bakiye);
    }

    @Override
    public void paraCek(double miktar) throws BankaException{
        throw new BankaException("Vadeli hesaptan para çekilemez");


    }

    @Override
    public String hesapBilgileri() {
        return " Vadeli Hesap - Hesap Numarası: " + hesapno + ", Bakiye: " + bakiye + ", Faiz Oranı: " + faizOrani;
    }
}
