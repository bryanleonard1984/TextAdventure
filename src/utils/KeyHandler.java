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
        switch (code) {
            case KeyEvent.VK_ESCAPE, KeyEvent.VK_SUBTRACT:
                globals.exitFrame(Switches.windowID);
                break;
            default:
                break;
        }
    }


}
