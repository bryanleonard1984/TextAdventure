import scenes.title.SelectionPane;
import scenes.title.Title;
import utils.Globals;
import utils.Switches;

public class Main {
    static Globals globals = new Globals();

    public static void main(String[] args)
    {
        createWindow();
    }

    private static void createWindow()
    {
        Switches.windowID = 0;
        Globals.frame = globals.createFrame(1500, 1000, Globals.mainBack);
        Globals.frame.setFocusable(true);
        Globals.title = new Title();
        Globals.frame.add(Globals.title);
        SelectionPane select = new SelectionPane();
        Globals.frame.add(select);

        Globals.frame.setVisible(true);
    }
}
