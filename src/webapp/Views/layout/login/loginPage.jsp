<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><tiles:insertAttribute name="title" /></title>
<link rel="stylesheet" type="text/css"
	href="<c:url value="/css/reset.css" />" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="/css/bootstrap.min.css" />" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="/css/bootstrap-theme.min.css" />" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="/css/font-awesome.min.css" />" />
<script src="<c:url value="/js/jquery-1.11.1.js" />"></script>
<script src="<c:url value="/js/bootstrap.min.js" />"></script>
<script src="<c:url value="/js/editor.js" />"></script>
<script src="<c:url value="/js/jquery.validate.min.js" />"></script>
</head>
<body>
	<nav class="login-navbar navbar-xs navbar-inverse" role="navigation">
	<div class="container-fluid">
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<li><a href="/trangphuc1/admin/login"><span
						class="glyphicon glyphicon-home" aria-hidden="true"></span></a></li>
			</ul>
		</div>
	</div>
	</nav>
	<div id="wrapper">
		<div class="breadcums-body">
			<ol class="breadcrumb">
				<li><a href="/trangphuc1/admin/login">Home</a></li>
				<li><a href="/trangphuc1/admin/login">Login</a></li>
			</ol>
		</div>
	</div>
	<div class="content">
		<tiles:insertAttribute name="content" />
	</div>
	<div class="admin-footer">
		<div class="footer-text">Version 1.0.1 © 2014 by Icoding Active
			Company Ltd. All rights reserved.</div>
	</div>
</body>
</html>