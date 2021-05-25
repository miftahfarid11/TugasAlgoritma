package NIMgui;

import javax.swing.*;

public class RunformNIM {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("From Biodata Mahasiswa");
        jFrame.setContentPane(new fromnim().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(600, 500);
        jFrame.setVisible(true);
    }
}
