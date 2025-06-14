<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.Student"%>
<%@page import="dao.StudentDao"%>
<%@page import="java.util.*"%>


<%@include file="header.jsp" %>


<%
 List<Student> list=StudentDao.getAllStudents();
 request.setAttribute("list", list);

%>

<div class="container">
   <h1 class="text-primary text-center">All Student</h1> 
   
   <table class="table table-striped">
       
       <thead>
           <tr>
               <th>ID</th>
               <th>Name</th>
               <th>Email</th>
               <th>Contact Number</th>
               <th>Action</th>
           </tr>
       </thead>
       
       <tbody>
           <c:forEach items="${list}" var="s">
               <tr>
                   <td>${s.getId()}</td>
                   <td>${s.getName()}</td>
                   <td>${s.getEmail()}</td>
                   <td>${s.getContactNo()}</td>
                   <td>
                         <button type="submit" class="btn btn-primary">Edit</button>
                        <button type="submit" class="btn btn-warning">Delete</button>
                   </td>
                   
               </tr>
               
           </c:forEach>
           
       </tbody>
       
       
   </table>
   
</div>





<%@include file="footer.jsp" %>