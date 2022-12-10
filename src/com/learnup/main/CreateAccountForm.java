package com.learnup.main;

public class CreateAccountForm extends javax.swing.JFrame {

    public CreateAccountForm() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CreateAccountPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        emailLabel = new javax.swing.JLabel();
        email_field = new javax.swing.JTextField();
        passLabel = new javax.swing.JLabel();
        password_field = new javax.swing.JPasswordField();
        emailLabel1 = new javax.swing.JLabel();
        email_field1 = new javax.swing.JTextField();
        email_field2 = new javax.swing.JTextField();
        emailLabel2 = new javax.swing.JLabel();
        password_field1 = new javax.swing.JPasswordField();
        passLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        createAcount_btn = new com.learnup.utils.Button();
        login_btn = new com.learnup.utils.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Create Account");
        setName("CreateAccountFrame"); // NOI18N
        setSize(new java.awt.Dimension(986, 753));

        CreateAccountPanel.setBackground(new java.awt.Color(40, 49, 59));
        CreateAccountPanel.setMaximumSize(new java.awt.Dimension(150, 150));
        CreateAccountPanel.setPreferredSize(new java.awt.Dimension(986, 750));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("LearnUp");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Level up your knowledge");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("<html>\nLearn like never before with our best teachers\n<br>\nDevelop Your skill and unlock a new appoturnties\n</html>");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/learnup/images/CreateAccountImage.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(64, 76, 89));
        jPanel2.setFocusable(false);

        jPanel3.setBackground(new java.awt.Color(64, 76, 89));

        emailLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel.setText("First Name");

        email_field.setBackground(new java.awt.Color(64, 76, 89));
        email_field.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        email_field.setForeground(new java.awt.Color(255, 255, 255));
        email_field.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(56, 211, 159)));
        email_field.setCaretColor(new java.awt.Color(56, 211, 159));
        email_field.setName("Email"); // NOI18N

        passLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        passLabel.setForeground(new java.awt.Color(255, 255, 255));
        passLabel.setText("Password");

        password_field.setBackground(new java.awt.Color(64, 76, 89));
        password_field.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        password_field.setForeground(new java.awt.Color(255, 255, 255));
        password_field.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(56, 211, 159)));
        password_field.setCaretColor(new java.awt.Color(56, 211, 159));
        password_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_fieldActionPerformed(evt);
            }
        });

        emailLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        emailLabel1.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel1.setText("Last Name");

        email_field1.setBackground(new java.awt.Color(64, 76, 89));
        email_field1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        email_field1.setForeground(new java.awt.Color(255, 255, 255));
        email_field1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(56, 211, 159)));
        email_field1.setCaretColor(new java.awt.Color(56, 211, 159));
        email_field1.setName("Email"); // NOI18N

        email_field2.setBackground(new java.awt.Color(64, 76, 89));
        email_field2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        email_field2.setForeground(new java.awt.Color(255, 255, 255));
        email_field2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(56, 211, 159)));
        email_field2.setCaretColor(new java.awt.Color(56, 211, 159));
        email_field2.setName("Email"); // NOI18N

        emailLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        emailLabel2.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel2.setText("Email");

        password_field1.setBackground(new java.awt.Color(64, 76, 89));
        password_field1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        password_field1.setForeground(new java.awt.Color(255, 255, 255));
        password_field1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(56, 211, 159)));
        password_field1.setCaretColor(new java.awt.Color(56, 211, 159));
        password_field1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_field1ActionPerformed(evt);
            }
        });

        passLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        passLabel1.setForeground(new java.awt.Color(255, 255, 255));
        passLabel1.setText("Confirm Password");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailLabel)
                            .addComponent(passLabel)
                            .addComponent(email_field, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailLabel1)
                            .addComponent(email_field1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email_field2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailLabel2)
                            .addComponent(passLabel1)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(password_field, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password_field1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(emailLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(email_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(emailLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(email_field1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(emailLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(email_field2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(passLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(password_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(passLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(password_field1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Create Account");

        createAcount_btn.setBackground(new java.awt.Color(56, 211, 159));
        createAcount_btn.setForeground(new java.awt.Color(255, 255, 255));
        createAcount_btn.setText("Create Account");
        createAcount_btn.setActionCommand("login_btn");
        createAcount_btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        createAcount_btn.setRadius(8);
        createAcount_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAcount_btnActionPerformed(evt);
            }
        });

        login_btn.setBackground(new java.awt.Color(233, 30, 99));
        login_btn.setForeground(new java.awt.Color(255, 255, 255));
        login_btn.setText("Login");
        login_btn.setActionCommand("login_btn");
        login_btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        login_btn.setRadius(8);
        login_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(createAcount_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(login_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(createAcount_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(login_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout CreateAccountPanelLayout = new javax.swing.GroupLayout(CreateAccountPanel);
        CreateAccountPanel.setLayout(CreateAccountPanelLayout);
        CreateAccountPanelLayout.setHorizontalGroup(
            CreateAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateAccountPanelLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(CreateAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        CreateAccountPanelLayout.setVerticalGroup(
            CreateAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateAccountPanelLayout.createSequentialGroup()
                .addGroup(CreateAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CreateAccountPanelLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CreateAccountPanelLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 986, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(CreateAccountPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 753, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(CreateAccountPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 753, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void password_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_fieldActionPerformed
        login_btnActionPerformed(evt);
    }//GEN-LAST:event_password_fieldActionPerformed

    private void password_field1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_field1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_field1ActionPerformed

    private void createAcount_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAcount_btnActionPerformed

    }//GEN-LAST:event_createAcount_btnActionPerformed

    private void login_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_btnActionPerformed
        this.setVisible(false);
        new LoginUpForm().setVisible(true);
    }//GEN-LAST:event_login_btnActionPerformed


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
            java.util.logging.Logger.getLogger(CreateAccountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAccountForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CreateAccountPanel;
    private com.learnup.utils.Button createAcount_btn;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel emailLabel1;
    private javax.swing.JLabel emailLabel2;
    private javax.swing.JTextField email_field;
    private javax.swing.JTextField email_field1;
    private javax.swing.JTextField email_field2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private com.learnup.utils.Button login_btn;
    private javax.swing.JLabel passLabel;
    private javax.swing.JLabel passLabel1;
    private javax.swing.JPasswordField password_field;
    private javax.swing.JPasswordField password_field1;
    // End of variables declaration//GEN-END:variables
}
