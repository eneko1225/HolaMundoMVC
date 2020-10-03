/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application_1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ResourceBundle;
import model.Model;
import view.View;

/**
 *
 * @author eneko
 */
public class Controller {
       // public String getGreeting() throws FileNotFoundException, IOException{
        /*File fich = new File("fich.obj");
        FileInputStream fis =  new FileInputStream(fich);
        ObjectInputStream ois = new ObjectInputStream(fis);
        ois.
        
        
        return "y";*/
        
        
        public static void run(View vi, Model mo) throws IOException{
            String propertie=ResourceBundle.getBundle("model.greetingFile").getString("parameter");
            boolean textView=false;
            if("text".equalsIgnoreCase(propertie))
                textView=true;
            else if("window".equalsIgnoreCase(propertie))
                textView=false;
            else{
                System.out.println("No has introducido una opcion valida, cambia el archivo de propiedades, recuerda que tienes que elegir entre 'texto' y 'ventana'");
                System.exit(0);
            }
            
            vi.showGreeting(mo.getGreeting(), textView);
        }
}
