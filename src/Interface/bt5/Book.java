package Interface.bt5;

import java.util.Arrays;

public class Book implements IBook {
    int id;
    String name;
    String publistDate;
    String author;
    String language;
    float averagePrice;
    int[] priceList = new int[5];

    public Book() {
    }

    public Book(int id, String name, String publistDate, String author, String language, int[] priceList) {
        this.id = id;
        this.name = name;
        this.publistDate = publistDate;
        this.author = author;
        this.language = language;
        this.priceList = priceList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublistDate() {
        return publistDate;
    }

    public void setPublistDate(String publistDate) {
        this.publistDate = publistDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public float getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(float averagePrice) {
        this.averagePrice = averagePrice;
    }

    public int[] getPriceList() {
        return priceList;
    }

    public void setPriceList(int[] priceList) {
        this.priceList = priceList;
    }

    @Override
    public void display() {
        System.out.println("id=" + id +
                ", name='" + name + '\'' +
                ", publistDate=" + publistDate +
                ", author='" + author + '\'' +
                ", language='" + language + '\'' +
                ", averagePrice=" + averagePrice +
                ", priceList=" + Arrays.toString(priceList) +
                '}');
    }

//    @Override
//    public String toString() {
//        return
//                "id=" + id +
//                        ", name='" + name + '\'' +
//                        ", publistDate=" + publistDate +
//                        ", author='" + author + '\'' +
//                        ", language='" + language + '\'' +
//                        ", averagePrice=" + averagePrice +
//                        ", priceList=" + Arrays.toString(priceList) +
//                        '}';
//    }

    public float calculate(){
        float sum=0;
        for (int i = 0; i <priceList.length ; i++) {
            sum=sum+priceList[i];
        }
        return  averagePrice=sum/priceList.length;
    }
}
