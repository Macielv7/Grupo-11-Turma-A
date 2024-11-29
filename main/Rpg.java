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

            System.out.println("3 - Créditos");
            Thread.sleep(400);

            System.out.println("4 - Sair");
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
                    System.out.println("Você escolheu a opção de Créditos");
                    Thread.sleep(1000);
                    System.out.println("Abrindo os Créditos... ");
                    Thread.sleep(800);
                    creditos();
                    break;

                case 4:
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

    
    public static void limparTela() {
        // Dependendo do sistema operacional, o comando pode ser diferente
        String sistema = System.getProperty("os.name");

        try {
            if (sistema.contains("Windows")) {
                // Comando para limpar a tela no Windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void jogo(Scanner entrada) throws InterruptedException {
        limparTela();
        texto("         LAMINA DOS DESAFIOS         ");

        criarPersonagem(entrada);
        FlorestaDasAlmas(entrada);
        CavernaDoFogo(entrada);
        ReinoDaCaveira(entrada);
    }

    private static void criarPersonagem(Scanner entrada) throws InterruptedException {
        String nomeRPG = "";
        String generoRPG = "";
        String classeRPG = "";

        System.out.println("Criação de Personagem: ");
        Thread.sleep(1000);

        System.out.println("Digite o nome para o seu personagem: ");
        nomeRPG = entrada.next();

        System.out.println("Seu nome será " + nomeRPG + ". Deseja salvar? (Sim/Não)");
        String opcNome = entrada.next();

        if (!opcNome.equalsIgnoreCase("Sim")) {
            System.out.println("Digite o nome novamente: ");
            nomeRPG = entrada.next();
        }

        limparTela();

        String opcGenero;
        do {
            System.out.println("Escolha o gênero do seu personagem: ");
            System.out.println("1 - Masculino");
            System.out.println("2 - Feminino");
            System.out.println("3 - Outro");
            opcGenero = entrada.next();

            if (opcGenero.equals("1")) {
                generoRPG = "Masculino";
            } else if (opcGenero.equals("2")) {
                generoRPG = "Feminino";
            } else if (opcGenero.equals("3")) {
                generoRPG = "Outro";
            } else {
                System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
            }

        } while (!opcGenero.equals("1") && !opcGenero.equals("2") && !opcGenero.equals("3"));

        System.out.println("O gênero do seu personagem será " + generoRPG + ". Deseja salvar? (Sim/Não)");
        String opcGeneroConfirmar = entrada.next();

        if (!opcGeneroConfirmar.equalsIgnoreCase("Sim")) {
            System.out.println("Escolha o gênero novamente: ");
            opcGenero = entrada.next();
        }

        limparTela();

        String opcClasse;
        do {
            System.out.println("Escolha a classe do seu personagem: ");
            System.out.println("1 - Guerreiro");
            System.out.println("2 - Mago");
            System.out.println("3 - Arqueiro");
            opcClasse = entrada.next();

            if (opcClasse.equals("1")) {
                classeRPG = "Guerreiro";
            } else if (opcClasse.equals("2")) {
                classeRPG = "Mago";
            } else if (opcClasse.equals("3")) {
                classeRPG = "Arqueiro";
            } else {
                System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
            }

        } while (!opcClasse.equals("1") && !opcClasse.equals("2") && !opcClasse.equals("3"));

        System.out.println("A classe do seu personagem será " + classeRPG + ". Deseja salvar? (Sim/Não)");
        String opcClasseConfirmar = entrada.next();

        if (!opcClasseConfirmar.equalsIgnoreCase("Sim")) {
            System.out.println("Escolha a classe novamente: ");
            opcClasse = entrada.next();
        }

        limparTela();

        System.out.println("Personagem criado com sucesso!");
        System.out.println("Nome: " + nomeRPG + "\n" + "Gênero: " + generoRPG + "\n" + "Classe: " + classeRPG + "\n");
    }

    public static void texto(String texto) {
        for (int i = 0; i < texto.length(); i++) {
            System.out.print(texto.charAt(i)); // Imprime um caractere por vez
            try {
                Thread.sleep(80); // Pausa de 150 milissegundos entre cada caractere
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(); // Pula para a próxima linha após a "digitação"
    }

    public static void FlorestaDasAlmas(Scanner entrada) throws InterruptedException {
        texto("Floresta Das Almas \n");

        texto("Você se aventura na sombria Floresta das Almas...");
        texto("Uma caveira misteriosa aparece na sua frente, bloqueando seu caminho!");
        texto("A caveira sussurra: 'Para passar, aventureiro, responda corretamente minha pergunta... ou pereça!'");
        texto("Após criar coragem, você adentra a sombria **Floresta das Almas**.");
        texto("Árvores torcidas como garras parecem observar cada movimento seu.");
        texto("Lamentos ecoam entre as folhas, e uma névoa densa cobre o chão, escondendo perigos desconhecidos.");
        texto("Uma voz misteriosa sussurra: 'Muitos entram aqui em busca de respostas, mas poucos saem com vida...' \n");

        if (perguntaCenario(entrada)) {
            texto("A caveira gargalha: Você é esperto, aventureiro! A resposta está correta!");
            texto("Assim abrindo espaço para seguir o seu caminho!");
            CavernaDoFogo(entrada);
        } else {
            texto("A caveira se enfurece. Agora você pertence à Floresta das Almas!");
            texto("Você sente sua vida se esvaindo... Game Over.");
        }
        
    }

    public static void CavernaDoFogo(Scanner entrada) throws InterruptedException {
        limparTela();
        texto("Caverna Do Fogo \n");

        texto("Você entra na Caverna do Fogo, onde criaturas flamejantes bloqueiam seu caminho.");
        texto("O solo está coberto de cinzas e brasas, e o ar cheira a enxofre.");
        texto("Rios de lava cortam a paisagem, e rajadas de fogo dançam ao vento, como se quisessem testar sua coragem.");
        texto("Você sente que cada passo é observado por algo maligno escondido nas chamas.");
        texto("Uma voz ecoa pelo ar: 'Bem-vindo, mortal! Para atravessar este inferno, você deve provar seu valor.'");
        texto("A primeira figura surge das sombras ardentes. Seu nome é Pyron, o Guardião das Chamas Eternas. \n");

        if (perguntaCenario(entrada)) {
            texto("Pyron se dissipa em cinzas, liberando seu caminho.");
            ReinoDaCaveira(entrada);
        } else {
            texto("Pyron exala uma labareda intensa... Você foi queimado! Game Over.");
        }
        limparTela();
    }

    public static void ReinoDaCaveira(Scanner entrada) throws InterruptedException {
        limparTela();
        texto("Reino Da Caveira \n");

        texto("Após atravessar a Caverna do Fogo, você chega a um lugar ainda mais aterrorizante...");
        texto("Bem-vindo ao Reino da Caveira.");
        texto("Esse reino é governado pela escuridão, onde os mortos sussurram seus segredos e os vivos raramente sobrevivem.");
        texto("A névoa que cobre o chão parece sussurrar seu nome. Você sente que apenas os mais inteligentes e corajosos conseguem sair daqui com vida.");
        texto("Uma voz profunda e sombria ecoa no ar: 'Aventureiro, sua jornada está longe de terminar. Enfrente nossos desafios, ou junte-se a nós para sempre...'");
        texto("Você encontra Karron, o Esqueleto do Portal. \n");

        if (perguntaCenario(entrada)) {
            texto("Karron abre o portal para você prosseguir.");
            ReinoDasSombrasDeNoxis(entrada);
        } else {
            texto("Karron ri enquanto o portal se fecha. Game Over.");
        }
       
    }

    public static void ReinoDasSombrasDeNoxis(Scanner entrada) throws InterruptedException {
        limparTela();
        texto("Reino Das Sombras De Noxis \n");

        texto("Você entrou no Reino das Sombras de Noxis, onde a escuridão domina e a luz quase não existe...");
        texto("Este reino é habitado por criaturas feitas de pura sombra, e os ecos de almas perdidas sussurram segredos antigos.");
        texto("Ao caminhar, você percebe que o ambiente muda. As sombras parecem ganhar vida, tentando puxar você para o vazio.");
        texto("De repente, surge uma presença poderosa e aterrorizante...");
        texto("Uma voz grave ecoa na escuridão: 'Aventureiro ousado, você ousa desafiar o poder das sombras?'");
        texto("Das trevas surge Noxis, o Mestre das Sombras Eternas, empunhando uma lâmina negra que parece absorver toda a luz ao redor.");
        texto("Noxis aponta sua lâmina para você e diz: 'Se deseja passar por este reino, prove ser digno enfrentando meu enigma.' \n");

        if (perguntaCenario(entrada)) {
            texto("Você respondeu corretamente ao enigma de Noxis! Ele dá um passo para trás, permitindo que você passe.");

            BatalhaFinalContraLordeKael(entrada);
        } else {
            texto("Você falhou e as sombras de Noxis te engolem completamente! Game Over.");
        }

    }

    public static void BatalhaFinalContraLordeKael(Scanner entrada) throws InterruptedException {
        limparTela();
        texto("Batalha Final Contra Lorde Kael \n");

        texto("Você atravessa o portal deixado por Noxis e chega ao salão final...");
        texto("O lugar é dominado por um céu vermelho-sangue, e trovões ecoam ao longe.");
        texto("No centro do salão, um trono negro feito de ossos e sombras se ergue majestosamente.");
        texto("Sentado no trono está Lorde Kael, o Tirano das Trevas, com um olhar penetrante e uma aura de puro poder.");
        texto("Lorde Kael se levanta lentamente, empunhando uma espada flamejante que parece irradiar energia destrutiva.");
        texto("Ele diz com uma voz profunda e ameaçadora: 'Aventureiro... Você chegou até aqui, mas sua jornada termina agora.'");
        texto("Ele ergue sua espada e o desafia: 'Se você deseja derrotar-me, prove sua sabedoria e força! Responda ao meu enigma.' \n");

        if (perguntaCenario(entrada)) {
            texto("Lorde Kael cai de joelhos, surpreso com sua vitória.");
            texto("'Impressionante... Você realmente possui a força e a sabedoria para me derrotar,' ele diz antes de desaparecer em uma explosão de luz.");
            texto("Você venceu a batalha final contra o Lorde Kael! Vitória!");
            texto("Após uma longa jornada, você finalmente derrotou o tirano Lorde Kael e trouxe a paz ao reino, voltando para seu lar.");
            texto("Obrigado por jogar 'A Lâmina dos Desafios'! Até a próxima aventura!");
        } else {
            texto("Lorde Kael ri maliciosamente: 'Patético! Sua fraqueza será sua ruína.'");
            texto("Ele desfere um golpe final devastador, e sua jornada chega ao fim... Fim de jogo.");
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

            double vidainicial = vidainicial();
            double porcface = dado();
            double vidaAtual = autodano(porcface, vidainicial);
            
            return false;
        }
    }

    private static void inicializarPerguntas() {
        perguntasAlternativasRespostas.add(new String[] {
                "Qual seria a forma correta de declarar uma variável inteira chamada 'idade' e atribuir o valor 25 a ela?",
                "a) int idade = 25;\nb) idade = 25;\nc) 25 = idade;\nd) int 25 = idade;",
                "a"
        });
        perguntasAlternativasRespostas.add(new String[] {
                "Como você imprimiria a frase 'Olá, mundo!' na tela?",
                "a) print \"Olá, mundo!\";\nb) System.out.println(\"Olá, mundo!\");\nc) Console.WriteLine(\"Olá, mundo!\");\nd) Mostrar(\"Olá, mundo!\");",
                "b"
        });
        perguntasAlternativasRespostas.add(new String[] {
                "Qual seria a forma correta de criar um loop que se repete 10 vezes?",
                "a) for (int i = 0; i < 10; i++) { ... }\nb) while (i < 10) { ... }\nc) repeat 10 times { ... }\nd) loop 10 { ... }",
                "a"
        });
        perguntasAlternativasRespostas.add(new String[] {
                "Como você verificaria se um número armazenado na variável 'numero' é maior que 10?",
                "a) if numero > 10\nb) if (numero > 10)\nc) if numero = 10\nd) if (numero < 10)",
                "b"
        });
        perguntasAlternativasRespostas.add(new String[] {
                "Qual seria a forma correta de criar um array de 5 elementos do tipo inteiro?",
                "a) int[] numeros = new int[5];\nb) array numeros[5];\nc) int numeros[5] = {1, 2, 3, 4, 5};\nd) int[] numeros = {1, 2, 3, 4, 5};",
                "a"
        });
        // Adicione as outras perguntas aqui, conforme necessário...
    }

    public static double autodano(double porcface, double vidainicial) {
        double dano = 3;

        double danoefetivo = porcface * dano;
        double vidaatual = vidainicial - danoefetivo;

        System.out.println("porcentagem de dano: " + (porcface * 100) + "% e recebeu " + danoefetivo + " de dano.");
        System.out.println("Sua vida atual é: " + vidaatual);

        return vidaatual;
    }

    public static double vidainicial() {
        return 4;
    }

    public static double dado() {
        int face;
        Random aleatorio = new Random();
        double porcface = 0;

        for (int i = 1; i <= 1; i++) {
            System.out.println("Você errou a pergunta, agora sofrerá as consequências. Rode o dado");
            System.out.println("Lançando o dado... ");
            face = aleatorio.nextInt(6) + 1; // Sorteia um número de 1 a 6
            System.out.println("Você tirou o dado: " + face);

            if (face == 1) {
                porcface = 0.16;
            } else if (face == 2) {
                porcface = 0.33;
            } else if (face == 3) {
                porcface = 0.5;
            } else if (face == 4) {
                porcface = 0.66;
            } else if (face == 5) {
                porcface = 0.83;
            } else if (face == 6) {
                porcface = 1;
            }

        }

        return porcface;
    }

    private static void Instrução() {
        System.out.println("");
    }

    private static void creditos() {
        System.out.println("Desenvolvido por Guilherme Rossi dos Santos.");
        System.out.println("Desenvolvido por Luan de Siqueira Oliveira.");
        System.out.println("Desenvolvido por Lucas Gabriel da Silva.");
        System.out.println("Desenvolvido por Maciel Vinicius da costa.");
    }

    private static void sair() {
        System.out.println("Saindo... Até a próxima!");
    }
}
