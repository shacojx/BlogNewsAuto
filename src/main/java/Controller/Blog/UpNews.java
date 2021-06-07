/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Blog;

import Controller.XuLy.AES;
import Entity.Account;
import EntityNews.New;
import Model.LoginDAO;
import Model.NewDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ShacoJX
 */
public class UpNews extends HttpServlet {

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
            LoginDAO loginD = new LoginDAO();
            AES aes = new AES();
            Account a = null;
            if (loginD.checkLogin(aes.decrypt(user), aes.decrypt(pass)) == null) {
                response.sendRedirect("/Login/Login.jsp");
            } else {
                String title = request.getParameter("title");
                String content = request.getParameter("content");
                String type_new = request.getParameter("type_new");
                String cover = request.getParameter("cover");
                String des = "...";
                content = content.replaceAll("<script>", "%3Cscript%3E");
                content = content.replaceAll("</script>", "%3C/script%3E");
                content = content.replaceAll("onerror", "");
                content = content.replaceAll("<script", "%3Cscript");
                content = content.replace("<img", "<img class=\"img-responsive\" ");
                if (title.length() == 0 || content.length() == 0 
                        || type_new.length() == 0 || cover.length() == 0) {
                    request.setAttribute("mess", "<p style=\"color: red;\">Thêm Bài Viết Thất Bại, Không được bỏ trống các trường bắt buộc (có icon khóa)</p>");
                    request.getRequestDispatcher("/FRS/ManagerNews/UpNews.jsp").forward(request, response);
                } else {
                    java.util.Date date1 = new java.util.Date();
                    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ");
                    String startDate = sdf1.format(date1);
                    String id = startDate.replaceAll(" ", "");
                    NewDAO nedao = new NewDAO();
                    New ne = new New(id, title, des, content, startDate, type_new, cover);
                    nedao.insertNews(ne);
                    request.setAttribute("mess", "<p style=\"color: #3ac33ad1;\">Thêm Bài Viết Thành Công</p>");
                    request.getRequestDispatcher("/FRS/ManagerNews/UpNews.jsp").forward(request, response);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpNews.class.getName()).log(Level.SEVERE, null, ex);
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
