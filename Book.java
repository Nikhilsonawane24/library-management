package objectarray;
// get package
public class Book {
    private int BookId;
    private String BookName;
    private String AuthorName;
    private  int prize;

    public int getBookId() //method
    {
        return BookId;
    }
     public void BookId(int bookId){

        BookId = bookId ;
    }
    public String BookName(){
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public void setAuthorName(String authorName) {
        AuthorName = authorName;
    }

    public double getPrize() {
        return getPrize();
    }


    public void setPrize(double prize) {
        prize = prize;
    }
    Book(int BookId,String BookName,String AuthorName,int prize){
        this.BookId = BookId;
        this.BookName = BookName;
        this.AuthorName = AuthorName;
        this.prize = prize;
    }
    @Override
    public String toString(){
        return "Book[BookId=" + BookId  + ",BookName="+ BookName +",AuthorName="+ AuthorName+",prize="+ prize+"]";
    }
}
