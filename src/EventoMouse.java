import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lola
 */
public class EventoMouse implements ActionListener{
    
    private JPanelPractice jPanelPractice;
    private int cont;
    
    public EventoMouse(JPanelPractice jPanelPractice){
        this.jPanelPractice = jPanelPractice;
        this.cont = 0;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nombre = e.getActionCommand();
        this.jPanelPractice.text();   
    }
    
}
