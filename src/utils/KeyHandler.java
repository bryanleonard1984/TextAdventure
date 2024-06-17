package utils;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener
{
    Globals globals = new Globals();

    @Override public void keyTyped(KeyEvent e) {}
    @Override public void keyReleased(KeyEvent e) {}
    @Override public void keyPressed(KeyEvent e)
    {
        int code = e.getKeyCode();
        int frame = Switches.windowID;
        switch (code)
        {
            case KeyEvent.VK_ESCAPE, KeyEvent.VK_SUBTRACT:
                switch(frame)
                {
                    case 0:
                        exitMessage(frame);
                        globals.exitFrame(0);
                        break;
                    case 1:
                        exitMessage(frame);
                        globals.exitFrame(1);
                        break;
                    case 2:
                        exitMessage(frame);
                        //future update
                        break;
                    case 3:
                        exitMessage(frame);
                        globals.exitFrame(3);
                        Globals.frame.setEnabled(true);
                        Switches.windowID = 0;
                        break;
                    default:
                        break;
                }
            default:
                break;
        }
    }

    //For testing purposes
    private void exitMessage(int id)
    {
        System.out.println("Exiting frame " + id);
    }

}
