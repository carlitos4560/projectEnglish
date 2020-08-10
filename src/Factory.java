import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lola
 */
public class Factory implements IFactory {
    
    private HashMap<String,Verbs> verbs;
    private ListWords listWords;
    
    public Factory(ListWords listWords) {
        this.listWords = listWords;
        this.verbs = new HashMap<>();
        this.verbs.put("Base", new VerbsBase(this.listWords));
        this.verbs.put("Pasado", new VerbsPass(this.listWords));
        this.verbs.put("Spanish", new VerbsEspanish(this.listWords));
    }
    
    @Override
    public Verbs kinOfVers(String key) {
        return this.verbs.get(key);
    }
    
}
