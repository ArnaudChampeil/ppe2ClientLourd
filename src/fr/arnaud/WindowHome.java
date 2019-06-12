package fr.arnaud;

import javax.swing.*;
import java.awt.*;

public class WindowHome extends JFrame {

    public WindowHome(){
        build();
    }
    public void build(){
        setTitle("Hopital d'Assas");
        setSize(600,600);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(buildContentPane());

        JMenuBar menuBar = new JMenuBar();

        JMenu menu1 = new JMenu("Listes");
        JMenuItem patientsList = new JMenuItem(new ActionSeePatients(this, "Liste des patients"));
        menu1.add(patientsList);
        JMenuItem roomsList = new JMenuItem(new ActionSeeRooms(this, "Liste des salles"));
        menu1.add(roomsList);
        JMenuItem equipmentsList = new JMenuItem(new ActionSeeEquipments(this, "Liste des équipements"));
        menu1.add(equipmentsList);

        menuBar.add(menu1);

        JMenu menu2 = new JMenu("?");

        JMenuItem aPropos = new JMenuItem(new ActionAPropos(this,"A propos"));
        menu2.add(aPropos);

        menuBar.add(menu2);

        setJMenuBar(menuBar);

        setVisible(true); // METTRE A LA FIN DE build()
    }

    private JPanel buildContentPane() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel textHome = new JLabel("Bienvenue sur l'application de l'hopital d'Assas");
        panel.add(textHome);

        JButton patients = new JButton(new ActionSeePatients(this, "Voir les patients"));
        panel.add(patients);

        JButton room = new JButton(new ActionSeeRooms(this, "Voir les salles disponibles"));
        panel.add(room);

        JButton equipment = new JButton(new ActionSeeEquipments(this, "Réserver des équipemets"));
        panel.add(equipment);

        return panel;
    }
}
