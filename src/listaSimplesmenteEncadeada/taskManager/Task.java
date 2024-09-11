package listaSimplesmenteEncadeada.taskManager;

public class Task {
    private String name;
    private boolean completed;
    private Task next;

    public Task(String name) {
        this.name = name;
        this.completed = false;
        this.next = null;
    }

    public String getName() {
        return name;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public boolean isCompleted() {
        return completed;
    }

    public Task getNext() {
        return next;
    }

    public void setNext(Task next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return name + (completed ? " (Concluída)" : " (Pendente)");
    }
}

