/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application_1;

import java.io.IOException;
import static java.lang.System.exit;
import java.util.ResourceBundle;
import javax.rmi.CORBA.Util;
import model.Model;
import view.View;

/**
 *
 * @author Eneko Medel
 */
public class Controller {
            //Initialize the controller
            public static void run(View vi, Model mo) throws IOException{
            String propertie=ResourceBundle.getBundle("model.greetingFile").getString("parameter");
            //Check if the user want a text or a window view
                System.out.println("Introduce la opcion: 1 para texto y 2 para ventana");
                int opc=utilities.Util.leerInt(1, 2);
                
            boolean textView=false;
            //If '1' is written it will show a text view in the viewImplementation
            if(opc==1)
                textView=true;
            //If '2' is written it will show a window view in the viewImplementatin
            else if(opc==2)
                textView=false;
            else{
                System.out.println("Saliendo");
                exit(0);
            }
            //Shows the greeting in the choosen view
            vi.showGreeting(mo.getGreeting(), textView);
        }
}
