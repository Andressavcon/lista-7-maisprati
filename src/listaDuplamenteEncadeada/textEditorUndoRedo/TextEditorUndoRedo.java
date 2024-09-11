package listaDuplamenteEncadeada.textEditorUndoRedo;

import java.util.Scanner;

public class TextEditorUndoRedo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ActionHistory actionHistory = new ActionHistory();
        String option;

        do {
            System.out.println("\n(1) Adicionar texto");
            System.out.println("(2) Desfazer (Undo)");
            System.out.println("(3) Refazer (Redo)");
            System.out.println("(4) Exibir conteúdo atual");
            System.out.println("(5) Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextLine();

            switch (option) {
                case "1":
                    System.out.print("Digite o texto a ser adicionado: ");
                    String text = scanner.nextLine();
                    actionHistory.addAction(text);
                    break;

                case "2":
                    actionHistory.undo();
                    break;

                case "3":
                    actionHistory.redo();
                    break;

                case "4":
                    actionHistory.displayCurrentContent();
                    break;

                case "5":
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (!option.equals("5"));
    }
}




