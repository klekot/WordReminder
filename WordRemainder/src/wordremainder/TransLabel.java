/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordremainder;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author igor
 */
public class TransLabel {
    public void put(JFrame frame, JTextField textField, ArrayList<String> response) {
        ResponseHandler handler = new ResponseHandler();
        JPanel pan = new JPanel();
        JLabel label = new JLabel();
        label.setText(handler.remake(textField.getText(), response.toString()));
        // System.out.println(handler.remake(textField.getText(), response.toString()));
        label.setSize(200, 100);
        frame.add(label);
    }
}
