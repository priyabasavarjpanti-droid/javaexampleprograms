 <%@ page language="java" %>
<%
    Cookie[] cookies = request.getCookies();
%>

<html>
<head>
    <title>Active Cookies</title>
</head>
<body>

    <h2>Active Cookie List</h2>

<%
    if (cookies != null) {
        for (int i = 0; i < cookies.length; i++) {
%>
            <p>
                <b>Name:</b> <%= cookies[i].getName() %><br>
                <b>Value:</b> <%= cookies[i].getValue() %>
            </p>
            <hr>
<%
        }
    } else {
%>
        <p>No active cookies found</p>
<%
    }
%>

    <a href="index.jsp">Add Another Cookie</a>

</body>
</html>