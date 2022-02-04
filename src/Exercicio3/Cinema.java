package Exercicio3;

import java.util.List;
import java.util.Scanner;

public class Cinema {
    private String nome;
    private String endereco;
    private List<Filme> filmesEmCartaz;

    public void adicionarFilme(Filme filme) {
        filmesEmCartaz.add(filme);

        for (Filme filmeEmCartaz : filmesEmCartaz) {
            System.out.println(filmeEmCartaz.getTitulo());
        }
    }

    public void removerFilme(Filme filme) {
        Scanner entrada = new Scanner(System.in);
        String confirmacao;
        System.out.println("Tem certeza que deseja remover este filme? ");
        confirmacao = entrada.next();
    }
}
