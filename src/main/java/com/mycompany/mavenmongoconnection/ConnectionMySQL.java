/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenmongoconnection;

/**
 *
 * @author rafaelpereira
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class ConnectionMySQL {

	Connection connection = null;
        private static final String URL = "jdbc:mysql://localhost/Vendas?useSSL=false";
        private static final String USER = "root";
        private static final String PASS = "rs038351";

        public boolean getConnection(){
            
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			if(connection == null){
				connection = DriverManager.getConnection(URL,USER,PASS);
                                return true;
                        }

		} catch (ClassNotFoundException e) {
                        
			e.printStackTrace();
                        return false;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
                        return false;
			
		}
	return true;
	}
	
	
	
	public void closeConnection(){
		try {
		      if (connection != null) {
		    	  connection.close();
		      }
		    } catch (Exception e) { 
		    	//do nothing
		    }
	}

}

