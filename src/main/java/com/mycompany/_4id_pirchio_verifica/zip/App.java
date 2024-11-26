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
    
    insegnante1 insegnantemate = new insegnante1();
    
    System.out.println("gli insegnanti della scuola sono:");
    
    System.out.println(insegnantemate.cognome);
    System.out.print("che insegna ");
    System.out.println(insegnantemate.materia);
    
    insegnante2 insegnantestoria = new insegnante2();
    System.out.println(insegnantestoria.cognome);
    System.out.print("che insegna ");
    System.out.println(insegnantestoria.materia);
    
    insegnante3 insegnanteita = new insegnante3();
    System.out.println(insegnanteita.cognome);
    System.out.print("che insegna ");
    System.out.println(insegnanteita.materia);
    }
}
