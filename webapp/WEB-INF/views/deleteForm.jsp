<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>방명록 삭제</title>
</head>
<body>


	<form action="${ pageContext.request.contextPath }/delete" method="post">
		<label for="input-pw">비밀번호</label>
		<input type="password" id="input-pw" name="password" value="">
		<button type="submit">확인</button>
		<input type="hidden" name="no" value="${ param.no }">
	</form>
	<a href="${ pageContext.request.contextPath }/addList">메인으로 돌아가기</a>


</body>
</html>