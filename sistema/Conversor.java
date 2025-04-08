package sistema;
import java.util.Scanner;

public class Conversor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("== CONVERSOR DE TEMPERATURA ==");
        System.out.println("1. Converter temperatura");
        System.out.println("2. Ver hisórico");
        System.out.println("3. Estatísticas");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
        int opcao_Escolhida = scanner.nextInt();
        System.out.println("");

        double temperatura;
        int posicao_Vetor = -1; 
        double[] resultado = new double[5];      
        
        while (opcao_Escolhida != 4) {
            switch (opcao_Escolhida) {
                case 1:
                    System.out.println("[CONVERSÃO]");
                    System.out.print("Digite a temperatura: ");
                    if (posicao_Vetor < 5){ //limitar a apenas 5 posições
                        posicao_Vetor++;
                    }
                    temperatura = scanner.nextInt();
                    System.out.print("Unidade atual (C/F/K): ");
                    String unidade_Atual = scanner.next().trim().toUpperCase(); //ler o valor e colocar em maiúsculo
                    System.out.print("Converter para (C/F/K): ");
                    String unidade_Converter = scanner.next().trim().toUpperCase();

                    //Conversão  
                    if (unidade_Atual.equals("C")) { //Celsius 
                        if (unidade_Converter.equals("F")) {
                            resultado[posicao_Vetor] = (temperatura * 9 / 5) + 32; //Celsius para Fahrenheit
                        } else if (unidade_Converter.equals("K")) {
                            resultado[posicao_Vetor] = temperatura + 273.15; //Celsius para Kelvin
                        } else {
                            System.out.println("Opção inválida!");
                            return;
                        }    
                    } else                   
                    if (unidade_Atual.equals("F")) { //Fahrenheit
                        if (unidade_Converter.equals("C")) {
                            resultado[posicao_Vetor] = (temperatura -32) * 5 / 9; //Fahrenheit para Celsius
                        } else if (unidade_Converter.equals("K")) {
                            resultado[posicao_Vetor] = (temperatura -32) * 5 / 9 + 273.15; //Fahrenheit para Kelvin
                        } else {
                            System.out.println("Opção inválida!");
                            return;
                        }     
                    } else
                    if (unidade_Atual.equals("K")) { //Kelvin
                        if (unidade_Converter.equals("C")) {
                            resultado[posicao_Vetor] = temperatura - 273.15; //Kelvin para Celsius
                        } else if (unidade_Converter.equals("F")) {
                            resultado[posicao_Vetor] = (temperatura - 273.15) * 9 / 5 + 32; //Kelvin para Fahrenheit
                        } else {
                            System.out.println("Opção inválida!");
                            return;
                        }    
                    } else {//Caso não seja nenhuma opção
                        System.out.println("Opção inválida!");
                        return;
                    }
                    System.out.printf("Resultado: %.2f %s\n", resultado[posicao_Vetor],unidade_Converter);
                    System.out.println("");
                    
                    //Padronizar tudo em Celsius
                    if (unidade_Converter.equals("F")){
                        resultado[posicao_Vetor] = (resultado[posicao_Vetor] -32) * 5 / 9;
                    }
                    if (unidade_Converter.equals("K")){
                        resultado[posicao_Vetor] = resultado[posicao_Vetor] - 273.15;
                    }
                    
                    break;
                case 2:
                    System.out.println("[HISTÓRICO]");
                    for (int i = 0 ; i <= posicao_Vetor ; i++){
                        System.out.println((i + 1) + ". " + String.format("%.2f",resultado[i]) + "°C");
                    }
                    System.out.println("");
                    break;
                case 3:

                    double menor = resultado[0];
                    double maior = resultado[0];
                    double soma = 0.0;
                    for (int i = 1; i <= 5; i++) {    
                        if (menor > resultado[i]){//comparar o menor dos valores
                            menor = resultado[i];
                        }
                        if (maior < resultado[i]){//comparar o maior dos valores
                            maior = resultado[i];
                        }         
                        soma += resultado[i]; //somar todos os resultados
                    }

                    double media = soma / posicao_Vetor ; //media dos resultados

                    System.out.println("[ESTATÍSTICAS]");
                    System.out.println("Menor: " + String.format("%.2f", menor));
                    System.out.println("Maior: " + String.format("%.2f", maior));
                    System.out.println("Média: " + String.format("%.2f", media));
                    break;
                default:
                    System.out.println("Opção inválida!");
                    System.out.println("");
            }

            System.out.println("== CONVERSOR DE TEMPERATURA ==");
            System.out.println("1. Converter temperatura");
            System.out.println("2. Ver hisórico");
            System.out.println("3. Estatísticas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao_Escolhida = scanner.nextInt();
            System.out.println("");

        }
        System.out.println("Programa finalizado!");
        scanner.close();
    }
    
}
