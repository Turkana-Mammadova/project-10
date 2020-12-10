package technoStudy.proje10.User;
import technoStudy.proje10.Book.*;
import technoStudy.proje10.LibraryData;
import java.time.LocalDate;
import java.util.*;

public class Librarian extends User {

      static ArrayList<Integer> checkedOutBooks = new ArrayList<>();
      static LocalDate ld = LocalDate.now();
      static LocalDate duedate = ld.plusDays(30);

    public Librarian(String Name, String Lastname, int UserID) {
        super(Name, Lastname, UserID);
    }



     public static void selfcheckOut() {
         if (checkedOutBooks.size() >= 10) {
             System.out.println("Your book quanity limit is 10");
         } else {
             System.out.println("Which book do you wants to borrow? Pleace type book ID");
             Scanner scanner = new Scanner(System.in);
             int inputBookId = scanner.nextInt();
             while (checkedOutBooks.contains(inputBookId)) {
                 System.out.println("You already checked out your this book");
                 inputBookId = scanner.nextInt();
             }
             while (!LibraryData.getBookhash().containsKey(inputBookId)) {
                 System.out.println("Type valid Book ID , please: ");
                 inputBookId = scanner.nextInt();
             }
             while (inputBookId < 100000 && inputBookId > 90000) {
                 System.out.println("This is a reference book, and it cannot be checked out.Please,type valid Book ID");
                 inputBookId = scanner.nextInt();
             }
             if (inputBookId < 30000 && inputBookId > 10000) {
                 checkedOutBooks.add(inputBookId);
                 System.out.println("It has successfully checked out.");
                 System.out.println("Check out date: " + ld
                         + "\n" + "Due date: " + duedate
                         + "\n" + LibraryData.getBookhash().get(inputBookId));
             }
         }
     }
    public static void checkOut() {

       Scanner scanner = new Scanner(System.in);

        System.out.println("Book ID : ");
        int inputBookID=scanner.nextInt();
        while (!LibraryData.getBookhash().containsKey(inputBookID)) {
           System.out.println("Type valid Book ID , please: ");
           inputBookID = scanner.nextInt(); }
        while (inputBookID < 100000 && inputBookID > 90000) {
            System.out.println("This is a reference book, and it cannot be checked out.Please,type valid Book ID");
            inputBookID = scanner.nextInt();}
        System.out.println("User ID pleace: ");
        int inputUserID = scanner.nextInt();
        if(inputUserID>=1000 && inputUserID<2000)
        while  (!LibraryData.getUserhash().containsKey(inputUserID)) {
            System.out.println("This is not a registered student id. Please enter a valid userId.");
            inputUserID = scanner.nextInt();
        } if(LibraryData.getUserhash().containsKey(inputUserID)){
                checkedOutBooks.add(inputBookID);
                System.out.println("It has successfully checked out.");
                System.out.println("Check out date: " + ld
                        + "\n" + "Due date: " + duedate
                        + "\n" + LibraryData.getBookhash().get(inputBookID));

            }
        }


     public static void checkIn() {
         System.out.println("Book Id please: ");
         Scanner scanner = new Scanner(System.in);
         int inputBookIDforReturn = scanner.nextInt();
         if (!LibraryData.getBookhash().containsKey(inputBookIDforReturn) || !checkedOutBooks.contains(inputBookIDforReturn)) {

                 System.out.println("The Book ID is either invalid or belongs to a book which has not checked out.");
         }
         if (LibraryData.getBookhash().containsKey(inputBookIDforReturn) && checkedOutBooks.contains(inputBookIDforReturn)) {
             checkedOutBooks.remove(Integer.valueOf(inputBookIDforReturn));
             boolean isbeforeduedate = LocalDate.now().isBefore(duedate);
             if (isbeforeduedate) {
                 System.out.println("Thanks for returning it on time. Have a great day.");
             } else {
                 System.out.println("Thanks for returning. The due date was " + duedate + " Please do your best to return the books on time next time!");
                 }
         }


     }

