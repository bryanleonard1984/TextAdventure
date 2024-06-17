package utils;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

import scenes.title.Title;

public class Globals {
    public static JFrame frame;
    public static JFrame frameGame;
    public static JFrame frameControls;
    public static Title title;
    public static Color mainBack = new Color(0, 0, 0);
    public static Color mainTheme = new Color(25, 10, 0);
    public static Color colorTitle = new Color(150, 125, 0);
    public static Color colorTextOne = new Color(200, 200, 200);
    public static Color colorTitleSelect = new Color(100, 100, 100);
    public static Color colorPnlControls = new Color(10, 5, 0);
    public static Color colorRowOddControls = new Color(50, 35, 0);
    public static Font fontTitle = new Font("Arial", Font.ITALIC, 100);
    public static Font fontTitleSelect = new Font("Arial", Font.ITALIC, 35);
    public static Font fontFrameTitle = new Font("Arial", Font.BOLD, 75);
    public static Font fontTableTitle = new Font("Arial", Font.BOLD, 25);
    public static Font fontTableText = new Font("Arial", Font.PLAIN, 25);

    static KeyHandler keyHandler = new KeyHandler();
    static MouseHandler mouseHandler = new MouseHandler();

    public JFrame createFrame(int width, int height, Color color)
    {
        JFrame f = new JFrame();
        f.setSize(width, height);
        f.setLayout(null);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setUndecorated(true);
        f.getContentPane().setBackground(color);
        f.addKeyListener(keyHandler);
        f.addMouseListener(mouseHandler);

        return f;
    }

    public JLabel createLabel(String s, int x, int y, int width, int height, Font font, Color color, int align,
                              boolean isActionable)
    {
        JLabel l = new JLabel(s);
        l.setBounds(x, y, width, height);
        l.setFont(font);
        l.setForeground(color);
        l.setHorizontalAlignment(align);
        if(isActionable)
        {
            l.addKeyListener(keyHandler);
            l.addMouseListener(mouseHandler);
        }

        return l;
    }

    public JPanel createPanel(int x, int y, int width, int height, Color color)
    {
        JPanel p = new JPanel();
        p.setBounds(x, y, width, height);
        p.setBackground(color);
        p.setLayout(null);

        return p;
    }

    public void exitFrame(int menu)
    {
        switch (menu)
        {
            case 0:
                int choice = JOptionPane.showConfirmDialog(frame, "Are you sure you want to quit?",
                        "Exit Game", JOptionPane.YES_NO_OPTION);
                if (choice == 0) {
                    frame.dispose();
                }
                break;
            case 1:
                frameGame.dispose();
                break;
            case 2:
                System.out.println("Exiting loading screen.");
                break;
            case 3:
                frameControls.dispose();
                break;
            default:
                break;
        }

    }
}
