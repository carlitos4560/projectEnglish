/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Catlos Roberto Escobar Soria
 */
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AddWordsList addWordsList = new AddWordsList();
        ListWords listWords = new ListWords();
        addWordsList.addWords(listWords);
        ViewVerbsIregulars viewVerbsIrregulars = new ViewVerbsIregulars(new Scanner(System.in));
        Secuence secuence = new Secuence(listWords, viewVerbsIrregulars);
        secuence.run();
        
    }
    
}
