package Lab2.bt10;

import java.util.ArrayList;

public class ManagerCard {

    protected ArrayList<Card> cards;

    public ManagerCard() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public boolean delete(String id) {
        Card card = this.cards.stream().filter(t -> t.getId().equals(id)).findFirst().orElse(null);
        if (card == null) {
            return false;
        }
        this.cards.remove(card);
        return true;
    }
    public void outputThongTin(){
        for (int i=0;i< cards.size();i++){
            System.out.println("Người mượn thứ "+ (i+1) +" là:");
            System.out.println(cards.get(i).toString());
        }
    }
}
