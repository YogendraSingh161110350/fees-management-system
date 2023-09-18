
package admin;

import java.awt.Color;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
/**
 *
 * @author yogendra singh
 */
public class EditReciept extends javax.swing.JFrame {
     ResultSet rs =null;
    public EditReciept() {
        initComponents();
        getCoursesList();
        payment2.setVisible(false);
        payment1.setVisible(false);
        payment_id1.setVisible(false);
        cv_number.setVisible(false);
        cv_label.setVisible(false);
        payment_id2.setVisible(false);
        rs= dboperation.DBOperation.printReciept();
        if(rs!=null)
        {
            try
            {
                rs.next();
                recieved_from.setText(rs.getString("student_name"));
                reciept_no.setText(rs.getInt(1)+"");
                deposite_from.setText(rs.getString("year1"));
                deposite_to.setText(rs.getString("year2"));
                remark.setText(rs.getString("remark"));
                course_name.setText(rs.getString("course_name"));
                courses.setSelectedItem(rs.getString("course_name"));
                String mode=rs.getString("mode");
                c_gst.setText(rs.getFloat("cgst")+"");
                s_gst.setText(rs.getFloat("sgst")+"");
                total_ammount.setText(rs.getFloat("paid_ammount")+"");
                deposite_ammount.setText(rs.getFloat("raw_ammount")+"");
                roll_no.setText(rs.getString("roll_no"));
                submition_date.setDate(rs.getDate("datee"));
                payment_option.setSelectedItem(mode);
                payment_id1.setText(rs.getString("bank"));
                payment_id2.setText(rs.getString("card"));
                cv_number.setText(rs.getString("cv"));
                payment_id1.setText(rs.getString("upi_id"));
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }   
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        courses = new javax.swing.JComboBox<>();
        submition_date = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        reciept_no = new javax.swing.JTextField();
        deposite_from = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        payment_option = new javax.swing.JComboBox<>();
        jPanel10 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        deposite_ammount = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        c_gst = new javax.swing.JTextField();
        s_gst = new javax.swing.JTextField();
        total_ammount = new javax.swing.JTextField();
        recieved_from = new javax.swing.JTextField();
        course_name = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        remark = new javax.swing.JTextArea();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        print = new javax.swing.JButton();
        payment2 = new javax.swing.JLabel();
        deposite_to = new javax.swing.JTextField();
        payment1 = new javax.swing.JLabel();
        payment_id1 = new javax.swing.JTextField();
        cv_label = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        payment_id2 = new javax.swing.JTextField();
        cv_number = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        roll_no = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
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
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("RECIVER SIGNATURE: ");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 880, 160, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("Date:");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 40, 50, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setText("Receipt no : SOC-");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 800, 410, 30));

