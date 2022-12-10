package com.learnup.teacher.panels;

public class Form extends javax.swing.JPanel {
    public Form(int index) {
        initComponents();
        setOpaque(false);
        label.setText("Form"+index);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label = new javax.swing.JLabel();

        label.setBackground(new java.awt.Color(204, 204, 204));
        label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label.setForeground(new java.awt.Color(153, 153, 153));
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setText("Form");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel label;
    // End of variables declaration//GEN-END:variables
}
