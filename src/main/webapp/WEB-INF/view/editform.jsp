<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" pageEncoding="UTF-8" %>
<%@ page import="com.example.summer.dao.BoardDAO, com.example.summer.bean.BoardVO"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Form</title>
</head>
<body>
    <h1>Edit Form</h1>
    <form:form modelAttribute="boardVO" method="post" action ="../editok">
        <form:hidden path="seq"/>
        <table id ="edit">
            <tr><td>주소:</td><td><form:input path="address"/></td></tr>
            <tr><td>상세위치:</td><td><form:input path="location"/></td></tr>
            <tr><td>숙박가능기간:</td><td><form:input path="holiday"/></td></tr>
            <tr><td>가격:</td><td><form:input path="price"/></td></tr>
        </table>
        <input type="submit" value="수정하기"/>
        <input type="button" value="취소하기" onclick="history.back()"/>
    </form:form>

</body>
</html>
