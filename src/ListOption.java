
import java.util.LinkedList;
import java.util.List;
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
public class ListOption implements IListOption {
    
    private List<String>list;
    
    public ListOption(){
        this.list = new LinkedList<>();
        this.addList();
    }
    
    @Override
    public void addList() {
        this.list.add("Base");
        this.list.add("Pasado");
        this.list.add("Spanish");
    }
    @Override
    public int size(){
        return this.list.size();
    }
    
    @Override
    public JButton title(int position) {
        return new JButton (this.list.get(position));
    }
    @Override
    public String getName(int position) {
        return this.list.get(position);
    }
}
