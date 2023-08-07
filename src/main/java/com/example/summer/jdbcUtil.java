package com.example.summer;

import java.sql.Connection;
import java.sql.DriverManager;

public class jdbcUtil {
    public static Connection getConnection(){
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://database-1.c4v7vclns4wo.us-east-2.rds.amazonaws.com:3306/2023_summer","admin","kjh7382!");
        }catch(Exception e){
            System.out.println(e);
        }
        return con;
    }


    public static void main(String ars[]) {
        Connection conn = getConnection();
        if(conn != null)
            System.out.println("DB 연결됨!");
        else
            System.out.println("DB 연결중 오류 !");
    }
}