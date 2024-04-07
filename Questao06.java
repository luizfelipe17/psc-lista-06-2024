/*6. Faça um Programa que peça as quatro notas de 10 alunos, calcule e armazene
num vetor a média de cada aluno, imprima o número de alunos com média
maior ou igual a 7.0.*/
package com.mycompany.psc.lista062024;
import java.util.Scanner;
import java.util.ArrayList;
       

public class Questao06 {
    public static void main (String[] args){
        
        Scanner ler = new Scanner(System.in);
        
        String[] alunos = new String[10];
        ArrayList<Double> notasMedias = new ArrayList<Double> ();
        double notas, notaMedia = 0;
        int totalAlunos = 0;
        
        System.out.print("AVALIACÕES\n\n");
        
        for (int i = 0; i < alunos.length; i++){
            
            System.out.print("\nNome do Aluno: ");
            alunos[i] = ler.next();
            
            System.out.print("Primeira Nota: ");
            notas = ler.nextDouble();
            notaMedia += notas;
            System.out.print("Primeira Nota: ");
            notas = ler.nextDouble();
            notaMedia += notas;
            System.out.print("Primeira Nota: ");
            notas = ler.nextDouble();
            notaMedia += notas;
            System.out.print("Primeira Nota: ");
            notas = ler.nextDouble();
            notaMedia += notas;
            
            
            
            if ( notas >= 7 ){
                
                notasMedias.add(notaMedia);
                totalAlunos++;
                
            }
        }
        
        System.out.print("\n\n Foram "+totalAlunos+" ALUNOS com média maior ou igual a 7 pontos\n");
        
    }
}
