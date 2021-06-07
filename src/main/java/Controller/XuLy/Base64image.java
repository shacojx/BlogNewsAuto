/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.XuLy;

import java.io.File;
import java.io.FileInputStream;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author ShacoJX
 */
public class Base64image {
    private static String encodeFileToBase64Binary(File file) throws Exception{
            FileInputStream fileInputStreamReader = new FileInputStream(file);
            byte[] bytes = new byte[(int)file.length()];
            fileInputStreamReader.read(bytes);
            return new String(Base64.encodeBase64(bytes), "UTF-8");
        }
}
