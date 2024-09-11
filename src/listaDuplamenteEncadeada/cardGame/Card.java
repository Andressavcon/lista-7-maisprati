package listaDuplamenteEncadeada.cardGame;

public class Card {
    private final String cardName;
    private Card prev;
    private Card next;

    public Card(String cardName) {
        this.cardName = cardName;
        this.prev = null;
        this.next = null;
    }

    public String getCardName() {
        return cardName;
    }

    public Card getPrev() {
        return prev;
    }

    public void setPrev(Card prev) {
        this.prev = prev;
    }

    public Card getNext() {
        return next;
    }

    public void setNext(Card next) {
        this.next = next;
    }
}