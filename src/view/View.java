/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 * Contain view methods for being used by a controller
 * @author Ruben Rabadan Hierro
 */
public interface View {
    /**
     * Shows a greeting in UI.
     * @param greeting The String that contain the greeting 
     */ 
    public void showGreeting(String greeting);
    
}
