/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.XuLy;

import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author Admin
 */
public class MD5Encryt {

    public String md5(String passwd) {
        String md5HexPass = DigestUtils
                .md5Hex(passwd);
        return md5HexPass;
    }
    
}
