<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>score.jsp</title>
</head>
<style>
.star_score{width:30px}
.star_score>span{display:inline-block;position:relative;height:14px;background:url(sp_ico.png) no-repeat -9999px -9999px;vertical-align:top}
.star_score span.st_on{position:absolute;z-index:10;height:14px;background-position:0 -690px}
</style>
<body>
<%! 
int sum=0;
int cnt=0;
%>
<%
 String scoreValue = request.getParameter("score"); 
 sum+= Integer.parseInt(scoreValue);
 cnt++;
 double avgScore = (double)sum / cnt;
%>
선택한 별점은 <%=scoreValue %>점 입니다.<br>
별점 총합은 <%=sum %>점, 총참여자수는 <%=cnt %>명입니다.<br>
영화 평점은 <%= avgScore %>점 입니다.
<div class="star_score">
  <span class="st_on" ></span>
</div>
</body>
</html>