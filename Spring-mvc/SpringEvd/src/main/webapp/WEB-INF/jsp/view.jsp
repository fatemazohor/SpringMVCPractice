<%-- 
    Document   : view
    Created on : 28 Dec 2023, 10:00:40
    Author     : user
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="f"  uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>


<div class="text-center ">
    <h1 >Spring MVC CRUD</h1>
    <h3 >Data List</h3>
    <a href="/addnew" class="btn btn-primary">Entry Form</a>
</div>

<div class="mx-4 py-3">
<!--    <h3 >Data List</h3>
    <a href="/addnew" class="btn btn-primary">Entry Form</a>-->
    <div class="container py-3 text-center">
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>Serial</th>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Roll</th>
                    <th>Department</th>
                    <th>Marks</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="s" items="${dtaList}" varStatus="loop">
                <tr>
                    <td>${loop.count}</td>     
                    <td>${s.id}</td>     
                    <td>${s.sName}</td>
                    <td>${s.roll}</td>
                    <td>${s.department}</td>
                    <td>${s.marks}</td>
                    <td>
                        <a href="/delete/${s.id}" class="btn btn-danger">Delete</a>
                        <a href="/editdata/${s.id}" class="btn btn-warning">Update</a>
                    </td>
                     
                </tr>
                </c:forEach>
            </tbody>
        </table>
        
    </div>

</div>
<%@include file="footer.jsp" %>
