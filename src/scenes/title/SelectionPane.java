package scenes.title;

import javax.swing.JLabel;
import javax.swing.JPanel;
import utils.Globals;

public class SelectionPane extends JPanel {
    Globals globals = new Globals();

    public SelectionPane()
    {
        this.setBounds(500, 500, 500, 500);
        this.setBackground(Globals.mainBack);
        this.setLayout(null);
        JLabel lblNewGame = globals.createLabel("New Game", 10, 10, 480, 50,
                Globals.fontTitleSelect, Globals.colorTitle, 0);
        JLabel lblLoad = globals.createLabel("Load Game", 10, 100, 480, 50,
                Globals.fontTitleSelect, Globals.colorTitle, 0);
        JLabel lblControls = globals.createLabel("Controls", 10, 190, 480, 50,
                Globals.fontTitleSelect, Globals.colorTitle, 0);

        this.add(lblNewGame);
        this.add(lblLoad);
        this.add(lblControls);
    }
}
