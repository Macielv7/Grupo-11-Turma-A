
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
                    System.out.println("Tem certeza ue desejar sair do jogo? (SIm/Não)");
                    String confirmação6 = entrada.next(); 
                    Thread.sleep(800);
                    
                    if(confirmação6.equalsIgnoreCase("sim")){
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

   
    private static void jogo() throws InterruptedException {
        Scanner jogo1 = new Scanner (System.in);

        System.out.print("A ");
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
        System.out.print("S ");
        Thread.sleep(300);

        sid();


    
    }



    private static void sid() {
        System.out.println("yes");
    }


    private static void modox1() {
    }

    private static void Instrução() {

    }

    private static void creditos() {

    }

    private static void sair(){
        System.out.println("Saindo... Até a proxima");
    } 



}