/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordremainder;

import java.awt.BorderLayout;
import java.awt.event.*;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author igor
 */
public class TopLevelWindow {
    public void start() throws IOException {
        JFrame frame = new JFrame();
        final JTextField textField = new JTextField(15);
        textField.setSize(100, 30);
        final JButton button = new JButton("Старт");
        button.setSize(100, 30);
        button.addActionListener(new ActionListener() {
            public void actionPerfofmed(ActionEvent ae) throws IOException {
                YandexDictionaryApi yandex = new YandexDictionaryApi();
                ArrayList<String> response = yandex.sendRequest(textField.getText());
                JLabel label = new JLabel(response.toString());
                frame.add(label, BorderLayout.NORTH); 
                // System.out.println();
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        JPanel panel = new JPanel();
        panel.setSize(290, 100);
        frame.add(panel);
        panel.add(textField);
        panel.add(button);
        frame.setSize(300, 900);
        frame.setLocation(1500, 50);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    //public void actionPerformed( ActionEvent e )  throws IOException {
    //    YandexDictionaryApi yandex = new YandexDictionaryApi();
    //    ArrayList<String> response = yandex.sendRequest(textField.getText());
    //    JLabel label = new JLabel(response.toString());
    //    frame.add(label, BorderLayout.NORTH);
    //}
}