<%@ page language="java" %>
<%
    String user = (String) session.getAttribute("user");
%>

<html>
<head>
    <title>Session Status</title>
</head>
<body>
<%
    if (user != null) {
%>
        <h2>Session Active</h2>
        <p>Hello <%= user %>! Your session is still active.</p>
<%
    } else {
%>
        <h2>Session Expired!</h2>
        <p>Your session has expired after 1 minute.</p>
        <a href="index.jsp">Start Again</a>
<%
    }
%>
</body>
</html>