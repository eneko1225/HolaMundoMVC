/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Eneko Medel
 */
public class ViewFactory {
    
    public View getview(){
        return new ViewImplementation();
    }

}
