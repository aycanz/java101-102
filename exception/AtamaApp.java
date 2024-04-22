package Hata;

public class AtamaApp  {
    public static void main(String[] args) {
        Atamamethodu a1= new Atamamethodu();

        try {
            a1.diziyeAta(0,3);
            a1.diziyeAta(2,2);

        } catch (AtamaHatasi e) {
            System.out.println(e.getMessage());
         }

    }
}
