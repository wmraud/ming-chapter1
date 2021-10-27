<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
     <title>The seungha alone project</title>
     <head>
             <meta charset="utf-8">
             <link rel="shortcut icon" href="/resources/assets/image/titleairplanicon.jpg">
             <link rel="stylesheet" type="text/css" href = "/resources/assets/css/7.memberupdate.css">
             <script src="/resources/assets/js/2.jquery.min.js"></script>
             <script src="/resources/assets/js/3.main.js"></script>
             <script src="/resources/assets/js/4.member.js"></script>
     </head>

<body>
    <c:if test="${member != null }">
      <div>
       <button id="ming22" type="button" class="logoutBtn">로그아웃</button>
       <button id="ming22" type="button" class="header_memberupdate">${member.userId}님</button>
      </div>
     </c:if>
     
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
    
    <div>
    <div class="inpoediter_a_name1"><br><br><br>
    <div class="inpoediter_a_name2">

   <br><br>

    <form class="deleteform" id="deleteForm" action="/memberDelete" method="post">
        <label class = "memberUpdate_label" for="userId">아이디</label><br>
        <input class = "memberUpdate_input" type = "text" name="userId" value="${member.userId}" readonly="readonly"/><br><br>

        <label class = "memberUpdate_label" for="userPass">패스워드</label><br>
        <input class = "memberUpdate_input" type = "password" id="userPass" name="userPass" />
        <br><div>
            <c:if test="${msg == false}">
                <p style="color: red;">비밀번호 확인해주세요.</p>
            </c:if>
        </div><br>
        
        <label class = "memberUpdate_label">성명</label><br>
        <input class = "memberUpdate_input" type = "text" id="userName" name="userName" value="${member.userName}"/><br><br>
    <br><br>
        <div>
            <button class="change_save" type="submit" name="Hover" id="delete_btn" >회원탈퇴</button>
            <button class="change_notsave" type="button" name="Hover" id="cancle">취소</button>
        </div>
        </form>
    </div>
        </div>
            <footer id = 'mainfooter' oncontextmenu="return false" ondragstart="return false" onselectstart="return false">
         <p>Copyright &copy; 2021 ALL Right Reserved    @The Simple / Ming2</p>
     </footer>

    </div>
</body>
</html>