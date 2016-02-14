<%-- 
    Document   : myResults
    Created on : Feb 11, 2016, 11:22:05 PM
    Author     : amitr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Compare Now</title>
    </head>
    <body>
        <%@page import="my.Products" %>
        <%
        String search = request.getParameter("search");
        Products p = new Products();
        p.findProducts(search);
        for(int i=0;i<p.length();i++)
        {
        %>
        
        <h3>
            <a href="<%=p.getLink(i)%>">
            <div><%=p.getTitle(i)%></div>
        
            <img src="<%=p.getSrc(i)%>" />
            <div><%=p.getParent(i)%></div>
            <div><%=p.getPrice(i)%></div>
            <div><%=p.getRate(i)%></div>
            <div><%=p.getReview(i)%></div>
        </a>
        </h3>
        <hr />
        <br/>
        <%
        }
        %>
    
    </body>
</html>
