<%-- 
    Document   : Menu
    Created on : Oct 27, 2020, 1:29:18 AM
    Author     : shacojx
--%>

<%@page import="Entity.Account"%>
<%@page import="Model.LoginDAO"%>
<%@page import="Controller.XuLy.AES"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="icon" href="${pageContext.request.contextPath}/MovieNews/images/ic4k.png" type="image/gif" sizes="32x32">
        <title>C4K Studio Admin</title>

    </head>
    <body>
        <%
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
                a = loginD.checkLogin(aes.decrypt(user), aes.decrypt(pass));
                ulogin = aes.decrypt(user);
            }
            

        %>
        <!-- Navbar -->
        <nav class="main-header navbar navbar-expand navbar-white navbar-light">
            <!-- Left navbar links -->
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" data-widget="pushmenu" href="#" role="button"><i class="fas fa-bars"></i></a>
                </li>
                <li class="nav-item d-none d-sm-inline-block">
                    <a href="${pageContext.request.contextPath}/Profile" class="nav-link">Home</a>
                </li>
                
            </ul>
            <!-- Right navbar links -->
            <ul class="navbar-nav ml-auto">


                <li class="nav-item">
                    <a class="nav-link" data-widget="control-sidebar" data-slide="true" href="#" role="button">
                        <i class="fas fa-th-large"></i>
                    </a>
                </li>
            </ul>
        </nav>
        <!-- /.navbar -->
        <!-- Main Sidebar Container -->
        <aside class="main-sidebar sidebar-dark-primary elevation-4">
            <!-- Brand Logo -->
            <a href="${pageContext.request.contextPath}/Profile" class="brand-link">
                <img src="${pageContext.request.contextPath}/AdminLTE/dist/img/ano.png" alt="EOG Logo" class="brand-image img-circle elevation-3"
                     style="opacity: .8">
                <span class="brand-text font-weight-light">C4K Studio</span>
            </a>

            <!-- Sidebar -->
            <div class="sidebar">
                <!-- Sidebar user panel (optional) -->
                <div class="user-panel mt-3 pb-3 mb-3 d-flex">
                    <div class="image">
                        <img src="${pageContext.request.contextPath}/AdminLTE/dist/img/ano.png" class="img-circle elevation-2" alt="User Image">
                    </div>
                    <div class="info">
                        <a href="${pageContext.request.contextPath}/Profile" class="d-block"><%=ulogin%></a>
                    </div>
                </div>

                <!-- Sidebar Menu -->
                <nav class="mt-2">
                    <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
                        <!-- Add icons to the links using the .nav-icon class
                             with font-awesome or any other icon font library -->
                       
                       
                        <li class="nav-item has-treeview ${admin1}">
                            <a href="#" class="nav-link ${admin2}">
                                <i class="nav-icon fas fa-tree"></i>
                                <p>
                                    Admin Control
                                    <i class="fas fa-angle-left right"></i>
                                </p>
                            </a>
                            <ul class="nav nav-treeview">
                                <li class="nav-item">
                                    <a href="${pageContext.request.contextPath}/FRS/AdminControl/PhanTich.jsp" class="nav-link ${admin3}">
                                        <i class="far fa-circle nav-icon"></i>
                                        <p>Analysis Dashboard</p>
                                    </a>
                                </li>
                                
                                <li class="nav-item">
                                    <a href="${pageContext.request.contextPath}/FRS/AdminControl/PhanTich2.jsp" class="nav-link ${admin4}">
                                        <i class="far fa-circle nav-icon"></i>
                                        <p>Analysis Views</p>
                                    </a>
                                </li>
                                
                                <li class="nav-item">
                                    <a href="${pageContext.request.contextPath}/FRS/AdminControl/PhanTichLocation.jsp" class="nav-link ${admin5}">
                                        <i class="far fa-circle nav-icon"></i>
                                        <p>Analysis Location</p>
                                    </a>
                                </li>
                                
                                <li class="nav-item">
                                    <a href="${pageContext.request.contextPath}/FRS/AdminControl/ViewUserOnline.jsp" class="nav-link ${admin6}">
                                        <i class="far fa-circle nav-icon"></i>
                                        <p>View User Online</p>
                                    </a>
                                </li>
                                
                                <li class="nav-item">
                                    <a href="${pageContext.request.contextPath}/FRS/AdminControl/AddUser.jsp" class="nav-link ${adduser}">
                                        <i class="far fa-circle nav-icon"></i>
                                        <p>Thêm người dùng</p>
                                    </a>
                                </li>
                   
                                
                            </ul>
                        </li>
                        
                        <li class="nav-header">Quản Lý Tin Tức</li>
                            
                        <li class="nav-item">
                            <a href="${pageContext.request.contextPath}/FRS/ManagerNews/UpNews.jsp" class="nav-link ${upnews}">
                                <i class="nav-icon far fa-calendar-alt"></i>
                                <p>
                                    Thêm tin tức
                                    <span class="badge badge-success right">News</span>
                                </p>
                            </a>
                        </li>
                        
                        <li class="nav-item">
                            <a href="${pageContext.request.contextPath}/ListNews" class="nav-link ${listnews}">
                                <i class="nav-icon far fa-image"></i>
                                <p>
                                    Danh sách tin tức
                                </p>
                            </a>
                        </li>
                        
                        

                        <li class="nav-header">Tin Tức</li>
                        <li class="nav-item">
                            <a href="${pageContext.request.contextPath}/News" class="nav-link">
                                <i class="nav-icon fas fa-file"></i>
                                <p>Tin Tức</p>
                            </a>
                        </li>
                        <li class="nav-header">Other</li>
                        <li class="nav-item">
                            <a href="${pageContext.request.contextPath}/FRS/Profile/ChangePass.jsp" class="nav-link">
                                <i class="fas fa-circle nav-icon"></i>
                                <p>Đổi mật khẩu</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="${pageContext.request.contextPath}/Logout" class="nav-link">
                                <i class="fas fa-circle nav-icon"></i>
                                <p>Đăng xuất</p>
                            </a>
                        </li>

                    </ul>
                </nav>
                <!-- /.sidebar-menu -->
            </div>
            <!-- /.sidebar -->
        </aside>


    </body>
</html>