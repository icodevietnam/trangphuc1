<%@page import="com.icoding.trangphuc.utils.AppVariable"%>
<div class="navbar-default sidebar" role="navigation">
	<div class="sidebar-nav navbar-collapse">
		<ul class="nav in" id="side-menu">
			<li><a href="/trangphuc1/admin/index" ><i
					class="fa fa-dashboard fa-fw"></i> Dashboard</a></li>
			<li><a><i class="fa fa-bar-chart-o fa-fw"></i>
					Category<span class="fa arrow"></span></a>
				<ul class="nav nav-second-level collapse">
					<li><a href="<%=AppVariable.WEBSITE_NAME%>/admin/category/admin">Admin</a></li>
					<li><a href="<%=AppVariable.WEBSITE_NAME%>/admin/category/news">News</a></li>
					<li><a href="<%=AppVariable.WEBSITE_NAME%>/admin/category/home">Home</a></li>
					<li><a href="<%=AppVariable.WEBSITE_NAME%>/admin/category/product">Product</a></li>
				</ul>
			</li>
			<li><a href="tables.html"><i class="fa fa-table fa-fw"></i>
					Need</a></li>
			<li><a href="forms.html"><i class="fa fa-edit fa-fw"></i>
					Products</a></li>
			<li><a href="forms.html"><i class="fa fa-edit fa-fw"></i>
					About Us</a></li>
		</ul>
	</div>
	<!-- /.sidebar-collapse -->
</div>