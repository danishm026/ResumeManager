$(document).ready(function() {
	//Form Validation Start
	//Adding Event Listener to register button
	var registerButton = document.getElementById("registerButton");
	registerButton.addEventListener("click", function(event) {
		//Get all field values
		var rollNumber = document.getElementById("registrationRollNumber").value.trim().toUpperCase();
		var email = document.getElementById("registrationEmail").value.trim();
		var password = document.getElementById("registrationPassword").value.trim();
		var comfirmedPassword = document.getElementById("comfirmedPassword").value.trim();
		
		//if fields are empty alert user and prevent from opening  link
		if(rollNumber == "" || email ==  "" || password == "" || comfirmedPassword == ""){
			alert("Enter all fields");
			event.preventDefault();
		}
		
		//if passwords do not match alert user
		if(password !=comfirmedPassword){
			alert("Passwords do not match.");
			event.preventDefault();
		}
	   document.getElementById("registrationRollNumber").value = rollNumber; 
    });
    
    //Covert rollnumber into upper case on login
    var loginButton = document.getElementById("loginButton");
    loginButton.addEventListener("click", function() {
        var loginRollnumber = document.getElementById("loginRollnumber");
        loginRollnumber.value = loginRollnumber.value.toUpperCase();
        console.log(loginRollnumber.value);
    });
});