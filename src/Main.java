import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean continuar = true;

    System.out.println("=== Conversor de Moedas ===");

    while (continuar) {
        System.out.println("Digite a moeda de origem (BRL, USD, EUR)");
        String origem = scanner.nextLine().toUpperCase();

        System.out.println("Digite a moeda de destino (BRL, USD, EUR)");
        String destino = scanner.nextLine().toUpperCase();

        System.out.println("Digite o valor: ");
        double valor = scanner.nextDouble();
        scanner.nextLine(); 

        double resultado = Conversor.converter(origem, destino, valor);

        if (resultado >= 0) {
            System.out.printf("Resultado: %.2f %s = %.2f %s\n", valor, origem, resultado, destino);
        } else {
            System.out.println("Conversão inválida.");
        }
        
        System.out.println("Deseja converter outro valor? (s/n): ");
        String resposta = scanner.nextLine().toLowerCase();
        if (!resposta.equals("s")) {
            continuar = false;
        }
    }

    System.out.println("Obrigado por usar o converso!");
    scanner.close();
    }
}