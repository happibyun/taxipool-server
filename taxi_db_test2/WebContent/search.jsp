<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:choose>
<c:when test="${empty param.searchItem }">
 <c:set var="item" value="no"/>
</c:when>
<c:otherwise>
 <c:set var="item" value="{param.searchItem}"/>
</c:otherwise>
</c:choose>
<%--
/* String item = request.getParameter("searchItem");
if(item == null){
 item = "no"; 
} */
/* String value = request.getParameter("searchValue");
if(value == null){
 value = ""; 
}
 */
--%>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script>
$(function(){
	$("option[value=${item}]").attr("selected", "true");
	<%-- $("input[name=searchValue]").val('<%=value%>'); --%>
	$("input[name=searchValue]").val('${param.searchValue}');
	$("form").submit(function(){
		return false;
	});
	$("input[type=button]").click(function(){		
		$.ajax({ url: "productlist.do",
			method: "post",
			data: $("form").serialize(),
			success:function(responseData){				
				var $parentObj = $("article");
				if($parentObj.length == 0){
					$parentObj = $("body");
				}
				$parentObj.empty();
				$parentObj.html(responseData.trim());
			}
		});
		return false;
	});
});
</script>
<form action="http://www.naver.com" style="width:60%; border-radius: 30px; border:1px solid; padding:10px; margin:10px;">   
<select name="searchItem" style="vertical-align:middle;">
  <option value="no">번호로 검색</option>
  <option value="name">이름으로 검색</option>
</select>
<input type="search" name="searchValue" style="vertical-align: :middle;">
<input type="button" value="검색">
</form>