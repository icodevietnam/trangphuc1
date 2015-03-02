(function($) {
	// Plugin create modal. Don't need to remember very much.
	$.fn.popup = function(options) {
		
		var defaults = {
				title : 'Insert Item',
				body : 'Modal Body',
				footer : 'default',
				saveAction : 'none',
				updateAction: 'none',
				loadObject : 'none',
				buttonCreate:'none',
		};
		
		var settings = $.extend({},defaults, options);
		return this.each(function() {
			$(this).append(initModal());
			var modal = $(this).find('#crudModal');
			var title = modal.find('#titleLabel');
			var body = modal.find('.modal-body');
			var footer = modal.find('.modal-footer');
			
			switch (settings.footer) {
			case 'default':
				break;
			default:
				footer.html(settings.footer);
				break;
			}
			
			switch(settings.buttonCreate){
			case 'none':
				$('#btnCreate').click(function() {
					$("#crudModal").modal('show');
				});
				break;
				$('#'+settings.buttonCreate).click(function() {
					$("#crudModal").modal('show');
				});
			default:
				break;
			}
			
			var urlPage = settings.body;
			if(urlPage == 'none'){
				body.html("");
				body.append("No Url Page is loaded");
			}
			else{
				body.load(urlForm + settings.body);
			}
			// Set title and body :)
			title.html(settings.title);
		});
	};

}(jQuery));

urlForm = '/trangphuc1/Views/jsp/form/';
webName ='/trangphuc1';
var minLength = 6;

function initModal() {
	var modalBox = "<div id='crudModal' class='modal fade' id='crudInsert' tabindex='-1' role='dialog' aria-labelledby='myModalLabel' aria-hidden='true'>"
			+ "<form id='crudInsert' >"
			+ "<div class='modal-dialog'>"
			+ "<div class='modal-content'>"
			+ "<div class='modal-header'>"
			+ "<button type='button' class='close' data-dismiss='modal' aria-label='Close'><span aria-hidden='true'>&times;</span></button>"
			+ "<h4 class='modal-title' id='titleLabel'>Modal title</h4>"
			+ "</div>"
			+ "<div class='modal-body'>"
			+ "This is demo modal box"
			+ "</div>"
			+ "<div class='modal-footer'>"
			+ "<button type='button' class='btn btn-sm btn-default' data-dismiss='modal'>Close</button>"
			+ "<button id='btnSave' type='button' class='btn btn-sm btn-primary'>Save</button>"
			+ "</div></form>" + "</div>";
	return modalBox;
}

function attributeError(msg) {
	console.log("Attribute Error:" + msg);
}

function requireMessage(fieldName){
	return fieldName.substring(3,fieldName.length) + " is not blank";
}

function minlengthMsg(fieldName){
	return fieldName.substring(3,fieldName.length) + " is smaller than " + minLength +" characters.";
}
