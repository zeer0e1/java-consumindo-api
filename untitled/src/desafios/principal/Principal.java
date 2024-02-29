package desafios.principal;

import com.google.gson.Gson;
import desafios.classes.Pessoa;

public class Principal {
    public static void main(String[] args) {
        String json = """
                {
                    "nome" : "joão",
                    "idade" : 30,
                    "cidade" : "Sorocaba"
                }
                
                """;

        Gson gson = new Gson();
        Pessoa pessoa = gson.fromJson(json, Pessoa.class);
        System.out.println(pessoa.nome());

    }
}
