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
        JLabel lblNewGame = this.globals.createLabel("New Game", 10, 10, 480, 50,
                Globals.fontTitleSelect, Globals.colorTitle, 0);
        JLabel lblLoad = this.globals.createLabel("Load Game", 10, 100, 480, 50,
                Globals.fontTitleSelect, Globals.colorTitle, 0);
        JLabel lblExit = this.globals.createLabel("Press ESC or '-' to quit.", 10, 440, 480, 50,
                Globals.fontTitleMsg, Globals.colorTitle, 0);
        lblNewGame.addMouseListener(this.mouseHandler);
        lblLoad.addMouseListener(this.mouseHandler);
        this.add(lblNewGame);
        this.add(lblLoad);
        this.add(lblExit);
    }
}