package http.hw2;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class Practicum {
    private static final int PORT = 8080;

    public static void main(String[] args) throws IOException {
        HttpServer httpServer = HttpServer.create();

        httpServer.bind(new InetSocketAddress(PORT), 0);
        httpServer.createContext("/hello", new HelloHandler());
        httpServer.start();
        System.out.println("HTTP-сервер запущен на " + PORT + " порту!");
        httpServer.stop(1);
    }

    static class HelloHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange httpExchange) throws IOException {
            String response;

            // извлеките метод из запроса
            String method = httpExchange.getRequestMethod();

            switch(method) {
                // сформируйте ответ в случае, если был вызван POST-метод
                case "GET":
                    response = "Здравствуйте!";
                    break;
                case "POST":
                    // извлеките тело запроса
                    InputStream inputStream = httpExchange.getRequestBody();
                    String body = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
                    // извлеките path из запроса
                    String path = httpExchange.getRequestURI().getPath();
                    // а из path — профессию и имя
                    String profession = path.split("/")[2];
                    String name = path.split("/")[3];
                    // извлеките заголовок
                    Headers requestHeaders = httpExchange.getRequestHeaders();
                    List<String> wishGoodDay = requestHeaders.get("X-Wish-Good-Day");

                    // соберите ответ
                    if ((wishGoodDay != null) && (wishGoodDay.contains("true"))) {
                        response = body + ", " + profession + " " + name + "!" + " Хорошего дня!";
                    } else {
                        response = body + ", " + profession + " " + name + "!";
                    }
                    break;
                default:
                    // не забудьте про ответ для остальных методов
                    response = "Некорректный метод!";

            }

            httpExchange.sendResponseHeaders(200, 0);
            try (OutputStream os = httpExchange.getResponseBody()) {
                os.write(response.getBytes());
            }
        }
    }
}