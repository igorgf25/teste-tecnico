package Exercicio1;

import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Integer valor;
        int contador = 0;

        System.out.println("Digite um numero de 4 digitos entre 1000 e 9999: ");
        valor = entrada.nextInt();
        char[] digitos = String.valueOf(valor).toCharArray();

        if (valor.toString().length() == 4) {
                for (char digito : digitos) {
                    if(Integer.parseInt(String.valueOf(digito)) % 2 == 0) {
                        contador++;
                    }
                }

                System.out.println("Numero de pares: " + contador);
        } else {
            System.out.println("O numero inserido deve possuir 4 digitos");
        }


    }
}
