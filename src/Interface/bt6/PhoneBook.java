package Interface.bt6;

import java.util.*;

public class PhoneBook implements IPhone {
    ArrayList<String> phoneList = new ArrayList<>();

    @Override
    public void insertPhone(String name, String phone) {
        if (phoneList.isEmpty()) {
            phoneList.add(name + "-" + phone);
            System.out.println("Da them sdt thanh cong!");
        } else {
            for (String ph : phoneList) {
                if (ph.contains(name + "-")) {
                    phoneList.set(phoneList.indexOf(ph), ph + ":" + phone);
                } else {
                    phoneList.add(name + "-" + phone);
                }
                System.out.println("Da them sdt thanh cong!");
                break;
            }

        }
    }

    @Override
    public void removePhone(String name) {
        sort();
        for (String ph : phoneList) {
            if (ph.contains(name + "-")) {
                phoneList.remove(ph);
                System.out.println("Da xoa thanh cong sdt co ten:" + name);
            } else {
                System.out.println("Không co sdt nao co ten la: " + name);
            }
            break;
        }
    }

    @Override
    public void updatePhone(String name, String newPhone) {
        for (String ph : phoneList) {
            if (ph.contains(name + "-")) {
                phoneList.set(phoneList.indexOf(ph),name+"-" +newPhone);
                System.out.println("Da sua thanh cong!");
            } else {
                System.out.println("Khong co sdt nao co ten can sua");
            }
            break;
        }
    }

    @Override
    public void searchPhone(String name) {
        for (String ph : phoneList) {
            if (ph.contains(name + "-")) {
                System.out.println("Sdt can tim la: "+ ph.substring(ph.indexOf("-")+1));
            } else {
                System.out.println("Khong co sdt nao co ten can tim");
            }
            break;
        }
    }


    @Override
    public void sort() {
        if (phoneList.size() == 0) System.out.println("PhoneList is empty");
        else {
            //Sắp xếp tăng dần theo tên
            Collections.sort(phoneList, new Comparator<String>() {
                @Override
                public int compare(String s, String t1) {
                    return s.compareTo(t1);
                }
            });
            System.out.println("Sort Ascending by name:");
            for (String s : phoneList) {
                System.out.println(s);
            }
            //Sắp xếp giảm dần theo tên
            Collections.sort(phoneList, new Comparator<String>() {
                @Override
                public int compare(String s, String t1) {
                    return t1.compareTo(s);
                }
            });
            System.out.println("Sort Descending by name:");
            for (String s : phoneList) {
                System.out.println(s);
            }
        }
//        phoneList.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });
    }
}

