/*4. Faça um Programa que leia um vetor de 10 caracteres, e diga quantas
consoantes foram lidas. Imprima as consoantes.
*/
package com.mycompany.lista062024;
import java.util.Scanner;   

public class Questao04 {
    public static void main (String[] args){
        
        Scanner ler = new Scanner (System.in);
        
        String[] vetorCaracteres = new String[10];
        String[] vogais = {"a", "e", "i", "o", "u"};
        String[] caracteres = new String[10];
        
        System.out.print("Consoantes");
        
        for (int index = 0; index < vetorCaracteres.length; index++){
            
            System.out.println("Informe " + (index + 1) + "º caractere: ");
            vetorCaracteres[index] = ler.nextLine();
            
                if (vetorCaracteres[index].equalsIgnoreCase("a" && "e" && "i" && "o" && "u")){
                    
                    
                }else {
                    
                    caracteres[index] = vetorCaracteres; 
                    
                }
            
        }
        
    }
}
