package technoStudy.proje10;

import technoStudy.proje10.Book.Books;
import technoStudy.proje10.Book.Fiction;
import technoStudy.proje10.Book.Non_Fiction;
import technoStudy.proje10.Book.Reference;
import technoStudy.proje10.User.Librarian;
import technoStudy.proje10.User.Student;
import technoStudy.proje10.User.Teacher;
import technoStudy.proje10.User.User;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LibraryData {

    private static LinkedHashMap<Integer,Books> bookhash=new LinkedHashMap<>();
    private static LinkedHashMap<Integer,User> userhash=new LinkedHashMap<>();
    public static HashMap<Integer, Books> getBookhash() {
        return bookhash;
    }
    public static HashMap<Integer, User> getUserhash() {
        return userhash;
    }

    static  {
      Newuser(new Librarian("Librarianuser1","Lfirst",1001));
      Newuser(new Librarian("Librarianuser2","Lsecond",1002));
      Newuser(new Librarian("Librarianuser3","Lthird",1003));
      Newuser(new Librarian("Librarianuser4","Lforth",1004));

      Newuser(new Teacher("Teacheruser1","Tfirst",2002));
      Newuser(new Teacher("Teacheruser2","Tsecond",2003));
      Newuser(new Teacher("Teacheruser3","Tthird",2004));
      Newuser(new Teacher("Teacheruser4","Tforth",2005));

      Newuser(new Student("Studentuser1","Sfirst",3003));
      Newuser(new Student("Studentuser2","Ssecond",3004));
      Newuser(new Student("Studentuser3","Sthird",3005));
      Newuser(new Student("Studentuser4","Sforth",3006));


      Newbook(new Fiction("Fictionbook1","fict.first",10001));
      Newbook(new Fiction("Fictionbook2","fict.second",10002));
      Newbook(new Fiction("Fictionbook3","fict.third",10003));
      Newbook(new Fiction("Fictionbook4","fict.forth",10004));

      Newbook(new Non_Fiction("Non-fictionbook1","non-fict.first",20002));
      Newbook(new Non_Fiction("Non-fictionbook2","non-fict.second",20003));
      Newbook(new Non_Fiction("Non-fictionbook3","non-fict.third",20004));
      Newbook(new Non_Fiction("Non-fictionbook4","non-fict.forth",20005));

      Newbook(new Reference("Referancebook1","ref.auth",90009));
      Newbook(new Reference("Referancebook2","ref.auth",90010));

    }

    public static void Newuser(User user) {
        userhash.put(user.getUserID(),user);
    }
    public static void Newbook(Books book) {
        bookhash.put(book.getBookID(),book);
    }
}