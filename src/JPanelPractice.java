
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JTextField;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lola
 */
public class JPanelPractice extends JPanel {
    
    private ViewMain jFrame;
    private JLabel title;
    private JButton next;
    private JTextField jTextFile;
    private final Box box1;
    private final Box box;
    private final Box boxVertical;
    private Answer answer;
    private ViewError viewError;
    public JPanelPractice() {
        this.answer = new Answer();
        this.viewError = new ViewError();
        this.title = new JLabel("Bien venido");
        this.title.setFont(new Font("Helvetica", Font.PLAIN, 20)); 
//        this.setBackground(Color.darkGray);
        
        this.box = Box.createHorizontalBox();
//        this.jTextFile.setBounds(100, 100, 100, 100);
        
        this.jTextFile = new JTextField();
        this.box1 = Box.createHorizontalBox();
        this.boxVertical = Box.createVerticalBox();
        this.add(title);
        this.next = new JButton("Next");
        
        
//        System.out.println(name)
//        this.setBounds(5, 10, 590, 360);
    }    
    
    public void setTitle(String name) {
        this.title.setText("Escribe el Verbo en :: " + name);     
        this.title.setFont(new Font("Helvetica", Font.PLAIN, 20)); 
        this.removeAll();
        //JLabel answer = new JLabel("Answer");
        this.jTextFile = new JTextField("", 20);
        this.jTextFile.setMaximumSize(this.jTextFile.getPreferredSize());
        
//        box = Box.createHorizontalBox();
//        box.add(this.jTextFile);
//        box.add(this.next);
//        box.add(Box.createHorizontalStrut(10));
        
//        JLabel answer = new JLabel("Answer :: ");
//        JLabel answerSistem = new JLabel("Answer Sistem :: ");
//        JLabel youAnswer = new JLabel("");
//        JLabel correctAnswer = new JLabel("");
        
//        box1 = Box.createHorizontalBox();
//        box1.add(this.jTextFile);
//        box1.add(Box.createHorizontalStrut(10));
        
//        this.boxVertical = Box.createVerticalBox();
//        this.boxVertical.add(this.box);
//        this.boxVertical.add(this.box1);
//        this.add(this.boxVertical);
//        this.add(box);
        
//        this.next.setBounds(200, 200, 200, 200);
        this.setLayout (new BoxLayout (this, BoxLayout.Y_AXIS));  
//        this.setLayout (new BoxLayout(this, BoxLayout.X_AXIS));
        this.add(this.title);
        this.add(this.jTextFile);
        this.add(this.next);
        this.repaint();
        this.add(answer);
        this.add(this.viewError);
    }
}
