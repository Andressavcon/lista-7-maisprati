package listaSimplesmenteEncadeada.textEditorUndo;

public class Action  {
    private String action;
    private Action next;

    public Action(String action) {
        this.action = action;
        this.next = null;
    }

    public String getAction() {
        return action;
    }

    public Action getNext() {
        return next;
    }

    public void setNext(Action next) {
        this.next = next;
    }
}