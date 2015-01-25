$(function(){
	var loginForm = $("#loginForm");
	var btnLogin = $("#btnLogin");
	
	loginForm.validate({
		rules : {
			username : {
				required : true,
				minlength : 6
			},
			password : {
				required : true,
				minlength : 6
			}
		},
		messages : {
			username : "Username can't be blank.",
			password : "Password can't be blank"
		}
	});
	
});