        courses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursesActionPerformed(evt);
            }
        });
        jPanel3.add(courses, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 250, 40));

        submition_date.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(submition_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 30, 290, 40));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 0, 0));
        jLabel18.setText("GSTIN :     77YKSJH55     ");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 310, 50));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setText("Mode Of Payment");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 170, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setText("TO");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 350, 50, -1));

        reciept_no.setEditable(false);
        reciept_no.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        reciept_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reciept_noActionPerformed(evt);
            }
        });
        jPanel3.add(reciept_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 210, 30));

        deposite_from.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        deposite_from.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deposite_fromActionPerformed(evt);
            }
        });
        jPanel3.add(deposite_from, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 140, 30));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setText("THE FOLLOWING PAYMENT DEPOSITED FROM ");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 380, -1));

        payment_option.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CASH", "UPI", "NET BANKING", "DEBIT CARD", "CREDIT CARD" }));
        payment_option.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                payment_optionMouseClicked(evt);
            }
        });
        payment_option.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payment_optionActionPerformed(evt);
            }
        });
        jPanel3.add(payment_option, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 210, -1));

        jPanel10.setBackground(new java.awt.Color(0, 119, 108));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setText("Sr. No.");
        jPanel10.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 140, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel23.setText("Sr. No.");
        jPanel10.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 100, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel24.setText("Head");
        jPanel10.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 140, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel25.setText("Ammount");
        jPanel10.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 20, 140, -1));

        jPanel3.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 1490, 70));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel26.setText("CGST 9%");
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 690, 80, -1));

        deposite_ammount.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        deposite_ammount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deposite_ammountActionPerformed(evt);
            }
        });
        deposite_ammount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                deposite_ammountKeyReleased(evt);
            }
        });
        jPanel3.add(deposite_ammount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 620, 410, 30));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel27.setText("SGST 9%");
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 720, 80, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel28.setText("Recieved From: ");
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 140, -1));

        c_gst.setEditable(false);
        c_gst.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        c_gst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_gstActionPerformed(evt);
            }
        });
        jPanel3.add(c_gst, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 680, 410, 30));

        s_gst.setEditable(false);
        s_gst.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        s_gst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_gstActionPerformed(evt);
            }
        });
        jPanel3.add(s_gst, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 740, 410, 30));

        total_ammount.setEditable(false);
        total_ammount.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        total_ammount.setForeground(new java.awt.Color(204, 0, 0));
        total_ammount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_ammountActionPerformed(evt);
            }
        });
        jPanel3.add(total_ammount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 810, 410, 30));

        recieved_from.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        recieved_from.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recieved_fromActionPerformed(evt);
            }
        });
        jPanel3.add(recieved_from, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 410, 40));

        course_name.setEditable(false);
        course_name.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        course_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course_nameActionPerformed(evt);
            }
        });
        jPanel3.add(course_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 620, 410, 30));

        remark.setColumns(20);
        remark.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        remark.setRows(5);
        jScrollPane1.setViewportView(remark);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 300, 410, 170));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel29.setText("COURSE :");
        jPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 80, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel31.setText("REMARK:");
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 270, 80, -1));

        print.setBackground(new java.awt.Color(0, 102, 51));
        print.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        print.setForeground(new java.awt.Color(255, 255, 255));
        print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/printer-.png"))); // NOI18N
        print.setText("Print");
        print.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 102, 51), null, null));
        print.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printMouseClicked(evt);
            }
        });
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        jPanel3.add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 900, 170, 60));

        payment2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        payment2.setText("Enter A/C Number:");
        jPanel3.add(payment2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, -1, -1));

        deposite_to.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        deposite_to.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deposite_toActionPerformed(evt);
            }
        });
        jPanel3.add(deposite_to, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 350, 140, 30));

        payment1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        payment1.setText("Enter Bank Name:");
        jPanel3.add(payment1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        payment_id1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        payment_id1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payment_id1ActionPerformed(evt);
            }
        });
        jPanel3.add(payment_id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 220, 30));

        cv_label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cv_label.setText("CV NUMBER:");
        jPanel3.add(cv_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 150, -1, -1));
        jPanel3.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 40, 260, -1));

        payment_id2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        payment_id2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payment_id2ActionPerformed(evt);
            }
        });
        jPanel3.add(payment_id2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 220, 30));

        cv_number.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cv_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cv_numberActionPerformed(evt);
            }
        });
        jPanel3.add(cv_number, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 140, 260, 30));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/sign1.jpg"))); // NOI18N
        jPanel3.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 850, 140, 40));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel33.setText("Enter Roll.No.");
        jPanel3.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, -1, -1));

        roll_no.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel3.add(roll_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 439, 290, 40));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(153, 0, 0));
        jLabel34.setText("Total Ammount");
        jPanel3.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 810, 180, -1));

        jSeparator6.setBackground(new java.awt.Color(51, 0, 102));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 204));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 890, 260, 20));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 102));
        jPanel3.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 790, 630, 10));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 204));
        jPanel3.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 784, 710, 0));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, -20, 1570, 1060));

        jPanel4.setBackground(new java.awt.Color(0, 107, 84));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 107, 84));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel1MouseExited(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/home.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Home");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 99, 358, -1));

        jPanel2.setBackground(new java.awt.Color(0, 107, 84));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel2MouseExited(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/search2.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Search Record");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 224, 358, -1));

        jPanel5.setBackground(new java.awt.Color(0, 107, 84));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
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

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/edit2.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Edit Course");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 357, 358, -1));

        jPanel6.setBackground(new java.awt.Color(0, 107, 84));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel6MouseExited(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/list.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Course List");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(30, 30, 30)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 492, 358, -1));

        jPanel7.setBackground(new java.awt.Color(0, 107, 84));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel7MouseExited(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/view all record.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("View All Records");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 619, -1, 80));

        jPanel8.setBackground(new java.awt.Color(0, 107, 84));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel8MouseExited(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/left-arrow.png"))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Back");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(28, 28, 28)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 754, 358, -1));

        jPanel9.setBackground(new java.awt.Color(0, 107, 84));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel9MouseExited(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/logout.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Logout");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 865, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 1050));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
       jPanel1.setBackground(Color.BLACK);
    }//GEN-LAST:event_jPanel1MouseEntered

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
       jPanel2.setBackground(Color.BLACK);
    }//GEN-LAST:event_jPanel2MouseEntered

    private void jPanel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseEntered
      jPanel6.setBackground(Color.BLACK);
    }//GEN-LAST:event_jPanel6MouseEntered

    private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseEntered
        jPanel7.setBackground(Color.BLACK);
    }//GEN-LAST:event_jPanel7MouseEntered

    private void jPanel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseEntered
        jPanel8.setBackground(Color.BLACK);
    }//GEN-LAST:event_jPanel8MouseEntered

    private void jPanel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseEntered
        jPanel9.setBackground(Color.BLACK);
    }//GEN-LAST:event_jPanel9MouseEntered

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
        jPanel5.setBackground(Color.BLACK);
    }//GEN-LAST:event_jPanel5MouseEntered

    private void jPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseExited
      jPanel1.setBackground(new Color(0,107,84));
    }//GEN-LAST:event_jPanel1MouseExited

    private void jPanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseExited
       jPanel2.setBackground(new Color(0,107,84));
    }//GEN-LAST:event_jPanel2MouseExited

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited
       jPanel5.setBackground(new Color(0,107,84));
    }//GEN-LAST:event_jPanel5MouseExited

    private void jPanel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseExited
       jPanel6.setBackground(new Color(0,107,84));
    }//GEN-LAST:event_jPanel6MouseExited

    private void jPanel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseExited
       jPanel8.setBackground(new Color(0,107,84));
    }//GEN-LAST:event_jPanel8MouseExited

    private void jPanel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseExited
       jPanel9.setBackground(new Color(0,107,84));
    }//GEN-LAST:event_jPanel9MouseExited

    private void jPanel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseExited
       jPanel7.setBackground(new Color(0,107,84));
    }//GEN-LAST:event_jPanel7MouseExited

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void reciept_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reciept_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reciept_noActionPerformed

    private void deposite_fromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deposite_fromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deposite_fromActionPerformed

    private void deposite_ammountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deposite_ammountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deposite_ammountActionPerformed

    private void c_gstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_gstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_gstActionPerformed

    private void s_gstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_gstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s_gstActionPerformed

    private void total_ammountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_ammountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_total_ammountActionPerformed

    private void recieved_fromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recieved_fromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recieved_fromActionPerformed

    private void course_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_course_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_course_nameActionPerformed

    private void payment_optionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_payment_optionMouseClicked
        if(((String)payment_option.getSelectedItem()).equals("cash"))
        {
            System.out.println("hiii");
        }
    }//GEN-LAST:event_payment_optionMouseClicked

    private void deposite_toActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deposite_toActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deposite_toActionPerformed

    private void payment_id1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payment_id1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payment_id1ActionPerformed
