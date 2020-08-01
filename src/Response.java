/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lola
 */
public class Response {
    
    private int correct;
    private int incorrect;
    
    public Response() {
        this.correct = 0;
        this.incorrect = 0;
    }
    
    public void correct(boolean response){
        if(response){
            this.correct++;
        }
        else{
            this.incorrect++;
        }
    }
    
    @Override
    public String toString() {
        String toString = "CORRECT \t INCORRECT \n "+ this.correct +"\t\t"+ this.incorrect;
        double porcentageCorrecto = 0.0;
        if(this.correct > 0) {
            porcentageCorrecto = this.correct / (this.correct + this.incorrect);
        }
        return toString + "\n prorcentage correcto :" + porcentageCorrecto;
    }
    
}
