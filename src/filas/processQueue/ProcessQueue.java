package filas.processQueue;

import java.util.LinkedList;
import java.util.Queue;

public class ProcessQueue {
    private final Queue<String> processQueue;

    public ProcessQueue() {
        this.processQueue = new LinkedList<>();
    }

    public void addProcess(String processName) {
        processQueue.add(processName);
        System.out.println("Processo '" + processName + "' adicionado à fila.");
    }

    public void executeNextProcess() {
        if (!processQueue.isEmpty()) {
            String process = processQueue.poll();
            System.out.println("Executando o processo: " + process);
        } else {
            System.out.println("Nenhum processo na fila para execução.");
        }
    }

    public void showPendingProcesses() {
        if (!processQueue.isEmpty()) {
            System.out.println("Processos na fila de execução: " + processQueue);
        } else {
            System.out.println("A fila de processos está vazia.");
        }
    }
}
