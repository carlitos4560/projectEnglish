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

    public String[] compareSpanish(String words) {
        String[] response = new String[3];
        boolean equals = this.spanish.equals(words);
        response[0] = words;
        response[1] = this.spanish;
        response[2] = "" + equals;
        return response;
    }
    public String[] compareFormBase(String words) {
        String[] response = new String[3];
        boolean equals = this.formBase.equals(words);
        response[0] = words;
        response[1] = this.formBase;
        response[2] = "" + equals;
        return response;
    }
    public String[] comparePassSimple(String words) {
        String[] response = new String[3];
        boolean equals = this.passSimple.equals(words);
        response[0] = words;
        response[1] = this.passSimple;
        response[2] = "" + equals;
        return response;
    }
    public String spanish(){
        return this.spanish;
    }
    public String passSimple(){
        return this.passSimple;
    }
    public String formaBase(){
        return this.formBase;
    }
    
}
