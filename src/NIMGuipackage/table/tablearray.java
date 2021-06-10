package NIMGuipackage.table;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tablearray {
    private JPanel rootPanel;
    private JTextField textangka;
    private JButton ButtonUrutkan;
    private JTable tableUrutkanData;
    private JTextField textInput;
    private DefaultTableModel tableModel;
    private boolean added = false;
    private Object DefaultTableModel;

    public JPanel getRootPanel() {
        return rootPanel;
    }


    public tablearray() {
        this.initComponents();
        ButtonUrutkan.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model = (DefaultTableModel) tableUrutkanData.getModel();
                String input = textInput.getText();
                int jumlah = Integer.parseInt(textangka.getText());
                String[] stmp = input.split(",");
                String angka = textangka.getText();
                if (textangka.getText().length() > 3) {
                    JOptionPane.showMessageDialog(rootPanel,
                            "Data yang diinput berlebih",
                            "Warning!!!",
                            JOptionPane.WARNING_MESSAGE);

                    return;
                }
                if (stmp.length > jumlah || stmp.length < jumlah) {
                    JOptionPane.showMessageDialog(rootPanel,
                            "Jumlah Angka Tidak Sesuai Limit yang DiInput",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }
                /**if (input.isEmpty() || angka.isEmpty()) {
                    JOptionPane.showMessageDialog(rootPanel,
                            "Data belum anda masukkan",
                            "Warning!!!",
                            JOptionPane.WARNING_MESSAGE);

                    return;
                }*/
                if (!added) {
                    for (int i = 0; i < jumlah; i++) {
                        model.addRow(new Object[]{});
                    }
                    added = true;
                }
                int a = 0;
                for (int i : Sorting.getas(input, jumlah)) {
                    model.setValueAt(i, a, 0);
                    a++;
                }
                int b = 0;
                for (int i : Sorting.getdes(input, jumlah)) {
                    model.setValueAt(i, b, 1);
                    b++;
                }
            }
        });
    }
    private void initComponents() {
        Object[] tableColom = {
                "Ascending",
                "Descending"
        };
        Object[][] initData = {
        };
        tableModel = new DefaultTableModel(initData, tableColom);
        tableUrutkanData.setModel(tableModel);
        tableUrutkanData.setAutoCreateRowSorter(false);
        tableUrutkanData.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
}