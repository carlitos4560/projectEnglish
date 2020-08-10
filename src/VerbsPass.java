/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lola
 */
public class VerbsPass extends Verbs{
    
    public VerbsPass(ListWords listWord){
        super(listWord);
    }

    @Override
    public String[] verbs(String word, int i) {
        return this.listWords.wordsPassSimple(i, word);
    }
    
    @Override
    public String verbs(int i) {
        Words word = this.listWords.words(i);
        return word.formaBase();
    }
}
