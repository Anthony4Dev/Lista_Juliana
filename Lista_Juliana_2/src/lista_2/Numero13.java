package lista_2;

import java.util.Scanner;

public class Numero13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor;

        do {
            System.out.print("Digite um valor entre 1 e 10: ");
            valor = sc.nextInt();
        } while (valor < 1 || valor > 10);

        System.out.println("Tabuada do " + valor + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = valor * i;
            System.out.println(valor + " x " + i + " = " + resultado);
        }

        sc.close();
    }
}
