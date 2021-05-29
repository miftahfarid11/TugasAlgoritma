package NIMGuipackage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class nimgui {
    private JTextField textNama;
    private JTextField textNIM;
    private JButton Exit;
    private JLabel Hasil;
    private JLabel Hasil2;
    private JLabel Hasil3;
    private JLabel Hasil4;
    private JLabel Hasil5;
    private JLabel Hasil6;
    private JLabel Hasil7;
    private JLabel Hasil8;
    private JButton Save;
    private JPanel rootPanel;

    public nimgui() {
        Save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = textNama.getText();
                String NIM = textNIM.getText();
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNama(nama);
                mhs.setNim(NIM);
                Hasil.setText("Nama: " + mhs.getNama());
                Hasil2.setText("NIM: " + mhs.getNim());
                Hasil3.setText("Jenjang Pendidikan: " + mhs.getJenjang());
                Hasil4.setText("Tahun Masuk: 20" + mhs.getTahun());
                Hasil5.setText("Fakultas: " + mhs.getFakultas());
                Hasil6.setText("Jurusan: " + mhs.getJurusan());
                Hasil7.setText("Jenis Kelamin: " + mhs.getJenisKelamin());
                Hasil8.setText("Nomor Urut: " + mhs.getNomorurut());

            }
        });
        Exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}
