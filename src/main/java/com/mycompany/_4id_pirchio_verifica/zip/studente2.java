/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._4id_pirchio_verifica.zip;

/**
 *
 * @author ospite
 */
public class studente2 {
    //dichiarazione e inizializzazione attributi della classe studente2
    public String nome = "leonardo";
    public String cognome = "biachi";
    public double voto_matematica = 5;
    public double voto_storia = 4;
    public double voto_italiano = 6;
    public double media_aritmetica;
    public String esito;
    //inizializzazione metodi della classe studente2
    //inizializzazione metodo per il calcolo della media aritmetica dei voti
    public double Media_aritmetica(){
        media_aritmetica = (voto_matematica + voto_storia + voto_italiano) / 3;
        System.out.print("la media aritmetica dello studente " + nome);
        System.out.print(" " + cognome);
        return media_aritmetica;
    }
    //inizializzazione metodo per il calcolo del debito
    public String promosso_bocciato(){
        if (media_aritmetica < 6){
            esito= "lo studente ha il debito";
        }else{
            esito = "lo studente non ha il deibito";
        }
       return esito;
    }
}
