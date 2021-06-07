/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Servlet.Auth;

import Controller.XuLy.CheckAccExit;
import Controller.XuLy.CheckPass;
import Controller.XuLy.Filter;
import Controller.XuLy.MD5Encryt;
import Entity.Account;
import Model.AccDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
public class AddAccount extends HttpServlet {

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
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");

        /* TODO output your page here. You may use following sample code. */
        AccDAO ad = new AccDAO();
        MD5Encryt md5 = new MD5Encryt();
        Filter fil = new Filter();

        String fullname = request.getParameter("fullname");
        String username = request.getParameter("username");

        String pass = request.getParameter("password");
        String password = md5.md5(pass);

        if (fullname.length() == 0
                || username.length() == 0
                || pass.length() == 0) {
            request.setAttribute("mess", "<p style=\"color: red;\">Thêm Người Dùng Thất Bại, Không được bỏ trống các trường bắt buộc (có icon khóa)</p>");
            request.getRequestDispatcher("/FRS/AdminControl/AddUser.jsp").forward(request, response);
        } else {
            CheckPass cp = new CheckPass();
            CheckAccExit cae = new CheckAccExit();
            boolean check_len_pass = true;
            boolean check_user = true;

            if (cp.check(pass) == true) {
                check_len_pass = true;
            } else {
                check_len_pass = false;
            }

            if (cae.checkUserExit(username) == null) {
                check_user = true;
            } else {
                check_user = false;
            }

            if (check_len_pass == true && check_user == true) {
                Account acc = new Account(username, password, fullname);

                ad.insertAcc(acc);

                request.setAttribute("mess", "<p style=\"color: #3ac33ad1;\">Thêm Người Dùng Thành Công</p>");
                request.getRequestDispatcher("/FRS/AdminControl/AddUser.jsp").forward(request, response);
            } else {
                request.setAttribute("mess", "<p style=\"color: red;\">Thêm Người Dùng Thất Bại. Kiểm tra mã nhân sự, tên username là duy nhất, tiêu chuẩn password mạnh</p>");
                request.getRequestDispatcher("/FRS/AdminControl/AddUser.jsp").forward(request, response);
            }
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
        try {
            request.setCharacterEncoding("UTF-8");
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(AddAccount.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            request.setCharacterEncoding("UTF-8");
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(AddAccount.class.getName()).log(Level.SEVERE, null, ex);
        }
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
