package filas.processQueue;

import java.util.Scanner;

public class ProcessQueueManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProcessQueue manager = new ProcessQueue();
        String option;

        do {
            System.out.println("\n1- Adicionar novo processo");
            System.out.println("2- Executar próximo processo");
            System.out.println("3- Exibir processos pendentes");
            System.out.println("4- Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextLine();

            switch (option) {
                case "1":
                    System.out.print("Nome do processo: ");
                    String processName = scanner.nextLine();
                    manager.addProcess(processName);
                    break;

                case "2":
                    manager.executeNextProcess();
                    break;

                case "3":
                    manager.showPendingProcesses();
                    break;

                case "4":
                    System.out.println("Encerrando o sistema de gerenciamento de processos.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (!option.equals("4"));
    }
}
