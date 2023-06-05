package Lab2.bt7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class School {
    private ArrayList<Student> students;

    public School() {
        this.students = new ArrayList<>();
    }

    public void add(Student student) {
        this.students.add(student);
    }
    public void show() {
        this.students.forEach(student -> System.out.println(student.toString()));
    }

    public void show(ArrayList<Student> students) {
        students.forEach(student -> System.out.println(student.toString()));
    }
    public List<Student> getStudent20YearOld(int yearOld) {
        return this.students.stream().filter(student -> student.getAge() == yearOld).collect(Collectors.toList());
    }

    public long countStudent23YearOldInDN(int yearOld, String homeTwon) {
        return this.students.stream().filter(student -> student.getAge() == yearOld && student.getHometown().equals(homeTwon)).count();
    }

}