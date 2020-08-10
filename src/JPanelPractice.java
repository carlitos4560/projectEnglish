import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
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
    private JTextField subtitle;
    private JTextField text;
    private Answer answer;
    private ViewError viewError;
    private Verbs verbs;
    private int contador;
    
    public JPanelPractice() {
        this.contador= 0;
        this.verbs = null;
        this.answer = new Answer();
        this.viewError = new ViewError();
        this.title = new JLabel("Bien venido");
        this.title.setFont(new Font("Helvetica", Font.PLAIN, 20)); 
        this.subtitle = new JTextField();
        this.text = new JTextField();
        this.add(title);
        this.add(new JLabel("PRUEBA VERBOS IRREGULARES"));
    }    
    
    public void setTitle(String name) {
        this.title.setText("Escribe el Verbo en :: " + name ); //+ " =>" + verb);     
        this.title.setFont(new Font("Helvetica", Font.PLAIN, 20));
        this.removeAll();
        this.subtitle = new JTextField("", 20);
        this.subtitle.setMaximumSize(this.subtitle.getPreferredSize());
        this.setLayout (new BoxLayout (this, BoxLayout.Y_AXIS));
        JButton next = new JButton("Next");
        next.addActionListener(new EventoMouse(this));
        this.subtitle.addKeyListener(new EvenKey(this));
        this.add(this.title);
        this.add(this.text);
        this.add(this.subtitle);
        this.add(next);
        this.repaint();
        this.add(answer);
        this.add(this.viewError); 
    }
    public void setVerbs(IFactory factory, String key){
        this.verbs = factory.kinOfVers(key);        
        this.text.setFont(new Font("Helvetica", Font.PLAIN, 50));
        this.text.setText(this.verbs.verbs(this.contador));
    }
    public void text() {
        String textAnswer = this.subtitle.getText();
        textAnswer = textAnswer.toUpperCase();
        this.subtitle.setText("");
        String []word = this.verbs.verbs(textAnswer, this.contador);
        this.viewError.setContador(5);// contadro de vista
        this.answer.setColor(Boolean.parseBoolean(word[2]), textAnswer, word[1]);
        int actualizarCont = this.verbs.actualizarContenedor(word[2]);
        this.viewError.setContador(actualizarCont);
        this.contador++;
        if(this.contador > this.verbs.size() - 1) {
            this.contador = 0;
        }
        this.text.setText(this.verbs.verbs(this.contador));
    }
    
    public void scoordCero(){
        this.contador = 0;
        this.text.setText(this.verbs.verbs(this.contador));
        this.answer.defaultAnswer();
        this.viewError.setContador(0);
    }
}
