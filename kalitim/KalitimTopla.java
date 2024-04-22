package kalitim;

public class KalitimTopla {
    public static void main(String[] args) {
        Aritmetik ar = new Adder();
     //   Adder adder = new Adder();
       // System.out.println("My superclass is: " + adder.getClass().getSuperclass().getName());
        //System.out.println(adder.ekle(42, 13) + " " + adder.ekle(13, 20));

        System.out.println(ar.ekle(42,13)+" "+ ar.ekle(54,6));
    }
}
