<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body> 
<!-- html 주석입니다 -->
<%-- jsp 주석입니다 --%>
<%
//java 주석입니다
/* 여러줄도 가능합니다 */
%>

<%
	for (int i=1; i<=5; i++) {
%>
<H<%=i %>>아름다운 한글</H<%=i %>>
<%
	}
%>
</body>
</html>