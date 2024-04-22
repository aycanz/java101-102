package Hata;

public class Atamamethodu {
    int [] dizi =new int[10];

    public void diziyeAta(int index, int deger)throws AtamaHatasi {
        if(index==deger){
            throw new AtamaHatasi("!!!!!");

        }
        else{
            dizi[index]=deger;

            System.out.println(dizi[index]);
        }
    }
}
