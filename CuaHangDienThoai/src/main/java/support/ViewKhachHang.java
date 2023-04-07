/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package support;

import domainmodel.KhachHang;
import java.awt.Color;
import java.awt.Font;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import repository.impl.KhachHangRepository;
import swing.Home;
import util.GenMa;
import viewmodel.KhachHangViewMD;

/**
 *
 * @author lethi
 */
public class ViewKhachHang extends javax.swing.JFrame {

    /**
     * Creates new form ViewKhachHang
     */
    KhachHangRepository kh = new KhachHangRepository();
    DefaultTableModel model;

    public ViewKhachHang() {
        initComponents();
        setLocationRelativeTo(null);
        model = (DefaultTableModel) tblKhachHangCu.getModel();
        fillToTable();
        tblKhachHangCu.getTableHeader().setBackground(new Color(13, 83, 193));
//        tblKhachHangCu.getTableHeader().setOpaque(false);
        tblKhachHangCu.getTableHeader().setForeground(Color.WHITE);
        tblKhachHangCu.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 16));
        tblKhachHangCu.setRowHeight(30);
        tblKhachHangCu.setShowHorizontalLines(true);
        tblKhachHangCu.setShowVerticalLines(false);
        tblKhachHangCu.setSelectionBackground(new Color(210,227,241));
        tblKhachHangCu.setSelectionForeground(Color.black);
    }

    void fillToTable() {
        model.setRowCount(0);
<<<<<<< HEAD
        for (KhachHang x : kh.getAll1()) {
            model.addRow(new Object[]{x.getMaKH(), x, x.getSDT(), x.getDiaChi(), x.getNgaySinh(), x.getGioiTinh() == 0 ? "Nữ" : "Nam", x.getDiemTichLuy()});
=======
        for (KhachHangViewMD x : kh.getAll()) {
            model.addRow(new Object[]{x.getMaKH(),x,x.getSDT(),x.getDiaChi(),x.getNgaySinh(),x.getGioiTinh()==0?"Nữ":"Nam",x.getDiemTichLuy()});
>>>>>>> ede697757949dc3a9927e5cdf53a3ff09bd4b6d2
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKhachHangCu = new javax.swing.JTable();
        txtSearchKHCu = new javax.swing.JTextField();
        LayThongTinKHCu = new javax.swing.JButton();
        btnHuyLTT = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        txthoTen = new javax.swing.JTextField();
        txtSoDienThoaiKHMoi = new javax.swing.JTextField();
        txtDiaChiKHMoi = new javax.swing.JTextField();
        txtEmailKHMoi = new javax.swing.JTextField();
        btnLayThongTinKhachHangMoi = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtGhiChu = new javax.swing.JTextArea();
        dcNamSinh = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Thông tin khách hàng");

        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

<<<<<<< HEAD
        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

=======
>>>>>>> ede697757949dc3a9927e5cdf53a3ff09bd4b6d2
        tblKhachHangCu.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        tblKhachHangCu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CCCD/CMND", "Tên khách hàng", "Số điện thoại", "Địa chỉ", "Năm sinh", "Giới Tính", "Điểm tích luỹ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKhachHangCu.setFillsViewportHeight(true);
        tblKhachHangCu.setSelectionBackground(new java.awt.Color(210, 227, 241));
        jScrollPane1.setViewportView(tblKhachHangCu);

        txtSearchKHCu.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
<<<<<<< HEAD
        txtSearchKHCu.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(71, 120, 197)));

        LayThongTinKHCu.setBackground(new java.awt.Color(71, 120, 197));
        LayThongTinKHCu.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        LayThongTinKHCu.setForeground(new java.awt.Color(255, 255, 255));
=======
        txtSearchKHCu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(71, 120, 197)));

        LayThongTinKHCu.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
>>>>>>> ede697757949dc3a9927e5cdf53a3ff09bd4b6d2
        LayThongTinKHCu.setText("Lấy thông tin");
        LayThongTinKHCu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LayThongTinKHCuActionPerformed(evt);
            }
        });

