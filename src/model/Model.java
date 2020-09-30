/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *  Contains model methods for being used by a controller.
 * @author Ruben Rabadan Hierro
 */
public interface Model {
    /**
     * Get the greeting
     * @return Return a String that is the greeting
     * @throws java.io.FileNotFoundException
     */
    public String getGreeting()throws FileNotFoundException, IOException;
}
