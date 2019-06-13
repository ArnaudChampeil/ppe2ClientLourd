package fr.arnaud;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ActionReturnHome3 extends AbstractAction {
    private WindowEquipments window;

    public ActionReturnHome3(WindowEquipments window, String text){
        super(text);
        this.window = window;
    }

    public void actionPerformed(ActionEvent e){
        WindowHome home = new WindowHome();
        window.dispose();
    }
}
