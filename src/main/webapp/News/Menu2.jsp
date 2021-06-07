<%-- 
    Document   : Menu
    Created on : Oct 27, 2020, 1:29:18 AM
    Author     : shacojx
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!-- Google font -->
        <link href="${pageContext.request.contextPath}/News/local.css" rel="stylesheet"> 

        <!-- Bootstrap -->
        <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/News/css/bootstrap.min.css"/>

        <!-- Font Awesome Icon -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/News/css/font-awesome.min.css">

        <!-- Custom stlylesheet -->
        <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/News/css/style.css"/>



    </head>
    <body>

        <!-- Header -->
        <header id="header">
            <!-- Nav -->
            <div id="nav">
                <!-- Main Nav -->
                <div id="nav-fixed">
                    <div style="padding-left: 15%; padding-right: 15%;">
                        <!-- logo -->
                        <div class="nav-logo ">
                            <a href="${pageContext.request.contextPath}/News" class="logo"><img style="padding-top: 5%;
                                                                                                padding-bottom: 1%;" class="img-responsive" src="${pageContext.request.contextPath}/News/img/logox.PNG" alt=""></a>
                        </div>
                        <!-- /logo -->

                        <!-- nav -->
                        <ul class="nav-menu nav navbar-nav">
                            <li class="cat-1"><a href="${pageContext.request.contextPath}/MovieNews"><h4>MOVIE NEWS</h4></a></li>
                            <li class="cat-1"><a href="${pageContext.request.contextPath}/TvNews"><h4>TV NEWS</h4></a></li>
                            <li class="cat-1"><a href="${pageContext.request.contextPath}/Trailers"><h4>TRAILERS</h4></a></li>
                            <li class="cat-1"><a href="${pageContext.request.contextPath}/Reviews"><h4>REVIEWS</h4></a></li>
                            <li class="cat-1"><a href="${pageContext.request.contextPath}/Interviews"><h4>INTERVIEWS</h4></a></li>
                            <li class="cat-1"><a href="${pageContext.request.contextPath}/Netflix"><h4>NETFLIX</h4></a></li>
                            <li class="cat-1"><a href="${pageContext.request.contextPath}/VideoGames"><h4>VIDEO GAMES</h4></a></li>
                            <li class="cat-2"><a href="${pageContext.request.contextPath}/Profile"><h4>LOGIN</h4></a></li>
                        </ul>
                        <!-- /nav -->

                        <!-- search & aside toggle -->
                        <div class="nav-btns">
                            <button class="aside-btn"><i class="fa fa-bars"></i></button>
                            <button class="search-btn"><i class="fa fa-search"></i></button>

                            <form action="${pageContext.request.contextPath}/Search" method="get">
                                <div class="search-form">
                                    <input class="search-input" type="text" name="hashsearch" placeholder="Enter Your Search ...">
                                    <button class="search-close"><i class="fa fa-times"></i></button>
                                </div>
                            </form>

                        </div>
                        <!-- /search & aside toggle -->
                    </div>
                </div>
                <!-- /Main Nav -->

                <!-- Aside Nav -->
                <div id="nav-aside">
                    <!-- nav -->
                    <div class="section-row">
                        <ul class="nav-aside-menu">
                            <li><a href="${pageContext.request.contextPath}/News" class="logo"><img src="${pageContext.request.contextPath}/News/img/logo-cong-ty-funtap.jpg" alt=""></a></li>
                            <li><a href="${pageContext.request.contextPath}/MovieNews">MOVIE NEWS</a></li>
                            <li><a href="${pageContext.request.contextPath}/TvNews">TV NEWS</a></li>
                            <li><a href="${pageContext.request.contextPath}/Trailers">TRAILERS</a></li>
                            <li><a href="${pageContext.request.contextPath}/Reviews">REVIEWS</a></li>
                            <li><a href="${pageContext.request.contextPath}/Interviews">INTERVIEWS</a></li>
                            <li><a href="${pageContext.request.contextPath}/Netflix">NETFLIX</a></li>
                            <li><a href="${pageContext.request.contextPath}/VideoGames">VIDEO GAMES</a></li>
                            <li><a href="${pageContext.request.contextPath}/Profile">LOGIN</a></li>
                        </ul>
                    </div>
                    <!-- /nav -->
                    <!-- social links -->
                    <div class="section-row">
                        <h3>Follow us</h3>
                        <ul class="nav-aside-social">
                            <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                            <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                            <li><a href="#"><i class="fa fa-google-plus"></i></a></li>
                            <li><a href="#"><i class="fa fa-pinterest"></i></a></li>
                        </ul>
                    </div>
                    <!-- /social links -->

                    <!-- aside nav close -->
                    <button class="nav-aside-close"><i class="fa fa-times"></i></button>
                    <!-- /aside nav close -->
                </div>
                <!-- Aside Nav -->
            </div>
            <!-- /Nav -->
            <!-- Page Header -->
            <div id="post-header" class="page-header">
                <div class="background-img" style="background-image: url('${pageContext.request.contextPath}/News/img/post-page.jpg');"></div>
                <div class="container">
                    <div class="row">
                        <div class="col-md-10">
                            <div class="post-meta">                    
                                <span class="post-category cat-1" href="${pageContext.request.contextPath}/NewWorld"><c:out value = "${Ne.type_new}"/></span>
                                <span class="post-date"><c:out value = "${Ne.date}"/></span>
                            </div>
                            <h1><c:out value = "${Ne.title}"/></h1>
                        </div>
                    </div>
                </div>
            </div>
            <!-- /Page Header -->
        </header>
        <!-- /Header -->
        <!-- jQuery Plugins -->
        <script src="${pageContext.request.contextPath}/News/js/jquery.min.js"></script>
        <script src="${pageContext.request.contextPath}/News/js/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/News/js/main.js"></script>
    </body>
</html>