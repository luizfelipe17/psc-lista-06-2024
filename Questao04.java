/*4. Faça um Programa que leia um vetor de 10 caracteres, e diga quantas
consoantes foram lidas. Imprima as consoantes.
 */
package com.mycompany.psc.lista062024;

import java.util.Scanner;
import java.util.ArrayList;

public class Questao04 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String[] vetorCaracteres = new String[10];
        ArrayList<String> consoante = new ArrayList<String>();
        int qtsConsoantes = 0;

        System.out.print("Consoantes\n\n");

        for (int index = 0; index < vetorCaracteres.length; index++) {

            System.out.print("Informe " + (index + 1) + "º caractere: ");
            vetorCaracteres[index] = ler.nextLine();

            if (!(vetorCaracteres[index].equalsIgnoreCase("a")
                    || vetorCaracteres[index].equalsIgnoreCase("e")
                    || vetorCaracteres[index].equalsIgnoreCase("i")
                    || vetorCaracteres[index].equalsIgnoreCase("o")
                    || vetorCaracteres[index].equalsIgnoreCase("u"))) {

                consoante.add(vetorCaracteres[index]);

                qtsConsoantes++;
            }

        }

        System.out.print("\nConsoantes informadas ("+qtsConsoantes+"): \n");

        for (String consoantes : consoante) {

            System.out.print(consoantes+", ");

        }

    }
}
