/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ResourceBundle;
/**
 * Model implementation where return the greeting.
 * @author Ruben Rabadan Hierro
 */
public class ModelImplementation implements Model{
/**
 * Return the greeting
 * @return a String that contains the greeting.
     * @throws java.io.FileNotFoundException
 */
    //It take the greeting from the properties file
    @Override
    public String getGreeting() throws FileNotFoundException, IOException {
        return ResourceBundle.getBundle("model.greetingFile").getString("greeting");
    }
    //It will take the greetin from a database
    /* public String getGreeting()throws FileNotFoundException, IOException {        
        DBManager db = new DBManager();
         String greeting;
        greeting = db.getGreetingDB();
        return greeting;
    }*/
            
}
