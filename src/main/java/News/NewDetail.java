/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package News;

import Controller.XuLy.GeoIP;
import EntityNews.ListNewtmp;
import EntityNews.ListNewtmp2;
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
public class NewDetail extends HttpServlet {

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

            String id = request.getParameter("id");
            String path = request.getContextPath();
            if (id == null) {
                response.sendRedirect(path + "/NotFound");
            } else {
                NewDAO nedao = new NewDAO();
                New ne = nedao.getNewById(id);
                if (ne == null) {
                    response.sendRedirect(path + "/NotFound");
                } else {
                    String nd = ne.getContent();
                    nd = nd.replaceAll("shacojx", "");
                    ne.setContent(nd);
                    GeoIP geo = new GeoIP();
                    String userIpAddress = request.getRemoteAddr();
                    String location = geo.getLocation(userIpAddress);
                    java.util.Date date1 = new java.util.Date();
                    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    String startDate = sdf1.format(date1);
                    Visiter vis = new Visiter(userIpAddress, location, startDate, id, ne.getType_new());
                    VisiterDAO vidao = new VisiterDAO();
                    vidao.insert(vis);

                    GetTopNews gettop = new GetTopNews();
                    ArrayList<ListNewtmp> listlii = gettop.RankingIP();
                    ArrayList<ListNewtmp2> listliii = new ArrayList<>();
                    for (ListNewtmp lol : listlii) {
                        String cove = nedao.getCoverById(lol.getId());
                        ListNewtmp2 lolo = new ListNewtmp2(lol.getId(), lol.getTitle(), lol.getType(), lol.getDate(), lol.getView(), cove);
                        listliii.add(lolo);
                    }

                    ArrayList<New> listPaging = nedao.getPaggingAll(1);
                    request.setAttribute("listNew", listPaging);
                    request.setAttribute("listTop", listliii);
                    request.setAttribute("Ne", ne);
                    request.getRequestDispatcher("/MovieNews/NewDetail.jsp").forward(request, response);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(NewDetail.class.getName()).log(Level.SEVERE, null, ex);
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
