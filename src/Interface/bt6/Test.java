package Interface.bt6;

import java.util.Scanner;


public class Test {
    static Scanner scanner = new Scanner(System.in);
    static void menu() {
        System.out.println("PHONEBOOK MANAGEMENT SYSTEM");
        System.out.println("1. Insert phone");
        System.out.println("2. Remove phone");
        System.out.println("3. Update phone");
        System.out.println("4. Search phone");
        System.out.println("5. Sort");
        System.out.println("6. Exit");
    }

    public static void main(String[] args) {
        menu();
        while (true) {
            System.out.print("Please choose an option: ");
            switch (scanner.nextInt()) {
                case 1:
                    ManagePhoneBook.insertPhone();
                    break;
                case 2:
                    ManagePhoneBook.removePhone();
                case 3:
                    ManagePhoneBook.updatePhone();
                    break;
                case 4:
                    ManagePhoneBook.searchPhone();
                    break;
                case 5:
                    ManagePhoneBook.sortPhone();
                    break;
                case 6:
                    return;
            }
        }
    }
}
