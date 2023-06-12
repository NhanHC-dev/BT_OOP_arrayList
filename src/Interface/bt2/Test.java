package Interface.bt2;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    static void inputNews(News news) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập title: ");
        news.title = scanner.nextLine();
        System.out.print("Nhập publish date: ");
        news.publistDay = scanner.nextLine();
        System.out.print("Nhập author: ");
        news.author = scanner.nextLine();
        System.out.print("Nhập content: ");
        news.content = scanner.nextLine();
        System.out.println("Nhập các đánh giá:");
        for (int i = 0; i < news.rateList.length; i++) {
            do {
                System.out.format("Đánh giá %d: ", i + 1);
                news.rateList[i] = scanner.nextInt();
            } while (!(1 <= news.rateList[i] && news.rateList[i] <= 5));
        }
    }
    public static void menu() {
        System.out.println("1. Insert news");
        System.out.println("2. View list news");
        System.out.println("3. Average rate");
        System.out.println("4. Exit");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<News> NewsList = new ArrayList<>();
        while (true){
            menu();
            System.out.println("Enter option: ");
            switch (input.nextInt()) {
                case 1 -> {
                    News news = new News();
                    inputNews(news);
                    news.id = NewsList.size() + 1;
                    NewsList.add(news);
                    System.out.println("Đã thêm tin có mã " + news.id + " vào danh sách!");
                }
                case 2 -> {
                    System.out.println("Danh sách tin:");
                    for (News news1 : NewsList) {
                        news1.display();
                    }
                }
                case 3 -> {
                    System.out.println("Danh sách tin sau khi tính trung bình rate:");
                    for (News news1 : NewsList) {
                        news1.caculate();
                        news1.display();
                    }
                }
                case 4 -> {
                    return;
                }
                default -> System.out.println("Nhap sai chuc nang");
            }
        }
    }
}
