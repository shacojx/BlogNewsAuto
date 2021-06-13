<%-- 
    Document   : index.jsp
    Created on : Oct 25, 2020, 1:52:14 PM
    Author     : shacojx
--%>
<%@page import="EntityNews.ListNewtmp"%>
<%@page import="News.GetTopNews"%>
<%@page import="EntityNews.New"%>
<%@page import="Model.NewDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="Model.VisiterDAO"%>
<%@page import="EntityNews.Visiter"%>
<%@page import="Entity.Account"%>
<%@page import="Model.LoginDAO"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page import="Controller.XuLy.AES"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
            VisiterDAO vidao = new VisiterDAO();
            int movienews = vidao.countByType("Movie News");
            int tvnews = vidao.countByType("TV News");
            int trailer = vidao.countByType("Trailers");
            int reviews = vidao.countByType("Reviews");
            int netflix = vidao.countByType("Netflix");
            int videogame = vidao.countByType("Video Games");
            int interviews = vidao.countByType("Interviews");
        %>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <link rel="icon" href="${pageContext.request.contextPath}/MovieNews/images/ic4k.png" type="image/gif" sizes="32x32">
        <title>C4K Studio Admin</title>
        <!-- Tell the browser to be responsive to screen width -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- Font Awesome -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/AdminLTE/plugins/fontawesome-free/css/all.min.css">
        <!-- Ionicons -->
        <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
        <!-- Tempusdominus Bbootstrap 4 -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/AdminLTE/plugins/tempusdominus-bootstrap-4/css/tempusdominus-bootstrap-4.min.css">
        <!-- iCheck -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/AdminLTE/plugins/icheck-bootstrap/icheck-bootstrap.min.css">
        <!-- JQVMap -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/AdminLTE/plugins/jqvmap/jqvmap.min.css">
        <!-- Theme style -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/AdminLTE/dist/css/adminlte.min.css">
        <!-- overlayScrollbars -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/AdminLTE/plugins/overlayScrollbars/css/OverlayScrollbars.min.css">
        <!-- Daterange picker -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/AdminLTE/plugins/daterangepicker/daterangepicker.css">
        <!-- summernote -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/AdminLTE/plugins/summernote/summernote-bs4.css">
        <!-- Google Font: Source Sans Pro -->
        <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">

        <script type="text/javascript" src="${pageContext.request.contextPath}/js/loader.js"></script>
        <script type="text/javascript">
            google.charts.load('current', {'packages': ['corechart']});
            google.charts.setOnLoadCallback(drawChart);

            function drawChart() {

                var data = google.visualization.arrayToDataTable([
                    ['Task', 'Hours per Day'],
                    ['Movie News', <%=movienews%>],
                    ['TV News', <%=tvnews%>],
                    ['Trailers', <%=trailer%>],
                    ['Reviews', <%=reviews%>],
                    ['Interviews', <%=interviews%>],
                    ['Netflix', <%=netflix%>],
                    ['Video Games', <%=videogame%>]
                ]);

                var options = {
                    title: ''
                };

                var chart = new google.visualization.PieChart(document.getElementById('piechart'));

                chart.draw(data, options);
            }
        </script>
    </head>
    <body class="hold-transition sidebar-mini layout-fixed">
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
        <div class="wrapper">
            <c:set var = "admin1" scope = "request" value = "menu-open"/>
            <c:set var = "admin2" scope = "request" value = "active"/>
            <c:set var = "admin3" scope = "request" value = "active"/>

            <jsp:include page="../Menu/Menu.jsp" />

            <!-- Content Wrapper. Contains page content -->
            <div class="content-wrapper">
                <!-- Content Header (Page header) -->
                <div class="content-header">
                    <div class="container-fluid">
                        <div class="row mb-2">
                            <div class="col-sm-6">
                                <h1 class="m-0 text-dark"></h1>
                            </div><!-- /.col -->
                            <div class="col-sm-6">
                                <ol class="breadcrumb float-sm-right">
                                    <li class="breadcrumb-item"><a href="${pageContext.request.contextPath}/FRS/world.jsp">Home</a></li>
                                    <li class="breadcrumb-item active">Phân Tích</li>
                                </ol>
                            </div><!-- /.col -->
                        </div><!-- /.row -->
                    </div><!-- /.container-fluid -->
                </div>
                <!-- /.content-header -->

                <!-- Main content -->
                <section class="content">
                    <div class="container-fluid">
                        <!-- Small boxes (Stat box) -->
                        <div class="row">
                            <div class="col-md-6 connectedSortable">
                                <div class="card card-success">
                                    <div class="card-header">
                                        <h3 class="card-title"><i class="fas fa-chart-pie mr-1"></i> Sơ Đồ Phân Tích Lượt Xem</h3>
                                    </div>
                                    <div class="panel-body" style="width:100%; height:100%;">
                                        <div id="piechart" style="width: 100%; height: 400px"></div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-6 connectedSortable">
                                <div class="card card-success">
                                    <div class="card-header">
                                        <h3 class="card-title"><i class="fas fa-chart-pie mr-1"></i> Top 5 Bài Viết Xem Nhiều Nhất</h3>
                                    </div>
                                    <div class="card-body p-0">
                                        <table class="table table-striped projects">
                                            <thead>
                                                <tr>

                                                    <th>
                                                        Bài Viết
                                                    </th>
                                                    <th>
                                                        Thể Loại
                                                    </th>

                                                    <th class="text-center">
                                                        Lượt Xem
                                                    </th>

                                                </tr>
                                            </thead>
                                            <tbody>
                                                <%                                                    GetTopNews gettop = new GetTopNews();
                                                    ArrayList<ListNewtmp> listlii = gettop.RankingIP();
                                                    for (ListNewtmp tt : listlii) {
                                                        out.println("<tr>");
                                                        out.print("<td><span>" + tt.getTitle() + "</span>");
                                                        out.print("<br/><small></small></td>");
                                                        out.print("<td> <ul class=\"list-inline\">");
                                                        out.print("<span>" + tt.getType() + "</span></ul></td>");
                                                        out.print("<td class=\"text-center\"> <span>" + tt.getView() + "</span> </td>");
                                                        out.print(" </tr>");
                                                    }
                                                %>


                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>

                        </div>
                        <!-- /.row -->

                        <div class="row">
                            <div class="col-12">
                                <div class="card card-info">
                                    <div class="card-header">
                                        <h3 class="card-title">Thống Kê Lượt Xem Hôm Nay</h3>

                                        <div class="card-tools">
                                            <button type="button" class="btn btn-tool" data-card-widget="collapse" data-toggle="tooltip" title="Collapse">
                                                <i class="fas fa-minus"></i></button>
                                        </div>
                                    </div>
                                    <div class="card-body p-0">
                                        <table class="table table-striped projects">
                                            <thead>
                                                <tr>

                                                    <th>
                                                        Ngày
                                                    </th>

                                                    <th class="text-center">
                                                        Lượt Xem
                                                    </th>

                                                </tr>
                                            </thead>
                                            <tbody>
                                                <%                                                    java.util.Date date1 = new java.util.Date();
                                                    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
                                                    String startDate = sdf1.format(date1);
                                                    out.println("<tr>");
                                                    out.print("<td><span>" + startDate + "</span>");
                                                    out.print("<br/><small></small></td>");
                                                    out.print("<td class=\"text-center\"> <span>" + vidao.countByDay(startDate) + "</span> </td>");
                                                    out.print(" </tr>");
                                                %>

                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-12">
                                <div class="card card-warning">
                                    <div class="card-header">
                                        <h3 class="card-title">Thống Kê Lượt Xem Tháng Này</h3>

                                        <div class="card-tools">
                                            <button type="button" class="btn btn-tool" data-card-widget="collapse" data-toggle="tooltip" title="Collapse">
                                                <i class="fas fa-minus"></i></button>
                                        </div>
                                    </div>
                                    <div class="card-body p-0">
                                        <table class="table table-striped projects">
                                            <thead>
                                                <tr>
                                                    <th>
                                                        Tháng
                                                    </th>

                                                    <th class="text-center">
                                                        Lượt Xem
                                                    </th>

                                                </tr>
                                            </thead>
                                            <tbody>
                                                <%                                                    java.util.Date date12 = new java.util.Date();
                                                    SimpleDateFormat sdf12 = new SimpleDateFormat("yyyy-MM");
                                                    String startDate2 = sdf12.format(date12);
                                                    out.println("<tr>");
                                                    out.print("<td><span>" + startDate2 + "</span>");
                                                    out.print("<br/><small></small></td>");
                                                    out.print("<td class=\"text-center\"> <span>" + vidao.countByMon(startDate2) + "</span> </td>");
                                                    out.print(" </tr>");
                                                %>

                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-12">
                                <div class="card card-danger">
                                    <div class="card-header">
                                        <h3 class="card-title">Thống Kê Lượt Xem Năm Nay</h3>

                                        <div class="card-tools">
                                            <button type="button" class="btn btn-tool" data-card-widget="collapse" data-toggle="tooltip" title="Collapse">
                                                <i class="fas fa-minus"></i></button>
                                        </div>
                                    </div>
                                    <div class="card-body p-0">
                                        <table class="table table-striped projects">
                                            <thead>
                                                <tr>
                                                    <th>
                                                        Năm
                                                    </th>

                                                    <th class="text-center">
                                                        Lượt Xem
                                                    </th>

                                                </tr>
                                            </thead>
                                            <tbody>
                                                <%                                                    java.util.Date date13 = new java.util.Date();
                                                    SimpleDateFormat sdf13 = new SimpleDateFormat("yyyy");
                                                    String startDate3 = sdf13.format(date13);
                                                    out.println("<tr>");
                                                    out.print("<td><span>" + startDate3 + "</span>");
                                                    out.print("<br/><small></small></td>");
                                                    out.print("<td class=\"text-center\"> <span>" + vidao.countByMon(startDate3) + "</span> </td>");
                                                    out.print(" </tr>");
                                                %>

                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>



                    </div><!-- /.container-fluid -->
                </section>
                <!-- /.content -->
            </div>
            <!-- /.content-wrapper -->
            <jsp:include page="../Menu/Footer.jsp" />

            <!-- Control Sidebar -->
            <aside class="control-sidebar control-sidebar-dark">
                <!-- Control sidebar content goes here -->
            </aside>
            <!-- /.control-sidebar -->
        </div>
        <!-- ./wrapper -->

        <!-- jQuery -->
        <script src="${pageContext.request.contextPath}/AdminLTE/plugins/jquery/jquery.min.js"></script>
        <!-- jQuery UI 1.11.4 -->
        <script src="${pageContext.request.contextPath}/AdminLTE/plugins/jquery-ui/jquery-ui.min.js"></script>
        <!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
        <script>
            $.widget.bridge('uibutton', $.ui.button)
        </script>
        <!-- Bootstrap 4 -->
        <script src="${pageContext.request.contextPath}/AdminLTE/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
        <!-- ChartJS -->
        <script src="${pageContext.request.contextPath}/AdminLTE/plugins/chart.js/Chart.min.js"></script>
        <!-- Sparkline -->
        <script src="${pageContext.request.contextPath}/AdminLTE/plugins/sparklines/sparkline.js"></script>
        <!-- JQVMap -->
        <script src="${pageContext.request.contextPath}/AdminLTE/plugins/jqvmap/jquery.vmap.min.js"></script>
        <script src="${pageContext.request.contextPath}/AdminLTE/plugins/jqvmap/maps/jquery.vmap.usa.js"></script>
        <!-- jQuery Knob Chart -->
        <script src="${pageContext.request.contextPath}/AdminLTE/plugins/jquery-knob/jquery.knob.min.js"></script>
        <!-- daterangepicker -->
        <script src="${pageContext.request.contextPath}/AdminLTE/plugins/moment/moment.min.js"></script>
        <script src="${pageContext.request.contextPath}/AdminLTE/plugins/daterangepicker/daterangepicker.js"></script>
        <!-- Tempusdominus Bootstrap 4 -->
        <script src="${pageContext.request.contextPath}/AdminLTE/plugins/tempusdominus-bootstrap-4/js/tempusdominus-bootstrap-4.min.js"></script>
        <!-- Summernote -->
        <script src="${pageContext.request.contextPath}/AdminLTE/plugins/summernote/summernote-bs4.min.js"></script>
        <!-- overlayScrollbars -->
        <script src="${pageContext.request.contextPath}/AdminLTE/plugins/overlayScrollbars/js/jquery.overlayScrollbars.min.js"></script>
        <!-- AdminLTE App -->
        <script src="${pageContext.request.contextPath}/AdminLTE/dist/js/adminlte.js"></script>
        <!-- AdminLTE dashboard demo (This is only for demo purposes) -->
        <script src="${pageContext.request.contextPath}/AdminLTE/dist/js/pages/dashboard.js"></script>
        <!-- AdminLTE for demo purposes -->
        <script src="${pageContext.request.contextPath}/AdminLTE/dist/js/demo.js"></script>
    </body>
</html>
