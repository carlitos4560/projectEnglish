/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lola
 */
public class Response implements IResponse{
    
    private int correct;
    private int incorrect;
    
    public Response() {
        this.correct = 0;
        this.incorrect = 0;
    }
    
    @Override
    public int inCorrect(boolean response){
//        int response = (response):this.correcto++ ?this.incorrect++;
        if(response){
            this.correct++;
        }
        else{
            this.incorrect++;
        }
        return this.incorrect;
    }
        
}
