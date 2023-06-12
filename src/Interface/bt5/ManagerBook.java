package Interface.bt5;
import java.util.ArrayList;
import java.util.Scanner;
public class ManagerBook {
     ArrayList<Book> BookList = new ArrayList<>();
     Scanner input = new Scanner(System.in);
    public void insertNewBook() {
        Book book = new Book();
        book.id = BookList.size()+1;
        System.out.print("Nhap name:");
        book.name = input.nextLine();
        System.out.print("Nhap publist Date:");
        book.publistDate = input.nextLine();
        System.out.print("Nhap author:");
        book.author = input.nextLine();
        System.out.print("Nhap language:");
        book.language = input.nextLine();
        System.out.println("Nhap 5 price:");
        for ( int i = 0; i< book.priceList.length; i++){
            System.out.printf("Price %d: ",i+1);
            book.priceList[i] = input.nextInt();
        }
        input.nextLine();
        BookList.add(book);
    }
    public void viewlistofBooks() {
        if(BookList.isEmpty()){
            System.out.println("No book!");
        }else {
            for(Book book : BookList){
                book.display();
            }
        }
    }
    public void averagePrice() {

        if(BookList.isEmpty()){
            System.out.println("No book!");
        }else {
            for(Book book : BookList){
                book.calculate();
                book.display();
            }
        }
    }
}
