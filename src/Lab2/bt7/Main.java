package Lab2.bt7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        School school = new School();
        school.add(new Student("NhanHC",23, "DN", 10));
        school.add(new Student("NguyenLKH",21, "DN", 10));
        school.add(new Student("AnhDD",23, "DN", 10));
        school.add(new Student("TuanNM",21, "QB", 10));
        school.add(new Student("ManhTV",23, "HT", 10));
        // add Student to school by func add(). for ex: school.add(new Student(// infor);
        System.out.println("Show all student:");
        school.show();
        System.out.println("Show result infor student by condition:");
        if(school.getStudent20YearOld(20).size() == 0){
            System.out.println("Not Found!");
        } else {
            System.out.println(school.getStudent20YearOld(20));
        }
        System.out.println("Result count = " + school.countStudent23YearOldInDN(23, "DN"));
    }
}