// to check the payment method
    private void payment_optionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payment_optionActionPerformed
        if(payment_option.getSelectedItem().equals("UPI"))
       {
           payment1.setText("UPI ID:");
           payment1.setVisible(true);
           payment_id1.setVisible(true);
           payment2.setVisible(false);
           cv_number.setVisible(false);
           cv_label.setVisible(false);
           payment_id2.setVisible(false);
       }
       else if(payment_option.getSelectedIndex()==2)
       {
           payment1.setText("Bank NAME:");
           payment2.setText("NET BANKING ID:");
           payment1.setVisible(true);
           payment2.setVisible(true);
           payment_id1.setVisible(true);
           payment_id2.setVisible(true);
           
           cv_number.setVisible(false);
           cv_label.setVisible(false);
           
       }
       else if(payment_option.getSelectedIndex()==3||payment_option.getSelectedIndex()==4)
       {
           payment1.setText("Bank NAME:");
           payment2.setText("Card Number");
           payment1.setVisible(true);
           payment2.setVisible(true);
           payment_id1.setVisible(true);
           payment_id2.setVisible(true);
           cv_label.setVisible(true);
           cv_number.setVisible(true);           
       } 
       else
       {
           payment1.setVisible(false);
           payment_id1.setVisible(false);
           payment_id2.setVisible(false);
           payment2.setVisible(false);
           cv_label.setVisible(false);
           cv_number.setVisible(false);
       }        
    }//GEN-LAST:event_payment_optionActionPerformed

    private void payment_id2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payment_id2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payment_id2ActionPerformed

    private void cv_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cv_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cv_numberActionPerformed

    private void printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseClicked
      if(getValidation())
      {
          int recieve_id = Integer.parseInt(reciept_no.getText().trim());
          String student_name = recieved_from.getText();
          String roll_number = roll_no.getText();
          String mode = payment_option.getSelectedItem().toString().toUpperCase();
          String upi_id =payment_id1.getText().trim().toUpperCase();
          String bank = payment_id1.getText().trim().toUpperCase();
          String cv = cv_number.getText().trim();
          String card = payment_id2.getText().trim();
          String course_name = this.course_name.getText().trim();
          String gst_num = "77YKSJH55";
          float paid_ammount=Float.parseFloat(total_ammount.getText());
          float sgst = Float.parseFloat(s_gst.getText());
          float cgst = Float.parseFloat(c_gst.getText());
          float raw_ammount = Float.parseFloat(deposite_ammount.getText().trim());
          String amt_in_word="hiiii";
          String remark = this.remark.getText().trim();
          SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-YYYY");
          java.util.Date d1 = submition_date.getDate();
          sdf.format(d1);
          Date datee = new Date(d1.getTime());
          String year1 = deposite_from.getText().trim();
          String year2 = deposite_to.getText().trim();
          boolean status =dboperation.DBOperation.getUpdate(recieve_id, raw_ammount, cgst, sgst, paid_ammount, datee, student_name,roll_number,mode,upi_id,bank,cv,card,course_name,gst_num,amt_in_word,remark,year1,year2);
           if(status)
          {
              JOptionPane.showMessageDialog(this, "value Updated..");
              new Receipt().setVisible(true);
              dispose();
          }
      }
    }//GEN-LAST:event_printMouseClicked

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_printActionPerformed

    private void deposite_ammountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_deposite_ammountKeyReleased
        
        if(deposite_ammount.getText().trim().matches("[0-9]+[.]?[0-9]*")&&!deposite_ammount.getText().trim().equals(""))
       {
           Float deposite = Float.parseFloat(deposite_ammount.getText().trim());
           Float gst = (float)(deposite*0.09);
           s_gst.setText(gst.toString());
           c_gst.setText(gst.toString());
           Float total = deposite+(2*gst); 
           total_ammount.setText(total.toString());
       }
        else
        {
            total_ammount.setText("");
            s_gst.setText("");
            c_gst.setText("");
        }
    }//GEN-LAST:event_deposite_ammountKeyReleased

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
       
    }//GEN-LAST:event_jPanel5MouseClicked

    private void coursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursesActionPerformed
        course_name.setText(""+courses.getSelectedItem().toString().toUpperCase());
    }//GEN-LAST:event_coursesActionPerformed

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
       new Home().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jPanel8MouseClicked
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditReciept().setVisible(true);
            }
        });
    }
       private boolean getValidation()
    {
        System.out.println(deposite_ammount.getText());
        
        if(recieved_from.getText().trim().length()<=2)
        {
            JOptionPane.showMessageDialog(rootPane, "please enter valid Student name", "inavlid Student name", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else if(submition_date.getDate()==null)
        {
            JOptionPane.showMessageDialog(rootPane, "please choose date", "inavlid date", JOptionPane.ERROR_MESSAGE);
            return false;
        } 
        else if((payment_option.getSelectedIndex()==1)&& payment_id1.getText().trim().length()<=3)
        {
           JOptionPane.showMessageDialog(rootPane, "enter UPI id", "inavlid UPI ID", JOptionPane.ERROR_MESSAGE);
           return false;
        }
        else if(payment_option.getSelectedIndex()==2)
        {
            if(payment_id1.getText().trim().length()<=3)
            {
                JOptionPane.showMessageDialog(rootPane, "Enter Bank Name", "inavlid Bank Name", JOptionPane.ERROR_MESSAGE);
                return false;   
            }
            else if(payment_id2.getText().trim().length()<=3)
            {
                JOptionPane.showMessageDialog(rootPane, "Enter Net Banking Id","Invalid NetBanking Id", JOptionPane.ERROR_MESSAGE);
                return false;   
            }
        }
         else if((payment_option.getSelectedIndex()==3)||(payment_option.getSelectedIndex()==4))
        {
            if(payment_id1.getText().trim().length()<=3)
            {
                JOptionPane.showMessageDialog(rootPane, "Enter Bank Name", "inavlid Bank Name", JOptionPane.ERROR_MESSAGE);
                return false;   
            }
            else if(payment_id2.getText().trim().length()<=3)
            {
                JOptionPane.showMessageDialog(rootPane, "Enter valid card number","Invalid Card Number", JOptionPane.ERROR_MESSAGE);
                return false;   
            }
            else if(!(cv_number.getText().trim().length()==3))
            {
                JOptionPane.showMessageDialog(rootPane, "Cv number must contain 3 numbers ","Invalid Cv number", JOptionPane.ERROR_MESSAGE);
                return false;   
            }
        }
         else if(!deposite_ammount.getText().trim().matches("[^0][0-9]*[.][0-9]*")||deposite_ammount.getText().trim().equals(""))
         {
             JOptionPane.showMessageDialog(rootPane, "Please enter valid ammount","Invalid ammount", JOptionPane.ERROR_MESSAGE);
             return false;
         }  
         else if(!deposite_from.getText().trim().matches("[1-9][0-9]{3}"))
         {
             JOptionPane.showMessageDialog(rootPane, "Please enter starting date","Invalid date", JOptionPane.ERROR_MESSAGE);
             return false;
         }
         else if(roll_no.getText().trim().length()==0)
         {
            JOptionPane.showMessageDialog(rootPane, "Please enter valid roll number","Invalid roll number", JOptionPane.ERROR_MESSAGE);
            return false; 
         }
         else if(!deposite_to.getText().trim().matches("[1-9][0-9]{3}"))
         {
             JOptionPane.showMessageDialog(rootPane, "Please enter valid end date","Invalid end course date", JOptionPane.ERROR_MESSAGE);
             return false;
         }
        
        return true;
    }
    public  void getCoursesList()
    {
        try
        {
            Connection con = dbconnection.DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from courses");
            ResultSet rs = ps.executeQuery();
            System.out.println(con.getClass());
            while(rs.next())
            {
                courses.addItem(rs.getString(2));
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField c_gst;
    private javax.swing.JTextField course_name;
    private javax.swing.JComboBox<String> courses;
    public javax.swing.JLabel cv_label;
    private javax.swing.JTextField cv_number;
    private javax.swing.JTextField deposite_ammount;
    private javax.swing.JTextField deposite_from;
    private javax.swing.JTextField deposite_to;
    private com.toedter.calendar.JDateChooser jDateChooser2;
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
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel payment1;
    private javax.swing.JLabel payment2;
    private javax.swing.JTextField payment_id1;
    private javax.swing.JTextField payment_id2;
    private javax.swing.JComboBox<String> payment_option;
    private javax.swing.JButton print;
    private javax.swing.JTextField reciept_no;
    private javax.swing.JTextField recieved_from;
    private javax.swing.JTextArea remark;
    private javax.swing.JTextField roll_no;
    private javax.swing.JTextField s_gst;
    private com.toedter.calendar.JDateChooser submition_date;
    private javax.swing.JTextField total_ammount;
    // End of variables declaration//GEN-END:variables
  
}
