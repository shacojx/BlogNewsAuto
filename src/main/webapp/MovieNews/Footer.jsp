<%-- 
    Document   : Footer
    Created on : Jun 10, 2021, 2:09:50 AM
    Author     : ShacoJX
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container-fluid fh5co_footer_bg pb-3">
            <div class="container animate-box">
                <div class="row">
                    <div class="col-12 spdp_right py-5"></div>
                    <div class="clearfix"></div>
                    <div class="col-12 col-md-4 col-lg-3">
                        <div class="footer_main_title py-3"> About</div>
                        <div class="footer_sub_about pb-3"> C4K is the best movie news in the world. We always update the latest news.<br>Contact: c4kstudio@gmail.com
                        </div>
                        <div class="footer_mediya_icon">
                            <div class="text-center d-inline-block"><a href="https://www.linkedin.com/" class="fh5co_display_table_footer">
                                    <div class="fh5co_verticle_middle"><i class="fa fa-linkedin"></i></div>
                                </a></div>
                            <div class="text-center d-inline-block"><a href="https://www.google.com/" class="fh5co_display_table_footer">
                                    <div class="fh5co_verticle_middle"><i class="fa fa-google-plus"></i></div>
                                </a></div>
                            <div class="text-center d-inline-block"><a href="https://twitter.com/" class="fh5co_display_table_footer">
                                    <div class="fh5co_verticle_middle"><i class="fa fa-twitter"></i></div>
                                </a></div>
                            <div class="text-center d-inline-block"><a href="https://fb.com/" class="fh5co_display_table_footer">
                                    <div class="fh5co_verticle_middle"><i class="fa fa-facebook"></i></div>
                                </a></div>
                        </div>
                    </div>
                    <div class="col-12 col-md-3 col-lg-2">
                        <div class="footer_main_title py-3"> Category</div>
                        <ul class="footer_menu">
                            <li><a href="${pageContext.request.contextPath}/MovieNews" class=""><i class="fa fa-angle-right"></i>&nbsp;&nbsp; Movie News</a></li>
                            <li><a href="${pageContext.request.contextPath}/TvNews" class=""><i class="fa fa-angle-right"></i>&nbsp;&nbsp; TV News</a></li>
                            <li><a href="${pageContext.request.contextPath}/Trailers" class=""><i class="fa fa-angle-right"></i>&nbsp;&nbsp; Trailers</a></li>
                            <li><a href="${pageContext.request.contextPath}/Reviews" class=""><i class="fa fa-angle-right"></i>&nbsp;&nbsp; Reviews</a></li>
                            <li><a href="${pageContext.request.contextPath}/Interviews" class=""><i class="fa fa-angle-right"></i>&nbsp;&nbsp; Interviews</a></li>
                            <li><a href="${pageContext.request.contextPath}/Netflix" class=""><i class="fa fa-angle-right"></i>&nbsp;&nbsp; Netflix</a></li>
                            <li><a href="${pageContext.request.contextPath}/VideoGames" class=""><i class="fa fa-angle-right"></i>&nbsp;&nbsp; Games</a></li>
                        </ul>
                    </div>
                    <div class="col-12 col-md-5 col-lg-3 position_footer_relative">
                        <div class="footer_main_title py-3"> Most Viewed Posts</div>
                        <c:forEach items="${listTop}" var="i" begin="0" end="2">
                            <div class="footer_makes_sub_font" style="font-size: 10px;"> ${i.date}</div>
                            <a href="${pageContext.request.contextPath}/NewDetail?id=${i.id}" class="footer_post pb-4" style="font-size: 10px;"> ${i.title} </a>
                        </c:forEach>
                        <div class="footer_position_absolute"><img src="${pageContext.request.contextPath}/MovieNews/images/footer_sub_tipik.png" alt="img" class="width_footer_sub_img"/></div>
                    </div>
                    <div class="col-12 col-md-12 col-lg-4 ">
                        <div class="footer_main_title py-3"> Last Posts</div>
                        <c:forEach items="${listNew}" var="i" begin="0" end="8">
                            <a href="${pageContext.request.contextPath}/NewDetail?id=${i.id}" class="footer_img_post_6"><img src="${i.cover}" alt="img"/></a>
                            </c:forEach>


                    </div>
                </div>

            </div>
        </div>
        <div class="container-fluid fh5co_footer_right_reserved">
            <div class="container">
                <div class="row  ">
                    <div class="col-12 col-md-6 py-4 Reserved"> © Copyright by <a href="#" title="EOG">C4K Studio</a> </div>
                    <div class="col-12 col-md-6 spdp_left py-4">
<!--                        <a href="${pageContext.request.contextPath}/News" class="footer_last_part_menu">Home</a>                     -->
                    </div>
                </div>
            </div>
    </body>
</html>
