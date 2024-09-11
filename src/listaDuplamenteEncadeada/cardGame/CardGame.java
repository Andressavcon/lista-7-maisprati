package listaDuplamenteEncadeada.cardGame;

import java.util.Scanner;

public class CardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PlayerHand playerHand = new PlayerHand();
        String option;

        do {
            System.out.println("\n(1) Adicionar carta à mão");
            System.out.println("(2) Remover carta da mão");
            System.out.println("(3) Reorganizar carta");
            System.out.println("(4) Exibir mão");
            System.out.println("(5) Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextLine();

            switch (option) {
                case "1":
                    System.out.print("Digite o nome da carta a ser adicionada: ");
                    String card = scanner.nextLine();
                    playerHand.addCard(card);
                    break;

                case "2":
                    System.out.print("Digite o nome da carta a ser removida: ");
                    String cardToRemove = scanner.nextLine();
                    playerHand.removeCard(cardToRemove);
                    break;

                case "3":
                    System.out.print("Digite o nome da carta a ser reorganizada: ");
                    String cardToMove = scanner.nextLine();
                    System.out.print("Posição (índice) para mover a carta: ");
                    int position = Integer.parseInt(scanner.nextLine());
                    playerHand.moveCard(cardToMove, position);
                    break;

                case "4":
                    playerHand.displayHand();
                    break;

                case "5":
                    System.out.println("Saindo do jogo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (!option.equals("5"));
    }
}
