package kalitim;

public class Calisan {
    private String ad;
    private String tel;
    private String eposta;

    public Calisan(String ad, String tel, String eposta) {
        this.ad = ad;
        this.tel = tel;
        this.eposta = eposta;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }


    public void yemekhane(){
        System.out.println(this.ad+" yemekhaneye girdi");
    }

    public static void girisyapanlar( Calisan[] girisyapan){
        for(Calisan temp : girisyapan){
            temp.yemekhane();
        }
    }
}
