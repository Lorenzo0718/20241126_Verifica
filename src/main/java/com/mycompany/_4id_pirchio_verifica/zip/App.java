/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._4id_pirchio_verifica.zip;

/**
 *
 * @author ospite
 */
//autore: Lorenzo Pirchio 4.inf.D 26/11/2024
//questo programma fa visionare i voti di 2 studenti la loro media aritmetica e se hanno preso il debito, 
//fa visionare 3 insegnanti di una scuola con i loro cognomi e le loro materie
public class App {

    public static void main(String[] args) {
   //output del primo studente creando un oggetto di tipo studente1 e utilizzando i suoi attributi e metodi
    studente1 primostudente = new studente1();
    
    System.out.print("i voti dello studente " + primostudente.cognome);
    
    System.out.println(" sono : " + primostudente.voto_italiano + primostudente.voto_matematica + primostudente.voto_storia);
    
    System.out.println(" e: " + primostudente.Media_aritmetica());
    
    System.out.println(primostudente.promosso_bocciato());
    
    //output del secondo studente creando un oggetto di tipo studente2 e utilizzando i suoi attributi e metodi
    studente2 secondostudente = new studente2();
    
    System.out.println("i voti dello studente " + secondostudente.cognome);
    
    System.out.println(" sono : " + secondostudente.voto_italiano + secondostudente.voto_matematica + secondostudente.voto_storia);
    
    System.out.println(" e: " + secondostudente.Media_aritmetica());
    
    System.out.println(secondostudente.promosso_bocciato());
    
    //output del primo insegnante creando un oggetto di tipo insegnante1 e utilizzando i suoi attributi e metodi
    insegnante1 insegnantemate = new insegnante1();
    
    System.out.println("gli insegnanti della scuola sono:");
    
    System.out.println(insegnantemate.cognome);
    System.out.print("che insegna ");
    System.out.println(insegnantemate.materia);
    //output del secondo insegnante creando un oggetto di tipo insegnante2 e utilizzando i suoi attributi e metodi
    insegnante2 insegnantestoria = new insegnante2();
    System.out.println(insegnantestoria.cognome);
    System.out.print("che insegna ");
    System.out.println(insegnantestoria.materia);
    //output del terzo insegnante creando un oggetto di tipo insegnante3 e utilizzando i suoi attributi e metodi
    insegnante3 insegnanteita = new insegnante3();
    System.out.println(insegnanteita.cognome);
    System.out.print("che insegna ");
    System.out.println(insegnanteita.materia);
    }
}
