package kalitim;

public class CalisanApp {
    public static void main(String[] args) {

        Calisan c1= new Calisan("zeliha","526","dhg");


        System.out.println(c1.getAd()+c1.getTel());

        c1.yemekhane();
        Calisan[] calisanlar = new Calisan[1]; // Burada bir Calisan dizisi oluşturuyoruz
        calisanlar[0] = new Calisan("aycan","d","s"); // Calisan sınıfından bir örnek oluşturuyoruz

        Calisan.girisyapanlar(calisanlar);
        Ogretimg o1= new Ogretimg("A0","56","SŞDSŞ","OG","LDSK");

        o1.yemekhane();
       // Akademisyen a1=new Akademisyen("aycan ","052,","ksld","mat","çöm");
      //  a1.yemekhane();
       // a1.ders();

//POLYMORPHISM
       /* Calisan a2= new Akademisyen("beyhude","052,","ksld","mat","çöm");
        a2.yemekhane();
        System.out.println(a2.getAd());

        ///
        // int[] girisyapanlar =new int [5]

        //Akademisyen [] giris ={c1,a1}; olmaaaz

        Calisan[] girisyapanlar = {c1,a1};//olur

        Calisan.girisyapanlar(girisyapanlar);*/

    }
}
