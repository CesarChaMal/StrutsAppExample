<%@ page language="java"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic" %>

<html>
	<head>
		<title>JSP Ejemplo</title>
	</head>
	<body>
		<html:form action="/printname">
			<html:errors /> <br>
			Nombre: <html:text property="name" /> <br>
			<html:submit value="Send"/>
		</html:form>
	</body>
</html>
