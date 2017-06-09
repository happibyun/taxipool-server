<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>session.jsp</title>
</head>
<body>
<%--
HttpSession s = request.getSession();
--%>
SESSION ID : <%=session.getId()%><br>
IS New :<%=session.isNew() %><br>
최종사용시간:<%=new Date(session.getLastAccessedTime()) %>
<%--session.setMaxInactiveInterval(10);//interval설정 기본값은 30분 --%>
<%session.invalidate();//세션죽이기 %>










</body>
</html>