package interfaces;

public class IntAapp {
    public static void callAll(IntA obj) {
        obj.collect(1);
        obj.run(2);
        obj.analysis(3);

        // IntA arayüzü içinde tanımlı olmadığı için, instanceof kontrolü ile
        // sınıfa özgü metotun çağrılması


        if (obj instanceof X) {
            ((X) obj).xl();
        } else if (obj instanceof Y) {
            ((Y) obj).yl();
        } else if (obj instanceof Z) {
            ((Z) obj).zl();
        }
    }

    public static void main(String[] args) {
        X xObject = new X();
        Y yObject = new Y();
        Z zObject = new Z();

        callAll(xObject);
        System.out.println("------------------");
        callAll(yObject);
        System.out.println("------------------");
        callAll(zObject);
    }
}

   // Hangi sınıftan üretilmiş nesne gelirse sırasıyla collect, run ve analysis metotlarını ve hangi sınıftan türetildiyse bu nesne
   //     metodunu da çağıran bir statik callALL metodu yazınız.