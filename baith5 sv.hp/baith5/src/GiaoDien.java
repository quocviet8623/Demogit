import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Vector;

public class GiaoDien {
    private JFrame frame;
    private JList<String> nhanVienList;

    public GiaoDien(Vector<NhanVien> danhSachNhanVien) {
        frame = new JFrame("Quản lý nhân viên");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(400, 300));

        DefaultListModel<String> listModel = new DefaultListModel<>();
        for (NhanVien nhanVien : danhSachNhanVien) {
            listModel.addElement(nhanVien.maNV + " - " + nhanVien.hoTen);
        }
         nhanVienList = new JList<>(listModel);
        nhanVienList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JButton btnHienThi = new JButton("Hiển thị thông tin");
        btnHienThi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = nhanVienList.getSelectedIndex();
                if (selectedIndex != -1) {
                    NhanVien selectedNhanVien = danhSachNhanVien.get(selectedIndex);
                    JOptionPane.showMessageDialog(frame, "Thông tin nhân viên:\n" +
                            "Mã nhân viên: " + selectedNhanVien.maNV + "\n" +
                            "Họ và tên: " + selectedNhanVien.hoTen + "\n" +
                            "Lương: " + selectedNhanVien.tinhLuong());
                } else {
                    JOptionPane.showMessageDialog(frame, "Vui lòng chọn một nhân viên.");
                }
            }
        });

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JScrollPane(nhanVienList), BorderLayout.CENTER);
        panel.add(btnHienThi, BorderLayout.SOUTH);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Vector<NhanVien> danhSachNhanVien = new Vector<>();
                danhSachNhanVien.add(new NhanVienHDG("NV001", "Nguyễn Văn A", 150000, (byte) 168));
                danhSachNhanVien.add(new NhanVienHDDH("NV002", "Trần Thị B", 20000000));
                danhSachNhanVien.add(new CongTacVien("NV003", "Lê Văn C", 50000000, 0.1));
                new GiaoDien(danhSachNhanVien);
            }
        });
    }
}







