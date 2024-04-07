/*7. Faça um Programa que leia um vetor de 5 números inteiros, mostre a soma, a
multiplicação e os números.*/
package com.mycompany.psc.lista062024;
import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args){
        
        Scanner ler = new Scanner(System.in);
        
        int[] numeros = new int[5];
        int soma = 0, multiplicacao = 1;
        
        System.out.print("Informe os números: \n\n");
        
        for (int i = 0; i < numeros.length; i++){
            
            System.out.print((i + 1) + "º Número: ");
            numeros[i] = ler.nextInt();
            soma += numeros[i];
            multiplicacao *= numeros[i];
            
        }
        
        System.out.print("\nNúmeros: ");
        
        for (int totalNumeros : numeros){
            
            System.out.print(totalNumeros+ " / ");
            
        }
               
        System.out.print("\nSoma: "+soma);
        System.out.print("\nMultiplicação: "+multiplicacao);
        
    }
}
