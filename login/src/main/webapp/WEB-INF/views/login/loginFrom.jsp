<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String msg = (String) request.getAttribute("message");
	if(msg==null) {
		msg ="아이디와 패스워드를 입력해주세요";
	}
%>
<!DOCTYPE HTML>
<html>
<body>
	<div class="container" align="center">
		<div class="col-lg-6" align="center">
			<form id="loginform" method="post" action="/login/login_exe">
				<div><label><%=msg%></label></div>
					<div class="form-group" align="left">
						<label for="">아이디</label>
						<input type="text" class="form-control" id="id" name="id" placeholder="">
					</div>
					<div class="form-group" align="left">
						<label for="">비밀번호</label>
						<input type="password" class="form-control" id="pw" name="pw" placeholder="">
					</div>
					<div class="form-group" align="left">
						<label for="">이름</label>
						<input type="text" class="form-control" id="name" name="name" placeholder="">
					</div>
					<div class="form-group" align="left">
						<label for="">생년월일</label>
						<input type="text" class="form-control" id="date" name="date" placeholder="">
					</div>
					<div class="form-group" align="center">
						<button type="button" id="loginBtn" class="btn btn-warning">로그인</button>
					</div>
			</form>
		</div>
	</div>