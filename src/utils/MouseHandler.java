package utils;

import scenes.controls.ControlsScene;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Objects;
import javax.swing.*;

public class MouseHandler implements MouseListener
{
    Globals globals = new Globals();

    @Override public void mousePressed(MouseEvent e) {}
    @Override public void mouseReleased(MouseEvent e) {}
    @Override public void mouseClicked(MouseEvent e)
    {
        if(SwingUtilities.isLeftMouseButton(e))
        {
            JLabel l = (JLabel)e.getSource();
            switch (l.getText())
            {
                case "New Game":
                    Switches.windowID = 1;
                    Globals.frameGame = this.globals.createFrame(1500, 1000, Globals.mainBack);
                    Globals.frameGame.setVisible(true);
                    Globals.frame.dispose();
                    break;
                case "Load Game":
                    System.out.println("Loading game.");
                    Switches.windowID = 2;
                    break;
                case "Controls":
                    ControlsScene controls = new ControlsScene();

                    l.setForeground(Globals.colorTitle);
                    Switches.windowID = 3;
                    Globals.frameControls = globals.createFrame(1000, 750, Globals.mainBack);
                    Globals.frameControls.add(controls);
                    Globals.frame.setEnabled(false);
                    Globals.frameControls.setAlwaysOnTop(true);
                    Globals.frameControls.setVisible(true);
                    break;
                default:
                    break;
            }
        }
        else if(SwingUtilities.isRightMouseButton(e))
        {
            int frame = Switches.windowID;
            switch(frame)
            {
                case 0:
                    globals.exitFrame(frame);
                    break;
                case 1:
                    globals.exitFrame(frame);
                    break;
                case 2:
                    //future update
                    break;
                case 3:
                    globals.exitFrame(3);
                    Globals.frame.setEnabled(true);
                    Switches.windowID = 0;
                    break;
                default:
                    break;
            }
        }
    }

    @Override public void mouseEntered(MouseEvent e)
    {
        try
        {
            JLabel l = (JLabel) e.getSource();
            switch (Switches.windowID)
            {
                case 0:
                    l.setForeground(Globals.colorTitleSelect);
                    break;
                default:
                    break;
            }
        } catch(Exception ignored) {}

    }
    @Override public void mouseExited(MouseEvent e)
    {
        try
        {
            JLabel l = (JLabel) e.getSource();
            switch (Switches.windowID)
            {
                case 0:
                    l.setForeground(Globals.colorTitle);
                default:
                    break;
            }
        } catch(Exception ignored) {}
    }
}