<<<<<<< HEAD
        btnHuyLTT.setBackground(new java.awt.Color(71, 120, 197));
        btnHuyLTT.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnHuyLTT.setForeground(new java.awt.Color(255, 255, 255));
=======
        btnHuyLTT.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
>>>>>>> ede697757949dc3a9927e5cdf53a3ff09bd4b6d2
        btnHuyLTT.setText("Hủy ");
        btnHuyLTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyLTTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
<<<<<<< HEAD
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnHuyLTT)
                            .addGap(18, 18, 18)
                            .addComponent(LayThongTinKHCu)
                            .addGap(6, 6, 6))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtSearchKHCu, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
=======
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnHuyLTT)
                        .addGap(24, 24, 24)
                        .addComponent(LayThongTinKHCu))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(txtSearchKHCu, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
>>>>>>> ede697757949dc3a9927e5cdf53a3ff09bd4b6d2
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSearchKHCu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
<<<<<<< HEAD
=======
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
>>>>>>> ede697757949dc3a9927e5cdf53a3ff09bd4b6d2
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LayThongTinKHCu)
                    .addComponent(btnHuyLTT))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Khách hàng cũ", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

<<<<<<< HEAD
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(71, 120, 197));
        jLabel1.setText("Họ và tên :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(71, 120, 197));
        jLabel3.setText("Số điện thoại:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(71, 120, 197));
        jLabel4.setText("Giới tính:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(71, 120, 197));
        jLabel5.setText("Địa chỉ:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(71, 120, 197));
        jLabel6.setText("Ngày sinh:");

        rdoNam.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoNam);
        rdoNam.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        rdoNam.setSelected(true);
        rdoNam.setText("Nam");

        rdoNu.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoNu);
        rdoNu.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        rdoNu.setText("Nữ");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(71, 120, 197));
        jLabel7.setText("Email:");

        txthoTen.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
=======
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel1.setText("Họ và tên :");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel2.setText("Số CCCD:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel3.setText("Số điện thoại:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel4.setText("Giới tính:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel5.setText("Địa chỉ:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel6.setText("Năm sinh:");

        radioNam.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radioNam);
        radioNam.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        radioNam.setText("Nam");

        radioNu.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radioNu);
        radioNu.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        radioNu.setText("Nữ");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setText("Email:");

        txtHoTenKHMoi.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        txtCccdKHMoi.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
>>>>>>> ede697757949dc3a9927e5cdf53a3ff09bd4b6d2

        txtSoDienThoaiKHMoi.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        txtDiaChiKHMoi.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

<<<<<<< HEAD
        txtEmailKHMoi.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        btnLayThongTinKhachHangMoi.setBackground(new java.awt.Color(71, 120, 197));
        btnLayThongTinKhachHangMoi.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnLayThongTinKhachHangMoi.setForeground(new java.awt.Color(255, 255, 255));
=======
        txtNamSinhKHMoi.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        txtEmailKHMoi.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        btnLayThongTinKhachHangMoi.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
>>>>>>> ede697757949dc3a9927e5cdf53a3ff09bd4b6d2
        btnLayThongTinKhachHangMoi.setText("Lấy thông tin");
        btnLayThongTinKhachHangMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLayThongTinKhachHangMoiActionPerformed(evt);
            }
        });
<<<<<<< HEAD

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(71, 120, 197));
        jLabel8.setText("Ghi chú");

        txtGhiChu.setColumns(20);
        txtGhiChu.setRows(5);
        jScrollPane2.setViewportView(txtGhiChu);
