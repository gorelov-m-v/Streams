package httpclient.test2;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Practicum {
    public static void main(String[] args) {
        String url = "ывавыаыва/";

        // добавьте отлов и обработку исключений вокруг кода ниже
        URI uri = URI.create(url);

        // создаём запрос
        HttpRequest request = HttpRequest.newBuilder().GET().uri(uri).build();

        // создаём HTTP-клиент
        HttpClient client = HttpClient.newHttpClient();

        // отправляем запрос

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return;
        } catch (IOException | InterruptedException ex) {
            System.out.println("Во время выполнения запроса возникла ошибка. Проверьте," +
                    " пожалуйста, URL-адрес и повторите попытку.");
            return;
        } catch (IllegalArgumentException ex) {
            System.out.println("Введённый вами адрес не соответствует формату URL. " +
                    "Попробуйте, пожалуйста, снова.");
            return;
        }

    }
}