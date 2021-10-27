//회원가입 js

$("#regbtn").on("click", function(){
				if($("#userId").val()==""){
					alert("아이디를 입력해주세요.");
					$("#userId").focus();
					return false;
				}
				if($("#userPass").val()==""){
					alert("비밀번호를 입력해주세요.");
					$("#userPass").focus();
					return false;
				}
				if($("#userName").val()==""){
					alert("성명을 입력해주세요.");
					$("#userName").focus();
					return false;
				}
				var idChkVal = $("#idChk").val();
				if(idChkVal == "N"){
					alert("중복확인 버튼을 눌러주세요.");
				}else if(idChkVal == "Y"){
					$("#regForm").submit();
				}
			
		})
		
		function fn_idChk(){
			$.ajax({
				url : "/member/idChk",
				type : "post",
				dataType : "json",
				data : {"userId" : $("#userId").val()},
				success : function(data){
					if(data == 1){
						alert("중복된 아이디입니다.");
					}else if(data == 0){
						$("#idChk").attr("value", "Y");
						alert("사용가능한 아이디입니다.");
					}
				}
			})
		}

//공용 js

$(document).ready(function(){
//메인로그아웃
$(".mainlogoutBtn").on("click", function(){
    location.href="member/logout";
})
//로그아웃
$(".logoutBtn").on("click", function(){
    location.href="logout";
})
// 취소
$("#cancle").on("click", function(){
    location.href = "/";
})
//상단개인정보수정
$(".header_memberupdate").on("click", function(){
    location.href="member/memberUpdateView";
})
//상단로그인
$(".header_login").on("click", function(){
    location.href="member/home_login";
})
//상단회원가입
$(".registerBtn").on("click", function(){
    location.href="member/register";
})
//회원탈퇴
$("#update_delete_btn").on("click", function(){
    location.href="memberDeleteView";
})
//회원가입
$("#registerBtn").on("click", function(){
    location.href="member/register";
})
//개인정보수정
$("#memberUpdateBtn").on("click", function(){
    location.href="memberUpdateView";
})
})


// 개인정보수정 js

$(document).ready(function(){

$("#memberupbtn").on("click", function(){
 if($("#userPass").val()==""){
    alert("비밀번호를 입력해주세요.");
    $("#userPass").focus();
    return false;
 }
 if($("#userName").val()==""){
    alert("성명을 입력해주세요.");
    $("#userName").focus();
    return false;
 }
 $.ajax({
    url : "/passChk",
    type : "POST",
    dateType : "json",
    data : $("#updateForm").serializeArray(),
    success: function(data){
       
       if(data==true){
          if(confirm("회원수정하시겠습니까?")){
             $("#updateForm").submit();
          }
       }else{
          alert("패스워드가 틀렸습니다.");
          return;
       }
    }
 })
});
})

// 회원탈퇴

$(document).ready(function(){

    $("#delete_btn").on("click", function(){
        if($("#userPass").val()==""){
            alert("비밀번호를 입력해주세요.");
            $("#userPass").focus();
            return false;
        }
        $.ajax({
            url : "/passChk",
            type : "POST",
            dateType : "json",
            data : $("#delForm").serializeArray(),
            success: function(data){
                
                if(data==true){
                    if(confirm("회원탈퇴하시겠습니까?")){
                        $("#delForm").submit();
                    }
                }else{
                    alert("패스워드가 틀렸습니다.");
                    return;
                }
            }
        })
    });
})