     public static void newuser() {

         System.out.println("For who you wants to create account: " + "\n" + "1.Librarian" + "\n" + "2.Teacher" + "\n" + "3.Student");
         Scanner scanner = new Scanner(System.in);
         String newacc = scanner.nextLine();
         Random random = new Random();


         switch (newacc) {
             case "1":
                 int uidlibrarian = random.nextInt(1000) + 1000;
                 System.out.println("New user name");
                 String libnewname=scanner.nextLine();
                 System.out.println("New user last name");
                 String libnewlastn=scanner.nextLine();
                 Librarian librarian=new Librarian(libnewname,libnewlastn,uidlibrarian);
                 if (!LibraryData.getUserhash().containsKey(uidlibrarian)) {
                     LibraryData.Newuser(librarian);
                     System.out.println(LibraryData.getUserhash().get(uidlibrarian));
                 }else{
                     System.out.println("This user ID number assigned before");
                 }break;


             case "2":
                 int uidteacher = random.nextInt(1000) + 2000;
                 System.out.println("New user name");
                 String technewname=scanner.nextLine();
                 System.out.println("New user last name");
                 String teacnewln=scanner.nextLine();
                 Teacher teacher=new Teacher(technewname,teacnewln,uidteacher);
                 if (!LibraryData.getUserhash().containsKey(uidteacher)) {
                     LibraryData.Newuser(teacher);
                     System.out.println(LibraryData.getUserhash().get(uidteacher));
                 }else{
                     System.out.println("This user ID number assigned before");
                 }break;

             case "3":
                 int uidstudent = random.nextInt(1000) + 3000;
                 System.out.println("New user name");
                 String studname=scanner.nextLine();
                 System.out.println("New user last name");
                 String studlastn=scanner.nextLine();
                 Student student=new Student(studname,studlastn,uidstudent);
                 if (!LibraryData.getUserhash().containsKey(uidstudent)) {
                     LibraryData.Newuser(student);
                     System.out.println(LibraryData.getUserhash().get(uidstudent));
                 }else{
                     System.out.println("This user ID number assigned before");
                 }break;
     }

     }
     public static void newbook(){

         System.out.println("Which kind of book is it type the number: " + "\n" + "1.Fiction" + "\n" + "2.Non-fiction" + "\n" + "3.Reference");
         Scanner scanner = new Scanner(System.in);
         String  newbookid = scanner.nextLine();
         Random random = new Random();

         switch (newbookid) {
             case "1":

                 int fictionbookID = random.nextInt(10000) + 10000;
                 System.out.println("New Book name:");
                 String ficbokname=scanner.nextLine();
                 System.out.println("New Book author name:");
                 String ficauthorname=scanner.nextLine();
                 Fiction fiction=new Fiction(ficbokname,ficauthorname,fictionbookID);
                 if (!LibraryData.getBookhash().containsKey(fictionbookID)) {
                     LibraryData.Newbook(fiction);
                     System.out.println(LibraryData.getBookhash().get(fictionbookID));

                 }else{
                     System.out.println("This book Id number assigned before");
                 }break;

             case "2":
                 int nonfictionbookID = random.nextInt(10000) + 20000;
                 System.out.println("New Book name:");
                 String nonficbokname=scanner.nextLine();
                 System.out.println("New Book author name:");
                 String nonficauthorname=scanner.nextLine();
                 Non_Fiction nonfiction=new Non_Fiction(nonficbokname,nonficauthorname,nonfictionbookID);
                 if (!LibraryData.getBookhash().containsKey(nonfictionbookID)) {
                     LibraryData.Newbook(nonfiction);
                     System.out.println(LibraryData.getBookhash().get(nonfictionbookID));
                 }else{
                     System.out.println("This book Id number assigned before");
                 }break;

             case "3":
                 int referencebookID = random.nextInt(10000) + 90000;
                 System.out.println("New Book name:");
                 String referencebookname=scanner.nextLine();
                 System.out.println("New Book author name:");
                 String refauthorname=scanner.nextLine();
                 Reference reference=new Reference(referencebookname,refauthorname,referencebookID);
                 if (!LibraryData.getBookhash().containsKey(referencebookID)) {
                    LibraryData.Newbook(reference);
                     System.out.println(LibraryData.getBookhash().get(referencebookID));
                 }else{
                     System.out.println("This book Id number assigned before");
                 }break;

         }
     }
 }