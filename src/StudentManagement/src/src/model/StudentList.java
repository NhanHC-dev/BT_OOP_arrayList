package model;

import model.comparator.StudentComparatorByID;
import view.Validation;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Predicate;

public final class StudentList extends ArrayList<Student> {
    public StudentList() {
        super();
        this.loadDataFromFile();
    }

    public void listAllStudents() {
        this.listAllStudents(this, new StudentComparatorByID());
    }

    public void listAllStudents(ArrayList<Student> list) {
        this.listAllStudents(list, new StudentComparatorByID());
    }

    public void listAllStudents(Comparator<Student> comparator) {
        this.listAllStudents(this, comparator);
    }

    public void listAllStudents(ArrayList<Student> list, Comparator<Student> comparator ) {
        int total = list.size();
        if (total <= 0) {
            System.out.println("Sorry. Nothing to print!");
            return;
        }
        list.sort(comparator);
        System.out.println("List all students");
        System.out.println("--------------------------------");
        System.out.printf("%-8s | %-15s | %-15s | %-5s\n", "ID", "Name", "Date of Birth", "GPA");

        for (Student student : list) {
            System.out.println(student);
        }
        System.out.println("--------------------------------");
        System.out.println("Total: " + total + " students.");
    }

    private void loadDataFromFile() {
        File file = new File("student.txt");
        try {
            Object[] lines = new BufferedReader(new FileReader(file)).lines().toArray();
            for (var line : lines) {
                String[] row = line.toString().split(",");
                if (row.length <= 1) {
                    continue;
                }
                String id = Validation.checkStudentId(row[0]);
                DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate dateLocal = LocalDate.parse(row[2], dateTimeFormatter);
                if((id != null) && (dateLocal != null) ){
                    this.add(new Student(row[0], row[1], dateLocal, Float.parseFloat(row[3])));
                }
            }
        } catch (Exception ioException) {
            System.out.println("Error.");
        }
    }

    public void addNewStudent() {
        if (this.size() >= 10000) {
            System.out.println("The list can only hold 10,000 students and is full.");
            return;
        }
        System.out.println("Add new student");
        System.out.println("-----------------------------------------");
        String newID;
        String newName;
        LocalDate newDob;
        float newGPA;
        while (true) {
            newID = Validation.getString("Enter Student ID (format DE000000): ", "[dD][eE]\\d{6}").toUpperCase();
            if (!this.isStudentIDDuplicated(newID)) {
                break;
            }
        }
        newName = Validation.getString("Enter Student Name: ");
        newDob = Validation.inputDate("Enter Student Date of Birth (dd/MM/yyyy): ");
        newGPA = Validation.getFloat("Enter GPA: ", 0.0F, 10.0f);

        this.add(new Student(newID, newName, newDob, newGPA));
        System.out.println("Student added successfully.");
    }

    private boolean isStudentIDDuplicated(String studentID) {
        studentID = studentID.trim().toUpperCase();
        for (Student student : this) {
            if (student.getId().equalsIgnoreCase(studentID)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Student> search(Predicate<Student> predicate) {
        ArrayList<Student> list = new ArrayList<>();

        for (Student student : this) {
            if (predicate.test(student)) {
                list.add(student);
            }
        }
        if (list.isEmpty()) {
            System.err.println("List Empty.");
        }
        return list;
    }


    private Student search(String ID) {
        for (Student s : this) {
            if (s.getId().equalsIgnoreCase(ID)) {
                return s;
            }
        }
        return null;
    }

    public void editInfo() {
        System.out.println("Edit Student information");
        System.out.println("--------------------------------");

        String ID = Validation.getString("Enter ID (format DE000000): ", "[dD][eE]\\d{6}");
        Student student = this.search(ID);
        if (student == null) {
            System.err.println("Not found!");
            return;
        }
        System.out.println(student);
        String name = Validation.getString("Enter new name: ");
        LocalDate dob = Validation.inputDate("Enter new Date of Birth (dd/MM/yyyy): ");
        float gpa = Validation.getFloat("Enter new GPA: ", 0.0F, 10.0f);
        student.setName(name);
        student.setDateOfBirth(dob);
        student.setGPA(gpa);
        System.out.println("Edit successfully!");
        listAllStudents();
    }


}
