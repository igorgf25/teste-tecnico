package Exercicio2;

import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int numero;
        int inicioIntervalo;
        int fimIntervalo;

        System.out.println("Digite o numero multiplicando que não seja negativo ou maior que 5000: ");
        numero = entrada.nextInt();
        validarNumero(numero);

        System.out.println("Digite o inicio do intervalo de multiplicação que não seja negativo ou maior que 5000: ");
        inicioIntervalo = entrada.nextInt();

        validarNumero(inicioIntervalo);

        System.out.println("Digite o fim do intervalo de multiplicação que não seja negativo ou maior que 5000: ");
        fimIntervalo = entrada.nextInt();

        validarNumero(fimIntervalo);

        if (fimIntervalo - inicioIntervalo > 9 || fimIntervalo - inicioIntervalo < 0) {
            System.err.println("Intervalo maior do que 10 ou inicio do intervalo maior do que o final.");
            System.exit(0);
        }

        System.out.println("Multiplicando:" + numero);
        System.out.println("Inicio do intervalo:" + inicioIntervalo);
        System.out.println("Fim do intervalo:" + fimIntervalo);
        for (int i = inicioIntervalo; i <= fimIntervalo; i++) {
            System.out.println(numero + " x " + i + " = " + numero*i);
        }
    }

    private static void validarNumero(int numero) {
        if (numero < 0 || numero > 5000) {
            System.err.println("Numero invalido");
            System.exit(0);
        }
    }
}
