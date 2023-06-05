package Lab2.bt10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Card {
    private Student student = new Student();
    private String id;
    private LocalDate borrowDate;
    private LocalDate paymentDate;
    private int bookId;

    public Card() {
        super();
    }

    public Card(Student student, String id, LocalDate borrowDate, LocalDate paymentDate, int bookId) {
        this.student = student;
        this.id = id;
        this.borrowDate = borrowDate;
        this.paymentDate = paymentDate;
        this.bookId = bookId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    

    public void inputThongTin(){
        student.inputThongTin();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID Card: ");
        id = scanner.nextLine();
        System.out.print("Enter borrowdate: ");
        String ngaymuon = scanner.nextLine();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        borrowDate = LocalDate.parse(ngaymuon,dateTimeFormatter);
        System.out.print("Enter paymentdate: ");
        String ngaytra = scanner.nextLine();
        paymentDate = LocalDate.parse(ngaytra,dateTimeFormatter);
        System.out.print("Enter book id: ");
        bookId = scanner.nextInt();
    }

    @Override
    public String toString() {
        return student.toString()+"Card{" +
                "Mã card=" + id +
                ", ngày mượn =" + borrowDate +
                ", ngày trả ='" + paymentDate + '\'' +
                ", mã sách =" + bookId +
                '}';
    }
}
