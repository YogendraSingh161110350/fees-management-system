
package admin;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.ResultSet;

/**
 *
 * @author yogendra singh
 */
public class Receipt extends javax.swing.JFrame
{

    public Receipt() 
    {
        initComponents();
        getContentPane().setBackground(new Color(0, 107, 84));
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        print = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        back = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        edit = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        receip_panel = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        course_name = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        ammount = new javax.swing.JLabel();
        cgst = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        sgst = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        receipt_no = new javax.swing.JLabel();
        year_to = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        bank_name = new javax.swing.JLabel();
        recived_from = new javax.swing.JLabel();
        year_from = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        mode = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1925, 1050));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 107, 84));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 107, 84));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/home.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 2, -1, 58));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Home");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 12, 91, 48));

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 300, 70));

        jPanel2.setBackground(new java.awt.Color(0, 107, 84));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel2MouseExited(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/search2.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Search Record");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 205, 48));

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 300, -1));

        jPanel5.setBackground(new java.awt.Color(0, 107, 84));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel5MouseExited(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/edit2.png"))); // NOI18N
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 2, 73, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Edit Course");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 12, 171, 48));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 300, -1));

        jPanel6.setBackground(new java.awt.Color(0, 107, 84));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel6MouseExited(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/list.png"))); // NOI18N
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Course List");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 2, 161, 48));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 310, -1));

        jPanel7.setBackground(new java.awt.Color(0, 107, 84));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        jPanel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel7MouseExited(evt);
            }
        });
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/view all record.png"))); // NOI18N
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 0, 60, 70));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("View All Records");
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, 48));

        jPanel10.setBackground(new java.awt.Color(0, 107, 84));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel10MouseExited(evt);
            }
        });
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/view all record.png"))); // NOI18N
        jPanel10.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 0, 60, 70));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("View All Records");
        jPanel10.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 8, -1, 48));

        jPanel7.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 310, 70));

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 310, 70));

        print.setBackground(new java.awt.Color(0, 107, 84));
        print.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        print.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                printMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                printMouseExited(evt);
            }
        });
        print.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/printer-.png"))); // NOI18N
        print.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Print");
        print.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 91, 48));

        jPanel4.add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 740, 310, -1));

        jPanel9.setBackground(new java.awt.Color(0, 107, 84));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        jPanel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel9MouseExited(evt);
            }
        });
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/logout.png"))); // NOI18N
        jPanel9.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 2, 78, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Logout");
        jPanel9.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 109, 48));

        jPanel4.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 860, 310, -1));

        back.setBackground(new java.awt.Color(0, 107, 84));
        back.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backMouseExited(evt);
            }
        });
        back.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/left-arrow.png"))); // NOI18N
        back.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Back");
        back.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 8, 91, 48));

        jPanel4.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, 310, -1));

        edit.setBackground(new java.awt.Color(0, 107, 84));
        edit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editMouseExited(evt);
            }
        });
        edit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/edit2.png"))); // NOI18N
        edit.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Edit");
        edit.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 8, 91, 48));

        jPanel4.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 640, 310, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 1050));

        receip_panel.setBackground(new java.awt.Color(255, 255, 255));
        receip_panel.setForeground(new java.awt.Color(0, 0, 204));
        receip_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(255, 255, 204));
        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel12.setForeground(java.awt.Color.white);
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 0, 102));
        jLabel21.setText("Yogendra Charitable Trust's");
        jPanel12.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(583, 23, 239, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 0, 102));
        jLabel22.setText("Sir Yogendra Singh kirola");
        jPanel12.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 54, 391, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 42)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 0, 102));
        jLabel23.setText("School Of Commerce");
        jPanel12.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 99, 434, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 0, 102));
        jLabel24.setText("bengra,suraikhet road,dwarahat ,almora,uttrakhand-263653");
        jPanel12.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 162, -1, 32));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/clg_1.png"))); // NOI18N
        jPanel12.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 200, 170));

        receip_panel.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1510, 200));

        jPanel13.setBackground(new java.awt.Color(0, 0, 0));
        jPanel13.setPreferredSize(new java.awt.Dimension(1560, 10));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1510, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        receip_panel.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 1510, 10));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 0, 102));
        jLabel26.setText("GSTIN                  77YKSJH55");
        receip_panel.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 310, 250, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 0, 102));
        jLabel27.setText("Bank Name:");
        receip_panel.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 120, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(51, 0, 102));
        jLabel28.setText("Recieved From:");
        receip_panel.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 150, -1));

        course_name.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        course_name.setForeground(new java.awt.Color(51, 0, 102));
        course_name.setText("1.");
        receip_panel.add(course_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 630, 300, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(51, 0, 102));
        jLabel30.setText("Time duration of the fees:");
        receip_panel.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 250, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(51, 0, 102));
        jLabel31.setText("Reciept no.");
        receip_panel.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 100, -1));
        receip_panel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 1560, 10));
        receip_panel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 780, 510, 10));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(51, 0, 102));
        jLabel33.setText("Date:");
        receip_panel.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 250, 100, -1));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(51, 0, 102));
        jLabel34.setText("Sr No.");
        receip_panel.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 570, 60, -1));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(51, 0, 102));
        jLabel35.setText("Head");
        receip_panel.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 570, 100, -1));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(51, 0, 102));
        jLabel36.setText("Ammount(INR)");
        receip_panel.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 570, 160, -1));

        ammount.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        ammount.setForeground(new java.awt.Color(51, 0, 102));
        ammount.setText("SGST (9%)");
        receip_panel.add(ammount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 630, 270, -1));

        cgst.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        cgst.setForeground(new java.awt.Color(51, 0, 102));
        cgst.setText("CGST (9%)");
        receip_panel.add(cgst, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 740, 270, -1));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(51, 0, 102));
        jLabel39.setText("1.");
        receip_panel.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 630, 70, -1));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(51, 0, 102));
        jLabel40.setText("1.");
        receip_panel.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 630, 70, -1));

        sgst.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        sgst.setForeground(new java.awt.Color(51, 0, 102));
        sgst.setText("SGST (9%)");
        receip_panel.add(sgst, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 690, 270, -1));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(51, 0, 102));
        jLabel42.setText("Total");
        receip_panel.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 800, 90, -1));

        total.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        total.setForeground(new java.awt.Color(51, 0, 102));
        total.setText("Ammount");
        receip_panel.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 800, 250, -1));

        jLabel44.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(51, 0, 102));
        jLabel44.setText("CGST (9%)");
        receip_panel.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 730, 100, -1));
        receip_panel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 1560, 10));
        receip_panel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 1560, 10));

        jLabel45.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(51, 0, 102));
        jLabel45.setText("Manager ");
        receip_panel.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 840, 90, -1));

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(51, 0, 102));
        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/sign1.jpg"))); // NOI18N
        receip_panel.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 810, 160, -1));

        receipt_no.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        receipt_no.setForeground(new java.awt.Color(51, 0, 102));
        receipt_no.setText("SGST (9%)");
        receip_panel.add(receipt_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 380, 20));

        year_to.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        year_to.setForeground(new java.awt.Color(51, 0, 102));
        year_to.setText("2022");
        receip_panel.add(year_to, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 490, 60, -1));
        receip_panel.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 786, 510, -1));
        receip_panel.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 860, 260, 10));

        bank_name.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        bank_name.setForeground(new java.awt.Color(51, 0, 102));
        bank_name.setText("SGST (9%)");
        receip_panel.add(bank_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 400, -1));

        recived_from.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        recived_from.setForeground(new java.awt.Color(51, 0, 102));
        recived_from.setText("SGST (9%)");
        receip_panel.add(recived_from, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 450, -1));

        year_from.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        year_from.setForeground(new java.awt.Color(51, 0, 102));
        year_from.setText("2021");
        receip_panel.add(year_from, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 490, 70, -1));

        jLabel52.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(51, 0, 102));
        jLabel52.setText("TO");
        receip_panel.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, 40, -1));

        jLabel53.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(51, 0, 102));
        jLabel53.setText("SGST (9%)");
        receip_panel.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 680, 100, -1));

        date.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        date.setForeground(new java.awt.Color(51, 0, 102));
        date.setText("15/09/2023");
        receip_panel.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 250, 140, -1));

        mode.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        mode.setForeground(new java.awt.Color(51, 0, 102));
        mode.setText("SGST (9%)");
        receip_panel.add(mode, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 350, -1));

        jLabel55.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(51, 0, 102));
        jLabel55.setText("Payment Mode:");
        receip_panel.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 150, -1));

        jLabel32.setText("This is computer genrated receipt");
        receip_panel.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 900, 330, -1));

        getContentPane().add(receip_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 1570, 870));

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel58.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel58.setText("ELECTRONIC RECIEPT");
        jPanel3.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 600, 60));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 102));
        jSeparator7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 650, 10));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 1570, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        jPanel1.setBackground(Color.BLACK);
    }//GEN-LAST:event_jPanel1MouseEntered

    private void jPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseExited
        jPanel1.setBackground(new Color(0,107,84));
    }//GEN-LAST:event_jPanel1MouseExited

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
        jPanel2.setBackground(Color.BLACK);
    }//GEN-LAST:event_jPanel2MouseEntered

    private void jPanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseExited
        jPanel2.setBackground(new Color(0,107,84));
    }//GEN-LAST:event_jPanel2MouseExited

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked

    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
        jPanel5.setBackground(Color.BLACK);
    }//GEN-LAST:event_jPanel5MouseEntered

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited
        jPanel5.setBackground(new Color(0,107,84));
    }//GEN-LAST:event_jPanel5MouseExited

    private void jPanel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseEntered
        jPanel6.setBackground(Color.BLACK);
    }//GEN-LAST:event_jPanel6MouseEntered

    private void jPanel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseExited
        jPanel6.setBackground(new Color(0,107,84));
    }//GEN-LAST:event_jPanel6MouseExited

    private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseEntered
        jPanel7.setBackground(Color.BLACK);
    }//GEN-LAST:event_jPanel7MouseEntered

    private void jPanel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseExited
        jPanel7.setBackground(new Color(0,107,84));
    }//GEN-LAST:event_jPanel7MouseExited

    private void printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseClicked
       PrinterJob job = PrinterJob.getPrinterJob();
       job.setJobName("Print Data");
       job.setPrintable(new Printable()
       {
           @Override
           public int print(Graphics graphics, PageFormat page_format, int page_num) throws PrinterException 
           {
              page_format.setOrientation(PageFormat.PORTRAIT);
              if(page_num>0)
              {
                  return Printable.NO_SUCH_PAGE;
              }
               Graphics2D g2 = (Graphics2D)graphics;
               g2.translate(page_format.getImageableX(), page_format.getImageableY());
               g2.scale(0.4, 0.4);
               receip_panel.paint(g2);
               return Printable.PAGE_EXISTS;
               
           }
           
       });
       boolean ok = job.printDialog();
       if(ok)
       {
           try
           {
               job.print();
           }
           catch(Exception e)
           {
               e.printStackTrace();
           }
       }
    }//GEN-LAST:event_printMouseClicked

    private void printMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseEntered
        print.setBackground(Color.BLACK);
    }//GEN-LAST:event_printMouseEntered

    private void printMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseExited
        print.setBackground(new Color(0,107,84));
    }//GEN-LAST:event_printMouseExited

    private void jPanel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseEntered
        jPanel9.setBackground(Color.BLACK);
    }//GEN-LAST:event_jPanel9MouseEntered

    private void jPanel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseExited
        jPanel9.setBackground(new Color(0,107,84));
    }//GEN-LAST:event_jPanel9MouseExited

    private void jPanel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel10MouseEntered

    private void jPanel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseExited
       
    }//GEN-LAST:event_jPanel10MouseExited

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        new AddFees().setVisible(true);
        dispose();
    }//GEN-LAST:event_backMouseClicked

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        back.setBackground(Color.black);
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
       back.setBackground(new Color(0,107,84));
    }//GEN-LAST:event_backMouseExited

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
        new EditReciept().setVisible(true);
        dispose();
    }//GEN-LAST:event_editMouseClicked

    private void editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseEntered
        edit.setBackground(Color.black);
    }//GEN-LAST:event_editMouseEntered

    private void editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseExited
        edit.setBackground(new Color(0,107,84));
    }//GEN-LAST:event_editMouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        try
        {
             ResultSet rs = dboperation.DBOperation.printReciept();
            if(!(rs==null)&&rs.next())
            {   
                
                receipt_no.setText(rs.getInt(1)+"");
                mode.setText(rs.getString("mode"));
                bank_name.setText("bank");
                recived_from.setText(rs.getString(2));
                year_from.setText(rs.getString(17));
                year_to.setText(rs.getString(18));
                date.setText(rs.getDate("datee").toString());
                String bank = rs.getString("bank");
                course_name.setText(rs.getString("course_name"));
                if(bank=="")
                {
                    bank_name.setText("_____");
                }
                else
                {
                    bank_name.setText(bank);
                }
                ammount.setText(rs.getFloat(19)+" INR");
                cgst.setText(rs.getFloat("cgst")+" INR");
                sgst.setText(rs.getFloat("sgst")+" INR");
                total.setText(rs.getFloat("paid_ammount")+" INR");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
       
    }//GEN-LAST:event_formWindowOpened

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
       jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white,java.awt.Color.BLUE, null));
    }//GEN-LAST:event_jPanel1MousePressed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Receipt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ammount;
    private javax.swing.JPanel back;
    private javax.swing.JLabel bank_name;
    private javax.swing.JLabel cgst;
    private javax.swing.JLabel course_name;
    private javax.swing.JLabel date;
    private javax.swing.JPanel edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel mode;
    private javax.swing.JPanel print;
    private javax.swing.JPanel receip_panel;
    private javax.swing.JLabel receipt_no;
    private javax.swing.JLabel recived_from;
    private javax.swing.JLabel sgst;
    private javax.swing.JLabel total;
    private javax.swing.JLabel year_from;
    private javax.swing.JLabel year_to;
    // End of variables declaration//GEN-END:variables
}
