package filas.bankQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BankQueueSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> customerQueue = new LinkedList<>();
        String option;

        do {
            System.out.println("\n(1) Adicionar cliente à fila");
            System.out.println("(2) Chamar próximo cliente");
            System.out.println("(3) Exibir fila de clientes");
            System.out.println("(4) Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextLine();

            switch (option) {
                case "1":
                    System.out.print("Nome do cliente: ");
                    String customerName = scanner.nextLine();
                    customerQueue.add(customerName);
                    System.out.println("Cliente adicionado à fila: " + customerName);
                    break;

                case "2":
                    if (!customerQueue.isEmpty()) {
                        String nextCustomer = customerQueue.poll();  // Chama e remove o próximo cliente
                        System.out.println("Atendendo o cliente: " + nextCustomer);
                    } else {
                        System.out.println("A fila está vazia. Nenhum cliente para atender.");
                    }
                    break;

                case "3":
                    if (!customerQueue.isEmpty()) {
                        System.out.println("Clientes na fila de atendimento: " + customerQueue);
                    } else {
                        System.out.println("A fila está vazia.");
                    }
                    break;

                case "4":
                    System.out.println("Encerrando o simulador de fila.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (!option.equals("4"));
    }
}