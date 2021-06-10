package NIMGuipackage.table;

import NIMGuipackage.nimgui;

import javax.swing.*;

public class RunTablearray {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ignored) {
        }
        /**
         * set image icon
         */
        ImageIcon imageIcon = new ImageIcon("image/lambang1.png");
        JFrame frame = new JFrame("Aplikasi Urutkan Data Miftah Farid");
        frame.setIconImage(imageIcon.getImage());
        frame.setContentPane(new tablearray().getRootPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(500, 400);
        frame.setVisible(true);
    }
}
