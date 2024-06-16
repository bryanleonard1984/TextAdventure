package scenes.title;

import javax.swing.JLabel;
import javax.swing.JPanel;
import utils.Globals;

public class Title extends JPanel {
    Globals globals = new Globals();

    public Title() {
        this.setBounds(100, 150, 1300, 100);
        this.setBackground(Globals.mainBack);
        JLabel lblTitle = this.globals.createLabel("Adventure", 10, 10, 1280, 80, Globals.fontTitle,
                Globals.colorTitle, 0);
        this.add(lblTitle);
    }
}