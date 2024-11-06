
import java.util.Scanner;

public class Rpg {
    public static void main(String[] args) throws InterruptedException {
        Scanner entrada = new Scanner(System.in);

        int opcao;

        System.out.println("A lâmina dos Desafios!");

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
                    System.out.println("Deseja iniciar o Jogo? (Sim/Não)");
                    Thread.sleep(800);
                    String confirmacao = entrada.next();

                    if (confirmacao.equalsIgnoreCase("sim")) {
                        System.out.println("Iniciando o jogo... // tocar video em popup");
                        Thread.sleep(800);
                        jogo(entrada);
                    } else {
                        System.out.println("Retornando ao Menu Inicial... ");
                    }
                    break;

                case 2:
                    System.out.println("Você escolheu a opção Instruções");
                    Thread.sleep(1000);
                    System.out.println("Abrindo o menu de Instrução de Jogo... ");
                    Thread.sleep(800);
                    Instrução();
                    break;

                case 3:
                    System.out.println("Você escolheu a opção de Modo X1");
                    Thread.sleep(1000);
                    System.out.println("Deseja Prosseguir para o Modo X1? (Sim/Não)");
                    String confirmacao4 = entrada.next();
                    Thread.sleep(800);

                    if (confirmacao4.equalsIgnoreCase("sim")) {
                        System.out.println("Iniciando o Modo X1... ");
                        modox1();
                    } else {
                        System.out.println("Retornando ao Menu Inicial... ");
                    }
                    break;

                case 4:
                    System.out.println("Você escolheu a opção de Créditos");
                    Thread.sleep(1000);
                    System.out.println("Abrindo os Créditos... ");
                    Thread.sleep(800);
                    creditos();
                    break;

                case 5:
                    System.out.println("Você escolheu a opção Sair");
                    Thread.sleep(1000);
                    System.out.println("Tem certeza que deseja sair do jogo? (Sim/Não)");
                    String confirmacao6 = entrada.next();
                    Thread.sleep(800);

                    if (confirmacao6.equalsIgnoreCase("sim")) {
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

    private static void jogo(Scanner entrada) throws InterruptedException {
        System.out.print("         A ");
        Thread.sleep(300);
        System.out.print("L");
        Thread.sleep(300);
        System.out.print("A");
        Thread.sleep(300);
        System.out.print("M");
        Thread.sleep(300);
        System.out.print("I");
        Thread.sleep(300);
        System.out.print("N");
        Thread.sleep(300);
        System.out.print("A ");
        Thread.sleep(300);

        System.out.print("D");
        Thread.sleep(300);
        System.out.print("O");
        Thread.sleep(300);
        System.out.print("S ");
        Thread.sleep(300);
        System.out.print("D");
        Thread.sleep(300);
        System.out.print("E");
        Thread.sleep(300);
        System.out.print("S");
        Thread.sleep(300);
        System.out.print("A");
        Thread.sleep(300);
        System.out.print("F");
        Thread.sleep(300);
        System.out.print("I");
        Thread.sleep(300);
        System.out.print("O");
        Thread.sleep(300);
        System.out.println("S           ");
        Thread.sleep(300);

        criarPersonagem(entrada);
        FlorestaDasAlmas(entrada);
    }

    private static void criarPersonagem(Scanner entrada) throws InterruptedException {
        int opcaoPersonagem;
        String nomeRPG = "";
        String generoRPG = "";
        String classeRPG = "";
        int nomeConfirmado = 0;
        int generoConfirmado = 0;
        int classeConfirmada = 0;

        System.out.println("Criação de Personagem: ");
        Thread.sleep(1000);
        do {
            System.out.println("Opções: ");
            System.out.println("1 - Nome ");
            System.out.println("2 - Gênero ");
            System.out.println("3 - Classe ");
            opcaoPersonagem = entrada.nextInt();

            switch (opcaoPersonagem) {
                case 1:
                    System.out.println("Digite o nome para o seu personagem: ");
                    nomeRPG = entrada.next();
                    System.out.println("Seu nome será " + nomeRPG + ", Deseja salvar? Sim/Não");
                    String opc = entrada.next();
                    if (opc.equalsIgnoreCase("Sim")) {
                        System.out.println("Nome salvo... ");
                        nomeConfirmado = 1;
                    }
                    break;

                case 2:
                    System.out.println("Escolha um gênero para o seu personagem: ");
                    generoRPG = entrada.next();
                    System.out.println(nomeRPG + ", o gênero do seu personagem será: " + generoRPG + " Deseja salvar? Sim/Não");
                    String opc1 = entrada.next();
                    if (opc1.equalsIgnoreCase("Sim")) {
                        System.out.println("Gênero salvo... ");
                        generoConfirmado = 5;
                    }
                    break;

                case 3:
                    System.out.println("Escolha uma classe para o seu personagem: ");
                    System.out.println("1 - Guerreiro ");
                    System.out.println("2 - Mago ");
                    System.out.println("3 - Arqueiro ");
                    String classeEscolha = entrada.next();
                    if (classeEscolha.equals("1")) {
                        classeRPG = "Guerreiro";
                    } else if (classeEscolha.equals("2")) {
                        classeRPG = "Mago";
                    } else if (classeEscolha.equals("3")) {
                        classeRPG = "Arqueiro";
                    }
                    System.out.println(nomeRPG + ", Sua classe é " + classeRPG + ", Deseja salvar? Sim/Não");
                    String opc2 = entrada.next();
                    if (opc2.equalsIgnoreCase("Sim")) {
                        System.out.println("Classe Salva... ");
                        classeConfirmada = 1;
                    }
                    break;

                default:
                    System.out.println("Opção inválida...");
                    break;
            }
        } while ((nomeConfirmado + generoConfirmado + classeConfirmada) != 7);

        System.out.println("Personagem criado: " + nomeRPG + ", " + generoRPG + ", " + classeRPG);
    }

    public static void FlorestaDasAlmas(Scanner entrada) throws InterruptedException {
        System.out.println();
        System.out.println("Você se aventura na sombria Floresta das Almas...");
        System.out.println("Uma caveira misteriosa aparece na sua frente, bloqueando seu caminho!");
        System.out.println("A caveira sussurra: 'Para passar, aventureiro, responda corretamente minha pergunta... ou pereça!'");
        
        System.out.println();
        System.out.println("Pergunta: Qual é o número de almas perdidas na Floresta?");
        System.out.println("Escolha uma opção:");
        System.out.println("1 - 13 almas");
        System.out.println("2 - 42 almas");
        System.out.println("3 - 66 almas");
        System.out.println("4 - 99 almas");
    
        System.out.print("Digite o número da sua escolha (1, 2, 3 ou 4): ");
        int escolha = entrada.nextInt();
    
        if (escolha == 3) {
            System.out.println();
            System.out.println("A caveira gargalha: Você é esperto, aventureiro! A resposta está correta!");
            System.out.println("Você sobreviveu e recebeu um amuleto das almas como recompensa.");
            Thread.sleep(300);
    
            int tentativas = 3; 
            boolean acertou = false;
            System.out.println();
            System.out.println("Você se encontra na sombria Caverna dos Mistérios...");
            System.out.println("Na parede, há uma inscrição enigmática que parece ativar uma armadilha se você errar a resposta!");
            System.out.println("A inscrição diz: 'Para sobreviver, diga-me: Qual número nunca aumenta nem diminui?'");
            System.out.println();
            // Laço do/while para permitir tentativas múltiplas até acertar ou perder todas as vidas
            do {
                System.out.println();
                System.out.println("Escolha uma opção:");
                System.out.println("1 - Zero");
                System.out.println("2 - Um");
                System.out.println("3 - Infinito");
                System.out.println("4 - Nada");
                System.out.println();

                System.out.print("Digite o número da sua escolha (1, 2, 3 ou 4): ");
                escolha = entrada.nextInt();
    
                if (escolha == 1) {
                    System.out.println();
                    System.out.println("Você acertou! A resposta é zero.");
                    System.out.println("A armadilha se desativa, e você continua sua jornada!");
                    acertou = true;
                    System.out.println();
                } else {
                    tentativas--;
                    System.out.println();
                    System.out.println("Resposta incorreta! A inscrição brilha intensamente... cuidado!");
                    if (tentativas > 0) {
                        System.out.println();
                        System.out.println("Você tem mais " + tentativas + " tentativa(s) restante(s).");
                    } else {
                        System.out.println();
                        System.out.println("A armadilha é ativada! Você foi pego e não sobreviveu... Game Over.");
                    }
                }
    
            } while (!acertou && tentativas > 0);
    
        } else {
            System.out.println("A caveira se enfurece: Resposta errada! Agora você pertence à Floresta das Almas!");
            System.out.println("Você sente sua vida se esvaindo... Game Over.");
        }
    }    

    private static void modox1() {
    }

    private static void Instrução() {
    }

    private static void creditos() {
    }

    private static void sair() {
        System.out.println("Saindo... Até a próxima!");
    }
}
