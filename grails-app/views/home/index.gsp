<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
    <g:if test="${testAbValue == 'A'}">
        <h1>Este é o TESTE A. Grails Test A/B example</h1>
    </g:if>
    <g:elseif test="${testAbValue == 'B'}">
        <h1>Este é o TESTE B. Seja bem-vindo!</h1>
    </g:elseif>
</body>
</html>