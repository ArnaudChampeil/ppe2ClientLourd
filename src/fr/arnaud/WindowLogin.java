package fr.arnaud;

import javax.swing.*;
import java.awt.*;

public class WindowLogin extends JFrame {
    private JTextField id;
    private JPasswordField password;

    public WindowLogin(){
        build();
    }
    public void build(){
        setTitle("Connexion");
        setSize(250,200);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(buildContentPane());
        setVisible(true);
    }

    private JPanel buildContentPane(){
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.white);

        JLabel textLogin = new JLabel("Connexion à l'hopital d'Assas");
        panel.add(textLogin);

        JLabel textId = new JLabel("Identifiant");
        panel.add(textId);
        id = new JTextField();
        id.setColumns(20);
        panel.add(id);

        JLabel textPassword = new JLabel("Mot de passe");
        panel.add(textPassword);
        password = new JPasswordField();
        password.setColumns(20);
        panel.add(password);

        JButton verifyLogin = new JButton(new ActionVerifyLogin(this, "Connexion"));
        panel.add(verifyLogin);

        return panel;
    }

    public JTextField getId() {
        return id;
    }

    public JPasswordField getPassword() {
        return password;
    }

    public void setId(JTextField id) {
        this.id = id;
    }

    public void setPassword(JPasswordField password) {
        this.password = password;
    }
}
