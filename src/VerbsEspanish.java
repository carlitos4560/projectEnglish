/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lola
 */
public class VerbsEspanish extends Verbs{
    
    public VerbsEspanish(ListWords listWord) {
        super(listWord);
    }

    @Override
    public String[] verbs(String word, int i) {
        return this.listWords.wordsSpanish(i, word); 
    }

    @Override
    public String verbs(int i) {
         Words word = this.listWords.words(i);
        return word.formaBase();
    }
    
    
}
