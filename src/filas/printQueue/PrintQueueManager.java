package filas.printQueue;
import java.util.Scanner;

public class PrintQueueManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintQueue manager = new PrintQueue();
        String option;

        do {
            System.out.println("\n1. Adicionar trabalho de impressão");
            System.out.println("2. Processar próximo trabalho de impressão");
            System.out.println("3. Exibir trabalhos pendentes");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextLine();

            switch (option) {
                case "1":
                    System.out.print("Nome do trabalho de impressão: ");
                    String jobName = scanner.nextLine();
                    manager.addPrintJob(jobName);
                    break;

                case "2":
                    manager.processNextJob();
                    break;

                case "3":
                    manager.showPendingJobs();
                    break;

                case "4":
                    System.out.println("Encerrando o sistema de gerenciamento de impressões.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (!option.equals("4"));
    }
}
