(function($) {
	$.fn.modal = function(options){
		
	}
	
	$.fn.modal.defaults = {
		header:'Modal Header',
		body :'Modal Body',
		footer:'saveAction'
	}
});

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

function updateModal() {

}

function createModal() {
	$("body").append(initModal());
	$("#crudModal").modal('show');
};