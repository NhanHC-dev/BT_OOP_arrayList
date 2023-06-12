package Interface.bt2;

public class News implements INews {
    int id;
    String title;
    String publistDay;
    String author;
    String content;
    float averageRate;
    int[] rateList = new int[3];
    public News() {
    }

    public News(int id, String title, String publistDay, String author, String content, float averageRate) {
        this.id = id;
        this.title = title;
        this.publistDay = publistDay;
        this.author = author;
        this.content = content;
        this.averageRate = averageRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublistDay() {
        return publistDay;
    }

    public void setPublistDay(String publistDay) {
        this.publistDay = publistDay;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    public void setAverageRate(float averageRate) {
        this.averageRate = averageRate;
    }

    @Override
    public void display() {
        System.out.println( "title: " + getTitle() + ", " +
                "publistDay:" + getPublistDay() + ", " +
                "author:" + getAuthor() + ", " +
                "content:" + getContent() + ", "
        );
    }
    public float caculate(){
        float sumRate=0;
        for (int rl:rateList) {
            sumRate=sumRate+rl;
        }
        return averageRate= sumRate/rateList.length;

    }
}
