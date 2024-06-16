package utils;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.LayoutManager;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import scenes.title.Title;

public class Globals {
    public static JFrame frame;
    public static JFrame frameGame;
    public static Title title;
    public static Color mainBack = new Color(0, 0, 0);
    public static Color colorTitle = new Color(150, 125, 0);
    public static Color colorTitleSelect = new Color(100, 100, 100);
    public static Font fontTitle = new Font("Arial", Font.ITALIC, 100);
    public static Font fontTitleSelect = new Font("Arial", Font.ITALIC, 35);
    public static Font fontTitleMsg = new Font("Arial", Font.ITALIC, 25);

    public JFrame createFrame(int width, int height, Color color)
    {
        JFrame f = new JFrame();
        f.setSize(width, height);
        f.setLayout(null);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setUndecorated(true);
        f.getContentPane().setBackground(color);
        return f;
    }

    public JLabel createLabel(String s, int x, int y, int width, int height, Font font, Color color, int align)
    {
        JLabel l = new JLabel(s);
        l.setBounds(x, y, width, height);
        l.setFont(font);
        l.setForeground(color);
        l.setHorizontalAlignment(align);
        return l;
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
        }

    }
}