package listaDuplamenteEncadeada.textEditorUndoRedo;

public class ActionHistory {
    private Action current;
    private final StringBuilder currentContent;

    public ActionHistory() {
        this.current = null;
        this.currentContent = new StringBuilder();
    }

    public void addAction(String action) {
        Action newNode = new Action(action);

        if (current != null) {
            current.setNext(null);
        }

        if (current != null) {
            newNode.setPrev(current);
            current.setNext(newNode);
        }
        current = newNode;

        currentContent.append(action);
        System.out.println("Texto adicionado: " + action);
    }

    public void undo() {
        if (current == null) {
            System.out.println("Nenhuma ação para desfazer.");
        } else {
            System.out.println("Desfazendo: " + current.getAction());
            currentContent.setLength(currentContent.length() - current.getAction().length());
            current = current.getPrev();
        }
    }

    public void redo() {
        if (current == null || current.getNext() == null) {
            System.out.println("Nenhuma ação para refazer.");
        } else {
            current = current.getNext();
            System.out.println("Refazendo: " + current.getAction());
            currentContent.append(current.getAction());
        }
    }

    public void displayCurrentContent() {
        if (currentContent.isEmpty()) {
            System.out.println("O conteúdo está vazio.");
        } else {
            System.out.println("Conteúdo atual: " + currentContent.toString());
        }
    }
}