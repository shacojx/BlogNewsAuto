/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.XuLy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Administrator
 */
public class CheckPass {

    public boolean check(String pass) {
        boolean check_len = false;
        boolean check_int = false;
        boolean check_low = false;
        boolean check_up = false;
        boolean check_dacbiet = false;

        char[] s = pass.toCharArray();

        if (s.length >= 8) {
            check_len = true;
        }
        for (char x : s) {
            if (Character.isDigit(x)) {
                check_int = true;
                break;
            }
        }
        for (char x : s) {
            if (Character.isLowerCase(x)) {
                check_low = true;
                break;
            }
        }
        for (char x : s) {
            if (Character.isUpperCase(x)) {
                check_up = true;
                break;
            }
        }

        Pattern p = Pattern.compile("[^A-Za-z0-9]");
        Matcher m = p.matcher(pass);
        check_dacbiet = m.find();

        if (check_dacbiet == true && check_int == true && check_low == true
                && check_up == true && check_len == true) {
            return true;
        } else {
            return false;
        }

    }

}
