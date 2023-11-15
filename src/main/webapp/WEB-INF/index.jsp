<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Login and Register</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" />
		<link rel="stylesheet" href="/css/style.css">
	</head>
	<body>
		<div class="container">
			<div class="row">
				<div class="col-12">
					<h1>Welcome !</h1>
					<p>Join our growing community.</p>
				</div>
				
				<div class="col-6">
					<h2>Register</h2>
					<div>
						<form:form action="/register" method="post" modelAttribute="register">
							<div>
						        <form:label path="userName">User Name</form:label>
						        <form:errors path="userName"/>
						        <form:input path="userName"/>
							</div>
							<div>
						        <form:label path="email">Email</form:label>
						        <form:errors path="email"/>
						        <form:input path="email" type="email"/>
							</div>
							<div>
						        <form:label path="password">Password</form:label>
						        <form:errors path="password"/>
						        <form:input path="password" type="password"/>
							</div>
							<div>
						        <form:label path="confirm">Confirm PW</form:label>
						        <form:errors path="confirm"/>
						        <form:input path="confirm" type="password"/>
							</div>
							<div>
								<input type="submit" value="Register"/>
							</div>
						</form:form>
					</div>
				</div>
				
				<div class="col-6">
					<h2>Login</h2>
					<div>
						<form:form action="/login" method="post" modelAttribute="login">
							<div>
						        <form:label path="email">Email</form:label>
						        <form:errors path="email"/>
						        <form:input path="email" type="email"/>
							</div>
							<div>
						        <form:label path="password">Password</form:label>
						        <form:errors path="password"/>
						        <form:input path="password" type="password"/>
							</div>
							<div>
								<input type="submit" value="Login"/>
							</div>
						</form:form>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>