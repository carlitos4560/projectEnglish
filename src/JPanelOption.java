
import java.awt.Color;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.GridLayout;
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
public class JPanelOption extends JPanel   {
    
    private List<JButton> buttons;
    private IListOption listOption;
    private ViewMain viewMain;
    private Eventos eventos;
    
    public JPanelOption(IListOption listOption, ViewMain viewMain, Eventos eventos) {
        this.buttons = new LinkedList<>();
        this.listOption = listOption;
        this.viewMain = viewMain;
        this.eventos = eventos;
        this.setBackground(Color.BLACK);
//        this.run();
        this.addComponent();
    }
    
//    public void run(){
//        
//        this.updateUI();
//    }
    
    public void addComponent() {
        JButton button = new JButton();
        for (int i = 0; i < this.listOption.size(); i++) {
            button = new JButton(this.listOption.getName(i));
            System.out.print(this.listOption.getName(i)+"\t");
            button.addActionListener(this.eventos);
            this.add(button);
        }
//        this.updateUI();
        this.viewMain.addPanel(this);
        
    }
    
    
}
