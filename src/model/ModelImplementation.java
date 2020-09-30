/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import application_1.Controller;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import application_1.DBManager;
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
    @Override
    public String getGreeting() throws FileNotFoundException, IOException {
        String cadena;
        String archivo = "C:\\Users\\rubir\\Desktop\\HOLA.txt";
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        cadena = b.readLine();
        b.close();
        return cadena;
    }
    /* public String getGreeting()throws FileNotFoundException, IOException {        
        DBManager db = new DBManager();
         String greeting;
        greeting = db.getGreetingDB();
        return greeting;
    }*/
            
}
