
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lola
 */
public class EvenKey implements KeyListener{

    private JPanelPractice jPanelPractice;
    
    public EvenKey(JPanelPractice jPanelPractice){
        this.jPanelPractice = jPanelPractice;
    }
    

    @Override
    public void keyTyped(KeyEvent e) {     
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {  
        if (e.getKeyCode()==KeyEvent.VK_ENTER){        
            this.jPanelPractice.text();
        }
    }

}
