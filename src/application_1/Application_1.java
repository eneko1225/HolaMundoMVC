/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application_1;

import java.io.FileNotFoundException;
import java.io.IOException;
import model.ModelImplementation;
import view.ViewImplementation;

/**
 *
 * @author eneko
 */
public class Application_1 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Controller control = new Controller();
        ModelImplementation mo;
        mo = new ModelImplementation();
        ViewImplementation vi = new ViewImplementation();
        
        control.run(vi, mo);
            
        
    }
    
}
