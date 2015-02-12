(function($) {
	// Plugin create modal. Don't need to remember very much.
	$.fn.showModal = function(options) {
		var settings = $.extend({}, $.fn.showModal.defaults, options);
		var modal = $(this).find('#crudModal');
		var title = modal.find('.modal-title');
		var body = modal.find('.modal-body');
		var footer = modal.find('.modal-footer');
		return this.each(function() {
			switch (settings.display) {
			case 'true':
				$(this).append(initModal());
				break;
			default:
				attributeError('Only 1 values: true');
				break;
			}
			
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
			title.html(settings.header);
			body.html(settings.body);
		});
	};

	$.fn.showModal.defaults = {
		display : 'true',
		title : 'Modal Header',
		body : 'Modal Body',
		footer : 'default',
		saveAction : 'none',
		updateAction: 'none',
		loadObject : 'none',
		buttonCreate:'none'
	};

}(jQuery));

function initModal() {
	var modalBox = "<div id='crudModal' class='modal fade' id='crudInsert' tabindex='-1' role='dialog' aria-labelledby='myModalLabel' aria-hidden='true'>"
			+ "<div class='modal-dialog'>"
			+ "<div class='modal-content'>"
			+ "<div class='modal-header'>"
			+ "<button type='button' class='close' data-dismiss='modal' aria-label='Close'><span aria-hidden='true'>&times;</span></button>"
			+ "<h4 class='modal-title' id='myModalLabel'>Modal title</h4>"
			+ "</div>"
			+ "<div class='modal-body'>"
			+ "This is demo modal box"
			+ "</div>"
			+ "<div class='modal-footer'>"
			+ "<button type='button' class='btn btn-default' data-dismiss='modal'>Close</button>"
			+ "<button type='button' class='btn btn-primary'>Save changes</button>"
			+ "</div>" + "</div>";
	return modalBox;
}

/*
 * function updateModal() {
 *  }
 */

function createModal() {
	$("body").append(initModal());
	$("#crudModal").modal('show');
};

function attributeError(msg) {
	console.log("Attribute Error:" + message);
}
