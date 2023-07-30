package http.hw1;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.List;
import java.util.Random;

public class Practicum {
    private static final int PORT = 8080;

    // IOException могут сгенерировать методы create() и bind(...)
    public static void main(String[] args) throws IOException {
        HttpServer httpServer = HttpServer.create();

        httpServer.bind(new InetSocketAddress(PORT), 0);
        httpServer.createContext("/hello", new HelloHandler());
        httpServer.createContext("/day", new DayHandler());
        // добавьте новый обработчик для /day тут
        httpServer.start(); // запускаем сервер

        System.out.println("HTTP-сервер запущен на " + PORT + " порту!");
        httpServer.stop(1);
    }

    static class HelloHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange httpExchange) throws IOException {
            System.out.println("Началась обработка /hello запроса от клиента.");

            String response = "Hey! Glad to see you on our server.";
            httpExchange.sendResponseHeaders(200, 0);

            try (OutputStream os = httpExchange.getResponseBody()) {
                os.write(response.getBytes());
            }
        }
    }

    static class DayHandler implements HttpHandler {

        @Override
        public void handle(HttpExchange exchange) throws IOException {
            Random randomGenerator = new Random();
            System.out.println("Началась обработка /day запроса от клиента.");

            String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

            exchange.sendResponseHeaders(200, 0);

            try (OutputStream os = exchange.getResponseBody()) {
                os.write(days[randomGenerator.nextInt(days.length)].getBytes());
            }
        }
    }
}