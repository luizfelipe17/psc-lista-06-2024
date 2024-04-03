/*2. Faça um Programa que leia um vetor de 10 números reais e mostre-os na
ordem inversa.*/
package com.mycompany.lista062024;

import java.util.Scanner;

public class Questao02 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double[] numeros = new double[10];

        for (int index = 0; index < numeros.length; index++) {

            System.out.print("Informe o " + (index + 1) + "º número: ");
            numeros[index] = ler.nextDouble();

        }

        System.out.println("\nNúmeros informados na ordem inversa\n");

        for (int i = 9; i >= 0; i--) {

            System.out.println((i + 1) + " = " + numeros[i]);

        }

    }
}
