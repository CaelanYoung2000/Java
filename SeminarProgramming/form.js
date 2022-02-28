var userInputs = new Array();
userInputs[0] = "errEmail";
userInputs[1] = "errPassword";
userInputs[2] = "errConfirm";
userInputs[3] = "errRenew";

function approval() {
    var inputs = new Array();

    inputs[0] = document.getElementById('email').value;
    inputs[1] = document.getElementById('password').value;
    inputs[2] = document.getElementById('confirm').value;
    inputs[3] = document.getElementById('Renew').value;
	
    var notApproved = new Array();
    notApproved[0] = "<span style='color:red'>Please enter your email!</span>";
    notApproved[1] = "<span style='color:red'>Please enter your password!</span>";
    notApproved[2] = "<span style='color:red'>Please confirm your password!</span>";
    notApproved[3] = "<span style='color:red'>Please select an option!</span>";

    for (i in inputs) {
        var errMessage = notApproved[i];
        var usrIn = userInputs[i];
        if (inputs[i] == "")
            document.getElementById(usrIn).innerHTML = errMessage;
        else if (i == 0) {
            var atpos = inputs[i].indexOf("@");
            var dotpos = inputs[i].lastIndexOf(".");
            if (atpos < 1 || dotpos < atpos + 2 || dotpos + 2 >= inputs[i].length)
                document.getElementById('errEmail').innerHTML = "<span style='color: red'>Enter a valid email address!</span>";
            else
                document.getElementById(usrIn).innerHTML = "OK!";
        } else if (i == 2) {
            var first = document.getElementById('password').value;
            var second = document.getElementById('confirm').value;
            if (second != first)
                document.getElementById('errConfirm').innerHTML = "<span style='color: red'>Your passwords don't match!</span>";
            else
                document.getElementById(usrIn).innerHTML = "OK!";
        } else if (i == 3) {
            var membership = document.getElementsByName("Renew");
            if (membership[0].checked == true) {
                document.getElementById(usrIn).innerHTML = "OK!";
            } else if (membership[1].checked == true) {
                document.getElementById(usrIn).innerHTML = "OK!";
            } else {
                document.getElementById('errRenew').innerHTML = notApproved[3];
            }

        } else
            document.getElementById(usrIn).innerHTML = "OK!";
    }
}

function finalApproval() {
    var count = 0;
    for (i = 0; i < 4; i++) {
        var usrIn = userInputs[i];
        if (document.getElementById(usrIn).innerHTML == "OK!")
            count = count + 1;
    }
    if (count == 4)
        return true;
    else return false;
}