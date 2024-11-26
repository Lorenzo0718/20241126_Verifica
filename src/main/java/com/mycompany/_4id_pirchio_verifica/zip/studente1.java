/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._4id_pirchio_verifica.zip;

/**
 *
 * @author ospite
 */
public class studente1 {
    public String nome = "marco";
    public String cognome = "rossi";
    public double voto_matematica = 7;
    public double voto_storia = 6;
    public double voto_italiano = 8;
    public double media_aritmetica;
    public String esito;
    public double Media_aritmetica(){
        media_aritmetica = (voto_matematica + voto_storia + voto_italiano) / 3;
        System.out.print("la media aritmetica dello studente " + nome);
        System.out.print(" " + cognome);
        return media_aritmetica;
    }
    public String promosso_bocciato(){
        if (media_aritmetica < 6){
            esito= "lo studente ha il debito";
        }else{
            esito = "lo studente non ha il deibito";
        }
       return esito;
    }
}
