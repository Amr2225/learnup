package com.learnup.teacher.panels;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

public class AssginExam extends javax.swing.JPanel {
    public AssginExam() throws SQLException {
        initComponents();
        
        DefaultTableModel table = (DefaultTableModel) tableDark1.getModel();
        String connectionString = "jdbc:sqlserver://AMR;databaseName=school;encrypt=true;integratedSecurity=true;trustServerCertificate=true";
        Connection c =  DriverManager.getConnection(connectionString);
        String sql = "select id, first_name, grade from student";
        Statement stat = c.createStatement();
        ResultSet result = stat.executeQuery(sql);
        
        String sql1 = "update student set grade = ? where id = ?";
        PreparedStatement pstat = c.prepareStatement(sql);
       
        while(result.next()){
            table.addRow(new Object[]{result.getInt("id"), result.getString("first_name"), result.getString("grade"), 0});
        }
        tableDark1.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
            }
            @Override
            public void mousePressed(MouseEvent e) {
         
                field1.setText(tableDark1.getValueAt(tableDark1.getSelectedRow(), 0).toString());
                field2.setText(tableDark1.getValueAt(tableDark1.getSelectedRow(), 1).toString());
            }
            @Override
            public void mouseReleased(MouseEvent e) {
            }
            @Override
            public void mouseEntered(MouseEvent e) {
            }
            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
        
        table.addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                if(tableDark1.isEditing()){
                    Object value = tableDark1.getValueAt(tableDark1.getSelectedRow(), tableDark1.getSelectedColumn());
                    Object id = tableDark1.getValueAt(tableDark1.getSelectedRow(), 0);
                    System.out.println(tableDark1.getValueAt(tableDark1.getSelectedRow(), 1)+" "+value.toString());
                    try {
                        String sql2 = "update student set grade = "+value+" where id = "+id;
//                        PreparedStatement pState = c.prepareStatement(sql2);
//                        pState.executeUpdate();
                          Statement s = c.createStatement();
                          s.executeUpdate(sql2);
//                        pstat.setObject(2, value);
//                        pstat.setObject(3, id);
//                        pstat.executeUpdate();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tableDark1 = new com.learnup.utils.TableDark();
        field1 = new javax.swing.JTextField();
        field2 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(64, 76, 89));

        tableDark1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableDark1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tableDark1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(field1, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(field2))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(field1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(field2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField field1;
    private javax.swing.JTextField field2;
    private javax.swing.JScrollPane jScrollPane2;
    private com.learnup.utils.TableDark tableDark1;
    // End of variables declaration//GEN-END:variables
}
