<%-- 
    Document   : Most
    Created on : Jun 10, 2021, 5:46:19 AM
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
        <div class="col-md-3 animate-box" data-animate-effect="fadeInRight">
            <div>
                <div class="fh5co_heading fh5co_heading_border_bottom py-2 mb-4">Author</div>
            </div>
            <div class="clearfix"></div>
            <div class="fh5co_tags_all">
                <a href="#" class="fh5co_tagg">Ping Pong</a>
                <a href="#" class="fh5co_tagg">Black Rose</a>

            </div>
            <div>
                <div class="fh5co_heading fh5co_heading_border_bottom pt-3 py-2 mb-4">Most Popular</div>
            </div>
            <c:forEach items="${listTop}" var="i" begin="0" end="3">
                <div class="row pb-3">
                    <div class="col-5 align-self-center">

                        <img src="${i.cover}" alt="img" class="fh5co_most_trading"/>
                    </div>
                    <div class="col-7 paddding">
                        <div class="most_fh5co_treding_font"><a href="${pageContext.request.contextPath}/NewDetail?id=${i.id}" class="fh5co_magna py-2" style="font-size: 10px;"> ${i.title}</a></div>
                        <div class="most_fh5co_treding_font_123"> ${i.date}</div>
                    </div>
                </div>
            </c:forEach>  
        </div>
    </body>
</html>
