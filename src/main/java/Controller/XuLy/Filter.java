/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.XuLy;

/**
 *
 * @author Admin
 */
public class Filter {


    public boolean checkLFI(String param) {
        boolean check = false;
        
        if(param.contains("..") || param.contains("../")){
            check = true;
        }

        return check;
    }
    
    

}
