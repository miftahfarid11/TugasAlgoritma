package NIMGuipackage;

import javax.swing.*;

public class runnimgui {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplikasi Scan NIM");
        frame.setContentPane(new nimgui().getRootPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(500, 400);
        frame.setVisible(true);
    }
}
