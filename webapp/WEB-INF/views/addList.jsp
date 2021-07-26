<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>방명록</title>
</head>
<body>


	<form action="${ pageContext.request.contextPath }/add" method="post">
		<table border="1" width="500">
			<tr>
				<td>이름</td>
				<td><input type="text" name="name" value=""></td>
				<td>비밀번호</td>
				<td><input type="password" name="password" value=""></td>
			</tr>
			<tr>
				<td colspan="4"><textarea name="content" cols="65" rows="5" style="resize: none;"></textarea></td>
			</tr>
			<tr>
				<td colspan="4"><button type="submit">확인</button></td>
			</tr>
		</table>
	</form>

	<br>

	<c:forEach items="${ requestScope.gList }" var="guestVo" varStatus="status">

		<table border="1" width="500">
			<tr>
				<td>${ guestVo.no }</td>
				<td>${ guestVo.name }</td>
				<td>${ guestVo.date }</td>
				<td><a href="${ pageContext.request.contextPath }/deleteForm?no=${ guestVo.no }">삭제</a></td>
			</tr>
			<tr>
				<td colspan="4">${ guestVo.content }</td>
			</tr>
		</table>

		<br>

	</c:forEach>


</body>
</html>