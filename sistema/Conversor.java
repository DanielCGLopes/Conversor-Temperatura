package sistema;
import java.util.Scanner;
public class Conversor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("== CONVERSOR DE TEMPERATURA ==");
        System.out.println("1. Converter temperatura");
        System.out.println("2. Ver hisórico");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
        int opcao_Escolhida = scanner.nextInt();
        System.out.println("");

        double[] temperaturas = new double[5];
        int posicao_Vetor = -1; 
        double resultado = 0.0;      
        
        while (opcao_Escolhida != 4) {
            switch (opcao_Escolhida) {
                case 1:
                    System.out.println("[CONVERSÃO]");
                    System.out.print("Digite a temperatura: ");
                    if (posicao_Vetor == 5) {
                        posicao_Vetor = -1;
                    } //Caso chegue a 5 voltar á 1° posição
                    if (posicao_Vetor < 5){
                        posicao_Vetor++;
                    } //limitar a apenas 5 posições
                    temperaturas[posicao_Vetor] = scanner.nextInt();
                    System.out.print("Unidade atual (C/F/K): ");
                    String unidade_Atual = scanner.next().trim().toUpperCase(); //ler o valor e colocar em maiúsculo
                    System.out.print("Converter para (C/F/K): ");
                    String unidade_Converter = scanner.next().trim().toUpperCase();

                    //Conversão  
                    if (unidade_Atual.equals("C")) { //Celsius 
                        if (unidade_Converter.equals("F")) {
                            resultado = (temperaturas[posicao_Vetor] * 9 / 5) + 32; //Celsius para Fahrenheit
                        } else if (unidade_Converter.equals("K")) {
                            resultado = temperaturas[posicao_Vetor] + 273.15; //Celsius para Kelvin
                        } else {
                            System.out.println("Opção inválida!");
                            return;
                        }    
                    } else                   
                    if (unidade_Atual.equals("F")) { //Fahrenheit
                        if (unidade_Converter.equals("C")) {
                            resultado = (temperaturas[posicao_Vetor] -32) * 5 / 9; //Fahrenheit para Celsius
                        } else if (unidade_Converter.equals("K")) {
                            resultado = (temperaturas[posicao_Vetor] -32) * 5 / 9 + 273.15; //Fahrenheit para Kelvin
                        } else {
                            System.out.println("Opção inválida!");
                            return;
                        }     
                    } else
                    if (unidade_Atual.equals("K")) { //Kelvin
                        if (unidade_Converter.equals("C")) {
                            resultado = temperaturas[posicao_Vetor] - 273.15; //Kelvin para Celsius
                        } else if (unidade_Converter.equals("F")) {
                            resultado = (temperaturas[posicao_Vetor] - 273.15) * 9 / 5 + 32; //Kelvin para Fahrenheit
                        } else {
                            System.out.println("Opção inválida!");
                            return;
                        }    
                    } else {//Caso não seja nenhuma opção
                        System.out.println("Opção inválida!");
                        return;
                    }
                    System.out.printf("Resultado: %.2f %s\n", resultado , unidade_Converter);
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("[HISTÓRICO]");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("[ESTATÍSTICAS]");
                    System.out.println("Menor: ");
                    System.out.println("Maior: ");
                    System.out.println("Média: ");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    System.out.println("");
            }

            System.out.println("== CONVERSOR DE TEMPERATURA ==");
            System.out.println("1. Converter temperatura");
            System.out.println("2. Ver hisórico");
            System.out.println("4. Sair");
            System.out.println("Escolha uma opção: ");
            opcao_Escolhida = scanner.nextInt();
            System.out.println("");





        }
        System.out.println("Programa finalizado!");
    }
    
}
