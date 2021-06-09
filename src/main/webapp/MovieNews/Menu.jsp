<%-- 
    Document   : Menu
    Created on : Jun 10, 2021, 1:56:25 AM
    Author     : ShacoJX
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container-fluid">
            <div class="container">
                <div class="row">
                    <div class="col-12 col-md-3 fh5co_padding_menu">
                        <img src="${pageContext.request.contextPath}/MovieNews/images/logo.png" alt="img" class="fh5co_logo_width"/>
                    </div>
                    <div class="col-12 col-md-9 align-self-center fh5co_mediya_right">
                        
                        <div class="text-center d-inline-block">
                            <a href="https://www.linkedin.com/" target="_blank" class="fh5co_display_table"><div class="fh5co_verticle_middle"><i class="fa fa-linkedin"></i></div></a>
                        </div>
                        <div class="text-center d-inline-block">
                            <a href="https://www.google.com/" target="_blank" class="fh5co_display_table"><div class="fh5co_verticle_middle"><i class="fa fa-google-plus"></i></div></a>
                        </div>
                        <div class="text-center d-inline-block">
                            <a href="https://twitter.com/" target="_blank" class="fh5co_display_table"><div class="fh5co_verticle_middle"><i class="fa fa-twitter"></i></div></a>
                        </div>
                        <div class="text-center d-inline-block">
                            <a href="https://fb.com/" target="_blank" class="fh5co_display_table"><div class="fh5co_verticle_middle"><i class="fa fa-facebook"></i></div></a>
                        </div>
                        <div class="text-center d-inline-block">
                            <a href="${pageContext.request.contextPath}/Profile" target="_blank" class="fh5co_display_table"><div class="fh5co_verticle_middle"><i class="fa fa-shield"></i></div></a>
                        </div>
                        <!--<div class="d-inline-block text-center"><img src="images/country.png" alt="img" class="fh5co_country_width"/></div>-->

                        <div class="clearfix"></div>
                    </div>
                </div>
            </div>
        </div>
        <div class="container-fluid bg-faded fh5co_padd_mediya padding_786">
            <div class="container padding_786">
                <nav class="navbar navbar-toggleable-md navbar-light ">
                    <button class="navbar-toggler navbar-toggler-right mt-3" type="button" data-toggle="collapse"
                            data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false"
                            aria-label="Toggle navigation"><span class="fa fa-bars"></span></button>
                    <a class="navbar-brand" href="${pageContext.request.contextPath}/News"><img src="${pageContext.request.contextPath}/MovieNews/images/logo.png" alt="img" class="mobile_logo_width"/></a>
                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="navbar-nav mr-auto">
                            <li class="nav-item ${home}">
                                <a href="${pageContext.request.contextPath}/News" class="nav-link">Home <span class="sr-only">(current)</span></a>
                            </li>
                            <li class="nav-item ${movie}">
                                <a href="${pageContext.request.contextPath}/MovieNews" class="nav-link">Movie News <span class="sr-only">(current)</span></a>
                            </li>
                            <li class="nav-item ${tv}">
                                <a href="${pageContext.request.contextPath}/TvNews" class="nav-link">TV News <span class="sr-only">(current)</span></a>
                            </li>
                            <li class="nav-item ${trailers}">
                                <a href="${pageContext.request.contextPath}/Trailers" class="nav-link">Trailers <span class="sr-only">(current)</span></a>
                            </li>
                            <li class="nav-item ${reviews}">
                                <a href="${pageContext.request.contextPath}/Reviews" class="nav-link">Reviews <span class="sr-only">(current)</span></a>
                            </li>
                            <li class="nav-item ${interviews}">
                                <a href="${pageContext.request.contextPath}/Interviews" class="nav-link">Interviews <span class="sr-only">(current)</span></a>
                            </li>
                            <li class="nav-item ${net}">
                                <a href="${pageContext.request.contextPath}/Netflix" class="nav-link" >Netflix <span class="sr-only">(current)</span></a>
                            </li>
                            <li class="nav-item ${game}">
                                <a href="${pageContext.request.contextPath}/VideoGames" class="nav-link" >Games <span class="sr-only">(current)</span></a>
                            </li>
                        </ul>
                    </div>
                </nav>
            </div>
        </div>
    </body>
</html>
