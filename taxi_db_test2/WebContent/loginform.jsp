<%@page import="java.net.URLDecoder"%>
<%@page contentType="text/html;charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script>
$(function(){
	var $form = $('form');
    var itemValue = localStorage.getItem("savedId");
    if(itemValue != null){ //localStorage에 savedId가 저장되있다면 아이디입력란에 넣어줌
    	$("input[name=id]").val(itemValue);
    	$("input[name=c]").prop("checked",true);
    }
	$form.submit(function(){
		var url = 'login.do';
		//로컬스토리지로 쿠키 대신해서 저장
		if($("input[name=c]").prop("checked")==true){
			localStorage.setItem("savedId", $("input[name=id]").val());
		}else{  //체크박스false인경우 삭제
			localStorage.removeItem("savedId");
		}
		
		//var $idValue = $('input[name=id]').val();
		//var $pwdValue =  $('input[name=pwd]').val();
		//var $chkValue = $('input[name=c]').val();

		$.ajax({url: url,
			method : 'POST',
			data: //{'id': $idValue, 'pwd': $pwdValue},
					$form.serialize(),
			success: function(responseData){
				var data = responseData.trim();
				if( data =='1'){
					//alert("로그인 성공");
					<%-- location.href='<%=contextPath%>';//'/web12'; //'/web12/index.jsp' --%>
					location.href='${pageContext.request.contextPath}';
				}else if( data == '-1'){
					alert("로그인 실패");
				}else{
					alert(data);
				}		
			}
		});
		//기본이벤트핸들러(submit핸들러: method="get" action="")가 처리됨
		return false;
	});
	//아이디저장 체크박스
	
});
</script> 
</head>
<body>
<form>
아이디 : <input type="text" name="id">
         <input type="checkbox" name="c" value="save">아이디저장<br> 
비밀번호:<input type="password" name="pwd"><br>
<input type="submit" value="로그인">
<button type="button" onclick="location.href='adminindex.jsp'">관리자로그인</button>
</form>
</body>
</html>