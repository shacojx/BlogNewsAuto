/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Servlet.Pro;

import Controller.XuLy.AES;
import Controller.XuLy.CheckPass;
import Controller.XuLy.Filter;
import Controller.XuLy.MD5Encryt;
import Entity.Account;
import Model.AccDAO;
import Model.LoginDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
public class ChangPassWord extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            Filter fil = new Filter();
            String oldpass = request.getParameter("oldpass");
            String newpass = request.getParameter("newpass");
            String renewpass = request.getParameter("renewpass");
            
                MD5Encryt md5 = new MD5Encryt();
                String passwd = md5.md5(newpass);
                //=========================
                Cookie[] listCookie = request.getCookies();
                String user = "";
                String pass = "";
                for (Cookie o : listCookie) {
                    if (o.getName().equals("mu")) {
                        user = o.getValue();
                    }
                    if (o.getName().equals("sa")) {
                        pass = o.getValue();
                    }
                }
                //========================
                AES aes = new AES();
                String pass_end = aes.decrypt(pass);
                AccDAO ad = new AccDAO();
                CheckPass cp = new CheckPass();
                boolean check_len_pass = true;
                if (cp.check(newpass) == true) {
                    check_len_pass = true;
                } else {
                    check_len_pass = false;
                }

                if (newpass.equals(renewpass) && check_len_pass == true && pass_end.equals(md5.md5(oldpass)) ) {
                    Account a = new Account(aes.decrypt(user), passwd);
                    ad.Update(a);
                    request.setAttribute("mess", "<p style=\"color: #3ac33ad1;\">Thay Đổi Mật Khẩu Thành Công</p>");
                    request.getRequestDispatcher("/FRS/Profile/ChangePass.jsp").forward(request, response);
                } else {
                    request.setAttribute("mess", "<p style=\"color: red;\">Thay Đổi Mật Khẩu Thất Bại</p>");
                    request.getRequestDispatcher("/FRS/Profile/ChangePass.jsp").forward(request, response);
                }
            

        } catch (Exception ex) {
            Logger.getLogger(ChangPassWord.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
