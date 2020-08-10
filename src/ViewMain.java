import java.awt.BorderLayout;
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
    private IFactory factory;
    private Verbs verbs;
    
    public ViewMain(IFactory factory){
        this.eventos = new Eventos(this);
        this.listOption = new ListOption();
        this.jPanelOption = new JPanelOption(this.listOption, this, eventos);
        this.factory = factory;
        this.setTitle("Practica de Ingles");
        
        this.setSize(600, 450);
        this.setLocation(200, 200);
        this.setVisible(true);    
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
    }
    
    public void addPanel(JPanel panel) {
        this.add(panel, BorderLayout.NORTH);
        this.panel2 = new JPanelPractice();
        this.add(panel2, BorderLayout.CENTER);
    }
    
    public void section(String name) {
        this.panel2.setTitle(name.trim());
        this.panel2.setVerbs(this.factory, name.trim());
        this.panel2.scoordCero();
    }
}
