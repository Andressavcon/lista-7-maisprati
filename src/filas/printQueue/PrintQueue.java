package filas.printQueue;
import java.util.LinkedList;
import java.util.Queue;

public class PrintQueue {
    private Queue<String> printQueue;

    public PrintQueue() {
        this.printQueue = new LinkedList<>();
    }

    public void addPrintJob(String jobName) {
        printQueue.add(jobName);
        System.out.println("Trabalho de impressão '" + jobName + "' adicionado à fila.");
    }

    public void processNextJob() {
        if (!printQueue.isEmpty()) {
            String job = printQueue.poll();
            System.out.println("Processando o trabalho de impressão: " + job);
        } else {
            System.out.println("Nenhum trabalho de impressão na fila.");
        }
    }

    public void showPendingJobs() {
        if (!printQueue.isEmpty()) {
            System.out.println("Trabalhos de impressão na fila: " + printQueue);
        } else {
            System.out.println("A fila de impressão está vazia.");
        }
    }
}
