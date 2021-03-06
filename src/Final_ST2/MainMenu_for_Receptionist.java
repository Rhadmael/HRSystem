package Final_ST2;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Yaseer
 */
public class MainMenu_for_Receptionist extends javax.swing.JFrame {

    /**
     * Creates new form Main_Menu
     */
    public MainMenu_for_Receptionist() {
        initComponents();
        //setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Room_Reservation_Form = new javax.swing.JButton();
        CustomerRegistrationBtn = new javax.swing.JButton();
        welcome = new javax.swing.JLabel();
        CheckOut = new javax.swing.JButton();
        LogOut = new javax.swing.JLabel();
        Room_Type_List = new javax.swing.JButton();
        CheckIn1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        RecepHome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(778, 500));
        jPanel1.setLayout(null);

        Room_Reservation_Form.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Room_Reservation_Form.setText("Room Reservation ");
        Room_Reservation_Form.setPreferredSize(new java.awt.Dimension(250, 50));
        Room_Reservation_Form.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Room_Reservation_FormActionPerformed(evt);
            }
        });
        jPanel1.add(Room_Reservation_Form);
        Room_Reservation_Form.setBounds(260, 270, 280, 50);

        CustomerRegistrationBtn.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        CustomerRegistrationBtn.setText("New Customer Registration");
        CustomerRegistrationBtn.setPreferredSize(new java.awt.Dimension(250, 50));
        CustomerRegistrationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerRegistrationBtnActionPerformed(evt);
            }
        });
        jPanel1.add(CustomerRegistrationBtn);
        CustomerRegistrationBtn.setBounds(450, 120, 280, 50);

        welcome.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        welcome.setForeground(new java.awt.Color(0, 0, 102));
        welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Final_ST2/images/welcomeNote.png"))); // NOI18N
        jPanel1.add(welcome);
        welcome.setBounds(170, 0, 440, 30);

        CheckOut.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        CheckOut.setText("Check Out");
        CheckOut.setPreferredSize(new java.awt.Dimension(250, 50));
        CheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckOutActionPerformed(evt);
            }
        });
        jPanel1.add(CheckOut);
        CheckOut.setBounds(450, 400, 280, 50);

        LogOut.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LogOut.setForeground(new java.awt.Color(0, 255, 255));
        LogOut.setText("Log Out");
        LogOut.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), java.awt.Color.gray, null, java.awt.Color.white));
        LogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutMouseClicked(evt);
            }
        });
        jPanel1.add(LogOut);
        LogOut.setBounds(720, 0, 60, 20);

        Room_Type_List.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Room_Type_List.setText("List of Room Types");
        Room_Type_List.setPreferredSize(new java.awt.Dimension(250, 50));
        Room_Type_List.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Room_Type_ListActionPerformed(evt);
            }
        });
        jPanel1.add(Room_Type_List);
        Room_Type_List.setBounds(60, 120, 280, 50);

        CheckIn1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        CheckIn1.setText("Check In");
        CheckIn1.setPreferredSize(new java.awt.Dimension(250, 50));
        CheckIn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckIn1ActionPerformed(evt);
            }
        });
        jPanel1.add(CheckIn1);
        CheckIn1.setBounds(60, 400, 280, 50);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Login AS Receptionist");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(650, 20, 120, 14);

        RecepHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Final_ST2/images/ReceptionHome.png"))); // NOI18N
        RecepHome.setPreferredSize(new java.awt.Dimension(778, 500));
        jPanel1.add(RecepHome);
        RecepHome.setBounds(0, 0, 778, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Room_Reservation_FormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Room_Reservation_FormActionPerformed
        Add_reservation Reserve= new Add_reservation();
        Reserve.setVisible(true);
      
        
    }//GEN-LAST:event_Room_Reservation_FormActionPerformed

    private void CustomerRegistrationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerRegistrationBtnActionPerformed
        
        RegCustomerView CustomerRegister = new RegCustomerView();
        CustomerRegister.setVisible(true);
        
    }//GEN-LAST:event_CustomerRegistrationBtnActionPerformed

    private void Room_Type_ListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Room_Type_ListActionPerformed
        ListRoomType roomType = new ListRoomType();
        roomType.setVisible(true);
    }//GEN-LAST:event_Room_Type_ListActionPerformed

    private void LogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutMouseClicked
       Login login = new Login();
       login.setVisible(true);
       dispose();
    }//GEN-LAST:event_LogOutMouseClicked

    private void CheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckOutActionPerformed
        CheckOut out  = new CheckOut();
       out.setVisible(true);
    }//GEN-LAST:event_CheckOutActionPerformed

    private void CheckIn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckIn1ActionPerformed
       CheckIn in  = new CheckIn();
       in.setVisible(true);
    }//GEN-LAST:event_CheckIn1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu_for_Receptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu_for_Receptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu_for_Receptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu_for_Receptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu_for_Receptionist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CheckIn1;
    private javax.swing.JButton CheckOut;
    private javax.swing.JButton CustomerRegistrationBtn;
    private javax.swing.JLabel LogOut;
    private javax.swing.JLabel RecepHome;
    private javax.swing.JButton Room_Reservation_Form;
    private javax.swing.JButton Room_Type_List;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
