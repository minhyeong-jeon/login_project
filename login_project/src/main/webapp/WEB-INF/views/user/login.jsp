<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>

</head>
<script type="text/javascript">
$(document).ready(function() {
	$("#loginBtn").click(function() {
		if($("#userName").val() == "") {
			alert("이름 입력");
			return;
		} else if($("#userDate").val() == "") {
			alert("생년월일 입력");
			return;
		} 
		else if($("#userId").val() == "") {
			alert("아이디 입력");
			return;
		}
		else if($("#userPass").val() == "") {
			alert("비밀번호 입력");
			return;
		}else {
			$("#loginform").attr("action", "${root}/user/login").submit();
		}
	});
	 
	$('#mvRegisterBtn').focusin(function() {
		$(location).attr("href", "${root}/");
	});
});
</script>
<body>
	<div class="container" align="center">
		<div class="col-lg-6" align="center">
			<form id="loginform" method="post" action="">
				<div class="form-group" align="left">
					<label for="">이름</label>
					<input type="text" class="form-control" id="userName" name="userName" placeholder="">
				</div>
				<div class="form-group" align="left">
					<label for="">생년월일</label>
					<input type="text" class="form-control" id="userDate" name="userDate" placeholder="" >
				</div>
				
				<div class="form-group" align="left">
					<label for="">아이디</label>
					<input type="text" class="form-control" id="userId" name="userId" placeholder="">
				</div>
				
				<div class="form-group" align="left">
					<label for="">비밀번호</label>
					<input type="password" class="form-control" id="userPass" name="userPass" placeholder="">
				</div>
				
				<button type="submit" id="loginBtn" class="btn btn-warning">로그인</button>
			</form>
		</div>
	</div>
</body>