package technoStudy.proje10.User;
import technoStudy.proje10.LibraryData;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;


public class Student extends User {
    static  ArrayList<Integer> checkedOutBooks = new ArrayList<>();
   static LocalDate ld = LocalDate.now();
   static LocalDate duedate = ld.plusWeeks(2);

    public Student(String name, String lastname, int userID) {
        super(name, lastname, userID);
    }



    public static void selfcheckOut() {

        if (checkedOutBooks.size() >= 3) {
            System.out.println("Your book quanity limit is 10");
        } else {
            System.out.println("Which book do you wants to borrow? Pleace type book ID");
            Scanner scanner = new Scanner(System.in);
            int inputBookId = scanner.nextInt();

            while (!LibraryData.getBookhash().containsKey(inputBookId)) {
                System.out.println("Type valid Book ID , please: ");
                inputBookId = scanner.nextInt();
            }
            while ( inputBookId < 100000 && inputBookId > 90000) {
                System.out.println("This is a reference book, and it cannot be checked out.Please,type valid Book ID");
                inputBookId = scanner.nextInt();
            } if(inputBookId<30000 && inputBookId>10000) {
                checkedOutBooks.add(inputBookId);
                System.out.println("It has successfully checked out.");
                System.out.println("Check out date: " + ld
                        + "\n" + "Due date: " + duedate
                        + "\n" +LibraryData.getBookhash().get(inputBookId) );
            }
        }

    }

}