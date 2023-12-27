<%-- 
    Document   : dataList
    Created on : 27 Dec 2023, 09:28:37
    Author     : user
--%>
<%@taglib prefix="f"  uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Student List</h1>
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Roll</th>
                    <th>Department</th>
                    <th>Roll</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="s" items="${stuList}">
                <tr>
                    <td>${s.id}</td>
                    
                    <td>${s.roll}</td>
                    <td>${s.sName}</td>
                    <td>${s.department}</td>
                    <td>${s.marks}</td>
                    <td>
                        <a href="/delete/${s.id}" class="btn btn-danger">Delete</a>
                        <a href="/editform/${s.id}" class="btn btn-warning">Update</a>
                    </td>
                     
                </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
