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
public class ViewError extends JPanel{
   
    private JLabel contador;
    
    public ViewError() {
        this.setBackground(Color.red);
        this.contador = new JLabel("Errores :: 0");
        this.contador.setFont(new Font("Helvetica", Font.PLAIN, 40)); 
        this.setBounds(5, 10, 590, 360);
        this.setLayout (new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground(Color.lightGray);
        this.add(contador);
    }
    
    public void setContador(int errores) {
        String viewErrors = "" + errores;
        this.contador.setText(viewErrors);
    }
}
