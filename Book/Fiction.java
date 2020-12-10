package technoStudy.proje10.Book;

public class Fiction extends Books{

    public enum FictionBookKinds {
        WORLD_CLASSICS, NOVELS, LITERATURE, EARLY_AGE,GENERAL,
    }

    public Fiction(String bookname, String authorname, int bookID) {
        super(bookname, authorname, bookID);
    }


}



