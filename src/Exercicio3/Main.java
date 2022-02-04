package Exercicio3;

public class Main {
    public static void main(String[] args){
        Filme filme1 = new Filme("Star Wars", 120, "12:30");
        Filme filme2 = new Filme("Star Wars 2", 130, "14:30");
        Cinema cinema = new Cinema("Pipoca", "Rua da lagoa");

        //adicionando filmes
        cinema.adicionarFilme(filme1);
        cinema.adicionarFilme(filme2);

        //removendo filme
        cinema.removerFilme(filme1);

        //
        filme1.calcularDuracaoEmHoras();
        filme1.retornarHoraQueAcaba();

    }
}
