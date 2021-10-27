<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html id="backcolor" oncontextmenu="return false" ondragstart="return false" onselectstart="return false">

     <title>The seungha alone project</title>

    <head>
        <meta charset="utf-8" />
        <link rel="shortcut icon" href="/resources/assets/image/titleairplanicon.jpg">
        <link rel="stylesheet" type="text/css" href = "/resources/assets/css/4.mainpage.css">
        <script src="/resources/assets/js/2.jquery.min.js"></script>
        <script src="/resources/assets/js/3.main.js"></script>
        <script src="/resources/assets/js/4.member.js"></script>
    </head>

    <body>
        <c:if test="${member == null }">
            <div>
             <button id="ming22" type="button" class="registerBtn">회원가입</button>
             <button id="ming22" type="button" class="header_login">로그인</button>
            </div>
           </c:if>
        <c:if test="${member != null }">
            <div>
             <button id="ming22" type="button" class="mainlogoutBtn">로그아웃</button>
             <button id="ming22" type="button" class="header_memberupdate">${member.userId}님</button>
            </div>
           </c:if>

        <nav class = time_nav>
        <div>
            <p>TODAY</p>
            <p><span id="clock_month"></span>
            <span id="clock_day"></span>
            <span id="clock_year"></span></p></div>
        <div>
            <p>KST +09:00</p>
            <p><span id="clock_ampm"></span>
            <span id="clock_time"></span></p></div>
        <div>
            <p>location</p>
            <p>seoul</p>
        </div></nav>
        
        <div id="mainresetmid">
        <button id = 'mainreset' onclick="location.href='/'">Knowing nothing, ming2 of Story Storage</button>
    </div>

            <footer id = 'mainfooter'>
                <p>Copyright &copy; 2021 ALL Right Reserved    @The Simple  / Ming2</p>
            </footer>
</body>
</html>