package desafios.classes;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class GoogleBooks {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do livro que você deseja buscar: ");
        String nomeLivro = sc.nextLine();


        HttpClient client = HttpClient.newHttpClient();
        String apiKey = "AIzaSyBIMZ2xEs3TsjJcMflH89xkLbzKOuy-SX4";

        String endereco = "https://www.googleapis.com/books/v1/volumes?q="
                + nomeLivro
                + "+intitle:keyes&key="
                + apiKey;

        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();

        HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
        sc.close();
    }
}
