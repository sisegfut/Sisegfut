<%@page isErrorPage="true" %>
<HTML>
    <HEAD>
        <TITLE>Sisegfut</TITLE>
    </HEAD>

    <BODY>
        <H1>Ha ocurrido un error</H1>
        Parece que la pagina que visito no existe.
        <BR>
        Consulte con su administrador de sistema.
        <pre>
            <% exception.printStackTrace(response.getWriter());%>
        </pre>
    </BODY>
</HTML>
