package com.learnup.utils;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class db {
    private static Connection c;
    public db() throws SQLException{
        String connectionString = "jdbc:sqlserver://AMR;databaseName=school;encrypt=true;integratedSecurity=true;trustServerCertificate=true";
        c = DriverManager.getConnection(connectionString);
    }
    
    public int insert( String first_name, String last_name) throws SQLException{
        int x = getId();
        String sql = "insert into student(id, first_name, last_name, age, grade, clase_id) values(?, ?,?, 30, 89, 2)";
        PreparedStatement stat =  c.prepareStatement(sql);
        stat.setInt(1, x+1);
        stat.setString(2, first_name);
        stat.setString(3, last_name);
       
        int row = stat.executeUpdate();
        return row;
        
    }
    
    public static int getId() throws SQLException{
        List<Integer> arr = new ArrayList<>();
        
        
        String query = "Select * from student";
        Statement stat = c.createStatement();
        ResultSet ids =  stat.executeQuery(query);
        while(ids.next()){
            arr.add(ids.getInt("id"));
        }
        System.out.println(Collections.max(arr));
        return Collections.max(arr);
    }
    //private static getmax(){
        
    //}
}
