/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.XuLy;

/**
 *
 * @author ShacoJX
 */
public class GenID {
     // function to generate a random string of length n
    public String genStr(int n) {

        // chose a Character random from this String
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";

        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                    = (int) (AlphaNumericString.length()
                    * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }
    
//    public static void main(String[] args) {
//        // TODO code application logic here
//
//        // Get the size n
//        int n = 6;
//
//        // Get and display the alphanumeric string
//        System.out.println(JavaApplication8
//                .getAlphaNumericString(n));
//
//    }
    
}
