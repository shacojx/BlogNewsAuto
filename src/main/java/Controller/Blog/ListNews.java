/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Blog;

import Controller.XuLy.AES;
import Entity.Account;
import EntityNews.ListNewtmp;
import EntityNews.New;
import Model.LoginDAO;
import Model.NewDAO;
import Model.VisiterDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
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
public class ListNews extends HttpServlet {

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
        try ( PrintWriter out = response.getWriter()) {
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
            String contextPath = request.getContextPath();
            String ulogin = "";
            Account a = null;
            if (loginD.checkLogin(aes.decrypt(user), aes.decrypt(pass)) == null) {
                response.sendRedirect(contextPath + "/Login/Login.jsp");
            } else {
                NewDAO newdao = new NewDAO();
                VisiterDAO vidao = new VisiterDAO();
                NewDAO ndao = new NewDAO();
                int count = ndao.count();
                int endPage = count / 12;
                if (count % 12 != 0) {
                    endPage++;
                }
                String indexPage = request.getParameter("index");
                int index = 1;
                boolean check = true;
                String path = request.getContextPath();

                if (indexPage != null) {
                    char[] list_index = indexPage.toCharArray();
                    for (char ch : list_index) {
                        if (Character.isDigit(ch) == false) {
                            check = false;
                            break;

                        }
                    }
                }
                if (check == false) {
                    response.sendRedirect(path + "/NotFound");
                } else {
                    if (indexPage != null) {
                        index = Integer.parseInt(indexPage);
                    }
                    if (index > endPage) {
                        response.sendRedirect(path + "/NotFound");
                    } else {
                        ArrayList<New> listnew = newdao.getPaggingAll(index);
                        ArrayList<ListNewtmp> listview = new ArrayList<>();
                        for (New nee : listnew) {
                            int xxx = vidao.countByNews(nee.getId());
                            ListNewtmp yyy = new ListNewtmp(nee.getId(), nee.getTitle(), nee.getType_new(), nee.getDate(), xxx + "");
                            listview.add(yyy);
                        }

                        request.setAttribute("end", endPage);
                        request.setAttribute("index", index);
                        request.setAttribute("listNews", listnew);
                        request.setAttribute("listxxx", listview);
                        request.getRequestDispatcher("/FRS/ManagerNews/ListNews.jsp").forward(request, response);
                    }
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(ListNews.class.getName()).log(Level.SEVERE, null, ex);
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