=======
>>>>>>> ede697757949dc3a9927e5cdf53a3ff09bd4b6d2

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLayThongTinKhachHangMoi)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
<<<<<<< HEAD
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
=======
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)))
>>>>>>> ede697757949dc3a9927e5cdf53a3ff09bd4b6d2
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDiaChiKHMoi, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                            .addComponent(txtEmailKHMoi, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                            .addComponent(txthoTen, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                            .addComponent(txtSoDienThoaiKHMoi, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(rdoNam)
                                .addGap(45, 45, 45)
<<<<<<< HEAD
                                .addComponent(rdoNu))
                            .addComponent(jScrollPane2)
                            .addComponent(dcNamSinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
=======
                                .addComponent(radioNu))
                            .addComponent(txtHoTenKHMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))))
>>>>>>> ede697757949dc3a9927e5cdf53a3ff09bd4b6d2
                .addGap(68, 68, 68))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txthoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSoDienThoaiKHMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rdoNam)
                    .addComponent(rdoNu))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtDiaChiKHMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(dcNamSinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtEmailKHMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnLayThongTinKhachHangMoi)
<<<<<<< HEAD
                .addGap(34, 34, 34))
=======
                .addContainerGap(106, Short.MAX_VALUE))
>>>>>>> ede697757949dc3a9927e5cdf53a3ff09bd4b6d2
        );

        jTabbedPane1.addTab("Khách hàng mới", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHuyLTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyLTTActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnHuyLTTActionPerformed

    private void LayThongTinKHCuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LayThongTinKHCuActionPerformed
        // TODO add your handling code here:
        int row = tblKhachHangCu.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn khách hàng");
            return;
        }
        KhachHang kh = (KhachHang) tblKhachHangCu.getValueAt(row, 1);
        Home.khachHangMua = kh;
        Home.lblTenKhachHang.setText(kh.getHoTenKH());
        Home.txtDiem.setText(tblKhachHangCu.getValueAt(row, 6).toString());
        JOptionPane.showMessageDialog(this, "Lấy thông tin thành công");
        dispose();
    }//GEN-LAST:event_LayThongTinKHCuActionPerformed

    private void btnLayThongTinKhachHangMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLayThongTinKhachHangMoiActionPerformed
        // TODO add your handling code here:
<<<<<<< HEAD
        String hoTen = getValues(txthoTen);
        String sdt = getValues(txtSoDienThoaiKHMoi);
        String diaChi = getValues(txtDiaChiKHMoi);
        String email = getValues(txtEmailKHMoi);
        Date ngaySinh = dcNamSinh.getDate();
        int gioiTinh = rdoNam.isSelected() ? 1 : 0;
        String ghiChu = txtGhiChu.getText().trim();
        String maKH = "KH" + (GenMa.getMa() + 1);

        KhachHang kh = new KhachHang(null, hoTen, maKH, ngaySinh, sdt, email, diaChi, gioiTinh, gioiTinh, ghiChu, null);
        this.kh.add(kh);
        Home.khachHangMua = kh;
        Home.lblTenKhachHang.setText(kh.getHoTenKH());
        Home.txtDiem.setText("0");
        JOptionPane.showMessageDialog(this, "Thêm khách hàng mới thành công");
        dispose();
    }//GEN-LAST:event_btnLayThongTinKhachHangMoiActionPerformed

    String getValues(JTextField txtField) {
        return txtField.getText().trim();
    }

=======
    }//GEN-LAST:event_btnLayThongTinKhachHangMoiActionPerformed

>>>>>>> ede697757949dc3a9927e5cdf53a3ff09bd4b6d2
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewKhachHang().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LayThongTinKHCu;
    private javax.swing.JButton btnHuyLTT;
    private javax.swing.JButton btnLayThongTinKhachHangMoi;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser dcNamSinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTable tblKhachHangCu;
    private javax.swing.JTextField txtDiaChiKHMoi;
    private javax.swing.JTextField txtEmailKHMoi;
    private javax.swing.JTextArea txtGhiChu;
    private javax.swing.JTextField txtSearchKHCu;
    private javax.swing.JTextField txtSoDienThoaiKHMoi;
    private javax.swing.JTextField txthoTen;
    // End of variables declaration//GEN-END:variables
}
