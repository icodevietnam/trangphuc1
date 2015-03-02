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
			}
		}
	});

	$('#btnSave').click(function(e) {
		e.preventDefault();
		var title = $('#txtTitle').val();
		var description = $('#txtDescription').val();
		if (crudForm.valid()) {
			$.ajax({
				type : 'POST',
				dataType : 'JSON',
				url : webName + '/admin/saveCategory',
				data : {
					txtTitle : title,
					txtDescription : description,
					categoryStatus : 'Admin',
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

});