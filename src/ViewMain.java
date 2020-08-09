
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import javax.swing.JButton;
import javax.swing.JFrame;
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
public class ViewMain extends JFrame {
    
    private final IListOption listOption;
    private final JPanelOption jPanelOption;
    private final Eventos eventos;
    private JPanelPractice panel2;
    
    public ViewMain(){
        this.eventos = new Eventos(this);
        this.listOption = new ListOption();
        this.jPanelOption = new JPanelOption(this.listOption, this, eventos);
        
        this.setTitle("Practica de Ingles");
        
        this.setSize(600, 400);
        this.setLocation(200, 200);
        this.setVisible(true);    
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
    }
    
    public void addPanel(JPanel panel) {
        this.add(panel, BorderLayout.NORTH);
        panel2 = new JPanelPractice();
        this.add(panel2, BorderLayout.CENTER);
    }
    
    public void section(String name) {
        System.out.println("\n boton \t"+ name);
        this.panel2.setTitle(name);
//        JPanelPractice panel2 = new JPanelPractice(this, name);
//        this.add(panel2, BorderLayout.CENTER);
//        repaint();
    }
}
