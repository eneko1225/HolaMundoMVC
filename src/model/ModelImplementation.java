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
    @Override
    public String getGreeting() throws FileNotFoundException, IOException {
        //configOutput = new FileOutputStream("data/config.properties");
        
        /*
        Properties greetingFile = new Properties();
        InputStream configInput = null;
        
        configInput = new FileInputStream("greetingFile");
        greetingFile.load(configInput);
        */
        
        //greetingFile.load(in);
        /*
        //String cadena;
        //String archivo = greetingFile.getProperty("greeting");
        FileReader f = new FileReader(greetingFile.getProperty("greeting"));
        BufferedReader b = new BufferedReader(f);
        cadena = b.readLine();
        b.close();
        return cadena;*/
        //return greetingFile.getProperty("greeting");
        return ResourceBundle.getBundle("model.greetingFile").getString("greeting");
    }
    /* public String getGreeting()throws FileNotFoundException, IOException {        
        DBManager db = new DBManager();
         String greeting;
        greeting = db.getGreetingDB();
        return greeting;
    }*/
            
}
