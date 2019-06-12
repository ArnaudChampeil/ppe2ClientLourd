package fr.arnaud;

import javax.swing.*;
import java.awt.*;

public class WindowPatients extends JFrame {

    public WindowPatients(){
        build();
    }
    public void build(){
        setTitle("Patients");
        setSize(600,1080);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(buildContentPane());
        setVisible(true);
    }

    private JPanel buildContentPane() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel textPatients = new JLabel("Liste des patients de l'hopital");
        panel.add(textPatients);

        JButton returnHome = new JButton(new ActionReturnHome(this, "Retour"));
        panel.add(returnHome);

        return panel;
    }
}
