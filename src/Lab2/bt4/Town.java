package Lab2.bt4;

import java.util.ArrayList;


public class Town {
    ArrayList<Family> families;

    public Town() {
        this.families = new ArrayList<>();
    }

    public ArrayList<Family> getFamilies() {
        return families;
    }

    public void setFamilies(ArrayList<Family> families) {
        this.families = families;
    }

    public void addFamily(Family family) {
        this.families.add(family);
    }
    public void showInfor(){
        this.families.forEach(family -> System.out.println(family.toString()));
    }
}