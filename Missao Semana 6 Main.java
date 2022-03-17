package testeMissaoSemana6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitorScanner = new Scanner(System.in);

        char continua = 'S';

        double celsius = 0.0d;
        double fahrenheit = 0.0d;
        double cotacao = 0.0d;
        double real = 0.0d;
        double dolar = 0.0d;

        System.out.println("BEM VINDO(A) AO PROGRAMA DE CONVERSAO.");
        System.out.println("");
        System.out.println("Favor informar a cotacao do dolar para real:");
        cotacao = leitorScanner.nextDouble();
        System.out.println("");

        int opcaoMenu = 0;

        while (opcaoMenu != 3) {
            System.out.println("Opoes do conversor:");
            System.out.println("1 - Temperatura");
            System.out.println("2 - Moeda");
            System.out.println("3 - Sair");
            System.out.println("Escolha uma opcao:");

            opcaoMenu = leitorScanner.nextInt();

            switch (opcaoMenu) {
                case 1:
                    System.out.println("----------------------------------------");
                    System.out.println("Iniciando conversor de Temperatura:");
                    System.out.println("----------------------------------------");

                    int opcaoTemperatura = 0;

                    while (opcaoTemperatura != 3) {
                        System.out.println("1 - Celsius para Fahrenheit");
                        System.out.println("2 - Fahrenheit para Celsius");
                        System.out.println("3 - Voltar ao menu principal");
                        System.out.println("Escolha uma opcao:");

                        opcaoTemperatura = leitorScanner.nextInt();

                        switch (opcaoTemperatura) {
                            case 1:
                                System.out.println("----------------------------------------");
                                System.out.println("Celsius para Fahrenheit:");
                                System.out.println("");
                                System.out.println("Diga a temperatura em Celsius:");

                                celsius = leitorScanner.nextDouble();

                                fahrenheit = ((1.8 * celsius) + 32);
                                System.out.println("A temperatura em Fahrenheit equivale a: " + fahrenheit);

                                System.out.println("Deseja continuar? S - sim / N - nao");
                                continua = leitorScanner.next().charAt(0);
                                if (continua == 'N' || continua == 'n') {
                                    opcaoTemperatura = 3;
                                    System.out.println("----------------------------------------");
                                    System.out.println("De volta ao menu principal:");
                                    System.out.println("----------------------------------------");
                                }
                                break;

                            case 2:
                                System.out.println("----------------------------------------");
                                System.out.println("Fahrenheit para Celsius:");
                                System.out.println("");
                                System.out.println("Diga a temperatura em Fahrenheit:");

                                fahrenheit = leitorScanner.nextDouble();

                                celsius = ((fahrenheit - 32) / 1.8);
                                System.out.println("A temperatura em Celsius equivale a: " + celsius);
                                
                                System.out.println("Deseja continuar? S - sim / N - nao");
                                continua = leitorScanner.next().charAt(0);
                                if (continua == 'N' || continua == 'n') {
                                    opcaoTemperatura = 3;
                                    System.out.println("----------------------------------------");
                                    System.out.println("De volta ao menu principal:");
                                    System.out.println("----------------------------------------");
                                }
                                break;
                            case 3:
                                System.out.println("----------------------------------------");
                                System.out.println("De volta ao menu principal:");
                                System.out.println("----------------------------------------");
                                break;
                            default:
                                System.out.println("----------------------------------------");
                                System.out.println("Opcao invalida.");
                                System.out.println("----------------------------------------");
                        }
                    }
                    break;

                case 2:
                    System.out.println("----------------------------------------");
                    System.out.println("Iniciando conversor de Moeda:");
                    System.out.println("----------------------------------------");

                    int opcaoMoeda = 0;

                    while (opcaoMoeda != 3) {
                        System.out.println("1 - Real para Dolar");
                        System.out.println("2 - Dolar para Real");
                        System.out.println("3 - Voltar ao menu principal");

                        opcaoMoeda = leitorScanner.nextInt();

                        switch (opcaoMoeda) {
                            case 1:
                                System.out.println("----------------------------------------");
                                System.out.println("Real para Dolar:");
                                System.out.println("Informe o valor em Real:");
                                real = leitorScanner.nextDouble();

                                dolar = (real / cotacao);

                                System.out.println("R$ " + real + " reais, equivalem a: US$ " + dolar + " dolares.");
                                
                                System.out.println("Deseja continuar? S - sim / N - nao");
                                continua = leitorScanner.next().charAt(0);
                                if (continua == 'N' || continua == 'n') {
                                    opcaoTemperatura = 3;
                                    System.out.println("----------------------------------------");
                                    System.out.println("De volta ao menu principal:");
                                    System.out.println("----------------------------------------");
                                }
                                break;
                            case 2:
                                System.out.println("----------------------------------------");
                                System.out.println("Dolar para Real:");
                                System.out.println("Informe o valor em Dolar:");
                                dolar = leitorScanner.nextDouble();

                                real = (dolar * cotacao);

                                System.out.println("US$ " + dolar + " dolares, equivalem a: R$ " + real + " reais.");
                                
                                System.out.println("Deseja continuar? S - sim / N - nao");
                                continua = leitorScanner.next().charAt(0);
                                if (continua == 'N' || continua == 'n') {
                                    opcaoTemperatura = 3;
                                    System.out.println("----------------------------------------");
                                    System.out.println("De volta ao menu principal:");
                                    System.out.println("----------------------------------------");
                                }
                                break;
                            case 3:
                                System.out.println("----------------------------------------");
                                System.out.println("De volta ao menu principal:");
                                System.out.println("----------------------------------------");
                            default:
                                System.out.println("----------------------------------------");
                                System.out.println("Opcao invalida.");
                                System.out.println("----------------------------------------");
                        }
                    }
                    break;
                case 3:
                    System.out.println("----------------------------------------");
                    System.out.println("VOLTE SEMPRE");
                    break;
                default:
                    System.out.println("----------------------------------------");
                    System.out.println("Opcao invalida.");
                    System.out.println("----------------------------------------");
            }
        }
    }
}
