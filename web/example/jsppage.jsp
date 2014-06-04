<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page contentType="text/html; charset=iso-8859-1" language="java" %>
<html>
<head></head>
<body>
<%

List<String> l = new ArrayList<String>();
l.add("1");
l.add("2");
l.add("3");

%>
q Parameter = <%=request.getParameter("q")%>


<%for(String s: l) {%>

<br/>
<br/>

<form method="post" action="#">
	sometext<%=s %> = <input name="sometext" id="sometext" type="text" />
	<br/>
	<%=Math.random() %>
	<br/>
	<input type="Submit" value="Submit">
</form>

<%} %>


</body>
</html>
