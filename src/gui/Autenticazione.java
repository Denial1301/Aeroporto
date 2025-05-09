package gui;

import javax.swing.*;
import controller.Controller;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Autenticazione {
    private JPanel mainPanel;
    private JTextField loginField;
    private JPasswordField passwordField;
    private JButton loginBtn;
    private JButton registratiButton;
    private JLabel emailLabel;
    private JLabel passwordLabel;
    private JLabel welcomeLabel;
    private static JFrame frameHome;
    private Controller controller;
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon(Autenticazione.class.getResource("/resources/Logo.jpg"));
        Image image = icon.getImage();
        frameHome = new JFrame("Home");
        frameHome.setIconImage(image);
        frameHome.setContentPane(new Autenticazione().mainPanel);
        frameHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameHome.pack();
        frameHome.setVisible(true);
        frameHome.setSize(350, 200);


    }

    public Autenticazione() {
        controller = new Controller();
        registratiButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Registrazione registrazione = new Registrazione(frameHome);
                registrazione.getFrame().setVisible(true);
            frameHome.setVisible(false);
            }
        });


    }
}
