import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Rpg {
    
    // Lista de perguntas globais para todos os cenários
    private static List<String[]> perguntasAlternativasRespostas = new ArrayList<>();
    
    public static void main(String[] args) throws InterruptedException {
        // Preencher a lista de perguntas
        inicializarPerguntas();
        
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
        CavernaDoFogo(entrada);
        ReinoDaCaveira(entrada);
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
        System.out.println("Você entrou na Floresta das Almas...");
        Thread.sleep(1000);
        if (perguntaCenario(entrada)) {
            System.out.println("Você passou da Floresta das Almas!");
            Thread.sleep(1000);
            CavernaDoFogo(entrada);
        } else {
            System.out.println("Você falhou na Floresta das Almas! Fim de jogo.");
        }
    }

    public static void CavernaDoFogo(Scanner entrada) throws InterruptedException {
        System.out.println("Você entrou na Caverna do Fogo...");
        Thread.sleep(1000);
        if (perguntaCenario(entrada)) {
            System.out.println("Você passou pela Caverna do Fogo!");
            Thread.sleep(1000);
            ReinoDaCaveira(entrada);
        } else {
            System.out.println("Você falhou na Caverna do Fogo! Fim de jogo.");
        }
    }
    public static void ReinoDaCaveira(Scanner entrada) throws InterruptedException {
        System.out.println("Você entrou no Reino da Caveira...");
        Thread.sleep(1000);
        if (perguntaCenario(entrada)) {
            System.out.println("Você passou pelo Reino da Caveira!");
            Thread.sleep(1000);
            ReinoDasSombrasDeNoxis(entrada);
        } else {
            System.out.println("Você falhou no Reino da Caveira! Fim de jogo.");
        }
    }

    public static void ReinoDasSombrasDeNoxis(Scanner entrada) throws InterruptedException {
        System.out.println("Você entrou no Reino das Sombras de Noxis...");
        Thread.sleep(1000);
        if (perguntaCenario(entrada)) {
            System.out.println("Você passou pelo Reino das Sombras de Noxis!");
            Thread.sleep(1000);
            BatalhaFinalContraLordeKael(entrada);
        } else {
            System.out.println("Você falhou no Reino das Sombras de Noxis! Fim de jogo.");
        }
    }

    public static void BatalhaFinalContraLordeKael(Scanner entrada) throws InterruptedException {
        System.out.println("Você chegou à batalha final contra o Lorde Kael...");
        Thread.sleep(1000);
        if (perguntaCenario(entrada)) {
            System.out.println("Você venceu a batalha final contra o Lorde Kael! Vitória!");
        } else {
            System.out.println("Você falhou na batalha final contra o Lorde Kael! Fim de jogo.");
        }
    }
   
    public static boolean perguntaCenario(Scanner entrada) {
        // Sorteia uma pergunta
        Random rand = new Random();
        int perguntaEscolhidaIndex = rand.nextInt(perguntasAlternativasRespostas.size());
        String[] perguntaEscolhida = perguntasAlternativasRespostas.get(perguntaEscolhidaIndex);

        // Exibe a pergunta e as alternativas
        System.out.println(perguntaEscolhida[0]);
        System.out.println(perguntaEscolhida[1]);

        // Obtém a resposta do jogador
        String resposta = entrada.next();

        // Verifica se a resposta está correta
        if (resposta.equalsIgnoreCase(perguntaEscolhida[2])) {
            System.out.println("Resposta correta!");
            perguntasAlternativasRespostas.remove(perguntaEscolhidaIndex); // Remove a pergunta após ser respondida
            return true;
        } else {
            System.out.println("Resposta errada! O correto era: " + perguntaEscolhida[2]);
            return false;
        }
    }

    private static void inicializarPerguntas() {
        perguntasAlternativasRespostas.add(new String[]{
            "Qual seria a forma correta de declarar uma variável inteira chamada 'idade' e atribuir o valor 25 a ela?",
            "a) int idade = 25;\nb) idade = 25;\nc) 25 = idade;\nd) int 25 = idade;",
            "a"
        });
        perguntasAlternativasRespostas.add(new String[]{
            "Como você imprimiria a frase 'Olá, mundo!' na tela?",
            "a) print \"Olá, mundo!\";\nb) System.out.println(\"Olá, mundo!\");\nc) Console.WriteLine(\"Olá, mundo!\");\nd) Mostrar(\"Olá, mundo!\");",
            "b"
        });
        perguntasAlternativasRespostas.add(new String[]{
            "Qual seria a forma correta de criar um loop que se repete 10 vezes?",
            "a) for (int i = 0; i < 10; i++) { ... }\nb) while (i < 10) { ... }\nc) repeat 10 times { ... }\nd) loop 10 { ... }",
            "a"
        });
        perguntasAlternativasRespostas.add(new String[]{
            "Como você verificaria se um número armazenado na variável 'numero' é maior que 10?",
            "a) if numero > 10\nb) if (numero > 10)\nc) if numero = 10\nd) if (numero < 10)",
            "b"
        });
        perguntasAlternativasRespostas.add(new String[]{
            "Qual seria a forma correta de criar um array de 5 elementos do tipo inteiro?",
            "a) int[] numeros = new int[5];\nb) array numeros[5];\nc) int numeros[5] = {1, 2, 3, 4, 5};\nd) int[] numeros = {1, 2, 3, 4, 5};",
            "a"
        });
        // Adicione as outras perguntas aqui, conforme necessário...
    }

   private static void modox1() {
        System.out.println("Em Desenvolvimento...");
    }

    private static void Instrução() {
        System.out.println("");
    }

    private static void creditos() {
        System.out.println("Desenvolvido por Guilherme Rossi dos Santos,");
    }

    private static void sair() {
        System.out.println("Saindo... Até a próxima!");
    }
}
