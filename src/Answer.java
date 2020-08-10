import java.awt.Color;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lola
 */
public class Answer extends JPanel {
    
    private JLabel answer;
    private JLabel answerSystem;
    
    public Answer() {
        this.setBackground(Color.LIGHT_GRAY);
        this.answer = new JLabel("Answer :: ");
        this.answerSystem = new JLabel("System :: ");
        this.answer.setFont(new Font("Helvetica", Font.PLAIN, 40)); 
        this.answerSystem.setFont(new Font("Helvetica", Font.PLAIN, 40)); 
        this.setBounds(5, 10, 590, 360);
        this.setLayout (new BoxLayout(this, BoxLayout.Y_AXIS));
        this.add(answer);
        this.add(answerSystem);
    }
    
    public void setColor(boolean answer, String youAnswer, String system) {
        String showAnswer = "Answer :: " + youAnswer;
        String showSystem = "System :: " + system;
        this.setBackground(Color.red);
        if(answer) {
            this.setBackground(Color.CYAN);
        }
        this.answer.setText(showAnswer);
        this.answerSystem.setText(showSystem);
    }
    
    public void defaultAnswer() {
        String showAnswer = "Answer :: ";
        String showSystem = "System :: ";
        this.answer.setText(showAnswer);
        this.answerSystem.setText(showSystem);
        this.setBackground(Color.LIGHT_GRAY);
    }
    
}
