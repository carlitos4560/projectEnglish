import java.util.LinkedList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lola
 */

public class ListWords {
    
    private List<Words> listWord;
    
    public ListWords(){
        this.listWord = new LinkedList<>();
    }
    
    public void insertWords(Words words) {
        this.listWord.add(words);
    }
    
    public Words words(int position) {
        return this.listWord.get(position);
    }
    
    public String[] wordsSpanish(int position, String word) {
        return this.listWord.get(position).compareSpanish(word);
    }
    
    public String[] wordsPassSimple(int position, String word) {
        return this.listWord.get(position).comparePassSimple(word);
    }
    
    public String[] wordsBase(int position, String word) {
        return this.listWord.get(position).compareFormBase(word);
    }
    
    public int size(){
        return this.listWord.size();
    }
}
