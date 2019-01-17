function checkRemaining(){
	var f1 = document.forms[0];
	var s1 = f1.skills;
	var s2 = f1.sa;
	var flag = true;
	for ( var i = 0; i < s1.length; i++) {
		if (!s1[i].checked) {
			flag = false;
		}
		s2.checked = flag;
	}
 }
 
function selectAll() {
	var f1 = document.forms[0];
	var s1 = f1.skills;
	var s2 = f1.sa;
	if (s2.checked) {
		for ( var i = 0; i < s1.length; i++) {
			s1[i].checked = true;
		}
	} else {
		for ( var i = 0; i < s1.length; i++) {
			s1[i].checked = false;
		}
	}
}

function validate() {
	var f1 = document.forms[0];
	
	var fName = f1.firstName;
	if (fName.value.length == 0) {
		alert("Pls Enter FirstName");
		fName.focus();
		return false;
	}
	
	var lName = f1.lastName;
	if (lName.value.length == 0) {
		alert("Pls Enter LastName");
		lName.focus();
		return false;
	}
	
	var address = f1.address;
	if (address.value.length == 0) {
		alert("Pls Enter Address");
		address.focus();
		return false;
	}
	
	var gen = f1.gender;
	var flag = true;
	for ( var i = 0; i < gen.length; i++) {
		if (gen[i].checked) {
			flag = false;
			break;
		}
	}
	
	if (flag) {
		alert("Pls Select Gender");
		gen[0].focus();
		return false;
	}
	
	var skills = f1.skills;
	flag = true;
	for ( var i = 0; i < skills.length; i++) {
		if (skills[i].checked) {
			flag = false;
			break;
		}
	}
	if (flag) {
		alert("Pls Select Skills");
		skills[0].focus();
		return false;
	}
	
	var educ = f1.education;
	if (educ.value == "default") {
		alert("Pls Select Education");
		educ.focus();
		return false;
	}
}