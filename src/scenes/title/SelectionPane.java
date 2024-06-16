package scenes.title;

import javax.swing.JLabel;
import javax.swing.JPanel;
import utils.Globals;
import utils.KeyHandler;
import utils.MouseHandler;

public class SelectionPane extends JPanel {
    Globals globals = new Globals();
    MouseHandler mouseHandler = new MouseHandler();
    KeyHandler keyHandler = new KeyHandler();

    public SelectionPane() {
        this.setBounds(500, 500, 500, 500);
        this.setBackground(Globals.mainBack);
        this.setLayout(null);
        JLabel lblNewGame = globals.createLabel("New Game", 10, 10, 480, 50,
                Globals.fontTitleSelect, Globals.colorTitle, 0);
        JLabel lblLoad = globals.createLabel("Load Game", 10, 100, 480, 50,
                Globals.fontTitleSelect, Globals.colorTitle, 0);
        JLabel lblControls = globals.createLabel("Controls", 10, 190, 480, 50,
                Globals.fontTitleSelect, Globals.colorTitle, 0);
        JLabel lblExit = globals.createLabel("Press ESC or '-' to quit.", 10, 440, 480, 50,
                Globals.fontTitleMsg, Globals.colorTitle, 0);
        lblNewGame.addMouseListener(mouseHandler);
        lblLoad.addMouseListener(mouseHandler);
        lblControls.addMouseListener(mouseHandler);
        this.add(lblNewGame);
        this.add(lblLoad);
        this.add(lblControls);
        this.add(lblExit);
    }
}
