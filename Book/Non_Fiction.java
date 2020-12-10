package technoStudy.proje10.Book;
public class Non_Fiction extends Books{


    public Non_Fiction(String bookname, String authorname, int bookID) {
        super(bookname, authorname, bookID);
    }

    public enum NunFictionBookKinds {
        MATH, SCIENCE, SOCIAL, HISTORICAL,
    }

}
