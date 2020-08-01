/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lola
 */
public class Secuence {
    
    private ListWords listWords;
    private ViewVerbsIregulars viewVerbsIregulars;
    
    public Secuence(ListWords listWords, ViewVerbsIregulars viewVerbsIregulars) {
        this.listWords = listWords;
        this.viewVerbsIregulars = viewVerbsIregulars;
    }
    
    public void run(){
        int type = 1;
        String instruction = "";
        Words words = null;
        boolean response = false;
        String answer = "";
        Response responses = new Response();
        for(int i = 0; i < this.listWords.size(); i++){
            words = this.listWords.words(i);
            if(type == 1) {
                instruction = words.message(type);
                viewVerbsIregulars.mostrar(instruction);
                answer = viewVerbsIregulars.answer();
                response = words.compareFormBase(answer);
                viewVerbsIregulars.showResponse(answer, words.getFormBase());
            }
            if(type == 2) {
                instruction = words.message(type);
                viewVerbsIregulars.mostrar(instruction);
                answer = viewVerbsIregulars.answer();
                response = words.comparePassSimple(answer);
                viewVerbsIregulars.showResponse(answer, words.getPassSimple());
            }
            if(type == 3) {
                instruction = words.message(type);
                viewVerbsIregulars.mostrar(instruction);
                answer = viewVerbsIregulars.answer();
                response = words.compareSpanish(answer);
                viewVerbsIregulars.showResponse(answer, words.getSpanish());
            }
            responses.correct(response);
            if(type ==3 && i == this.listWords.size() - 1) {
                break;
            }
            if( i == this.listWords.size() - 1) {
                i = -1;
                type++;
            } 
        }
        this.viewVerbsIregulars.mostrar(responses.toString());
    }
    
}
