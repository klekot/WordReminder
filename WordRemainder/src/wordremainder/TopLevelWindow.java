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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author igor
 */
public class TopLevelWindow {
    public static ArrayList<String> response = new ArrayList<>();
    public void start() throws IOException {
        JFrame frame = new JFrame();
        final JTextField textField = new JTextField(15);
        textField.setSize(100, 30);
        final JButton button = new JButton("Старт");
        button.setSize(100, 30);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                YandexDictionaryApi yandex = new YandexDictionaryApi(); 
                try {
                    response = yandex.sendRequest(textField.getText());
                } catch (IOException ex) {
                    Logger.getLogger(TopLevelWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("ok");
            }
        });
        JPanel panel = new JPanel();
        panel.setSize(290, 100);
        frame.add(panel);
        panel.add(textField);
        panel.add(button);
        JLabel label = new JLabel(response.toString());
        label.setSize(200, 400);
        frame.add(label);
        frame.setSize(300, 700);
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
