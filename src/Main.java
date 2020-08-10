/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Catlos Roberto Escobar Soria
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        AddWordsList addWordsList = new AddWordsList();
        ListWords listWords = new ListWords();    
        addWordsList.addWords(listWords);

        IFactory factory = new Factory(listWords);        

        ViewMain viewMain = new ViewMain(factory);
        
    }
    
}
