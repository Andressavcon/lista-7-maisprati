package listaSimplesmenteEncadeada.taskManager;

public class TaskList {
    private Task head = null;

    public void addTask(String name) {
        Task newTask = new Task(name);
        if (head == null) {
            head = newTask;
        } else {
            Task current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newTask);
        }
    }

    public void showTasks() {
        if (head == null) {
            System.out.println("Nenhuma tarefa.");
            return;
        }
        Task current = head;
        while (current != null) {
            System.out.println(current);
            current = current.getNext();
        }
    }

    public void markAsCompleted(String nome) {
        Task current = head;

        while (current != null) {
            if (current.getName().equals(nome)) {
                current.setCompleted(true);
                return;
            }
            current = current.getNext();
        }
        System.out.println("Tarefa não encontrada.");
    }
}
