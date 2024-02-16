<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.dto.Employee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home</title>
</head>
<body>
<%=request.getAttribute("employee") %>
<table >
     <thead>
     <tr>
<th>Basic Salary</th>
     <th>HRA</th>
     <th>DA</th>
     <th>GS</th>
     <th>PF</th>
     <th>NS</th>
     </tr>
     </thead>
    <tbody>
    <tr>
    
     <td><%=request.getAttribute("salary") %></td>
      <td><%=request.getAttribute("hra") %></td>
      <td><%=request.getAttribute("da") %></td>
      <td><%=request.getAttribute("gs") %></td>
     <td><%=request.getAttribute("pf") %></td>
      <td><%=request.getAttribute("ns") %></td>

     </tbody>
     </table>
</body>
</html>