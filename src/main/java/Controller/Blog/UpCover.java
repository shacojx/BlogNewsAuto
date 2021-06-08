/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Blog;

import Controller.XuLy.AES;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author Admin
 */
public class UpCover extends HttpServlet {

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
           String name_file = null;

            Cookie[] listCookie = request.getCookies();
            String user = "";
            String pass = "";
            for (Cookie o : listCookie) {
                if (o.getName().equals("mu")) {
                    user = o.getValue();
                }
            }
            AES aes = new AES();
            String ulogin = aes.decrypt(user);
            Date date = new Date();
            SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hhmmss");
            String time = ft.format(date);

            File f = new File("/home/shacojx/img_uploads/" + ulogin+"/"+time);
            if (!f.exists()) {
                f.mkdirs();
            }
            String up_url = f.toString();
            String path_final = ulogin+"/"+time;

            /* TODO output your page here. You may use following sample code. */
            if (ServletFileUpload.isMultipartContent(request)) {
                try {
                    List<FileItem> multiparts = new ServletFileUpload(
                            new DiskFileItemFactory()).parseRequest(request);

                    for (FileItem item : multiparts) {
                        if (!item.isFormField()) {
                            name_file = new File(item.getName()).getName();
                            if (name_file.split("\\.")[1].equalsIgnoreCase("png")
                                    || name_file.split("\\.")[1].equalsIgnoreCase("jpg")
                                    || name_file.split("\\.")[1].equalsIgnoreCase("gif") ) {
                                item.write(new File(up_url + File.separator + name_file));
                                request.setAttribute("message", "<p style=\"color: #3ac33ad1;\">File Uploaded Successfully</p>");
                                request.setAttribute("name_file", "URL: <a href=\"http://sieucapvip1.ddns.net:8080/BlogAuto/DownloadImage?name_file=" + path_final+"/"+name_file + "\">http://sieucapvip1.ddns.net:8080/BlogAuto/DownloadImage?name_file=" + path_final+"/"+name_file + "</a>");
                                request.setAttribute("name_file_cover", "http://sieucapvip1.ddns.net:8080/BlogAuto/DownloadImage?name_file=" + path_final+"/"+name_file);
                                request.getRequestDispatcher("/FRS/ManagerNews/UpNews.jsp").forward(request, response);
                            } else {

                                request.setAttribute("message", "<p style=\"color: red;\">File Upload thất bại, chỉ được up file png và jpg</p>");
                                request.getRequestDispatcher("/FRS/ManagerNews/UpNews.jsp").forward(request, response);
                            }

                        }
                    }

                } catch (Exception ex) {

                    request.setAttribute("message", "<p style=\"color: red;\">File Upload thất bại</p>");
                    request.getRequestDispatcher("/FRS/ManagerNews/UpNews.jsp").forward(request, response);
                }

            } else {

                request.setAttribute("message", "<p style=\"color: red;\">File Upload thất bại</p>");
                request.getRequestDispatcher("/FRS/ManagerNews/UpNews.jsp").forward(request, response);
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
