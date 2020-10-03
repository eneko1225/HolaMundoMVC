/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JFrame;
import java.util.ResourceBundle;

/**
 * View implementation where show the greeting in text type UI.
 * @author Ruben Rabadan Hierro
 */
public class ViewImplementation implements View{
    /**
     * Shows the param greeting in text type UI.
     * @param greeting 
     * @param parameter 
     */
    @Override
    public void showGreeting(String greeting, boolean parameter) {
        
        if(parameter)
            System.out.println(greeting);
        else {
            UI ui;
            ui = new UI(greeting);
            ui.setVisible(true);
        }
    }
}
