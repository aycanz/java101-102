package Hata;

public class KutuphaneApp {

    public static void main(String[] args) {
        try {
            // 6 adet farklı Book nesnesi oluşturuluyor
            Book book1 = new Book("Java Programming", "q", "a", "12");
            Book book2 = new Book("Python Basics", "q", "a", "12");
            Book book3 = new Book("Data Structures", "q", "a", "12");
            Book book4 = new Book("Algorithm Design", "q", "a", "12");
            Book book5 = new Book("Web Development", "q", "a", "12");
            Book book6 = new Book("Database Management", "q", "a", "12");

            // LibraryManager nesnesi oluşturuluyor
            LibraryManager library = new LibraryManager( );

            // Kitaplar kütüphaneye ekleniyor
            library.addBook(book1);
            library.addBook(book2);
            library.addBook(book3);
            library.addBook(book4);
            library.addBook(book5);
            library.addBook(book6); // Maksimum kitap sayısına ulaşıldığı için uyarı mesajı verilecek

            // Kütüphanede bulunan kitaplar listeleniyor
            library.listBooks();

            // Kitap ödünç alma ve iade işlemleri gerçekleştiriliyor
            try {
                library.BarrowBook(book4, 2023); // 4. kitap ödünç alınıyor
            } catch (LateReturnException ex) {
                throw new RuntimeException(ex);
            }
            try {
                library.BarrowBook(book1, 2023); // 1. kitap ödünç alınıyor
            } catch (LateReturnException ex) {
                throw new RuntimeException(ex);
            }

            // Kütüphanede bulunan kitaplar listeleniyor (Kütüphanede olan ve ödünç alınan kitaplar belirtilmiş olmalıdır)
            library.listBooks();

        } catch (Exception e) {
            System.out.println("Beklenmeyen bir hata oluştu: " + e.getMessage());
        }

    }
}

