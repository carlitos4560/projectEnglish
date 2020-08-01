
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lola
 */
public class ViewVerbsIregulars {
    
    private Scanner sc ;
    
    public ViewVerbsIregulars(Scanner sc) {
        this.sc = sc;
    }
    
    public void mostrar(String instruction) {
        System.out.println(instruction);
    }
    
    public String answer(){
        return this.sc.nextLine().toUpperCase().trim();
    } 
    
    public void showResponse(String response, String words) {
        System.out.println("****************************************");
        System.out.println("RESPUETA \t DEL SISTEMA");
        System.out.println(response +"\t\t"+ words + "\n");
    }
}
