package Exercicio01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
    Scanner sc= new Scanner( System.in);

        int INDICE = 13, SOMA = 0, K = 0;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        System.out.println(SOMA);
    }
}