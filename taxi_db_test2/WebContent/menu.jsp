<%@ page  contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script>
$(function(){
	var $header = $("header");	
	var $a = $header.find("a");   
	$a.click(function(){
		var url = $(this).attr("href");
		$.ajax({url:url,
		        success:function(responseData){
		        	if(url=='logout.do'){
		        	  location.href=responseData.trim();
		        	}else{
		        		$("article").empty();
		        		$("article").html(responseData.trim());
		        	}
		        }		
		}); 
		return false;
	});
});
</script>
<div>
<c:choose>
 <c:when test="${empty sessionScope.loginInfo }">
<a href="signupform.html">가입</a>&nbsp;&nbsp;
  <a href="loginform.jsp">로그인</a>&nbsp;&nbsp;
</c:when>
<c:otherwise>
<c:set var="c" value="${empty sessionScope.loginInfo }"/> 
  <a href="logout.do">로그아웃</a>&nbsp;&nbsp;
  <a href="customerdetail.do">고객정보보기</a>&nbsp;&nbsp;
  <a href="orderlist.do">주문목록</a>&nbsp;&nbsp;
</c:otherwise>
</c:choose> 
  <a href="productlist.do">상품목록</a>&nbsp;&nbsp;
  <a href="cartlist.do">장바구니보기</a>
</div>



