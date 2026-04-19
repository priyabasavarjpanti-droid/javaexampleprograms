<%@ page language="java" %>
<%
    String name = request.getParameter("username");

    if (name != null) {
        session.setAttribute("user", name);

        // Set session timeout = 60 seconds (1 minute)
        session.setMaxInactiveInterval(60);
    }

    String user = (String) session.getAttribute("user");
%>

<html>
<head>
    <title>Welcome</title>
</head>
<body>
<%
    if (user != null) {
%>
        <h2>Hello <%= user %>!</h2>
        <p>Session will expire in 1 minute.</p>
        <a href="check.jsp">Check Session Status</a>
<%
    } else {
%>
        <h2>Session expired!</h2>
        <a href="index.jsp">Go Back</a>
<%
    }
%>
</body>
</html>