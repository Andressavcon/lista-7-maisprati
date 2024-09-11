package listaSimplesmenteEncadeada.browserHistory;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HistoryList historyList = new HistoryList(5);
        String option;

        do {
            System.out.println("\n(1) Adicionar nova URL");
            System.out.println("(2) Exibir histórico");
            System.out.println("(3) Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextLine();

            switch (option) {
                case "1":
                    System.out.print("Digite a URL: ");
                    String url = scanner.nextLine();
                    historyList.addURL(url);
                    break;

                case "2":
                    historyList.displayHistory();
                    break;

                case "3":
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (!option.equals("3"));
    }
}