import java.awt.Color;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JButton;
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
        this.addComponent();
    }
    
    public void addComponent() {
        JButton button = new JButton();
        for (int i = 0; i < this.listOption.size(); i++) {
            button = new JButton(this.listOption.getName(i));
            button.addActionListener(this.eventos);
            this.add(button);
        }
        this.viewMain.addPanel(this);   
    }
}
