package interfaces;

public class databaseApp {
    public static void main(String[] args) {

   //     Idatabase da= new Idatabase() ; BU OLMAZ

        Idatabase idatabase1= new Customer(); //olur

        Customer c1=new Customer();
        Students s1 =new Students();
        s1.log();
        c1.log();
    }
}
