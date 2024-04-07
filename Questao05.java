/*5. Faça um Programa que leia 20 números inteiros e armazene-os num vetor.
Armazene os números pares no vetor PAR e os números IMPARES no vetor
ímpar. Imprima os três vetores.*/
package com.mycompany.psc.lista062024;

import java.util.ArrayList;
import java.util.Scanner;

public class Questao05 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int[] numeros = new int[20];
        ArrayList<Integer> pares = new ArrayList<Integer>();
        ArrayList<Integer> impares = new ArrayList<Integer>();

        System.out.println("Digite os Números:\n");
        
        for (int i = 0; i < numeros.length; i++) {

            System.out.print("Informe o " + (i + 1) + "º: ");
            numeros[i] = ler.nextInt();

            if (numeros[i] % 2 == 0) {

                pares.add (numeros[i]); 

            } else {

                impares.add (numeros[i]);

            }
        }

        System.out.println("\n\nNúmeros:");

        for (int totalNumeros : numeros) {

            System.out.print(totalNumeros + ", ");

        }
        
        System.out.println("\n\nNúmeros Pares:");

        for (int numeroesPares : pares) {

            System.out.print(numeroesPares + ", ");

        }
        
        System.out.println("\n\nNúmeros Impares:");

        for (int numerosImpares : impares ) {

            System.out.print(numerosImpares + ", ");

        }

    }
}
