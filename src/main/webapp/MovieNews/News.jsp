<%-- 
    Document   : News
    Created on : Jun 10, 2021, 1:51:58 AM
    Author     : ShacoJX
--%>
<%@page import="Model.NewDAO"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" class="no-js">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta property="og:image" content="${pageContext.request.contextPath}/MovieNews/images/CC4K2.PNG">
        <meta property="og:title" content="Movie News">
        <meta property="og:description" content="Movie News">
        <title>Home</title>
        <link rel="icon" href="${pageContext.request.contextPath}/MovieNews/images/ic4k.png" type="image/gif" sizes="32x32">
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
        <!-- Global site tag (gtag.js) - Google Analytics -->
        <script async src="https://www.googletagmanager.com/gtag/js?id=G-MFZLP1746C"></script>
        <script>
            window.dataLayer = window.dataLayer || [];
            function gtag() {
                dataLayer.push(arguments);
            }
            gtag('js', new Date());

            gtag('config', 'G-MFZLP1746C');
        </script>

    </head>
    <body>
        <c:set var = "home" scope = "request" value = "active"/>
        <jsp:include page="Menu.jsp" />
        <div class="container-fluid paddding mb-5">
            <div class="row mx-0">
                <div class="col-md-6 col-12 paddding animate-box" data-animate-effect="fadeIn">
                    <c:forEach items="${listNew}" var="i" begin="0" end="0">

                        <a href="${pageContext.request.contextPath}/a?a=${i.id}"><div class="fh5co_suceefh5co_height"><img style="object-fit: cover;" src="${i.cover}" alt="img" class="responsive"/>
                                <div class="fh5co_suceefh5co_height_position_absolute"></div>
                                <div class="fh5co_suceefh5co_height_position_absolute_font">
                                    <div class="" style="white-space: nowrap; width: 90%; overflow: hidden; text-overflow: ellipsis;"><a href="${pageContext.request.contextPath}/a?a=${i.id}" class="color_fff"> <i class="fa fa-clock-o"></i>&nbsp;&nbsp;[${i.type_new}] ${i.date}
                                        </a></div>
                                    <div class="" style="white-space: nowrap; width: 90%; overflow: hidden; text-overflow: ellipsis;"><a href="${pageContext.request.contextPath}/a?a=${i.id}" class="fh5co_good_font"> ${i.title} </a></div>
                                </div>
                            </div></a>
                        </c:forEach>
                </div>

                <div class="col-md-6">
                    <div class="row">
                        <c:forEach items="${listNew}" var="i" begin="1" end="4">
                            <a href="${pageContext.request.contextPath}/a?a=${i.id}"><div class="col-md-6 col-6 paddding animate-box" data-animate-effect="fadeIn">
                                    <div class="fh5co_suceefh5co_height_2"><img style="object-fit: cover;" src="${i.cover}" alt="img" />
                                        <div class="fh5co_suceefh5co_height_position_absolute"></div>
                                        <div class="fh5co_suceefh5co_height_position_absolute_font_2">
                                            <div class="" style="white-space: nowrap; width: 90%; overflow: hidden; text-overflow: ellipsis;"><a href="${pageContext.request.contextPath}/a?a=${i.id}" class="color_fff"> <i class="fa fa-clock-o"></i>&nbsp;&nbsp;[${i.type_new}] ${i.date}</a></div>
                                            <div class="" style="white-space: nowrap; width: 90%; overflow: hidden; text-overflow: ellipsis;"><a href="${pageContext.request.contextPath}/a?a=${i.id}" class="fh5co_good_font_2" > ${i.title} </a></div>
                                        </div>
                                    </div>
                                </div></a>
                            </c:forEach>
                    </div>
                </div>
            </div>
        </div>
        <div class="container-fluid pt-3">
            <div class="container animate-box" data-animate-effect="fadeIn">
                <div>
                    <div class="fh5co_heading fh5co_heading_border_bottom py-2 mb-4">Trending</div>
                </div>
                <div class="owl-carousel owl-theme js" id="slider1">
                    <c:forEach items="${listTop}" var="i" begin="0" end="3">
                        <div class="item px-2">
                            <a href="${pageContext.request.contextPath}/a?a=${i.id}"><div class="fh5co_latest_trading_img_position_relative">
                                    <div class="fh5co_latest_trading_img"><img src="${i.cover}" alt=""
                                                                               class="fh5co_img_special_relative"/></div>
                                    <div class="fh5co_latest_trading_img_position_absolute"></div>
                                    <div class="fh5co_latest_trading_img_position_absolute_1" style="white-space: nowrap; width: 90%; overflow: hidden; text-overflow: ellipsis;" >
                                        <a href="${pageContext.request.contextPath}/a?a=${i.id}" class="text-white"> ${i.title} </a>
                                        <div class="fh5co_latest_trading_date_and_name_color"> [${i.type}] ${i.date}</div>
                                    </div>
                                </div></a>
                        </div>
                    </c:forEach>
                </div>
            </div>
        </div>
        <div class="container-fluid pb-4 pt-5">
            <div class="container animate-box">
                <div>
                    <div class="fh5co_heading fh5co_heading_border_bottom py-2 mb-4">News</div>
                </div>
                <div class="owl-carousel owl-theme" id="slider2">
                    <c:forEach items="${listNew}" var="i" begin="5" end="7">
                        <div class="item px-2">
                            <a href="${pageContext.request.contextPath}/a?a=${i.id}"><div class="fh5co_hover_news_img">
                                    <div class="fh5co_news_img"><img src="${i.cover}" alt=""/></div>
                                    <div>
                                        <a href="${pageContext.request.contextPath}/a?a=${i.id}" class="d-block fh5co_small_post_heading"><span class="">${i.title}</span></a>
                                        <div class="c_g"><i class="fa fa-clock-o"></i> [${i.type_new}] ${i.date}</div>
                                    </div>
                                </div></a>
                        </div>
                    </c:forEach>


                </div>
            </div>
        </div>

        <div class="container-fluid pb-4 pt-4 paddding">
            <div class="container paddding">
                <div class="row mx-0">
                    <div class="col-md-8 animate-box" data-animate-effect="fadeInLeft">
                        <div>
                            <div class="fh5co_heading fh5co_heading_border_bottom py-2 mb-4">News</div>
                        </div>
                        <c:forEach items="${listNew}" var="i" begin="8" end="11">
                            <div class="row pb-4">
                                <div class="col-md-5">
                                    <div class="fh5co_hover_news_img">
                                        <a href="${pageContext.request.contextPath}/a?a=${i.id}"><div class="fh5co_news_img"><img src="${i.cover}" alt=""/></div></a>
                                        <div></div>
                                    </div>
                                </div>
                                <div class="col-md-7 animate-box">
                                    <a href="${pageContext.request.contextPath}/a?a=${i.id}" class="fh5co_magna py-2"> ${i.title}</a><br>
                                    <a href="${pageContext.request.contextPath}/a?a=${i.id}" class="fh5co_mini_time py-3"> [${i.type_new}] ${i.date} </a>
                                    <div class="fh5co_consectetur">
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                    <jsp:include page="Most.jsp" />
                </div>
                <div class="row mx-0 animate-box" data-animate-effect="fadeInUp" style="overflow: hidden;">
                    <div class="row text-center pb-4 pt-4">

                        <c:if test = "${end < 2}">
                            <a href="${pageContext.request.contextPath}/News?index=1" class="btn_mange_pagging">&nbsp;&nbsp; Start : 1</a>      
                            <c:forEach begin="1" end="${end}" var="i">
                                <a href="${pageContext.request.contextPath}/News?index=${i}" class="btn_pagging" style="${i==index?"color: red;":""}"><c:out value = "${i}"/></a>
                            </c:forEach> 
                            <a href="${pageContext.request.contextPath}/News?index=${end}" class="btn_mange_pagging">End : ${end} </a>
                        </c:if>
                        <c:if test = "${index == 1}">
                            <a href="${pageContext.request.contextPath}/News?index=1" class="btn_mange_pagging">&nbsp;&nbsp; Start : 1</a>
                            <c:forEach begin="1" end="3" var="i">
                                <a href="${pageContext.request.contextPath}/News?index=${i}" class="btn_pagging" style="${i==index?"color: red;":""}"><c:out value = "${i}"/></a>
                            </c:forEach>
                            <a href="${pageContext.request.contextPath}/News?index=${end}" class="btn_mange_pagging">End : ${end} </a>
                        </c:if>
                        <c:if test = "${index == 2 && end < 5}">
                            <a href="${pageContext.request.contextPath}/News?index=1" class="btn_mange_pagging">&nbsp;&nbsp; Start : 1</a>
                            <c:forEach begin="1" end="1" var="i">
                                <a href="${pageContext.request.contextPath}/News?index=${i}" class="btn_pagging" style="${i==index?"color: red;":""}"><c:out value = "${i}"/></a>
                            </c:forEach>
                            <c:forEach begin="2" end="${end}" var="i">
                                <a href="${pageContext.request.contextPath}/News?index=${i}" class="btn_pagging" style="${i==index?"color: red;":""}"><c:out value = "${i}"/></a>
                            </c:forEach>
                            <a href="${pageContext.request.contextPath}/News?index=${end}" class="btn_mange_pagging">End : ${end} </a>
                        </c:if>
                        <c:if test = "${index == 2 && end >= 5}">
                            <a href="${pageContext.request.contextPath}/News?index=1" class="btn_mange_pagging">&nbsp;&nbsp; Start : 1</a>
                            <c:forEach begin="1" end="1" var="i">
                                <a href="${pageContext.request.contextPath}/News?index=${i}" class="btn_pagging" style="${i==index?"color: red;":""}"><c:out value = "${i}"/></a>
                            </c:forEach>
                            <c:forEach begin="2" end="5" var="i">
                                <a href="${pageContext.request.contextPath}/News?index=${i}" class="btn_pagging" style="${i==index?"color: red;":""}"><c:out value = "${i}"/></a>
                            </c:forEach>
                            <a href="${pageContext.request.contextPath}/News?index=${end}" class="btn_mange_pagging">End : ${end} </a>
                        </c:if>
                        <c:if test = "${index > 2 && index < end-1}">
                            <a href="${pageContext.request.contextPath}/News?index=1" class="btn_mange_pagging">&nbsp;&nbsp; Start : 1</a>
                            <c:forEach begin="${index-2}" end="${index-1}" var="i">
                                <a href="${pageContext.request.contextPath}/News?index=${i}" class="btn_pagging" style="${i==index?"color: red;":""}"><c:out value = "${i}"/></a>
                            </c:forEach>
                            <c:forEach begin="${index}" end="${index+2}" var="i">
                                <a href="${pageContext.request.contextPath}/News?index=${i}" class="btn_pagging" style="${i==index?"color: red;":""}"><c:out value = "${i}"/></a>
                            </c:forEach>
                            <a href="${pageContext.request.contextPath}/News?index=${end}" class="btn_mange_pagging">End : ${end} </a>
                        </c:if>
                        <c:if test = "${index == end-1 && index != 2}">
                            <a href="${pageContext.request.contextPath}/News?index=1" class="btn_mange_pagging">&nbsp;&nbsp; Start : 1</a>
                            <c:forEach begin="${index -2}" end="${index-1}" var="i">
                                <a href="${pageContext.request.contextPath}/News?index=${i}" class="btn_pagging" style="${i==index?"color: red;":""}"><c:out value = "${i}"/></a>
                            </c:forEach>
                            <c:forEach begin="${index}" end="${end}" var="i">
                                <a href="${pageContext.request.contextPath}/News?index=${i}" class="btn_pagging" style="${i==index?"color: red;":""}"><c:out value = "${i}"/></a>
                            </c:forEach>
                            <a href="${pageContext.request.contextPath}/News?index=${end}" class="btn_mange_pagging">End : ${end} </a>
                        </c:if>
                        <c:if test = "${index == end}">
                            <a href="${pageContext.request.contextPath}/News?index=1" class="btn_mange_pagging">&nbsp;&nbsp; Start : 1</a>
                            <c:forEach begin="${index-2}" end="${index}" var="i">
                                <a href="${pageContext.request.contextPath}/News?index=${i}" class="btn_pagging" style="${i==index?"color: red;":""}"><c:out value = "${i}"/></a>
                            </c:forEach>
                            <a href="${pageContext.request.contextPath}/News?index=${end}" class="btn_mange_pagging">End : ${end} </a>
                        </c:if>

                    </div>
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
        <!-- Main -->
        <script src="${pageContext.request.contextPath}/MovieNews/js/main.js"></script>

    </body>
</html>
