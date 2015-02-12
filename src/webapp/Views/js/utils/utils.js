(function($) {
	// Plugin create modal. Don't need to remember very much.
	$.fn.showModal = function(options) {
		
		var defaults = {
				title : 'Modal Header',
				body : 'Modal Body',
				footer : 'default',
				saveAction : 'none',
				updateAction: 'none',
				loadObject : 'none',
				buttonCreate:'none',
				loadPage:'none'
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
			}
			// Set title and body :)
			title.html(settings.title);
			body.html(settings.body);
		});
	};

}(jQuery));

function initModal() {
	var modalBox = "<div id='crudModal' class='modal fade' id='crudInsert' tabindex='-1' role='dialog' aria-labelledby='myModalLabel' aria-hidden='true'>"
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
			+ "<button type='button' class='btn btn-sm btn-primary'>Save</button>"
			+ "</div>" + "</div>";
	return modalBox;
}

function attributeError(msg) {
	console.log("Attribute Error:" + msg);
}
