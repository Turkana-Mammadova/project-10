package technoStudy.proje10;

import technoStudy.proje10.User.Librarian;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LibraryWork {
    public static void main(String[] args) {

        System.out.println("Welcome to library");
        boolean outerloop = true;
        while (outerloop) {

            System.out.println("Your valid ID number please");
            try {
                Scanner scanner = new Scanner(System.in);
                int id = scanner.nextInt();
            if (id >= 1000 && id < 2000) {
                System.out.println("Welcome Librarian! ");
                boolean innerloop=true;
                while (innerloop) {
                    System.out.println("****** What do you want to do?******"
                            + "\n" + "1. See book inventory"
                            + "\n" + "2. See user inventory"
                            + "\n" + "3. Check out book for yourself"
                            + "\n" + "4. Check out book for user"
                            + "\n" + "5. Check in book for user"
                            + "\n" + "6. Create a user account"
                            + "\n" + "7. Create a book account"
                            + "\n" + "C. Back to main menu"
                            + "\n" + "X. Exit");
                    Scanner scanner1 = new Scanner(System.in);
                    String chooseone = scanner1.nextLine();

                    switch (chooseone) {
                        case "1":
                            System.out.println(LibraryData.getBookhash());
                            break;
                        case "2":
                            System.out.println(LibraryData.getUserhash());
                            break;
                        case "3":
                            Librarian.selfcheckOut();
                            break;
                        case "4":
                            Librarian.checkOut();
                            break;
                        case "5":
                            Librarian.checkIn();
                            break;
                        case "6":
                            Librarian.newuser();
                            break;
                        case "7":
                            Librarian.newbook();
                            break;
                        case "X":
                            outerloop=false;innerloop=false;
                            break;
                        case "C":
                            innerloop = false;
                            break;

                    }
                }
                }
            if (id >= 2000 && id < 3000) {
                System.out.println("Welcome Teacher!");
                boolean innerloop=true;
                while (innerloop) {
                    System.out.println(" ***What do you want to do?***"
                            + "\n" + "1. Check out book for yourself"
                            + "\n" + "2. Check in book for user"
                            + "\n" + "C. Back to main menu"
                            + "\n" + "X. Exit");
                    Scanner scanner2 = new Scanner(System.in);
                    String chooseone2 = scanner2.nextLine();

                    switch (chooseone2) {
                        case "1":
                            Librarian.selfcheckOut();
                            break;
                        case "2":
                            Librarian.checkIn();
                            break;
                        case "C":
                            innerloop = false;
                            break;
                        case "X":
                            outerloop=false;innerloop=false;
                            break;

                    }
                    }
                }
            if (id >= 3000 && id < 4000) {
                System.out.println("Welcome Student!");
                boolean innerloop=true;
                while (innerloop) {
                    System.out.println(" ******What do you want to do?******"
                            + "\n" + "1. Check out book for yourself"
                            + "\n" + "2. Check in book for user"
                            + "\n" + "C. Back to main menu"
                            + "\n" + "X. Exit");
                    Scanner scanner3 = new Scanner(System.in);
                    String chooseone3 = scanner3.nextLine();

                    switch (chooseone3) {
                        case "1":
                            Librarian.selfcheckOut();
                            break;
                        case "2":
                            Librarian.checkIn();
                            break;
                        case "C":
                            innerloop = false;break;
                        case "X":
                            outerloop=false;innerloop=false;
                            break;

                    }
                }}
            if (id < 1000 || id > 4000) {
                System.out.println("This is not a valid User Id");


            }
            }catch (InputMismatchException e){
                System.out.println("Type 4 digit numbers");
            }
        }
        System.out.println("See you later."); }


}