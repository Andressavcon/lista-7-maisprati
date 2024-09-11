package listaSimplesmenteEncadeada.textEditorUndo;

public class ActionHistory {
    private Action top;
    private StringBuilder currentContent;

    public ActionHistory() {
        this.top = null;
        this.currentContent = new StringBuilder();
    }

    public void addAction(String action) {
        Action newNode = new Action(action);

        if (top != null) {
            newNode.setNext(top);
        }
        top = newNode;

        currentContent.append(action);
        System.out.println("Texto adicionado: " + action);
    }

    public void undoLastAction() {
        if (top == null) {
            System.out.println("Nenhuma ação para desfazer.");
        } else {
            System.out.println("Desfazendo última ação: " + top.getAction());
            top = top.getNext();
            recalculateContent();
        }
    }

    private void recalculateContent() {
        currentContent.setLength(0);
        Action current = top;
        while (current != null) {
            currentContent.append(current.getAction());
            current = current.getNext();
        }
    }

    public void displayCurrentContent() {
        if (currentContent.length() == 0) {
            System.out.println("O conteúdo está vazio.");
        } else {
            System.out.println("Conteúdo atual: " + currentContent.toString());
        }
    }
}