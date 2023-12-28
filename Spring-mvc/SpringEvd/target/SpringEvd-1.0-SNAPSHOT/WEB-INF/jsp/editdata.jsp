<%-- 
    Document   : editdata
    Created on : 28 Dec 2023, 10:00:49
    Author     : user
--%>

<%@taglib prefix="f"  uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>


<div class="text-center ">
    <h1 >Spring MVC CRUD</h1></div>
<div class="mx-4 py-3">
    <h3 class="text-center">Update Form</h3>

    <div class="container py-3">

        <f:form method="post" action="/edit" modelAttribute="dt">
            <f:hidden path="id"></f:hidden>
            
            <div class="form-group  mb-3">
                <label>Full Name</label>
                <f:input path="sName" cssClass="form-control"></f:input>
                </div>    
                
            <div class="form-group  mb-3">
                <label>Roll</label>
                <f:input path="roll" cssClass="form-control"></f:input>
                </div>       

                <div class="form-group  mb-3">
                    <label>Department</label>
                <f:input path="department" cssClass="form-control"></f:input>
                </div>  
                
                <div class="form-group  mb-3">
                    <label>Marks</label>
                <f:input path="marks" cssClass="form-control"></f:input>
                </div>
                
                <div class="form-group  mb-3">
                    <input  type="submit" value="Update" class="btn btn-success"/>
                </div>

        </f:form>
    </div>

</div>
<%@include file="footer.jsp" %>
