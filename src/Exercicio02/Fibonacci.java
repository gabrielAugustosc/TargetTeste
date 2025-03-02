package Exercicio02;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        sc.close();

        if (isFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência.");
        } else {
            System.out.println(numero + " não pertence à sequência.");
        }
    }

    public static boolean isFibonacci(int n) {
        if (n < 0) return false;

        int a = 0, b = 1;
        while (a < n) {
            int temp = a + b;
            a = b;
            b = temp;
        }

        return a == n;
    }
}
