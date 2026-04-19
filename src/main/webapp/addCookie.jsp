<%@ page language="java" %>
<%
    String name = request.getParameter("name");
    String domain = request.getParameter("domain");
    int age = Integer.parseInt(request.getParameter("age"));

    Cookie c = new Cookie(name, "DemoValue");

    c.setDomain(domain);
    c.setMaxAge(age);

    response.addCookie(c);
%>

<html>
<head>
    <title>Cookie Added</title>
</head>
<body>

    <h2>Cookie Information</h2>

    <p><b>Name:</b> <%= name %></p>
    <p><b>Domain:</b> <%= domain %></p>
    <p><b>Max Age:</b> <%= age %> seconds</p>

    <br>
    <a href="showCookies.jsp">Go to Active Cookie List</a>

</body>
</html>