<%-- 
    Document   : studentform
    Created on : 24 Dec 2023, 12:18:25
    Author     : user
--%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

        <div>
            <h1>Entry New Student</h1>
            <div>
                <form:form method="post" action="/save" modelAttribute="student">
                    Name:
                    <input type="text" name="sName">
                    <form:input path="sName"/>
                    Email:
                    <input type="text" name="email">
                    <form:input path="email"/>
                    Password:
                    <input type="text" name="password">
                    <form:input path="password"/>
                    Gender:
                    <input type="text" name="gender">
                    <form:input path="gender"/>
                    Address:
                    <input type="text" name="address">
                    <form:input path="address"/>
                    Name:
                    <input type="text" name="city">
                    <form:input path="ctity"/>
                    State:
                    <input type="text" name="state">
                    <form:input path="state"/>
                    Zip:
                    
                    <form:input path="zip"/>
                    <input type="submit" value="Save" />
                </form:form>
            </div>
        </div>
        
   
