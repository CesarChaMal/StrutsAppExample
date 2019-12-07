<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic" %>


<html:html locale="true">
    <body style="background-color: white">
        <%
        String name = request.getParameter("name");
        %>
        Tu Nombre es <%=name%>
    </body>
</html:html>
