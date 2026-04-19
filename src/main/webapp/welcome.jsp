<%@ page language="java" %>

<%
    // Set session timeout = 60 seconds
    session.setMaxInactiveInterval(60);

    String name = request.getParameter("username");

    if (name != null) {
        session.setAttribute("user", name);
    }

    String user = (String) session.getAttribute("user");
%>

<html>
<head>
    <title>Welcome Page</title>
</head>
<body>

<%
    if (user != null) {
%>
        <h2>Hello <%= user %>!</h2>
        <p>Session will expire after 1 minute of inactivity.</p>
<%
    } else {
%>
        <h2>Session Expired!</h2>
        <p>Please login again.</p>
<%
    }
%>

</body>
</html>