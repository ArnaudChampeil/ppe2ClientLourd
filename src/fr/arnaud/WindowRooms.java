package fr.arnaud;

import javax.swing.*;
import java.awt.*;

public class WindowRooms extends JFrame {

    public WindowRooms(){
        build();
    }
    public void build(){
        setTitle("Salles");
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

        JLabel textPatients = new JLabel("Liste des salles de l'hopital");
        panel.add(textPatients);

        //JButton returnHome = new JButton(new ActionReturnHome(this, "Retour"));
        JButton returnHome = new JButton("Retour");
        panel.add(returnHome);

        return panel;
    }
}
