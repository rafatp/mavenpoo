/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenmongoconnection;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author rafaelpereira
 */
public class main extends ConnectionMySQL{
    public static void main (String[] args) throws SQLException
    {
        ConnectionMySQL mysql = new ConnectionMySQL();
        
   
        if(mysql.getConnection())
        {
            System.out.println("Conectou ao banco");
        } else {
            System.out.println("Erro");
        }
    }
    
}
