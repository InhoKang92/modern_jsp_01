<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<%
System.out.println("checkSuccess.jsp");
response.sendRedirect("http://localhost:8082/Web_01/ModernServlet?command=product_list");
%>

</body>
</html>