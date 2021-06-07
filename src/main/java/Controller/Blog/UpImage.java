/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Blog;

import Controller.XuLy.AES;
import Model.LoginDAO;
import com.google.gson.Gson;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author Administrator
 */
public class UpImage extends HttpServlet {

    private final String UPLOAD_DIRECTORY = "/home/toanvv/img_uploads";

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

            File f = new File(UPLOAD_DIRECTORY+"/" + ulogin+"/"+time);
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
                                    || name_file.split("\\.")[1].equalsIgnoreCase("jpg")) {
                                item.write(new File(up_url + File.separator + name_file));
                                request.setAttribute("message", "<p style=\"color: #3ac33ad1;\">File Uploaded Successfully</p>");
                                request.setAttribute("name_file", "URL: <a href=\"https://infosec.funtap.vn/DownloadImage?name_file=" + path_final+"/"+name_file + "\">https://infosec.funtap.vn/DownloadImage?name_file=" + path_final+"/"+name_file + "</a>");
                                request.getRequestDispatcher("/QuanTriBlog/upload.jsp").forward(request, response);
                            } else {

                                request.setAttribute("message", "<p style=\"color: red;\">File Upload thất bại, chỉ được up file png và jpg</p>");
                                request.getRequestDispatcher("/QuanTriBlog/upload.jsp").forward(request, response);
                            }

                        }
                    }

                } catch (Exception ex) {

                    request.setAttribute("message", "<p style=\"color: red;\">File Upload thất bại</p>");
                    request.getRequestDispatcher("/QuanTriBlog/upload.jsp").forward(request, response);
                }

            } else {

                request.setAttribute("message", "<p style=\"color: red;\">File Upload thất bại</p>");
                request.getRequestDispatcher("/QuanTriBlog/upload.jsp").forward(request, response);
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
