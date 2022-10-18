console.log("Hello World");

let profileEditBtn = document.getElementById('profile-edit-btn');
if (profileEditBtn != null) {
	profileEditBtn.addEventListener("click", function() {

		document.getElementsByName("firstName")[0].removeAttribute("disabled");
		document.getElementsByName("lastName")[0].removeAttribute("disabled");
		document.getElementsByName("email")[0].removeAttribute("disabled");
		document.getElementsByName("password")[0].removeAttribute("disabled");
		document.getElementsByName("dob")[0].removeAttribute("disabled");
		document.getElementsByName("userImage")[0].removeAttribute("disabled");
		document.getElementById("profile-update-btn").removeAttribute("disabled");
	})
}