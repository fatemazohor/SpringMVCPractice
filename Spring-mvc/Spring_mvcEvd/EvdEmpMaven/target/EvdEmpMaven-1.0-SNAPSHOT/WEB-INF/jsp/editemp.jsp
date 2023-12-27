<%-- 
    Document   : editemp
    Created on : 27 Dec 2023, 11:52:07
    Author     : user
--%>
<%@taglib prefix="f"  uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<!--<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    </head>
    <body>-->
<div class="mx-4 py-3">
    <h1 class="text-center">Employee Edit Form</h1>
    <div class="container">
        <f:form method="post" action="/edit" modelAttribute="employee">
            <f:hidden path="empid"></f:hidden>
                <div class="form-group mb-3">
                    <label>Full Name</label>
                <f:input path="ename" cssClass="form-control"></f:input>
                </div>       

                <div class="form-group mb-3">
                    <label>Department</label>
                <f:input path="department" cssClass="form-control"></f:input>
                </div>       
                <div class="form-group mb-3">
                    <label>Salary</label>
                <f:input path="salary" cssClass="form-control"></f:input>
                </div>
                <div class="form-group mb-3">
                    <input  type="submit" value="Update" class="btn btn-primary"/>
                </div>

        </f:form>
    </div>
</div>

<%@include file="footer.jsp" %>
<!--    </body>
</html>-->
