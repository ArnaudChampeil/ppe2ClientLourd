package fr.arnaud;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ActionSeeRooms extends AbstractAction {
    private WindowHome window;

    public ActionSeeRooms(WindowHome window, String text){
        super(text);
        this.window = window;
    }

    public void actionPerformed(ActionEvent e){
        WindowRooms rooms = new WindowRooms();
        window.dispose();
    }
}
