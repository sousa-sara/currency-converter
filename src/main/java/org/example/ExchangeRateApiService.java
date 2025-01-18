package org.example;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;

public class ExchangeRateApiService {
    private static final String API_URL = "https://open.er-api.com/v6/latest/";
    private static final String API_KEY = "1af34fc4fd3701d767414b1b"; // Substitua pela sua chave de API

    public double getExchangeRate(String fromCurrency, String toCurrency) {
        try {
            String url = API_URL + fromCurrency + "?apikey=" + API_KEY;
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() == 200) {
                JsonObject jsonObject = JsonParser.parseString(response.body()).getAsJsonObject();
                JsonObject rates = jsonObject.getAsJsonObject("rates");

                if (rates.has(toCurrency)) {
                    return rates.get(toCurrency).getAsDouble();
                }
            }
        } catch (Exception e) {
            System.err.println("Erro ao obter a taxa de câmbio: " + e.getMessage());
        }
        return -1; // Retorna -1 em caso de erro
    }
}
