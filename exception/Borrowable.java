package Hata;

public interface Borrowable {
    void borrowBook (int yil);
    void returnBook();
   default String overdueeNotification(){
       return "“Kitap geç iade edildi. Ceza uygulanacak!";
   }
}
