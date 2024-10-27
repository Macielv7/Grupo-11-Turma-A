import java.util.Scanner;

public class Rpg {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcao;

        System.out.println(" Bem-vindo ! 🎮");

        do {
            System.out.println("1 - Instruções");
            System.out.println("2 - Jogar");
            System.out.println("3 - Modo-X1");
            System.out.println("4 - Créditos");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu a opção Instruções");
                    break;
                case 2:
                    System.out.println("Você escolheu a opção Jogar");
                    break;
                case 3:
                    System.out.println("Você escolheu a opção Modo-x1");
                    break;
                case 4:
                    System.out.println("Você escolheu a opção Créditos");
                    break;
                case 5:
                    System.out.println("Você escolheu a opção Sair");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);
    }
}