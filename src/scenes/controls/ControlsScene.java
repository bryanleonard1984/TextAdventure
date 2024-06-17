package scenes.controls;

import utils.Globals;

import javax.swing.*;
import java.awt.*;

public class ControlsScene extends JPanel
{
    Globals globals = new Globals();
    Color text = Globals.colorTextOne;
    Color even = Globals.mainTheme;
    Color odd = Globals.colorRowOddControls;
    Font fontText = Globals.fontTableText;

    public ControlsScene()
    {
        this.setBounds(0, 0, 1000, 300);
        this.setBackground(Globals.colorPnlControls);
        this.setLayout(null);

        JPanel pnlTitle = globals.createPanel(5, 5, 990, 90, even);
        JPanel pnlAction = globals.createPanel(5, 105, 240, 40, odd);
        JPanel pnlPrimaryKey = globals.createPanel(250, 105, 245, 40, odd);
        JPanel pnlSecondKey = globals.createPanel(500, 105, 245, 40, odd);
        JPanel pnlMouseAction = globals.createPanel(750, 105, 245, 40, odd);
        JPanel pnlConfirm = globals.createPanel(5, 150, 245, 50, even);
        JPanel pnlPrimaryConfirm = globals.createPanel(250, 150, 250, 50, even);
        JPanel pnlSecondConfirm = globals.createPanel(500, 150, 250, 50, even);
        JPanel pnlMouseConfirm = globals.createPanel(750, 150, 245, 50, even);
        JPanel pnlRowCancel = globals.createPanel(5, 200, 245, 50, odd);
        JPanel pnlPrimaryCancel = globals.createPanel(250, 200, 250, 50, odd);
        JPanel pnlSecondCancel = globals.createPanel(500, 200, 250, 50, odd);
        JPanel pnlMouseCancel = globals.createPanel(750, 200, 245, 50, odd);
        JPanel pnlRowExit = globals.createPanel(5, 250, 245, 50, even);
        JPanel pnlPrimaryExit = globals.createPanel(250, 250, 250, 50, even);
        JPanel pnlSecondExit = globals.createPanel(500, 250, 250, 50, even);
        JPanel pnlMouseExit = globals.createPanel(750, 250, 245, 50, even);

        JLabel lblTitle = controlLabels("Controls", 990, 90, Globals.fontFrameTitle);
        JLabel lblAction = controlLabels("Actions", 240, 40, Globals.fontTableTitle);
        JLabel lblPrimaryKey = controlLabels("Primary Key", 245, 40, Globals.fontTableTitle);
        JLabel lblSecondKey = controlLabels("Secondary Key", 245, 40, Globals.fontTableTitle);
        JLabel lblMouseAction = controlLabels("Mouse Actions", 245, 40, Globals.fontTableTitle);
        JLabel lblConfirm = controlLabels("Confirm");
        JLabel lblPrimaryConfirm = controlLabels("NUMPAD 5");
        JLabel lblSecondConfirm = controlLabels("s");
        JLabel lblMouseConfirm = controlLabels("Left Click");
        JLabel lblCancel = controlLabels("Cancel");
        JLabel lblPrimaryCancel = controlLabels("- (Subtract)");
        JLabel lblSecondCancel = controlLabels("ESC");
        JLabel lblMouseCancel = controlLabels("Right Click");
        JLabel lblExit = controlLabels("Exit/Close");
        JLabel lblPrimaryExit = controlLabels("- (Subtract)");
        JLabel lblSecondExit = controlLabels("ESC");
        JLabel lblMouseExit = controlLabels("Right Click");

        addComponent(lblTitle, pnlTitle);
        addComponent(lblAction, pnlAction);
        addComponent(lblPrimaryKey, pnlPrimaryKey);
        addComponent(lblSecondKey, pnlSecondKey);
        addComponent(lblMouseAction, pnlMouseAction);
        addComponent(lblConfirm, pnlConfirm);
        addComponent(lblPrimaryConfirm, pnlPrimaryConfirm);
        addComponent(lblSecondConfirm, pnlSecondConfirm);
        addComponent(lblMouseConfirm, pnlMouseConfirm);
        addComponent(lblCancel, pnlRowCancel);
        addComponent(lblPrimaryCancel, pnlPrimaryCancel);
        addComponent(lblSecondCancel, pnlSecondCancel);
        addComponent(lblMouseCancel, pnlMouseCancel);
        addComponent(lblExit, pnlRowExit);
        addComponent(lblPrimaryExit, pnlPrimaryExit);
        addComponent(lblSecondExit, pnlSecondExit);
        addComponent(lblMouseExit, pnlMouseExit);
    }

    private JLabel controlLabels(String s, int width, int height, Font font)
    {
        return globals.createLabel(s, 0, 0, width, height, font, text, 0, false);
    }

    private JLabel controlLabels(String s)
    {
        return globals.createLabel(s, 0, 0, 245, 50, fontText, text, 0, false);
    }

    private void addComponent(JLabel l, JPanel p)
    {
        p.add(l);
        this.add(p);
    }
}
