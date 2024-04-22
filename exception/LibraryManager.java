package Hata;

public class LibraryManager {

    private int maxBorrowYears=3;
    private  static int numBooks=1;
  private   Book [] books =new Book[5];

    public LibraryManager() {
        this.maxBorrowYears = maxBorrowYears;
        this.books = books;
    }

    public void addBook(Book book){

        if(numBooks<books.length){
            books[numBooks++] = book;
            System.out.println("eklendi");
        }
        else {
            System.out.println("maksa ulaştı");
        }

    }
    public void listBooks() {
        System.out.println("kitaplar:");
        for (Book book /*i*/ :books  ){
            if (book!=null){
                String status = (book.isBookBorrowed() != false) ? "Ödünçte" : "Kütüphanede";
                System.out.println(book.getTitle() + " - Durum: " + status);
            }
            }
        }

        public void BarrowBook(Book kitap,int yil) throws LateReturnException{
        if(kitap.isBookBorrowed()!=false){
            throw new LateReturnException("kitap zaten alınmış");
        }
        else{
            kitap.borrowBook(yil);
            System.out.println(kitap.getTitle()+"ödünç alındı");

        }
        }
    public void returnBook(Book book) throws LateReturnException {
        if (book.isBookBorrowed() == false) {
            System.out.println("Kitap zaten kütüphanede.");
        } else {
            if ((2024 - book.borrowDate) > maxBorrowYears) {
                throw new LateReturnException(book.overdueNotification());
            } else {
                book.returnBook();
                System.out.println("Kitap iade edildi: " + book.getTitle());
            }
        }
    }
    }

