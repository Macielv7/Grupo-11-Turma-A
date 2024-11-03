import java.util.Scanner;

public class Rpg {

    public static void main(String[] args) throws InterruptedException {
        Scanner entrada = new Scanner(System.in);

        int opcao;

        System.out.println("A lamina dos Desafios! ");

        Thread.sleep(1000);

        do {
            System.out.println("1 - Jogar");
            Thread.sleep(400);

            System.out.println("2 - Instruções");
            Thread.sleep(400);

            System.out.println("3 - Modo X1");
            Thread.sleep(400);

            System.out.println("4 - Créditos");
            Thread.sleep(400);

            System.out.println("5 - Sair");
            Thread.sleep(400);

            System.out.print("Escolha uma opção: ");
            Thread.sleep(400);

            opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu a opção Jogar");
                    Thread.sleep(1000);
                    System.out.println("Deseja Prosseguir para Jogar? (Sim/Não)");
                    Thread.sleep(800);
                    String confirmação = entrada.next();

                    if (confirmação.equalsIgnoreCase("sim")) {
                        System.out.println("Inciando o jogo... // tocar video em popup");
                        Thread.sleep(800);
                        jogo();
                        criarPersonagem(entrada);
                    } else {
                        System.out.println("Retornando ao Menu Inicial... ");
                    }
                    break;

                case 2:
                    System.out.println("Você escolheu a opção Instruções");
                    Thread.sleep(1000);
                    System.out.println("Deseja Prosseguir para Instruções? (Sim/Não)");
                    String confirmação2 = entrada.next();
                    Thread.sleep(800);

                    if (confirmação2.equalsIgnoreCase("sim")) {
                        System.out.println("Abrindo o menu de Instrução de Jogo... ");
                        Instrução();
                    } else {
                        System.out.println("Retornando ao Menu Inicial... ");
                    }

                    break;

                case 3:
                    System.out.println("Você escolheu a opção de Modo X1");
                    Thread.sleep(1000);
                    System.out.println("Deseja Prosseguir para o Modo X1? (Sim/Não)");
                    String confirmação4 = entrada.next();
                    Thread.sleep(800);

                    if (confirmação4.equalsIgnoreCase("sim")) {
                        System.out.println("Inciando o Modo X1... ");
                        modox1();
                    } else {
                        System.out.println("Retornando ao Menu Inicial... ");
                    }

                    break;

                case 4:
                    System.out.println("Você escolheu a opção de Créditos");
                    Thread.sleep(1000);
                    System.out.println("Deseja Prosseguir para os Créditos? (Sim/Não)");
                    String confirmação5 = entrada.next();
                    Thread.sleep(800);

                    if (confirmação5.equalsIgnoreCase("sim")) {
                        System.out.println("Abrindo os Créditos... ");
                        creditos();
                    } else {
                        System.out.println("Retornando ao Menu Inicial... ");
                    }
                    break;

                case 5:
                    System.out.println("Você escolheu a opção Sair");
                    Thread.sleep(1000);
                    System.out.println("Tem certeza que desejar sair do jogo? (SIm/Não)");
                    String confirmação6 = entrada.next();
                    Thread.sleep(800);

                    if (confirmação6.equalsIgnoreCase("sim")) {
                        sair();
                        opcao = 6;
                    } else {
                        System.out.println("Retornando ao Menu Inicial... ");
                    }
                    break;

                default:
                    System.out.println("Opção inválida!");
                    Thread.sleep(800);

            }

        } while (opcao != 6);

        entrada.close();
    }

    private static void jogo() {

    }

    private static void criarPersonagem(Scanner input) {
        System.out.println("Você deseja criar um personagem masculino ou feminino? (M/F)");
        char genero = input.next().charAt(0);

        System.out.println("Digite o nome do seu personagem:");
        String nome = input.next();

        System.out.println("Escolha uma habilidade inicial para " + nome + ":");
        System.out.println("1. Força Aumentada");
        System.out.println("2. Agilidade Rápida");
        System.out.println("3. Inteligência Brilhante");

        int habilidadeEscolhida = input.nextInt();
        switch (habilidadeEscolhida) {
            case 1:
                System.out.println("Força Aumentada");
                break;
            case 2:
                System.out.println("Agilidade Rápida");
                break;
            case 3:
                System.out.println("Inteligência Brilhante");
                break;
            default:
                System.out.println("Habilidade inválida, nenhuma habilidade adicionada.");
        }

        System.out.println("Personagem criado: " + nome + " (Gênero: " + (genero == 'M' ? "Masculino" : "Feminino")
                + ", Habilidade: " + habilidadeEscolhida + ")");
    }

    private static void modox1() {
    }

    private static void Instrução() {

    }

    private static void creditos() {

    }

    private static void sair() {
        System.out.println("Saindo... Até a proxima");
    }

}
