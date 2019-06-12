package fr.arnaud;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ActionSeeEquipments extends AbstractAction {
    private WindowHome window;

    public ActionSeeEquipments(WindowHome window, String text){
        super(text);
        this.window = window;
    }

    public void actionPerformed(ActionEvent e){
        WindowEquipments equipments = new WindowEquipments();
        window.dispose();
    }
}
