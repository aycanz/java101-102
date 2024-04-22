package Hata;

public abstract class BankaHesabi implements BankaMusterisi {
    protected  String hesapno;
    protected double bakiye;

    public BankaHesabi(String hesapno, double bakiye) {
        this.hesapno = hesapno;
        this.bakiye = bakiye;
    }
    public abstract void parayatir(double miktar ) throws BankaException;
    public abstract void paraCek(double miktar)throws BankaException;
}
