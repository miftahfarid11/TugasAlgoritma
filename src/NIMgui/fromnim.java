package NIMgui;

import com.sun.corba.se.impl.protocol.giopmsgheaders.TargetAddressHelper;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLOutput;

public class fromnim {
    private JTextField textNama;
    private JTextField textNIM;
    private JTextField textTempatLahir;
    private JTextField textTanggalLahir;
    private JTextField textJenjang;
    private JTextField textTahunMasuk;
    private JTextField textFakultas;
    private JTextField textJurusan;
    private JTextField textJenisKelamin;
    private JTextField textNomorUrut;
    private JButton Save;
    private JPanel rootPanel;
    private JLabel labelhasil;

    public fromnim() {
        Save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = textNama.getText();
                String NIM = textNIM.getText();
                String TempatLahir = textTempatLahir.getText();
                String TanggalLahir = textTanggalLahir.getText();
                String Jenjang = textJenjang.getText();
                String TahunMasuk = textTahunMasuk.getText();
                String Fakultas = textFakultas.getText();
                String Jurusan = textJurusan.getText();
                String JenisKelamin = textJenisKelamin.getText();
                String NomorUrut = textNomorUrut.getText();
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNama(nama);
                mhs.setNIM(NIM);
                mhs.setTempatLahir(TempatLahir);
                mhs.setTanggalLahir(TanggalLahir);
                mhs.setJenjang(Jenjang);
                mhs.setTahunMasuk(TahunMasuk);
                mhs.setFakultas(Fakultas);
                mhs.setJurusan(Jurusan);
                mhs.setJenisKelamin(JenisKelamin);
                mhs.setNomorUrut(NomorUrut);
                labelhasil.setText(mhs.toString());
            }
        });

    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}
