package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();

        System.out.println("=== Conversor de Moedas ===");

        while (true) {
            System.out.println("\nEscolha a moeda de origem:");
            converter.displayCurrencies();
            int fromIndex = scanner.nextInt();

            System.out.println("\nEscolha a moeda de destino:");
            converter.displayCurrencies();
            int toIndex = scanner.nextInt();

            System.out.print("\nDigite o valor a ser convertido: ");
            double amount = scanner.nextDouble();

            double result = converter.convert(fromIndex, toIndex, amount);
            if (result >= 0) {
                System.out.printf("\nResultado: %.2f\n", result);
            } else {
                System.out.println("Erro na conversão. Verifique suas entradas.");
            }

            System.out.print("\nDeseja realizar outra conversão? (s/n): ");
            String continueOption = scanner.next();
            if (!continueOption.equalsIgnoreCase("s")) {
                System.out.println("Encerrando o programa.");
                break;
            }
        }

        scanner.close();
    }
}
