package utils;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

public class MouseHandler implements MouseListener
{
    Globals globals = new Globals();
    KeyHandler keyHandler = new KeyHandler();

    @Override public void mousePressed(MouseEvent e) {}
    @Override public void mouseReleased(MouseEvent e) {}
    @Override public void mouseClicked(MouseEvent e)
    {
        JLabel l = (JLabel)e.getSource();
        switch (l.getText())
        {
            case "New Game":
                Switches.windowID = 1;
                Globals.frameGame = this.globals.createFrame(1500, 1000, Globals.mainBack);
                Globals.frameGame.addKeyListener(this.keyHandler);
                Globals.frameGame.setVisible(true);
                Globals.frame.dispose();
                break;
            case "Load Game":
                System.out.println("Loading game.");
            case "Controls":
                System.out.println("Controls");
                break;
            default:
                break;
        }

    }

    @Override public void mouseEntered(MouseEvent e)
    {
        JLabel l = (JLabel)e.getSource();
        switch (Switches.windowID) {
            case 0:
                l.setForeground(Globals.colorTitleSelect);
            default:
                break;
        }
    }
    @Override public void mouseExited(MouseEvent e)
    {
        JLabel l = (JLabel)e.getSource();
        switch (Switches.windowID) {
            case 0:
                l.setForeground(Globals.colorTitle);
            default:
                break;
        }
    }
}
