package Lab2.bt4;

import java.util.ArrayList;

public class Family {
    private ArrayList<Person> presons;
    private String address;

    public Family(ArrayList<Person> presons, String address) {
        this.presons = presons;
        this.address = address;
    }

    public ArrayList<Person> getPresons() {
        return presons;
    }

    public void setPresons(ArrayList<Person> presons) {
        this.presons = presons;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Family{" +
                "presons=" + presons +
                ", address='" + address + '\'' +
                '}';
    }
}