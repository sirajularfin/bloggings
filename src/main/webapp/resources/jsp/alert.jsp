<%@page import="com.blog.files.entities.Message"%>
<%
Message msg = (Message) session.getAttribute("message");
if (msg != null) {
%>

<div class="alert <%=msg.getCssClass()%>" role="alert">
	<span class="material-icons"> <%= msg.getIconType()%> </span> <%=msg.getContent()%>
</div>

<%
session.removeAttribute("message");
}
%>