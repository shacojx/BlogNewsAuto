<%-- 
    Document   : NewSec
    Created on : Aug 3, 2020, 3:39:16 PM
    Author     : Admin
--%>
<%@page import="Entity.Account"%>
<%@page import="Model.AccDAO"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

        <title>News Movies</title>

        <!-- Google font -->
        <link href="${pageContext.request.contextPath}/News/local.css" rel="stylesheet"> 

        <!-- Bootstrap -->
        <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/News/css/bootstrap.min.css"/>

        <!-- Font Awesome Icon -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/News/css/font-awesome.min.css">

        <!-- Custom stlylesheet -->
        <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/News/css/style.css"/>

        <style>
            hr.new1 {
                border: 1px solid gray;
            }
            .site-footer
            {
                background-color:#26272b;
                padding:45px 0 20px;
                font-size:15px;
                line-height:24px;
                color:#737373;
            }
            .site-footer hr
            {
                border-top-color:#bbb;
                opacity:0.5
            }
            .site-footer hr.small
            {
                margin:20px 0
            }
            .site-footer h6
            {
                color:#fff;
                font-size:16px;
                text-transform:uppercase;
                margin-top:5px;
                letter-spacing:2px
            }
            .site-footer a
            {
                color:#737373;
            }
            .site-footer a:hover
            {
                color:#3366cc;
                text-decoration:none;
            }
            .footer-links
            {
                padding-left:0;
                list-style:none
            }
            .footer-links li
            {
                display:block
            }
            .footer-links a
            {
                color:#737373
            }
            .footer-links a:active,.footer-links a:focus,.footer-links a:hover
            {
                color:#3366cc;
                text-decoration:none;
            }
            .footer-links.inline li
            {
                display:inline-block
            }
            .site-footer .social-icons
            {
                text-align:right
            }
            .site-footer .social-icons a
            {
                width:40px;
                height:40px;
                line-height:40px;
                margin-left:6px;
                margin-right:0;
                border-radius:100%;
                background-color:#33353d
            }
            .copyright-text
            {
                margin:0
            }
            @media (max-width:991px)
            {
                .site-footer [class^=col-]
                {
                    margin-bottom:30px
                }
            }
            @media (max-width:767px)
            {
                .site-footer
                {
                    padding-bottom:0
                }
                .site-footer .copyright-text,.site-footer .social-icons
                {
                    text-align:center
                }
            }
            .social-icons
            {
                padding-left:0;
                margin-bottom:0;
                list-style:none
            }
            .social-icons li
            {
                display:inline-block;
                margin-bottom:4px
            }
            .social-icons li.title
            {
                margin-right:15px;
                text-transform:uppercase;
                color:#96a2b2;
                font-weight:700;
                font-size:13px
            }
            .social-icons a{
                background-color:#eceeef;
                color:#818a91;
                font-size:16px;
                display:inline-block;
                line-height:44px;
                width:44px;
                height:44px;
                text-align:center;
                margin-right:8px;
                border-radius:100%;
                -webkit-transition:all .2s linear;
                -o-transition:all .2s linear;
                transition:all .2s linear
            }
            .social-icons a:active,.social-icons a:focus,.social-icons a:hover
            {
                color:#fff;
                background-color:#29aafe
            }
            .social-icons.size-sm a
            {
                line-height:34px;
                height:34px;
                width:34px;
                font-size:14px
            }
            .social-icons a.facebook:hover
            {
                background-color:#3b5998
            }
            .social-icons a.twitter:hover
            {
                background-color:#00aced
            }
            .social-icons a.linkedin:hover
            {
                background-color:#007bb6
            }
            .social-icons a.dribbble:hover
            {
                background-color:#ea4c89
            }
            @media (max-width:767px)
            {
                .social-icons li.title
                {
                    display:block;
                    margin-right:0;
                    font-weight:600
                }
            }
        </style>

    </head>
    <body>

        <jsp:include page="Menu.jsp" />

        <!-- section -->
        <div class="section">
            <!-- container -->
            <div class="container">

                <!-- row -->
                <div class="row">
                    <div class="col-md-12">
                        <div class="section-title">
                            <h4>LAST</h4>
                            <hr class="new1">
                        </div>
                        <div class="row">
                            <c:forEach items="${listNew}" var="i" begin="0" end="1">
                                <!-- post -->
                                <div class="col-md-6">
                                    <div class="post">
                                        <a class="post-img" href="${pageContext.request.contextPath}/NewDetail?id=${i.id}"><img class="img-responsive" src="${i.cover}" alt="" style="height: 300px;"></a>
                                        <div class="post-body">
                                            <div class="post-meta">
                                                <a class="post-category cat-1" href="${pageContext.request.contextPath}/NewWorld"><c:out value = "${i.type_new}"/></a>
                                                <span class="post-date">${i.date}</span>
                                            </div>
                                            <h3 class="post-title"><a href="${pageContext.request.contextPath}/NewDetail?id=${i.id}"><c:out value = "${i.title}"/></a></h3>
                                        </div>
                                    </div>
                                </div>
                                <!-- /post -->
                            </c:forEach>
                            <div class="clearfix visible-md visible-lg"></div>
                        </div>
                        <div class="row">
                            <c:forEach items="${listNew}" var="i" begin="2" end="3">
                                <!-- post -->
                                <div class="col-md-6">
                                    <div class="post">
                                        <a class="post-img" href="${pageContext.request.contextPath}/NewDetail?id=${i.id}"><img class="img-responsive" src="${i.cover}" alt="" style="height: 300px;"></a>
                                        <div class="post-body">
                                            <div class="post-meta">
                                                <a class="post-category cat-1" href="${pageContext.request.contextPath}/NewWorld"><c:out value = "${i.type_new}"/></a>
                                                <span class="post-date">${i.date}</span>
                                            </div>
                                            <h3 class="post-title"><a href="${pageContext.request.contextPath}/NewDetail?id=${i.id}"><c:out value = "${i.title}"/></a></h3>
                                        </div>
                                    </div>
                                </div>
                                <!-- /post -->
                            </c:forEach>
                            <div class="clearfix visible-md visible-lg"></div>
                        </div>
                        <div class="row">
                            <c:forEach items="${listNew}" var="i" begin="4" end="5">
                                <!-- post -->
                                <div class="col-md-6">
                                    <div class="post">
                                        <a class="post-img" href="${pageContext.request.contextPath}/NewDetail?id=${i.id}"><img class="img-responsive" src="${i.cover}" alt="" style="height: 300px;"></a>
                                        <div class="post-body">
                                            <div class="post-meta">
                                                <a class="post-category cat-1" href="${pageContext.request.contextPath}/NewWorld"><c:out value = "${i.type_new}"/></a>
                                                <span class="post-date">${i.date}</span>
                                            </div>
                                            <h3 class="post-title"><a href="${pageContext.request.contextPath}/NewDetail?id=${i.id}"><c:out value = "${i.title}"/></a></h3>
                                        </div>
                                    </div>
                                </div>
                                <!-- /post -->
                            </c:forEach>
                            <div class="clearfix visible-md visible-lg"></div>
                        </div>
                    </div>
                  
                    
                </div>
                <!-- /row -->


            </div>
            <!-- /container -->
        </div>
        <!-- /section -->


        <c:if test = "${end < 2}">
            <div class="container" style="margin-left: 20%">                  
                <ul class="pagination">
                    <li class="page-item"><a href="${pageContext.request.contextPath}/Reviews?index=1">Start: 1</a></li>
                        <c:forEach begin="1" end="${end}" var="i">
                        <li class="${i==index?"active":""}" class="page-item"><a class="${i==index?"active":""}" href="${pageContext.request.contextPath}/Reviews?index=${i}"><c:out value = "${i}"/></a></li>
                        </c:forEach>
                    <li class="page-item"><a href="${pageContext.request.contextPath}/Reviews?index=${end}">End: <c:out value = "${end}"/></a></li>
                </ul>
            </div>
        </c:if>
        <c:if test = "${index ==1}">
            <div class="container" style="margin-left: 20%">                  
                <ul class="pagination">
                    <li class="page-item"><a href="${pageContext.request.contextPath}/Reviews?index=1">Start: 1</a></li>
                        <c:forEach begin="1" end="3" var="i">
                        <li class="${i==index?"active":""}" class="page-item"><a class="${i==index?"active":""}" href="${pageContext.request.contextPath}/Reviews?index=${i}"><c:out value = "${i}"/></a></li>
                        </c:forEach>
                    <li class="page-item"><a class="page-link" href="${pageContext.request.contextPath}/Reviews?index=${index+1}"> >> </a></li>
                    <li class="page-item"><a href="${pageContext.request.contextPath}/Reviews?index=${end}">End: <c:out value = "${end}"/></a></li>
                </ul>
            </div>
        </c:if>
        <c:if test = "${index == 2}">
            <div class="container" style="margin-left: 20%">                  
                <ul class="pagination">
                    <li class="page-item"><a href="${pageContext.request.contextPath}/Reviews?index=1">Start: 1</a></li>
                    <li class="page-item"><a class="page-link" href="${pageContext.request.contextPath}/Reviews?index=${index-1}"> << </a></li>
                        <c:forEach begin="1" end="1" var="i">
                        <li class="${i==index?"active":""}" class="page-item"><a class="${i==index?"active":""}" href="${pageContext.request.contextPath}/Reviews?index=${i}"><c:out value = "${i}"/></a></li>
                        </c:forEach>
                        <c:forEach begin="2" end="4" var="i">
                        <li class="${i==index?"active":""}" class="page-item"><a class="${i==index?"active":""}" href="${pageContext.request.contextPath}/Reviews?index=${i}"><c:out value = "${i}"/></a></li>
                        </c:forEach>
                    <li class="page-item"><a class="page-link" href="${pageContext.request.contextPath}/Reviews?index=${index+1}"> >> </a></li>
                    <li class="page-item"><a href="${pageContext.request.contextPath}/Reviews?index=${end}">End: <c:out value = "${end}"/></a></li>
                </ul>
            </div>
        </c:if>
        <c:if test = "${index > 2 && index < end-1}">
            <div class="container" style="margin-left: 20%">                  
                <ul class="pagination">
                    <li class="page-item"><a href="${pageContext.request.contextPath}/Reviews?index=1">Start: 1</a></li>
                    <li class="page-item"><a class="page-link" href="${pageContext.request.contextPath}/Reviews?index=${index-1}"> << </a></li>
                        <c:forEach begin="${index-2}" end="${index-1}" var="i">
                        <li class="${i==index?"active":""}" class="page-item"><a class="${i==index?"active":""}" href="${pageContext.request.contextPath}/Reviews?index=${i}"><c:out value = "${i}"/></a></li>
                        </c:forEach>
                        <c:forEach begin="${index}" end="${index+2}" var="i">
                        <li class="${i==index?"active":""}" class="page-item"><a class="${i==index?"active":""}" href="${pageContext.request.contextPath}/Reviews?index=${i}"><c:out value = "${i}"/></a></li>
                        </c:forEach>
                    <li class="page-item"><a class="page-link" href="${pageContext.request.contextPath}/Reviews?index=${index+1}"> >> </a></li>
                    <li class="page-item"><a href="${pageContext.request.contextPath}/Reviews?index=${end}">End: <c:out value = "${end}"/></a></li>
                </ul>
            </div>
        </c:if>
        <c:if test = "${index == end-1}">
            <div class="container" style="margin-left: 20%">                  
                <ul class="pagination">
                    <li class="page-item"><a href="${pageContext.request.contextPath}/Reviews?index=1">Start: 1</a></li>
                    <li class="page-item"><a class="page-link" href="${pageContext.request.contextPath}/Reviews?index=${index-1}"> << </a></li>

                    <c:forEach begin="${index -2}" end="${index-1}" var="i">
                        <li class="${i==index?"active":""}" class="page-item"><a class="${i==index?"active":""}" href="${pageContext.request.contextPath}/Reviews?index=${i}"><c:out value = "${i}"/></a></li>
                        </c:forEach>
                        <c:forEach begin="${index}" end="${end}" var="i">
                        <li class="${i==index?"active":""}" class="page-item"><a class="${i==index?"active":""}" href="${pageContext.request.contextPath}/Reviews?index=${i}"><c:out value = "${i}"/></a></li>
                        </c:forEach>

                    <li class="page-item"><a href="${pageContext.request.contextPath}/Reviews?index=${end}">End: <c:out value = "${end}"/></a></li>
                </ul>
            </div>
        </c:if>
        <c:if test = "${index == end}">
            <div class="container" style="margin-left: 20%">                  
                <ul class="pagination">
                    <li class="page-item"><a href="${pageContext.request.contextPath}/Reviews?index=1">Start: 1</a></li>
                    <li class="page-item"><a class="page-link" href="${pageContext.request.contextPath}/Reviews?index=${index-1}"> << </a></li>

                    <c:forEach begin="${index-2}" end="${index}" var="i">
                        <li class="${i==index?"active":""}" class="page-item"><a class="${i==index?"active":""}" href="${pageContext.request.contextPath}/Reviews?index=${i}"><c:out value = "${i}"/></a></li>
                        </c:forEach>

                    <li class="page-item"><a href="${pageContext.request.contextPath}/Reviews?index=${end}">End: <c:out value = "${end}"/></a></li>
                </ul>
            </div>
        </c:if>


        <!-- Footer -->
        <jsp:include page="Footer.jsp" />
        <!-- /Footer -->

        <!-- jQuery Plugins -->
        <script src="${pageContext.request.contextPath}/News/js/jquery.min.js"></script>
        <script src="${pageContext.request.contextPath}/News/js/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/News/js/main.js"></script>

    </body>
</html>

