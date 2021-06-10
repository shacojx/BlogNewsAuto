<%-- 
    Document   : MovieNews
    Created on : Jun 10, 2021, 4:36:11 AM
    Author     : ShacoJX
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" class="no-js">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>24 News</title>
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
    </head>
    <body>
        <c:set var = "trailers" scope = "request" value = "active"/>
        <jsp:include page="Menu.jsp" />

        <div class="container-fluid pb-4 pt-4 paddding">
            <div class="container paddding">
                <div class="row mx-0">
                    <div class="col-md-8 animate-box" data-animate-effect="fadeInLeft">
                        <div>
                            <div class="fh5co_heading fh5co_heading_border_bottom py-2 mb-4">News</div>
                        </div>
                        <c:forEach items="${listNew}" var="i" begin="0" end="3">
                            <div class="row pb-4">
                                <div class="col-md-5">
                                    <div class="fh5co_hover_news_img">
                                        <div class="fh5co_news_img"><img src="${i.cover}" alt=""/></div>
                                        <div></div>
                                    </div>
                                </div>
                                <div class="col-md-7 animate-box">
                                    <a href="${pageContext.request.contextPath}/NewDetail?id=${i.id}" class="fh5co_magna py-2"> ${i.title}</a><br>
                                    <a href="${pageContext.request.contextPath}/NewDetail?id=${i.id}" class="fh5co_mini_time py-3"> [${i.type_new}] ${i.date}</a>
                                    <div class="fh5co_consectetur">
                                    </div>
                                </div>
                            </div>
                        </c:forEach>

                    </div>
                    <jsp:include page="Most.jsp" />
                </div>
                <div class="row mx-0">
                    <div class="row text-center pb-4 pt-4">
                        <c:if test = "${end < 2}">
                            <a href="${pageContext.request.contextPath}/${fuck}?index=1" class="btn_mange_pagging">&nbsp;&nbsp; Start : 1</a>      
                            <c:forEach begin="1" end="${end}" var="i">
                                <a href="${pageContext.request.contextPath}/${fuck}?index=${i}" class="btn_pagging" style="${i==index?"color: red;":""}"><c:out value = "${i}"/></a>
                            </c:forEach> 
                            <a href="${pageContext.request.contextPath}/${fuck}?index=${end}" class="btn_mange_pagging">End : ${end} </a>
                        </c:if>
                        <c:if test = "${index == 1}">
                            <a href="${pageContext.request.contextPath}/${fuck}?index=1" class="btn_mange_pagging">&nbsp;&nbsp; Start : 1</a>
                            <c:forEach begin="1" end="3" var="i">
                                <a href="${pageContext.request.contextPath}/${fuck}?index=${i}" class="btn_pagging" style="${i==index?"color: red;":""}"><c:out value = "${i}"/></a>
                            </c:forEach>
                            <a href="${pageContext.request.contextPath}/${fuck}?index=${end}" class="btn_mange_pagging">End : ${end} </a>
                        </c:if>
                        <c:if test = "${index == 2 && end < 5}">
                            <a href="${pageContext.request.contextPath}/${fuck}?index=1" class="btn_mange_pagging">&nbsp;&nbsp; Start : 1</a>
                            <c:forEach begin="1" end="1" var="i">
                                <a href="${pageContext.request.contextPath}/${fuck}?index=${i}" class="btn_pagging" style="${i==index?"color: red;":""}"><c:out value = "${i}"/></a>
                            </c:forEach>
                            <c:forEach begin="2" end="${end}" var="i">
                                <a href="${pageContext.request.contextPath}/${fuck}?index=${i}" class="btn_pagging" style="${i==index?"color: red;":""}"><c:out value = "${i}"/></a>
                            </c:forEach>
                            <a href="${pageContext.request.contextPath}/${fuck}?index=${end}" class="btn_mange_pagging">End : ${end} </a>
                        </c:if>
                        <c:if test = "${index == 2 && end >= 5}">
                            <a href="${pageContext.request.contextPath}/${fuck}?index=1" class="btn_mange_pagging">&nbsp;&nbsp; Start : 1</a>
                            <c:forEach begin="1" end="1" var="i">
                                <a href="${pageContext.request.contextPath}/${fuck}?index=${i}" class="btn_pagging" style="${i==index?"color: red;":""}"><c:out value = "${i}"/></a>
                            </c:forEach>
                            <c:forEach begin="2" end="5" var="i">
                                <a href="${pageContext.request.contextPath}/${fuck}?index=${i}" class="btn_pagging" style="${i==index?"color: red;":""}"><c:out value = "${i}"/></a>
                            </c:forEach>
                            <a href="${pageContext.request.contextPath}/${fuck}?index=${end}" class="btn_mange_pagging">End : ${end} </a>
                        </c:if>
                        <c:if test = "${index > 2 && index < end-1}">
                            <a href="${pageContext.request.contextPath}/${fuck}?index=1" class="btn_mange_pagging">&nbsp;&nbsp; Start : 1</a>
                            <c:forEach begin="${index-2}" end="${index-1}" var="i">
                                <a href="${pageContext.request.contextPath}/${fuck}?index=${i}" class="btn_pagging" style="${i==index?"color: red;":""}"><c:out value = "${i}"/></a>
                            </c:forEach>
                            <c:forEach begin="${index}" end="${index+2}" var="i">
                                <a href="${pageContext.request.contextPath}/${fuck}?index=${i}" class="btn_pagging" style="${i==index?"color: red;":""}"><c:out value = "${i}"/></a>
                            </c:forEach>
                            <a href="${pageContext.request.contextPath}/${fuck}?index=${end}" class="btn_mange_pagging">End : ${end} </a>
                        </c:if>
                        <c:if test = "${index == end-1 && index != 2}">
                            <a href="${pageContext.request.contextPath}/${fuck}?index=1" class="btn_mange_pagging">&nbsp;&nbsp; Start : 1</a>
                            <c:forEach begin="${index -2}" end="${index-1}" var="i">
                                <a href="${pageContext.request.contextPath}/${fuck}?index=${i}" class="btn_pagging" style="${i==index?"color: red;":""}"><c:out value = "${i}"/></a>
                            </c:forEach>
                            <c:forEach begin="${index}" end="${end}" var="i">
                                <a href="${pageContext.request.contextPath}/${fuck}?index=${i}" class="btn_pagging" style="${i==index?"color: red;":""}"><c:out value = "${i}"/></a>
                            </c:forEach>
                            <a href="${pageContext.request.contextPath}/${fuck}?index=${end}" class="btn_mange_pagging">End : ${end} </a>
                        </c:if>
                        <c:if test = "${index == end}">
                            <a href="${pageContext.request.contextPath}/${fuck}?index=1" class="btn_mange_pagging">&nbsp;&nbsp; Start : 1</a>
                            <c:forEach begin="${index-2}" end="${index}" var="i">
                                <a href="${pageContext.request.contextPath}/${fuck}?index=${i}" class="btn_pagging" style="${i==index?"color: red;":""}"><c:out value = "${i}"/></a>
                            </c:forEach>
                            <a href="${pageContext.request.contextPath}/${fuck}?index=${end}" class="btn_mange_pagging">End : ${end} </a>
                        </c:if>
                    </div>
                </div>
            </div>
        </div>
        <div class="container-fluid pb-4 pt-5">
            <div class="container animate-box">
                <div>
                    <div class="fh5co_heading fh5co_heading_border_bottom py-2 mb-4">Trending</div>
                </div>
                <div class="owl-carousel owl-theme" id="slider2">
                    <c:forEach items="${listTop}" var="i" begin="0" end="3">
                        <div class="item px-2">
                            <div class="fh5co_hover_news_img">
                                <div class="fh5co_news_img"><img src="${i.cover}" alt=""/></div>
                                <div>
                                    <a href="${pageContext.request.contextPath}/NewDetail?id=${i.id}" class="d-block fh5co_small_post_heading"><span class="">${i.title}</span></a>
                                    <div class="c_g"><i class="fa fa-clock-o"></i>[${i.type}] ${i.date}</div>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
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
