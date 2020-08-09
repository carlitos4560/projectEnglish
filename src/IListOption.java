
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
public interface IListOption {
    void addList();
    int size();
    JButton title(int position);
    String getName(int position);
}
