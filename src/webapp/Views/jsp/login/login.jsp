<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet" type="text/css"
	href="<c:url value="/css/style-admin.css" />" />
<script src="<c:url value="/js/admin.js" />"></script>
<div class="loginPage"
	style="width: 490px; height: 300px; margin: auto;">
	<form action="<c:url value="/j_spring_security_check"/>" id="loginForm"
		class="form-horizontal" method="POST" role="form">
		<div class="panel panel-primary">
			<div class="panel-heading">
				<h3 class="panel-title">
					<span class="glyphicon glyphicon-user" aria-hidden="true"></span>
					Login
				</h3>
			</div>
			<div class="panel-body">
				<div class="logo col-lg-3">
					<img style="width: 100px; margin: auto"
						src="<c:url value="/images/logo.png" />">
				</div>
				<div class="col-lg-9">
					<div class="form-group">
						<div class="col-sm-12">
							<input type="text" class="form-control" id="txtUsername"
								name="username" placeholder="Username">
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-12">
							<input type="password" class="form-control" id="txtPassword"
								name="password" placeholder="Password">
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-12">
							<div class="checkbox">
								<label> <input type="checkbox"> Remember me
								</label>
							</div>
						</div>
						<div class="col-sm-12">
							<div class="checkbox">
								<a href="login.gsp">Forgot password</a>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="panel-footer">
				<button type="submit" class="btn btn-sm btn-primary" id="btnLogin">
					<span style="margin-right: 10px;"
						class="icon glyphicon glyphicon-log-in" aria-hidden="false"></span>Login
				</button>
				<button type="reset" class="btn btn-sm btn-danger">
					<span style="margin-right: 10px;"
						class="icon glyphicon glyphicon-refresh" aria-hidden="false"></span>Reset
				</button>
			</div>
			<input type="hidden" name="${_csrf.parameterName}"
				value="${_csrf.token}" />
		</div>
	</form>
</div>