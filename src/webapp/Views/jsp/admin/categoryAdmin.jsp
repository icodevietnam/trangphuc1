<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script src="<c:url value="/js/admin/catAdmin.js" />"></script>

<div class="row">
	<div class="col-lg-12">
		<h1 class="page-header">Category Admin</h1>
	</div>
</div>
<div class="row">
	<div class="col-lg-12">
		<div id ="crudAction">
			<button id='btnCreate' class="btn btn-sm btn-primary"><i class="fa fa-plus"></i> Create</button>
			<button class="btn btn-sm  btn-success"><i class="fa fa-hand-o-right"></i> Copy</button>
			<button class="btn btn-sm  btn-danger"><i class="fa fa-trash-o"></i> Delete</button>
			<button class="btn btn-sm  btn-default"><i class="fa fa-refresh"></i> Refresh</button>
		</div>
		<div id="crudTable">
			<table class="table table-striped table-bordered table-hover" id="crudAdmin">
			</table>
		</div>
	</div>
</div>