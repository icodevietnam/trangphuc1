<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><tiles:insertAttribute name="title" /></title>
<link rel="stylesheet" type="text/css"
	href="<c:url value="/css/reset.css" />" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="/css/metisMenu.min.css" />" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="/css/font-awesome.min.css" />" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="/css/bootstrap-theme.min.css" />" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="/css/bootstrap.min.css" />" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="/css/bootstrap-wysihtml5.css" />" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="/css/dataTables.bootstrap.css" />" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="/css/timeline.css" />" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="/css/sb-admin-2.css" />" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="/css/admin/admin-page.css" />" />
<script src="<c:url value="/js/jquery-1.11.1.js" />"></script>
<script src="<c:url value="/js/bootstrap.min.js" />"></script>
<script src="<c:url value="/js/editor.js" />"></script>
<script src="<c:url value="/js/metisMenu.min.js" />"></script>
<script src="<c:url value="/js/jquery.validate.min.js" />"></script>
<script src="<c:url value="/js/bootstrap-wysihtml5.js" />"></script>
<script src="<c:url value="/js/jquery.dataTables.js" />"></script>
<script src="<c:url value="/js/dataTables.bootstrap.js" />"></script>
<script src="<c:url value="/js/utils/utils.js" />"></script>
</head>
<body>
	<div id="wrapper">
		<nav class="navbar navbar-default navbar-static-top" role="navigation"
			style="margin-bottom: 0"> <tiles:insertAttribute
			name="navbar-header" /> <tiles:insertAttribute name="navbar-right" />
		<tiles:insertAttribute name="navbar-default" /> </nav>
		<div id="page-wrapper" style="min-height: 650px;">
			<tiles:insertAttribute name="content" />
		</div>
	</div>
	<div class="admin-footer">
		<div class="footer-text">Version 1.0.1 © 2014 by Icoding Active
			Company Ltd. All rights reserved.</div>
	</div>
</body>
</html>