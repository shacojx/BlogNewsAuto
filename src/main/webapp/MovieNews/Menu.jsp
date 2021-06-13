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
        <title>C4K</title>
    </head>
    <body>
        <div class="container-fluid abcd">
            <div class="container" style="width: 1122px">
                <div class="row">
                    <div class="col-12 col-md-8 fh5co_padding_menu" style="display: flex ;">
                        <img style="filter: drop-shadow(1px 1px 0px#222); margin-left: 2%;" src="${pageContext.request.contextPath}/MovieNews/images/C4K.png" alt="C4K STUDIO" class="fh5co_logo_width"/>
                        <h1 style="color: rgb(243 92 105); width: 100%; padding-left: 50px; font-weight: 700; font-family: math; margin-bottom: 0px; align-items: flex-end; font-size: 45px; display: flex;">C4K STUDIO</h1>
                    </div>
                        <div class="col-12 col-md-4 align-self-center fh5co_mediya_right" style="padding-right: 2%;">
                        
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
                        
                        <!--<div class="d-inline-block text-center"><img src="images/country.png" alt="img" class="fh5co_country_width"/></div>-->

                        <div class="clearfix"></div>
                    </div>
                </div>
            </div>
        </div>
        <div class="container-fluid bg-faded fh5co_padd_mediya padding_786" >
            <div class="container padding_786">
                <nav class="navbar navbar-toggleable-md navbar-light " style=" padding: 0.5rem 0px;">
                    <button class="navbar-toggler navbar-toggler-right mt-3" type="button" data-toggle="collapse"
                            style="margin-top: 9px!important; margin-right: 0px;"
                            data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false"
                            aria-label="Toggle navigation"><span class="fa fa-bars"></span></button>
                            <a class="navbar-brand" href="${pageContext.request.contextPath}/News" style="display: inline-flex; align-items: center">
                        <img src="${pageContext.request.contextPath}/MovieNews/images/C4K.png" alt="C4K STUDIO" class="mobile_logo_width" style="width: 70px; filter: drop-shadow(1px 1px 0px#222); margin-top: 2px; margin-left: 10px;"/>
                        <h1 style="padding-bottom: 2px; padding-left: 0; padding-right: 0; padding-top: 0; font-weight: 700; font-family: math; margin: 0px; align-items: flex-end; font-size: 37px; color: rgb(243 92 105);" class="mobile_logo_width">C4K STUDIO</h1>
                    </a>
                    
                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="navbar-nav mr-auto" style="width: 100%; justify-content: space-between;">
                            <li class="nav-item ${home}" style="margin-left: 20px;">
                                <a href="${pageContext.request.contextPath}/News" class="nav-link" style="inline-size: max-content; margin: 0px !important">Home <span class="sr-only">(current)</span></a>
                            </li>
                            <li class="nav-item ${movie}">
                                <a href="${pageContext.request.contextPath}/MovieNews" class="nav-link" style="inline-size: max-content;">Movie News <span class="sr-only">(current)</span></a>
                            </li>
                            <li class="nav-item ${tv}">
                                <a href="${pageContext.request.contextPath}/TvNews" class="nav-link" style="inline-size: max-content;">TV News <span class="sr-only">(current)</span></a>
                            </li>
                            <li class="nav-item ${trailers}">
                                <a href="${pageContext.request.contextPath}/Trailers" class="nav-link" style="inline-size: max-content;">Trailers <span class="sr-only">(current)</span></a>
                            </li>
                            <li class="nav-item ${reviews}">
                                <a href="${pageContext.request.contextPath}/Reviews" class="nav-link" style="inline-size: max-content;">Reviews <span class="sr-only">(current)</span></a>
                            </li>
                            <li class="nav-item ${interviews}">
                                <a href="${pageContext.request.contextPath}/Interviews" class="nav-link" style="inline-size: max-content;">Interviews <span class="sr-only">(current)</span></a>
                            </li>
                            <li class="nav-item ${net}">
                                <a href="${pageContext.request.contextPath}/Netflix" class="nav-link" style="inline-size: max-content;">Netflix <span class="sr-only">(current)</span></a>
                            </li>
                            <li class="nav-item ${game}">
                                <a href="${pageContext.request.contextPath}/VideoGames" class="nav-link" style="inline-size: max-content;">Games <span class="sr-only">(current)</span></a>
                            </li>
                        </ul>
                    </div>
                </nav>
            </div>
        </div>
    </body>
</html>
