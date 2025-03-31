package sistema;
import java.util.Scanner;
public class Conversor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("== CONVERSOR DE TEMPERATURA ==");
        System.out.println("1. Converter temperatura");
        System.out.println("2. Ver hisórico");
        System.out.println("4. Sair");
        System.out.println("Escolha uma opção: ");
        int opcao_Escolhida = scanner.nextInt();
        System.out.println("");

        float[] temperaturas = new float[5];
        int posicao_Vetor = -1;
        String unidade_Atual;
        String unidade_Converter;        
        
        while (true) {
            switch (opcao_Escolhida) {
                case 1:
                    System.out.println("[CONVERSÃO]");
                    System.out.println("Digite a temperatura: ");
                    if (posicao_Vetor == 5) {
                        posicao_Vetor = -1;
                    } //Caso chegue a 5 voltar á 1° posição
                    if (posicao_Vetor < 5){
                        posicao_Vetor++;
                    } //limitar a apenas 5 posições
                    temperaturas[posicao_Vetor] = scanner.nextInt();
                    System.out.println("Unidade atual (C/F/K): ");
                    unidade_Atual = scanner.nextLine();
                        switch (unidade_Atual) {
                            case C:

                                break;
                            case F:
                                
                                break;
                            case K:
                                
                                break;
                            default:
                                System.out.println("Opção inválida: ");
                        }
                    System.out.println("Converter para (C/F/K): ");
                        switch (unidade_Converter) {
                            case C:
                                
                                break;
                            case F:
                            
                                break;
                            case K:
                            
                                break;
                            default:
                                System.out.println("Opção inválida: ");
                        }
                    System.out.println("Resultado: ");
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
            if (opcao_Escolhida == 4){
                System.out.println("Programa finalizado!");
                break;
            }
            System.out.println("== CONVERSOR DE TEMPERATURA ==");
            System.out.println("1. Converter temperatura");
            System.out.println("2. Ver hisórico");
            System.out.println("4. Sair");
            System.out.println("Escolha uma opção: ");
            opcao_Escolhida = scanner.nextInt();
            System.out.println("");





        }
    }
    
}
