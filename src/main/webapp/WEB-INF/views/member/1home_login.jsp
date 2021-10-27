<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
     <title>The seungha alone project</title>
     <head>
        <meta charset="utf-8">
        <link rel="shortcut icon" href="/resources/assets/image/titleairplanicon.jpg">
        <link rel="stylesheet" type="text/css" href = "/resources/assets/css/6.login.css">
        
         <script src="/resources/assets/js/2.jquery.min.js"></script>
         <script src="/resources/assets/js/3.main.js"></script>
         <script src="/resources/assets/js/4.member.js"></script>
         
    </head>
    
    <body>
      <div class="header" oncontextmenu="return false" ondragstart="return false" onselectstart="return false">
       <div id = "mingresetmid">
        <button id = 'mingreset' onclick="location.href='/'">Knowing nothing, ming2 of Story Storage</button>
       </div>
       <div id = "clock_weather">
           <div class="time_nav">
            <div>
                <p>TODAY</p>
                <p><span id="clock_month"></span> <span id="clock_day"></span> <span id="clock_year"></span></p>
            </div>
            <div>
               <p>KST(+)09:00</p>
               <p><span id="clock_ampm"></span> <span id="clock_time"></span></p>
            </div>
            <div>
                <p>LOCATION</p>
                <p>KOREA : SEOUL</p>
            </div>
           </div>
       </div>
      </div>

        <hr style="border : 1px inset #1b1b1b"id="hr_line" >
        

        <form action="/login" method="post" id="login_container">
        <c:if test="${member == null}">
        <div id = "login_cuser_input">
        <input class="ming2" id = "userId" name = "userId" type = "text" placeholder="아이디를 입력해주세요"></div>
        <div id = "login_cuser_input">
        <input class="ming2" id = "userPass" name = "userPass" type = "password" placeholder="비밀번호를 입력해주세요"></div>
      <!--   <c:if test="${msg == false}">
         <p style="color: red;">로그인 실패! 아이디와 비밀번호 확인해주세요.</p>
        </c:if>  --> 

        <div class="login_button-container-3">
        <button id="home_loginBtn" type="submit" name="Hover">로그인</button>
        </div>
        <div class="new_join_idpwfind_button-container-3">
        <button id="registerBtn" type="button">회원가입</button>
        </div>
        <div class="new_join_idpwfind_button-container-3">
        <button type="button" name="Hover" onclick="location.href='idfind'">아이디 찾기</button>
        </div>
        <div class="new_join_idpwfind_button-container-3">
        <button type="button" name="Hover" onclick="location.href='pwfind'">비밀번호 찾기</button>
        </div></c:if>
        
        <c:if test="${member != null }">
        <button id="ming22" type="button" class="header_memberupdate">${member.userId}님</button><br>
            <p class = "idwelcome">${member.userId}님 환영 합니다.</p>
            <div class="login_button-container-3">
            <button class="logoutBtn" type="button">로그아웃</button>
         </div>
         <div class="new_join_idpwfind_button-container-3">
        <button id="memberUpdateBtn" type="button" name="Hover">개인정보수정</button>
        </div>
      </c:if>
    </form>

        <footer id = 'mainfooter' oncontextmenu="return false" ondragstart="return false" onselectstart="return false">
        <p>Copyright &copy; 2021 ALL Right Reserved    @The Simple / Ming2</p>
        </footer>

    </body>
</html>