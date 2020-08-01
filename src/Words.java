/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lola
 */
public class Words {
    
    private String spanish;
    private String formBase;
    private String passSimple;
    
    public Words(String spanish, String formBase, String passSimple) {
        this.spanish = spanish;
        this.formBase = formBase;
        this.passSimple = passSimple;
    }
    
    public boolean compareSpanish(String words) {
        return this.spanish.equals(words);
    }
    
    
    public boolean compareFormBase(String words) {
        return this.formBase.equals(words);
    }
    
    public boolean comparePassSimple(String words) {
        return this.passSimple.equals(words);
    }
    
    public String message(int tipo) {
        String message = "";
        switch(tipo){
            case 1: message = "ESCRIBE LA RESPUESTA EN SU INFINITIVO \t" + this.passSimple;
                break;
            case 2: message = "ESCRIBE LA RESPUESTA EN SU PASADO \t " + this.formBase;
                break;
            case 3: message = "ESCRIBE LA RESPUESTA EN SPANIOL \t " + this.formBase;
                break;
        }
        return message;
    }
    public String getFormBase(){
        return this.formBase ;
    }
    public String getPassSimple(){
        return this.passSimple ;
    }
    public String getSpanish(){
        return this.spanish ;
    }
}
