<%--
  Created by IntelliJ IDEA.
  User: junhyeokkang
  Date: 2023/08/07
  Time: 12:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" pageEncoding="utf-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Add New post</h1>
<form action = "addok" method="POST">
    <table id = "edit">
        <tr><td>주소:</td><td><input id="address" type="text" name="address"/></td></tr>
        <tr><td>상세위치:</td><td><input id="location" type="text" name="location"/></td></tr>
        <tr><td>숙박가능기간:</td><td><input id="holiday" type="text" name="holiday"/></td></tr>
        <tr><td>가격:</td><td><input id="price" type="number" name="price"/></td></tr>
    </table>
    <input type="reset">
    <button type="button" onclick="location.href='list'">돌아가기</button>
    <button type="submit">등록하기</button>
</form>

</body>
</html>
