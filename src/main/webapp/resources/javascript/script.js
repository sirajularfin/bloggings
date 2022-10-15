/*
$(document).ready(function() {
	console.log("Success");

	$('#registration-form').on('submit', function(event) {
		event.preventDefault();

		let form = new FormData(this);

		$.ajax({
			url: "RegisterServlet",
			type: "POST",
			data: form,
			success: function(data, textStatus, jqXHR) {
				console.log(data);
			},
			error: function(jqXHR, textStatus, errorThrown) {
				console.log(jqXHR);
			},
			processData: false,
			contentType: false
		})
	});
})
*/

let form = document.getElementById('registration-form');
if (form != null) {
	console.log("Loading");
	form.addEventListener('submit', function(event) {

		event.preventDefault();
		let formData = new FormData(form);
		fetch('register', {
			method: 'POST',
			headers: { 'Content-type': 'false' },
			body: formData
		})
			.then(response => response.text())
			.then(data => console.log(data))
			.catch(err => console.log("Error", err));

	})
}