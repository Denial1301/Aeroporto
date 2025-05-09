package gui;

import controller.Controller;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Registrazione {
    private JFrame frame;
    private Controller controller;
    private JPanel panel1;
    private JLabel registerAsLabel;
    private JLabel nomeLabel;
    private JTextField nomeField;
    private JButton returnBtn;
    private JLabel cognomeLabel;
    private JTextField cognomeField;
    private JLabel emailLabel;
    private JTextField emailField;
    private JLabel passwordLabel;
    private JTextField passwordField;
    private JLabel idAmministratoreLabel;
    private JTextField idAmministratoreField;
    private JCheckBox amministratoreCheck;
    private JCheckBox utenteCheck;


    public JFrame getFrame() {
        return frame;
    }

    public Registrazione(JFrame frameC) {
        frame = new JFrame("Registrazione");
        frame.setContentPane(panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(500, 350);
        frame.setVisible(true);


        idAmministratoreLabel.setVisible(false);
        idAmministratoreField.setVisible(false);

        returnBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                frameC.setVisible(true);
                frame.dispose();
            }
        });


        ButtonGroup gruppo = new ButtonGroup();
        gruppo.add(utenteCheck);
        gruppo.add(amministratoreCheck);


        amministratoreCheck.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                boolean isSelected = amministratoreCheck.isSelected();
                idAmministratoreLabel.setVisible(isSelected);
                idAmministratoreField.setVisible(isSelected);
                frame.revalidate();
                frame.repaint();
            }
        });

        utenteCheck.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (utenteCheck.isSelected()) {
                    idAmministratoreLabel.setVisible(false);
                    idAmministratoreField.setVisible(false);
                    frame.revalidate();
                    frame.repaint();
                }
            }
        });
    }
}