package listaSimplesmenteEncadeada.taskManager;

import java.util.Scanner;

public class TaskManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TaskList list = new TaskList();
        String option;

        do {
            System.out.println("\n1- Adicionar tarefa");
            System.out.println("2- Marcar tarefa como concluída");
            System.out.println("3- Exibir tarefas");
            System.out.println("4- Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextLine();


            switch (option) {
                case "1":
                    System.out.print("Digite o nome da tarefa: ");
                    String nome = scanner.nextLine();
                    list.addTask(nome);
                    break;

                case "2":
                    System.out.print("Digite o nome da tarefa a concluir: ");
                    String nomeCompleted = scanner.nextLine();
                    list.markAsCompleted(nomeCompleted);
                    break;

                case "3":
                    list.showTasks();
                    break;

                case "4":
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (!option.equals("4"));
    }
}