package listaSimplesmenteEncadeada.textEditorUndo;

import java.util.Scanner;

public class TextEditorUndo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ActionHistory actionHistory = new ActionHistory();
        String option;

        do {
            System.out.println("\n(1) Adicionar texto");
            System.out.println("(2) Desfazer última ação");
            System.out.println("(3) Exibir conteúdo atual");
            System.out.println("(4) Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextLine();

            switch (option) {
                case "1":
                    System.out.print("Digite o texto a ser adicionado: ");
                    String text = scanner.nextLine();
                    actionHistory.addAction(text);
                    break;

                case "2":
                    actionHistory.undoLastAction();
                    break;

                case "3":
                    actionHistory.displayCurrentContent();
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