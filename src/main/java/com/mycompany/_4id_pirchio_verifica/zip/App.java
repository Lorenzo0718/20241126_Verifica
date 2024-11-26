/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._4id_pirchio_verifica.zip;

/**
 *
 * @author ospite
 */
public class App {

    public static void main(String[] args) {
   
    studente1 primostudente = new studente1();
    System.out.print("i voti dello studente " + primostudente.cognome);
    System.out.println(" sono : " + primostudente.voto_italiano + primostudente.voto_matematica + primostudente.voto_storia);
    System.out.println(" e: " + primostudente.Media_aritmetica());
    System.out.println(primostudente.promosso_bocciato());
    studente2 secondostudente = new studente2();
    System.out.println("i voti dello studente " + secondostudente.cognome);
    System.out.println(" sono : " + secondostudente.voto_italiano + secondostudente.voto_matematica + secondostudente.voto_storia);
    System.out.println(" e: " + secondostudente.Media_aritmetica());
    System.out.println(secondostudente.promosso_bocciato());
    }
}
