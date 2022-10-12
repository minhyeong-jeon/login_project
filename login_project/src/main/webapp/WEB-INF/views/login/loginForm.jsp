<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String strMeg = (String) request.getAttribute("message");
	if(strMeg==null) {
		strMeg ="아이디와 패스워드를 입력해주세요";
	}
%>
<!DOCTYPE HTML>
<html>
<body>
	<div class="container">
		 <form action="/login/login_exe" method="post">
		 	<div><label><%=strMeg%></label></div>
		 	
		 	 <div class="form-group">
				 <label for="userName">이름</label>
				 <input type="text" id="userName" name="userName" required>
			 </div>
		 
			 <div class="form-group">
				 <label for="userDate">생년월일</label>
				 <input type="text" id="userDate" name="userDate" required>
			 </div>
			 
			 <div class="form-group">
				 <label for="userId">아이디</label>
				 <input type="text" id="userId" name="userId" required>
			 </div>
			 
			 <div class="form-group">
				 <label for="userPass">비밀번호</label>
				 <input type="password" id="userPass" name="userPass" required>
			 </div>	 
			 
			 <button type="submit">로그인</button>
		 </form>
	</div>
</body>
</html>