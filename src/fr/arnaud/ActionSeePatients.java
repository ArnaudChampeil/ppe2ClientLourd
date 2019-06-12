package fr.arnaud;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ActionSeePatients extends AbstractAction {
    private WindowHome window;

    public ActionSeePatients(WindowHome window, String text){
        super(text);
        this.window = window;
    }

    public void actionPerformed(ActionEvent e){
        WindowPatients patients = new WindowPatients();
        window.dispose();
    }
}
