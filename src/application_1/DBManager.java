/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author rubir
 */
public class DBManager {
     /**
     * Attributes
     */
    private Connection connection;
    private Statement statement;
    
     private void openConnection() throws Exception {
	System.out.println("abro");
        String path = "jdbc:mysql://localhost:3306/greetings";
	connection = DriverManager.getConnection(path, "root", "abcd*1234");
        System.out.println("abro 2");
      
    }
   
   private void closeConnection() throws SQLException {
	statement.close();
	connection.close();
        
        System.out.println("Connection has been closed");
    }  
   
   public String getGreetingDB(){
       String greeting = null;
       try{
            this.openConnection();
            
            statement = connection.createStatement();
            
            String select = "select * from greeting";
           try (ResultSet resultSet = statement.executeQuery(select)) {
               while(resultSet.next()) {
                   greeting=resultSet.getString("greeting");
               }
           }
            
            this.closeConnection();   
       }
       catch(SQLException sqlE){
            System.out.println("Not found or doesn't exist");
       }
       catch(Exception e){
            System.out.println("No se ha podido establecer conexión con la base de datos");
       }
       return greeting;
   }
}
