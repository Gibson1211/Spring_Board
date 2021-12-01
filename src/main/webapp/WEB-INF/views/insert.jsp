<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	input {
		display : blodck;
		}
</style>
</head>
<body>
	<h2>글쓰기 페이지</h2>
	<form action="insert" method="post">
		작성자<br><input type="text" name="b_writer"><br><br>
		글비밀번호<br><input type="password" name="b_password"><br><br>
		제목<br><input type="text" name="b_title"><br><br>
		내용<br><input type="text" name="b_contents"><br><br>
<!--    조회수<br><input type="text" name="b_hits"><br>  
  		작성시간<br><input type="date" name="b_date"><br>	-->
			<input type="submit" value="글쓰기 완료">	
	</form>

</body>
</html>