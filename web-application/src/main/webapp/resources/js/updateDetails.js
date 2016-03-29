$(document).ready(function() {
    //Set Update Details Button to enable input fields.
    var updateDetailsButton = document.getElementById("updateDetails");
    updateDetailsButton.addEventListener("click", function() {
        var input = document.getElementsByTagName("input");
        for(var i=0; i<input.length; i++) {
            if(input[i].hasAttribute("disabled"))
                input[i].removeAttribute("disabled");
        }
        var select = document.getElementsByTagName("select");
        for(var i=0; i<select.length; i++) {
            if(select[i].hasAttribute("disabled"))
                select[i].removeAttribute("disabled");
        }
        updateDetailsButton.setAttribute("disabled", "true");
        var submitInput;
        input = document.getElementsByTagName("input");
        for(var i=0; i<input.length; i++) {
            if(input[i].getAttribute("type") == "submit") {
                submitInput = input[i];
                break;
            }
        }
        submitInput.removeAttribute("disabled");
    });
    
    //Set editField Button to edit corresponding Field
    var editField = document.getElementsByClassName("editField");
    for(var i=0; i<editField.length; i++) {
        editField[i].addEventListener("click", function(event) {
            var input = this.parentNode.getElementsByTagName("input");
            var select = this.parentNode.getElementsByTagName("select");
            for(var i=0; i<input.length; i++) {
                input[i].removeAttribute("disabled");
            }
            for(var i=0; i<select.length; i++) {
                select[i].removeAttribute("disabled");
            }
            var submitInput;
            input = document.getElementsByTagName("input");
            for(var i=0; i<input.length; i++) {
                if(input[i].getAttribute("type") == "submit") {
                    submitInput = input[i];
                    break;
                }
            }
            submitInput.removeAttribute("disabled");
            event.preventDefault();
        });
    }
    
    var submit = document.getElementById("submit");
    submit.addEventListener("click", function() {
    	input = document.getElementsByTagName("input");
        for(var i=0; i<input.length; i++) {
        	input[i].removeAttribute("disabled");
        }
        select = document.getElementsByTagName("select");
        for(var i=0; i<select.length; i++) {
        	select[i].removeAttribute("disabled");
        }
    });
});