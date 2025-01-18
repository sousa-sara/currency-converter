package org.example;

import java.util.List;

public class CurrencyConverter {
    private final ExchangeRateApiService apiService;
    private final List<String> currencies;

    public CurrencyConverter() {
        this.apiService = new ExchangeRateApiService();
        this.currencies = List.of("ARS", "BOB", "BRL", "CLP", "COP", "USD");
    }

    public void displayCurrencies() {
        for (int i = 0; i < currencies.size(); i++) {
            System.out.printf("[%d] %s\n", i, currencies.get(i));
        }
    }

    public double convert(int fromIndex, int toIndex, double amount) {
        if (fromIndex < 0 || fromIndex >= currencies.size() ||
                toIndex < 0 || toIndex >= currencies.size()) {
            return -1; // Erro: índices inválidos
        }

        String fromCurrency = currencies.get(fromIndex);
        String toCurrency = currencies.get(toIndex);

        double rate = apiService.getExchangeRate(fromCurrency, toCurrency);
        return rate >= 0 ? amount * rate : -1; // Retorna -1 em caso de erro
    }
}
