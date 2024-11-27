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
                        System.out.println("Iniciando o jogo...");
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
            System.out.println();
            System.out.println("Você se aventura na sombria Floresta das Almas...");
            Thread.sleep(1000);
            System.out.println("Uma caveira misteriosa aparece na sua frente, bloqueando seu caminho!");
            Thread.sleep(1000);
            System.out.println("A caveira sussurra: 'Para passar, aventureiro, responda corretamente minha pergunta... ou pereça!'");
            Thread.sleep(1000);
            System.out.println("Após criar coragem, você adentra a sombria **Floresta das Almas**.");
            Thread.sleep(1000);
            System.out.println("Árvores torcidas como garras parecem observar cada movimento seu.");
            Thread.sleep(1000);
            System.out.println("Lamentos ecoam entre as folhas, e uma névoa densa cobre o chão, escondendo perigos desconhecidos.");
            Thread.sleep(1000);
            System.out.println("Uma voz misteriosa sussurra: 'Muitos entram aqui em busca de respostas, mas poucos saem com vida...'");
            Thread.sleep(1000);
        if (perguntaCenario(entrada)) {
            System.out.println("A caveira gargalha: Você é esperto, aventureiro! A resposta está correta!");
            Thread.sleep(1000);
            System.out.println("Assim abrindo espaço para seguir o seu caminho!");
            CavernaDoFogo(entrada);
        } else {
            System.out.println("A caveira se enfurece. Agora você pertence à Floresta das Almas!");
            Thread.sleep(1000);
            System.out.println("Você sente sua vida se esvaindo... Game Over.");
        }
    }

    public static void CavernaDoFogo(Scanner entrada) throws InterruptedException {
        System.out.println();
        System.out.println("Você entra na Caverna do Fogo, onde criaturas flamejantes bloqueiam seu caminho.");
        Thread.sleep(1000);
        System.out.println("O solo está coberto de cinzas e brasas, e o ar cheira a enxofre.");
        Thread.sleep(1000);
        System.out.println("Rios de lava cortam a paisagem, e rajadas de fogo dançam ao vento, como se quisessem testar sua coragem.");
        Thread.sleep(1000);
        System.out.println("Você sente que cada passo é observado por algo maligno escondido nas chamas.");
        Thread.sleep(1000);
    
        System.out.println("Uma voz ecoa pelo ar: 'Bem-vindo, mortal! Para atravessar este inferno, você deve provar seu valor.'");
        Thread.sleep(1000);

        System.out.println();
        System.out.println("A primeira figura surge das sombras ardentes. Seu nome é Pyron, o Guardião das Chamas Eternas.");
        Thread.sleep(1000);
        if (perguntaCenario(entrada)) {
            System.out.println("Pyron se dissipa em cinzas, liberando seu caminho.");
            Thread.sleep(1000);
            ReinoDaCaveira(entrada);
        } else {
            System.out.println("Pyron exala uma labareda intensa... Você foi queimado! Game Over.");
        }
    }
    public static void ReinoDaCaveira(Scanner entrada) throws InterruptedException {
        System.out.println();
        System.out.println("Após atravessar a Caverna do Fogo, você chega a um lugar ainda mais aterrorizante...");
        Thread.sleep(1000);
        System.out.println("Bem-vindo ao Reino da Caveira.");
        Thread.sleep(1000);
        System.out.println("Esse reino é governado pela escuridão, onde os mortos sussurram seus segredos e os vivos raramente sobrevivem.");
        Thread.sleep(1000);
        System.out.println("A névoa que cobre o chão parece sussurrar seu nome. Você sente que apenas os mais inteligentes e corajosos conseguem sair daqui com vida.");
        Thread.sleep(1000);
        System.out.println("Uma voz profunda e sombria ecoa no ar: 'Aventureiro, sua jornada está longe de terminar. Enfrente nossos desafios, ou junte-se a nós para sempre...'");
        Thread.sleep(1000);
        System.out.println();
        System.out.println("Você encontra Karron, o Esqueleto do Portal.");
        Thread.sleep(1000);

        if (perguntaCenario(entrada)) {
            System.out.println("Karron abre o portal para você prosseguir.");
            Thread.sleep(1000);
            ReinoDasSombrasDeNoxis(entrada);
        } else {
            System.out.println("Karron ri enquanto o portal se fecha. Game Over.");
        }
    }

    public static void ReinoDasSombrasDeNoxis(Scanner entrada) throws InterruptedException {
        System.out.println("Você entrou no Reino das Sombras de Noxis, onde a escuridão domina e a luz quase não existe...");
        Thread.sleep(1000);
        System.out.println("Este reino é habitado por criaturas feitas de pura sombra, e os ecos de almas perdidas sussurram segredos antigos.");
        Thread.sleep(1000);

        System.out.println();
        System.out.println("Ao caminhar, você percebe que o ambiente muda. As sombras parecem ganhar vida, tentando puxar você para o vazio.");
        Thread.sleep(1000);
        System.out.println("De repente, surge uma presença poderosa e aterrorizante...");
        Thread.sleep(1000);

        System.out.println("Uma voz grave ecoa na escuridão: 'Aventureiro ousado, você ousa desafiar o poder das sombras?'");
        Thread.sleep(1000);
        System.out.println("Das trevas surge Noxis, o Mestre das Sombras Eternas, empunhando uma lâmina negra que parece absorver toda a luz ao redor.");
        Thread.sleep(1000);

        System.out.println();
        System.out.println("Noxis aponta sua lâmina para você e diz: 'Se deseja passar por este reino, prove ser digno enfrentando meu enigma.'");
        Thread.sleep(1000);
        if (perguntaCenario(entrada)) {
            System.out.println("Você respondeu corretamente ao enigma de Noxis! Ele dá um passo para trás, permitindo que você passe.");
            Thread.sleep(1000);
            BatalhaFinalContraLordeKael(entrada);
        } else {
            System.out.println("Você falhou e as sombras de Noxis te engolem completamente! Game Over.");
        }
    }

    public static void BatalhaFinalContraLordeKael(Scanner entrada) throws InterruptedException {
        System.out.println();
        System.out.println("Você atravessa o portal deixado por Noxis e chega ao salão final...");
        Thread.sleep(1000);
        System.out.println("O lugar é dominado por um céu vermelho-sangue, e trovões ecoam ao longe.");
        Thread.sleep(1000);

        System.out.println("No centro do salão, um trono negro feito de ossos e sombras se ergue majestosamente.");
        Thread.sleep(1000);
        System.out.println("Sentado no trono está Lorde Kael, o Tirano das Trevas, com um olhar penetrante e uma aura de puro poder.");
        Thread.sleep(1000);

        System.out.println();
        System.out.println("Lorde Kael se levanta lentamente, empunhando uma espada flamejante que parece irradiar energia destrutiva.");
        Thread.sleep(1000);
        System.out.println("Ele diz com uma voz profunda e ameaçadora: 'Aventureiro... Você chegou até aqui, mas sua jornada termina agora.'");
        Thread.sleep(1000);

        System.out.println("Ele ergue sua espada e o desafia: 'Se você deseja derrotar-me, prove sua sabedoria e força! Responda ao meu enigma.'");
        Thread.sleep(1000);
        if (perguntaCenario(entrada)) {
            System.out.println();
            System.out.println("Lorde Kael cai de joelhos, surpreso com sua vitória.");
            Thread.sleep(1000);
            System.out.println("'Impressionante... Você realmente possui a força e a sabedoria para me derrotar,' ele diz antes de desaparecer em uma explosão de luz.");
            Thread.sleep(1000);
            System.out.println("Você venceu a batalha final contra o Lorde Kael! Vitória!");
            System.out.println();
            System.out.println("Após uma longa jornada, você finalmente derrotou o tirano Lorde Kael e trouxe a paz ao reino, voltando para seu lar.");
            Thread.sleep(1000);
            System.out.println("Obrigado por jogar 'A Lâmina dos Desafios'! Até a próxima aventura!");
            Thread.sleep(1000);
        } else {
            System.out.println();
            System.out.println("Lorde Kael ri maliciosamente: 'Patético! Sua fraqueza será sua ruína.'");
            Thread.sleep(1000);
            System.out.println("Ele desfere um golpe final devastador, e sua jornada chega ao fim... Fim de jogo.");
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
        System.out.println("Desenvolvido por Guilherme Rossi dos Santos.");
        System.out.println("Desenvolvido por Luan de Siqueira Oliveira.");
        System.out.println("Desenvolvido por Lucas Gabriel da Silva.");
        System.out.println("Desenvolvido por Maciel.");
    }

    private static void sair() {
        System.out.println("Saindo... Até a próxima!");
    }
}
