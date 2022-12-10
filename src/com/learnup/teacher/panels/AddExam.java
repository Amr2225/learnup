package com.learnup.teacher.panels;

import java.awt.Color;
import java.awt.Font;
import java.util.Arrays;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import net.miginfocom.swing.MigLayout;

public class AddExam extends javax.swing.JPanel {
    private static String[] questions = new String[5];
    private static int count = 0;
    public AddExam() {
        initComponents();
        questionPanel.setLayout(new MigLayout("wrap, fillx, inset 10", "[fill]", "[]2[]"));
    }
    
    private static void set_qeustion(String question){
        try{
            questions[count++] = question;
        }catch(IndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "Cannot add more than 5 questions");
        }
    }
    
    private void add_quesitons(String question){
        if(count>5){
            return;
        }
        JLabel questions = new JLabel("Questions "+count+": "+question);
        questions.setForeground(Color.WHITE);
        questions.setFont(new Font("Segoe UI", 1, 15));
        questionPanel.add(questions);
        questionPanel.revalidate();
        questionPanel.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        questionField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        answerField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        answerField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        answerField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        answerField4 = new javax.swing.JTextField();
        resetQuestionBtn = new com.learnup.utils.Button();
        r1 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        r2 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        submit = new com.learnup.utils.Button();
        nextQuestionBtn1 = new com.learnup.utils.Button();
        questionPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(64, 76, 89));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Question");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Answer 1");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Answer 2");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Answer 3");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Answer 4");

        resetQuestionBtn.setBackground(new java.awt.Color(233, 30, 99));
        resetQuestionBtn.setForeground(new java.awt.Color(255, 255, 255));
        resetQuestionBtn.setText("Reset Questions");
        resetQuestionBtn.setRadius(8);
        resetQuestionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetQuestionBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(r1);
        r1.setForeground(new java.awt.Color(255, 255, 255));
        r1.setText("All");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Assign to all student");

        buttonGroup1.add(r2);
        r2.setForeground(new java.awt.Color(255, 255, 255));
        r2.setText("Specifiic");
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Exam Name");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Date");

        jDateChooser1.setDateFormatString("dd-MM-yyy\n");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Add Exmas");

        submit.setBackground(new java.awt.Color(56, 211, 159));
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("Add Exam");
        submit.setRadius(8);
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        nextQuestionBtn1.setBackground(new java.awt.Color(233, 30, 99));
        nextQuestionBtn1.setForeground(new java.awt.Color(255, 255, 255));
        nextQuestionBtn1.setText("Next Quesiton");
        nextQuestionBtn1.setRadius(8);
        nextQuestionBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextQuestionBtn1ActionPerformed(evt);
            }
        });

        questionPanel.setOpaque(false);

        javax.swing.GroupLayout questionPanelLayout = new javax.swing.GroupLayout(questionPanel);
        questionPanel.setLayout(questionPanelLayout);
        questionPanelLayout.setHorizontalGroup(
            questionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 222, Short.MAX_VALUE)
        );
        questionPanelLayout.setVerticalGroup(
            questionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(questionField, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(answerField4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(answerField3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(answerField2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(answerField1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(submit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                .addComponent(nextQuestionBtn1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)))
                        .addGap(158, 158, 158)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(26, 26, 26))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(r1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(24, 24, 24)
                                    .addComponent(r2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel7)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                            .addComponent(resetQuestionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(questionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(questionField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(answerField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel3))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(answerField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel4)
                        .addGap(10, 10, 10)
                        .addComponent(answerField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel5)
                        .addGap(10, 10, 10)
                        .addComponent(answerField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(nextQuestionBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(r1)
                            .addComponent(r2))
                        .addGap(18, 18, 18)
                        .addComponent(resetQuestionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(questionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r2ActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submitActionPerformed

    private void resetQuestionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetQuestionBtnActionPerformed
        questions = new String[5];
        count = 0;
        questionPanel.removeAll();
        questionPanel.revalidate();
        questionPanel.repaint();
    }//GEN-LAST:event_resetQuestionBtnActionPerformed

    private void nextQuestionBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextQuestionBtn1ActionPerformed
        String question = questionField.getText();
        if(question.equals("")){
         JOptionPane.showInternalMessageDialog(null, "Questions cannot be empty");
         return;
        }
        set_qeustion(question);
        add_quesitons(question);
        questionField.setText("");
        answerField1.setText("");
        answerField2.setText("");
        answerField3.setText("");
        answerField4.setText("");
        System.out.println(Arrays.toString(questions));
    }//GEN-LAST:event_nextQuestionBtn1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answerField1;
    private javax.swing.JTextField answerField2;
    private javax.swing.JTextField answerField3;
    private javax.swing.JTextField answerField4;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField6;
    private com.learnup.utils.Button nextQuestionBtn1;
    private javax.swing.JTextField questionField;
    private javax.swing.JPanel questionPanel;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private com.learnup.utils.Button resetQuestionBtn;
    private com.learnup.utils.Button submit;
    // End of variables declaration//GEN-END:variables
}
