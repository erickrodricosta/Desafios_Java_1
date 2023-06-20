/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dia_15;

/**
 *
 * @author ficdev
 */
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Desafio_15 {
    private static final String API_KEY = "ba7e6de2140e4a7eabaa0c000af6b03c";
    private static final String API_URL = "https://api.weatherbit.io/v2.0/current?city=%s&key=%s";

    public static void main(String[] args) {
        String cidade = "Cuiabá"; // Nome da cidade que você deseja obter o clima

        try {
            String url = String.format(API_URL, cidade, API_KEY);
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();

            // Faz uma requisição GET para a API
            con.setRequestMethod("GET");

            int responseCode = con.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                // Converte a resposta para um objeto JSON
                JSONObject json = new JSONObject(response.toString());

                // Obtém as informações do climasua_chave_sua_chave_de_api_aquide_api_aqui
                JSONArray data = json.getJSONArray("data");
                JSONObject clima = data.getJSONObject(0);
                double temperatura = clima.getDouble("temp");
                int umidade = clima.getInt("rh");
                String descricao = clima.getJSONObject("weather").getString("description");

                // Exibe as informações do clima
                System.out.println("Cidade: " + cidade);
                System.out.println("Temperatura: " + temperatura + "°C");
                System.out.println("Umidade: " + umidade + "%");
                System.out.println("Descrição: " + descricao);
            } else {
                System.out.println("Erro ao obter informações do clima. Código de resposta: " + responseCode);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
