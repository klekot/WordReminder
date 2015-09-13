/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordremainder;

import java.awt.Color;
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
public class TopLevelWindow extends JComponent {
    public static ArrayList<String> response = new ArrayList<>();
    public void start() throws IOException {
        JFrame frame = new JFrame();
        final JTextField textField = new JTextField(15);
        textField.setSize(120, 30);
        final JButton button = new JButton("Старт");
        button.setSize(100, 30);
        button.addActionListener((ActionEvent e) -> {
            YandexDictionaryApi yandex = new YandexDictionaryApi();
            try {
                response = yandex.sendRequest(textField.getText());
            } catch (IOException ex) {
                Logger.getLogger(TopLevelWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
            TransLabel transLabel = new TransLabel();
            transLabel.put(frame, textField, response);
            // System.out.println(handler.remake(textField.getText(), response.toString()));
        });
        JPanel panel = new JPanel();
        panel.setSize(290, 50);
        panel.setBackground(Color.YELLOW);
        frame.add(panel);
        panel.add(textField);
        panel.add(button);
        frame.setSize(300, 100);
        frame.setLocation(1500, 50);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
