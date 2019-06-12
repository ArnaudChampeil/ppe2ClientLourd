package fr.arnaud;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ActionAPropos extends AbstractAction {
    private WindowHome fenetre;

    public ActionAPropos(WindowHome fenetre, String texte){
        super(texte);

        this.fenetre = fenetre;
    }

    public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(fenetre, "L'hôpital d'Assas est un établissement de santé privée.\n"+
                "L'application mis au point pour l'hôpital a pour but une gestion plus pragmatique des ressources du bâtiment.\n" +
                "Programme développé par Arnaud Champeil.");
    }
}
