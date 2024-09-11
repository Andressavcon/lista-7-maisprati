package listaSimplesmenteEncadeada.browserHistory;

public class History {
    private String url;
    private History next;

    public History(String url) {
        this.url = url;
        this.next = null;
    }

    public String getUrl() {
        return url;
    }

    public History getNext() {
        return next;
    }

    public void setNext(History next) {
        this.next = next;
    }
}