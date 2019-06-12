package fr.arnaud;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ActionReturnHome extends AbstractAction {
    private WindowPatients window;

    public ActionReturnHome(WindowPatients window, String text){
        super(text);
        this.window = window;
    }

    public void actionPerformed(ActionEvent e){
        WindowHome home = new WindowHome();
        window.dispose();
    }
}
