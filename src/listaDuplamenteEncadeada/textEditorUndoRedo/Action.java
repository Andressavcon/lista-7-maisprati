package listaDuplamenteEncadeada.textEditorUndoRedo;

public class Action {
    private String action;
    private Action prev;
    private Action next;

    public Action(String action) {
        this.action = action;
        this.prev = null;
        this.next = null;
    }

    public String getAction() {
        return action;
    }

    public Action getPrev() {
        return prev;
    }

    public void setPrev(Action prev) {
        this.prev = prev;
    }

    public Action getNext() {
        return next;
    }

    public void setNext(Action next) {
        this.next = next;
    }
}