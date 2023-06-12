package Interface.bt6;

import java.util.Scanner;

public class ManagePhoneBook {
    static PhoneBook pb = new PhoneBook();
    static Scanner scanner = new Scanner(System.in);
    static String name, phone;

    public static void removePhone() {
        System.out.print("Input name of person you want to remove: ");
        name = scanner.nextLine();
        pb.removePhone(name);
    }

    public static void searchPhone() {
        System.out.print("Please input name of person you want to search the phone: ");
        name = scanner.nextLine();
        pb.searchPhone(name);
    }

    public static void updatePhone() {
        boolean searched = false;
        System.out.print("Input name of person you want to update: ");
        name = scanner.nextLine();
        for (String s : pb.phoneList) {
            if (name.equals(s.substring(0, s.indexOf(",")))) {
                searched = true;
                System.out.print("Input phone number you want to update: ");
                phone = scanner.nextLine();
                pb.updatePhone(name, phone);
                break;
            }
        }
        if (!searched) System.out.println("Not found person with name is: " + name);
    }

    public static void sortPhone() {
        pb.sort();
    }

    public static void insertPhone() {
        System.out.print("Input name: ");
        name = scanner.nextLine();
        System.out.print("Input phone: ");
        phone = scanner.nextLine();
        pb.insertPhone(name, phone);
    }
}

