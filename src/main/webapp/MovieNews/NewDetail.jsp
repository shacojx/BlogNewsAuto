<%-- 
    Document   : NewDetail
    Created on : Jun 10, 2021, 5:35:13 AM
    Author     : ShacoJX
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en" class="no-js">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta property="og:image" content="${Ne.cover}">
        <meta property="og:title" content="${Ne.title}">
        <meta property="og:description" content="${Ne.title}">
        <link rel="icon" href="${pageContext.request.contextPath}/MovieNews/images/ic4k.png" type="image/gif" sizes="32x32">
        <title>${Ne.title}</title>
        <link href="${pageContext.request.contextPath}/MovieNews/css/media_query.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/MovieNews/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet"
              integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <link href="${pageContext.request.contextPath}/MovieNews/css/animate.css" rel="stylesheet" type="text/css"/>
        <link href="https://fonts.googleapis.com/css?family=Poppins" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/MovieNews/css/owl.carousel.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/MovieNews/css/owl.theme.default.css" rel="stylesheet" type="text/css"/>
        <!-- Bootstrap CSS -->
        <link href="${pageContext.request.contextPath}/MovieNews/css/style_1.css" rel="stylesheet" type="text/css"/>
        <!-- Modernizr JS -->
        <script src="${pageContext.request.contextPath}/MovieNews/js/modernizr-3.5.0.min.js"></script>
        <style>
            .xxx img {
                margin-bottom: 2%;
            }
        </style>
    </head>
    <body class="single">

        <jsp:include page="Menu.jsp" />

        <div id="fh5co-title-box" style="background-image: url('${Ne.cover}'); background-position: 50% 0.0px;" data-stellar-background-ratio="0.5">
            <div class="overlay"></div>
            <div class="page-title">

                <span>${Ne.date}</span>
                <span>${Ne.type_new}</span>
            </div>
        </div>
        <div id="fh5co-single-content" class="container-fluid pb-4 pt-4 paddding">
            <div class="container paddding">
                <div class="row mx-0">
                    <div class="col-md-8 animate-box" data-animate-effect="fadeInLeft">
                        <div><h3>${Ne.title}</h3></div><br>
                        <div class="xxx">
                            ${Ne.content}       
                        </div>

                    </div>

                    <jsp:include page="Most.jsp" />

                </div>
            </div>
        </div>


        <!-- Footer -->
        <jsp:include page="Footer.jsp" />
        <!-- /Footer -->

        <div class="gototop js-top">
            <a href="#" class="js-gotop"><i class="fa fa-arrow-up"></i></a>
        </div>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="${pageContext.request.contextPath}/MovieNews/js/owl.carousel.min.js"></script>
        <!--<script src="https://code.jquery.com/jquery-3.1.1.slim.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>-->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js"
                integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb"
        crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js"
                integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn"
        crossorigin="anonymous"></script>
        <!-- Waypoints -->
        <script src="${pageContext.request.contextPath}/MovieNews/js/jquery.waypoints.min.js"></script>
        <!-- Parallax -->
        <script src="${pageContext.request.contextPath}/MovieNews/js/jquery.stellar.min.js"></script>
        <!-- Main -->
        <script src="${pageContext.request.contextPath}/MovieNews/js/main.js"></script>
        <script>if (!navigator.userAgent.match(/Android|BlackBerry|iPhone|iPad|iPod|Opera Mini|IEMobile/i)) {
                $(window).stellar();
            }</script>

    </body>
</html>
