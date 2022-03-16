package MissaoSemana6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner leitorScanner = new Scanner(System.in);
        
        System.out.println("BEM VINDO(A) AO PROGRAMA DE CONVERSAO:");
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
                    
                    int opcaoTemperatura = 0;

                    while (opcaoTemperatura != 3) {
                        System.out.println("1 - Celsius para Fahrenheit");
                        System.out.println("2 - Fahrenheit para Celsius");
                        System.out.println("3 - Voltar ao menu principal"); 
                        System.out.println("Escolha uma opcao:");
                        
                        opcaoTemperatura = leitorScanner.nextInt();
                        
                        switch (opcaoTemperatura){
                            case 1:
                                System.out.println("----------------------------------------");
                                System.out.println("Celsius para Fahrenheit:");
                                break;
                            case 2:
                                System.out.println("----------------------------------------");
                                System.out.println("Fahrenheit para Celsius:");
                                break;
                            case 3:
                                System.out.println("----------------------------------------");
                                System.out.println("De volta ao menu principal:");
                                break;
                            default:
                                System.out.println("----------------------------------------");                           
                                System.out.println("Opcao invalida.");   
                        }
                    }
                    break;
                    
                case 2:
                    System.out.println("----------------------------------------");
                    System.out.println("Iniciando conversor de Moeda:");
                                        
                    int opcaoMoeda = 0;
                    
                    while (opcaoMoeda != 3){
                        System.out.println("1 - Real para Dolar");
                        System.out.println("2 - Dolar para Real");
                        System.out.println("3 - Voltar ao menu principal");
                        
                        opcaoMoeda = leitorScanner.nextInt();
                        
                        switch (opcaoMoeda){
                            case 1:
                                System.out.println("----------------------------------------");
                                System.out.println("Real para Dolar:");
                                break;
                            case 2: 
                                System.out.println("----------------------------------------");
                                System.out.println("Dolar para Real:");
                                break;
                            case 3:
                                System.out.println("----------------------------------------");
                                System.out.println("De volta ao menu principal:");
                            default:
                                System.out.println("----------------------------------------");
                                System.out.println("Opcao invalida.");    
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
            }   
        }
    }    
}
