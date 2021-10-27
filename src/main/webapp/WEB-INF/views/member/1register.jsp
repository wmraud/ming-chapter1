<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
     <title>The seungha alone project</title>
         <head>
             <meta charset="utf-8">
             <link rel="shortcut icon" href="/resources/assets/image/titleairplanicon.jpg">
             <link rel="stylesheet" type="text/css" href = "/resources/assets/css/8.register.css">
             <link rel="stylesheet" type="text/css" href = "/resources/assets/css/3.main.css">
             
         <script src="/resources/assets/js/2.jquery.min.js"></script>
         <script src="/resources/assets/js/3.main.js"></script>
                  </head>
    <body>
    <c:if test="${member !=null}">
        <div>
         <button id="ming22" type="button" class="header_login">로그인</button>
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
       
               <hr style="border : 1px inset #1b1b1b" id="hr_line" >
      <!--  <div><center>
                <input id = 'new_join_ming1' type = "text" maxlength="16" placeholder="아이디를 입력해주세요">&nbsp;&nbsp;&nbsp;
                <input id = 'new_join_ming1' type = "password" maxlength="20" placeholder="비밀번호를 입력해주세요"><br><br><br>
                <input id = 'new_join_ming1' type = "text" maxlength="10" placeholder="이름 입력해주세요">&nbsp;&nbsp;&nbsp;
                <select id = 'new_join_ming1_5' name = "gender">
                    <option value selected>성별을 선택해주세요</option>
                    <option value="M">남자</option>
                    <option value="U">여자</option>
                    <option value="U">선택 안함</option>
                </select><br><br><br>
                <div>
                    <input id = 'new_join_ming2' type = "text" maxlength="4" placeholder="년도를 입력해주세요">
                <select id = 'new_join_ming2_5' name = "month">
                    <option value selected>월을 선택하세요</option>
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                    <option value="4">4</option>
                    <option value="5">5</option>
                    <option value="6">6</option>
                    <option value="7">7</option>
                    <option value="8">8</option>
                    <option value="9">9</option>
                    <option value="10">10</option>
                    <option value="11">11</option>
                    <option value="12">12</option>
                </select>
                <input id = 'new_join_ming2_7' type = "text" maxlength="2" placeholder="일를 입력해주세요">
            </div><br><br>
                <input id = 'new_join_ming3' type = "text" placeholder="이메일 입력해주세요"><br><br><br>
                <input id = 'new_join_ming3_5' type = "text" placeholder="주소를 입력해주세요"> -->
        
        <form action="/register" method="post" id="regForm">
                <div class="new_join_ming1">
                <div id = "login_cuser_input">
                <input id = "userId" name = "userId" type = "text" maxlength="16" placeholder="아이디를 입력해주세요" /></div>
                <div id="regidchk"><button class="nolocationming22" type="button" id="idChk" onclick="fn_idChk();" value="N">중복확인</button></div>
                <div id = "login_cuser_input">
                <input id = "userPass" name = "userPass" type = "password" maxlength="20" placeholder="비밀번호를 입력해주세요" /></div>
                <div id = "login_cuser_input">
                <input id = "userName" name = "userName" type = "text" maxlength="10" placeholder="이름 입력해주세요" /></div>
            </div>
                
                <div class="login_button-container-3">
                    <button id = "regbtn" type="submit">회원가입</button>
                </div>
                <div class="new_join_idpwfind_button-container-3">
                    <button type="button" id="cancle">취소</button>
                </div>
            </form>

            <footer id = "mainfooter" oncontextmenu="return false" ondragstart="return false" onselectstart="return false">
                <p>Copyright &copy; 2021 ALL Right Reserved    @The Simple / Ming2</p>
            </footer>

    </body>
</html>