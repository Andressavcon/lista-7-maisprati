package listaSimplesmenteEncadeada.browserHistory;

public class HistoryList {
    private History head;
    private History tail;
    private int size;
    private int maxSize;

    public HistoryList(int maxSize) {
        this.head = null;
        this.tail = null;
        this.size = 0;
        this.maxSize = maxSize;
    }

    public void addURL(String url) {
        History newNode = new History(url);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }

        size++;

        if (size > maxSize) {
            removeOldestURL();
        }
    }

    private void removeOldestURL() {
        if (head != null) {
            head = head.getNext();
            size--;
        }
    }
    public void displayHistory() {
        if (head == null) {
            System.out.println("Não há histórico de navegação.");
            return;
        }

        History current = head;
        System.out.println("Histórico de navegação:");
        while (current != null) {
            System.out.println(current.getUrl());
            current = current.getNext();
        }
    }
}