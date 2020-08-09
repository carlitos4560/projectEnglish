
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lola
 */
public class Eventos implements ActionListener{
    
    private ViewMain jFrame;
    
    public Eventos(ViewMain jFrame){
        this.jFrame = jFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nombre = e.getActionCommand();
        this.jFrame.section(nombre);
    }
    
}
