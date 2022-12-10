package com.learnup.components;

public class Header extends javax.swing.JPanel {
    public Header() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button2 = new com.learnup.utils.Button();
        button3 = new com.learnup.utils.Button();

        setBackground(new java.awt.Color(64, 76, 89));

        button2.setBackground(new java.awt.Color(0, 0, 0));
        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/learnup/images/noti.png"))); // NOI18N
        button2.setText(" Notification");
        button2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        button2.setRadius(8);
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button3.setBackground(new java.awt.Color(0, 0, 0));
        button3.setForeground(new java.awt.Color(255, 255, 255));
        button3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/learnup/images/message.png"))); // NOI18N
        button3.setText(" Messages");
        button3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        button3.setRadius(8);
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(337, Short.MAX_VALUE)
                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.learnup.utils.Button button2;
    private com.learnup.utils.Button button3;
    // End of variables declaration//GEN-END:variables
}
