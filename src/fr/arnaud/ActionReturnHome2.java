package fr.arnaud;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ActionReturnHome2 extends AbstractAction {
    private WindowRooms window;

    public ActionReturnHome2(WindowRooms window, String text){
        super(text);
        this.window = window;
    }

    public void actionPerformed(ActionEvent e){
        WindowHome home = new WindowHome();
        window.dispose();
    }
}
