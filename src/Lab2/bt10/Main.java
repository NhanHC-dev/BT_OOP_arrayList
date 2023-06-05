package Lab2.bt10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        ManagerCard managerCard = new ManagerCard();
        Card card;

        do{
            System.out.println("1.Thêm card mượn sách");
            System.out.println("2.Xóa card mượng sách");
            System.out.println("3.Xuất ra thông tin");
            System.out.println("0.Quit");
            System.out.print("Sự lựa chọn: ");
            choice =  scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Nhập thông tin người mượn sách thứ "+ (managerCard.cards.size()+1) +" là: ");
                    card = new Card();
                    card.inputThongTin();
                    managerCard.add(card);
                    System.out.println("Thêm thành công.");
                    break;
                case 2:
                    System.out.println("Enter id borrow bạn muốn xóa: ");
                    scanner.nextLine();
                    String idremove = scanner.nextLine();
                    for(int i=0;i<managerCard.cards.size();i++){
                        if(managerCard.cards.get(i).getId().equalsIgnoreCase(idremove)){
                            System.out.println("Đây là thông tin người bạn kiếm:");
                            System.out.println(managerCard.cards.get(i).toString());
                        }
                    }
                    if(managerCard.delete(idremove)){
                        System.out.println("Xóa thành công");
                    }else{
                        System.out.println("Không tìm thầy thông tin bạn tìm");
                    }
                    break;
                case 3:
                    System.out.println("Xuất thông tin:");
                    managerCard.outputThongTin();
                    if(managerCard.cards.size()==0){
                        System.out.println("Không có người mượn sách.");
                    }
            }
        }while(choice !=0);
    }
}
