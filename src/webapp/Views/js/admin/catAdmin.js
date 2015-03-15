$(function() {
	$('body').popup({
		body : 'cat-admin-form.jsp',
	});
	var crudForm = $("#crudInsert");
	crudForm.validate({
		rules : {
			txtTitle : {
				required : true,
				minlength : 6
			},
			txtDescription : {
				required : true,
				minlength : 6
			},
			txtMetaKeyword : {
				required : true,
				minlength : 6
			},
			txtMetaDescription : {
				required : true,
				minlength : 6
			},
			txtOrders : {
				required : true,
			}
		},
		messages : {
			txtTitle : {
				required : requireMessage('txtTitle'),
				minlength : minlengthMsg('txtTitle')
			},
			txtDescription : {
				required : requireMessage('txtDescription'),
				minlength : minlengthMsg('txtDescription')
			},
			txtMetaKeyword : {
				required : requireMessage('txtMetaKeyword'),
				minlength : minlengthMsg('txtMetaKeyword')
			},
			txtMetaDescription : {
				required : requireMessage('txtMetaDescription'),
				minlength : minlengthMsg('txtMetaDescription')
			},
			txtOrders : {
				required : requireMessage('txtOrders'),
			}
		}
	});

	$('#btnSave').click(function(e) {
		e.preventDefault();
		var title = $('#txtTitle').val();
		var description = $('#txtDescription').val();
		var metaKeyword = $('#txtMetaKeyword').val();
		var metaDescription = $('#txtMetaDescription').val();
		var position = $('#txtPosition').val();
		var parent = $('#cbxParent').val();
		console.log(parent);
		if (crudForm.valid()) {
			$.ajax({
				type : 'POST',
				dataType : 'JSON',
				url : webName + '/admin/saveCategory',
				data : {
					txtTitle : title,
					txtDescription : description,
					txtMetaKeyword : metaKeyword,
					txtMetaDescription : metaDescription,
					txtPosition : position,
					cbxParent : parent,
					categoryStatus : 'Admin'
				},
				success : function(data) {
					// reload Table
					$("#crudModal").modal('hide');
				},
				error : function(xhr, ajaxOptions, thrownError) {
					console.log(xhr.status);
					console.log(thrownError);
				}
			});
		}
	});
	
/*	$.ajax({
		type : 'GET',
		dataType : 'JSON',
		url : webName + '/admin/showCategory',
	});

	$('#crudTable').dataTable({
		"bDestroy" : true,
		"bSort" : true,
		"bFilter" : false,
		"bLengthChange" : false,
		"bPaginate" : true,
		"sDom" : '<"top">rt<"bottom"flp><"clear">',
		"aaData" : dataCategoryAdmin,
		"aaSorting" : [],
		"aoColumns" : [ {
			"sTitle" : "Patient"
		}, {
			"sTitle" : "DOB"
		}, {
			"sTitle" : "Age"
		}, {
			"sTitle" : "Insurance"
		}, {
			"sTitle" : "Referral"
		} ]
	});*/
	
	$.ajax({
		type:'GET',
		dataType:'JSON',
		url : webName + '/admin/showCategoryParent',
		data : {
			categoryStatus : 'admin'
		},
		success:function(data){
			console.log(data);
		},
		error : function(xhr, ajaxOptions, thrownError) {
			console.log(xhr.status);
			console.log(thrownError);
		}
	});

});