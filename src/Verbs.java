/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lola
 */
public abstract class Verbs {
    
    protected IResponse contener;
    protected ListWords listWords;
    
    public Verbs( ListWords listWords){
        this.listWords = listWords;
        this.contener = new Response();
    }
    
    abstract public String[] verbs(String word, int i);
    
    public int actualizarContenedor(String actualizar){
        boolean actualizarContenedor = Boolean.parseBoolean(actualizar);
        return this.contener.inCorrect(actualizarContenedor);
    }
    
    abstract public String verbs(int i);
    
    public int size(){
        return this.listWords.size();
    }
}
