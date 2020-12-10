package technoStudy.proje10.Book;
/* Each book has a name, a author, a five-digit bookId and
   a status(checkedIn or not)
   It may have more identifiers if needed.
   bookIds cannot be the the same as any other book's
   There are three types of books: Fiction, Non-Fiction and Reference*/

public abstract class Books {
    private String Bookname;
    private String Authorname;

    private int BookID;

    public void setBookname(String bookname) {
        this.Bookname = bookname;
    }

    public void setAuthorname(String authorname) {
        this.Authorname = authorname;
    }

    public void setBookID(int bookID) {
        this.BookID = bookID;
    }

    public Books(String bookname, String authorname, int bookID) {
        this.Bookname = bookname;
        this.Authorname = authorname;
        this.BookID = bookID;
    }

    @Override
    public String toString() {
        return "Books informations:"
                +"\n"+  "Book name: " + Bookname
                +"\n"+ "Author name: " + Authorname
                +"\n"+ "Book ID number: " + BookID;
    }

    public String getBookname() {
        return Bookname;
    }

    public String getAuthorname() {
        return Authorname;
    }

    public int getBookID() {
        return BookID;
    }
}
