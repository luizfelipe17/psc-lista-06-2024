/*1. Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.
*/

package com.mycompany.lista062024;
import java.util.Scanner;

public class Questao01 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int[] vetorNumeros = new int[5];
        
        for (int index = 0; index < vetorNumeros.length; index++){
            
            System.out.print("Digite o "+ (index + 1) +"º valor: " );
            vetorNumeros[index] = ler.nextInt();
            
        }
        
        System.out.println();
        System.out.println("Números Digitados:");
        
        for (int i = 0; i < vetorNumeros.length; i++){
            
            System.out.println((i + 1) + " = " + vetorNumeros[i]);
            
        }
        
    }
}
