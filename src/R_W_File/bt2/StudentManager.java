package R_W_File.bt2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentManager {
     ArrayList<Student> studentList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public void inputStudent() {
        System.out.println("Enter element student: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter information student " + (i + 1) + ": ");
            Student std = new Student();
            std.input();
            studentList.add(std);
        }
    }
    public void editStudentById() {
        System.out.println("Enter id student need edit: ");
        int id = scanner.nextInt();
        for (Student s : studentList){
            if(s.getId() == id){
                s.input();
                break;
            }
        }
    }
    public void deletetudentById() {
        System.out.println("Enter id student need delete: ");
        int id = scanner.nextInt();
        for (Student s : studentList){
            if(s.getId() == id){
                studentList.remove(s);
                break;
            }
        }
    }

    public void sortStudentByGPA() {
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getGpa() > o2.getGpa()){
                    return -1;
                }
                return 1;
            }
            //return o1.getGpa() > o2.getGpa() ? -1  : 1;
        });
    }

    public void sortStudentByName() {
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
                //giam dan -> muon tang dan thi them -o1
            }
        });
    }

    public void displayStudent() {
        for (Student s: studentList){
            s.display();
        }
    }

    public void saveFile() {
        System.out.println("Save start: ");
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("Student.txt",true);
            for (Student s : studentList) {
                String line = s.getFileLine();
                byte[] b = line.getBytes("utf8");
                fos.write(b);
            }
        } catch (FileNotFoundException e) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,e);
        } catch (UnsupportedEncodingException e) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,e);
        } catch (IOException e) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,e);
        } finally {
            if (fos != null) {
                try {
                    System.out.println("Success!");
                    fos.close();
                } catch (IOException e) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
                }
            }else System.out.println("Fail!");
        }
    }

    public void readFile() {
        FileInputStream fis = null;
        FileReader reader = null; // InputStreamReader
        BufferedReader bufferedReader = null;
        try {
            fis = new FileInputStream("Student.txt");
            reader = new FileReader(fis.toString(), StandardCharsets.UTF_8);
            bufferedReader = new BufferedReader(reader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null){
                if(line.isEmpty()){
                    continue;
                }
                Student std = new Student();
                std.parse(line);
            }
        } catch (FileNotFoundException e) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,e);
        } catch (IOException e) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,e);
        } finally {
            if (fis != null){
                try {
                    System.out.println("Success!");
                    fis.close();
                } catch (IOException e) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
                }
            }else System.out.println("Fail!");
            if (reader != null){
                try {
                    System.out.println("Success!");
                    reader.close();
                } catch (IOException e) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
                }
            }else System.out.println("Fail!");
            if (bufferedReader != null){
                try {
                    System.out.println("Success!");
                    bufferedReader.close();
                } catch (IOException e) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
                }
            }else System.out.println("Fail!");
        }
    }
}
