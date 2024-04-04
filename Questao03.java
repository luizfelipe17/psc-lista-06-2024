/*3. Faça um Programa que leia 4 notas, mostre as notas e a média na tela*/
package com.mycompany.lista062024;

import java.util.Scanner;

public class Questao03 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double[] notas = new double[4];
        double somaNotas = 0, media = 0;

        System.out.print("Cálculo de médias\n\n");

        for (int index = 0; index < notas.length; index++) {

            System.out.print("Informe a " + (index + 1) + "º nota: ");
            notas[index] = ler.nextDouble();

            somaNotas += notas[index];

        }

        media = somaNotas / notas.length;

        System.out.print("\nA média das notas é " + media + "\n");

    }
}
