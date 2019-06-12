package fr.arnaud;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ActionVerifyLogin extends AbstractAction {
    private WindowLogin window;

    public ActionVerifyLogin(WindowLogin window, String text){
        super(text);
        this.window = window;
    }

    public void actionPerformed(ActionEvent e){
        String id = window.getId().getText(); //JE n'arrive pas à récupérer la CC des formulaires
        String password = window.getPassword().getText();

        if (id.equals("Arnaud") && password.equals("Arnaud")){
            System.out.println("Connexion accepté !");
            WindowHome home = new WindowHome();
            window.dispose();
        }else {
            JOptionPane login = new JOptionPane();
            login.showMessageDialog(null,"L'identifiant ou le mot de passe est invalide", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }
}
