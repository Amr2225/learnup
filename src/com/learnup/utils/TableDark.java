package com.learnup.utils;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
public class TableDark extends JTable{
     public TableDark(){
         getTableHeader().setDefaultRenderer(new TableDarkHeader());
         getTableHeader().setPreferredSize(new Dimension(0, 35));
         setDefaultRenderer(Object.class, new TableDarkCell());
         setRowHeight(30);
     } 
     
     private class TableDarkHeader extends DefaultTableCellRenderer{

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component comp =  super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            comp.setBackground(new Color(30, 30, 30));
            comp.setForeground(Color.white);
            comp.setFont(comp.getFont().deriveFont(Font.BOLD, 12));
            
            return comp;
        }
     }
     private class TableDarkCell extends DefaultTableCellRenderer{

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component comp =  super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
            if(isCellSelected(row, column)){
                if(row%2==0){
                    comp.setBackground(new Color(33, 103, 153));
                }else{
                    comp.setBackground(new Color(29, 86, 127));
                }
            }else{
                if(row%2==0){
                    comp.setBackground(new Color(50, 50, 50));
                }else{
                    comp.setBackground(new Color(30, 30, 30));
                }
            }
            //setBorder(new EmptyBorder(0, 5,0,5));
            comp.setForeground(Color.WHITE);
            return comp;        
        }
         
     }
}
