<div class="form-group">
	<label for="inputTitle">Title</label> <input type="text"
		class="form-control" id="txtTitle" name="txtTitle" placeholder="Title">
</div>
<div class="form-group">
	<label for="inputDescription">Description</label> <input type="text"
		class="form-control" id="txtDescription" name="txtDescription"
		placeholder="Description">
</div>
<div class="form-group">
	<label for="inputMetaKeyworld">Meta Keyword</label> <input type="text"
		class="form-control" id="txtMetaKeyword" name="txtMetaKeyword"
		placeholder="Meta Keyword">
</div>
<div class="form-group">
	<label for="inputMetaDescription">Meta Description</label> <input
		type="text" class="form-control" id="txtMetaDescription"
		name="txtMetaDescription" placeholder="Meta Description">
</div>
<div class="form-group">
	<label for="inputParent">Category Parent</label>
	<select name="cbxParent" class="form-control select-parent"
		id="cbxParent">
	</select>

</div>
<div class="form-group">
	<label for="inputPosition">Orders</label> <input type="text"
		class="form-control" id="txtPosition" name="txtPosition">
</div>
<script>
	$('#txtOrders').TouchSpin({
		initval : 0
	});

	$('.select-parent').selectpicker();
</script>
