/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package News;

import Controller.XuLy.GeoIP;
import EntityNews.New;
import EntityNews.Visiter;
import Model.NewDAO;
import Model.VisiterDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ShacoJX
 */
public class VideoGames extends HttpServlet {

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
            GeoIP geo = new GeoIP();
            String userIpAddress = request.getRemoteAddr();
            String location = geo.getLocation(userIpAddress);
            java.util.Date date1 = new java.util.Date();
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String startDate = sdf1.format(date1);
            String id_news = "trangchu_7";
            Visiter vis = new Visiter(userIpAddress, location, startDate, id_news);
            VisiterDAO vidao = new VisiterDAO();
            vidao.insert(vis);
            
            String indexPage = request.getParameter("index");
            
            int index = 1;
            if (indexPage != null) {
                index = Integer.parseInt(indexPage);
            }
            NewDAO ndao = new NewDAO();
            int count = ndao.countByType("Video Games");
            int endPage = count / 6;
            if (count % 6 != 0) {
                endPage++;
            }
            ArrayList<New> listPaging = ndao.getPaggingByType(index,"Video Games");
            request.setAttribute("end", endPage);
            request.setAttribute("index", index);
            request.setAttribute("listNew", listPaging);
            request.getRequestDispatcher("/News/VideoGames.jsp").forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(VideoGames.class.getName()).log(Level.SEVERE, null, ex);
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
