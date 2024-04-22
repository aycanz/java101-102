package Hata;

public class Book implements Borrowable {

   private String title;
    private  String author;
    private  String publisher;
    private  String publicationYear;
       int borrowDate =0;

    public Book(String title, String author, String publisher, String publicationYear) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(String publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public void borrowBook(int yil) {

        this.borrowDate = yil;
    }

    @Override
    public void returnBook() {

        borrowDate=0;
    }

  boolean  isBookBorrowed(){
        return borrowDate!=0 ;
    }


    public String overdueNotification() {
        return "hata";
    }
}
