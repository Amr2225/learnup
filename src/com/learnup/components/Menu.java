package com.learnup.components;

import com.learnup.utils.Button;
import java.awt.Color;
import java.awt.Component;
import com.learnup.event.EventPanel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import net.miginfocom.swing.MigLayout;

public class Menu extends javax.swing.JPanel {
    private EventPanel event;

    public Menu() {
        initComponents();
        setOpaque(false);
        Menu.setLayout(new MigLayout("wrap, fillx, inset 10", "[fill]", "[]2[]")); // making the layout
    }
    
    // adding all the button menus to the menu
    public void initMenu(EventPanel event){
        this.event = event;
        addMenu("Dashboard", "\\com\\learnup\\images\\1.png",0);
        addMenu("Courses", "\\com\\learnup\\images\\2.png",1);
        addMenu("Exams", "\\com\\learnup\\images\\3.png",2);
        addMenu("Report", "\\com\\learnup\\images\\4.png",3);
        addMenu("Students", "\\com\\learnup\\images\\5.png",4);
    }
    
    private void addMenu(String name, String iconPath,  int index){
        Button btn = new Button();
        // get relative path to the icon
        String basePath = new File("").getAbsolutePath().concat("\\src");
        ImageIcon icon  = new ImageIcon(basePath.concat(iconPath));
        // making the button component
        btn.setBackground(new Color(64,76,89));
        btn.setForeground(new Color(255, 255, 255));
        btn.setFont(new Font("Segoe UI", 1, 15));
        btn.setIcon(icon);
        btn.setText(" "+name);
        btn.setRadius(8);
        btn.setHorizontalAlignment(SwingConstants.LEFT);      
        //Adding the btn to the menu
        Menu.add(btn);
        //Listening to clicks
        btn.addActionListener((ActionEvent e) -> { 
            event.selected(index); // to get the index of the selected therefore changing the panel accordingly
            setSelected(btn); // to change the color of the selected button
        });
    }
    // Sets the clicked on button to selected to make it darker
    private void setSelected(Button btn){
        for (Component comp: Menu.getComponents()){ // loops over every component in menu and setting all of the to not selected
            if (comp instanceof Button b){
                b.setSelected(false);
            }
        }
        btn.setSelected(true); // makes the clicked on button selected
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel4 = new com.learnup.utils.RoundPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CourseName = new javax.swing.JLabel();
        Menu = new com.learnup.utils.RoundPanel();

        setBackground(new java.awt.Color(40, 49, 59));

        roundPanel4.setBackground(new java.awt.Color(64, 76, 89));
        roundPanel4.setRadius(20);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("dr.Mohamed Adel");

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Teacher");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Course:");

        CourseName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CourseName.setForeground(new java.awt.Color(255, 255, 255));
        CourseName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CourseName.setText("IS");

        javax.swing.GroupLayout roundPanel4Layout = new javax.swing.GroupLayout(roundPanel4);
        roundPanel4.setLayout(roundPanel4Layout);
        roundPanel4Layout.setHorizontalGroup(
            roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(CourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        roundPanel4Layout.setVerticalGroup(
            roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CourseName))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        Menu.setBackground(new java.awt.Color(64, 76, 89));
        Menu.setRadius(20);

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 237, Short.MAX_VALUE)
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 468, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(roundPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CourseName;
    private com.learnup.utils.RoundPanel Menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private com.learnup.utils.RoundPanel roundPanel4;
    // End of variables declaration//GEN-END:variables
}
