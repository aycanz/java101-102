package kalitim;

public abstract class Akademisyen extends Calisan {

    private String bolum;
    private String unvan;
    public Akademisyen(String ad, String tel, String eposta,String bolum,String unvan) {
        super(ad, tel, eposta);
        this.bolum=bolum;
        this.unvan=unvan;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public void  ders(){
        System.out.println(this.getAd()+" derse girdi.");
    }
    @Override
    public abstract void yemekhane();
    /*{
        System.out.println(this.unvan+" yemekhaneye girdi"); //metodun bodysi olamaz
    }*/

    public abstract void ay();
}
