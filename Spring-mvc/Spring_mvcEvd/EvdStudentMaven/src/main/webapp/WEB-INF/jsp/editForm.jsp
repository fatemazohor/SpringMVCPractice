<%-- 
    Document   : editForm
    Created on : 27 Dec 2023, 09:28:44
    Author     : user
--%>
<%@taglib prefix="f"  uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        
        
        <h1>Edit Student Form</h1>
        
        <f:form method="post" action="/edit"  modelAttribute="student">
            <f:hidden  path="id" />
            <table class="table table-striped">
                <tr>
                    <td>
                        Name
                    </td>
                    <td>                        
                        <f:input path="sName"></f:input>
                        </td>
                    </tr>

                    <tr>
                        <td>
                            Roll
                        </td>
                        <td>                        
                        <f:input path="roll"></f:input>
                        </td>
                    </tr>

                    <tr>
                        <td>
                            Department
                        </td>
                        <td>                        
                        <f:input path="department"></f:input >
                        </td>
                    </tr>

                    <tr>
                        <td>
                            Marks
                        </td>
                        <td>                        
                        <f:input path="marks"></f:input >
                        </td>
                    </tr>
                    <tr>
                        <td>                      
                            <input  type="submit" value="Update"/>
                        </td>
                    </tr>
                  
                </table>
                        
                        <div class="form-group">
                            <label>Full Name</label>
                            <f:input path="sName"></f:input>
                        </div>       
                        <div class="form-group">
                            <label>Roll</label>
                            <f:input path="roll"></f:input>
                        </div>       
                        <div class="form-group">
                            <label>Department</label>
                            <f:input path="department"></f:input>
                        </div>       
                        <div class="form-group">
                            <label>Marks</label>
                            <f:input path="marks"></f:input>
                        </div>       
        </f:form>
    </body>
</html>
