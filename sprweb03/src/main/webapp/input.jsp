<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="insdata" method="get">
	과일명 : <input type="text" name="sang"/><br/>
	가격 : <input type="text" name="price"/><br/>
	품질 : <select name="quality" size="2">
		<option value="상">상</option>
		<option value="상">하</option>
	</select>  <br/>
	수량 : <input type="text" name="su"/><br/>
	<input type="submit" value="전송"/>
</form>
</body>
</html>