package httpclient.hw3;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Practicum {

    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();

        // укажите URL запроса, включая его параметры
        URI uri = URI.create("https://api.exchangerate.host/convert?base=RUB&sympols=USD,EUR");

        // создайте объект, описывающий запрос с необходимой информацией
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(uri)
                .version(HttpClient.Version.HTTP_1_1)
                .header("Accept", "text/html")
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Код статуса: " + response.statusCode());
            System.out.println("Ответ: " + response.body());
        } catch (IOException | InterruptedException e) { // обработка ошибки отправки запроса
            System.out.println("Во время выполнения запроса ресурса по URL-адресу: '" + uri + "' возникла ошибка.\n" +
                    "Проверьте, пожалуйста, адрес и повторите попытку.");
        }
    }
}