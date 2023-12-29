 function clearErrors(){

        errors=document.getElementsByClassName('fromerror');
        for(let item of errors)
        {
            item.innerHTML="";
        }
    }
function seterror(id,error){
    //sets error inside tag of id
    element=document.getElementById(id);
    element.getElementsByClassName('fromerror')[0].innerHTML=error;
}
function resetForm(){
		document.getElementById('surveyForm').reset();
	}
function validateForm(){
    var returnval=true;
    clearErrors();

    var email=document.forms['empreg']["email"].value;
    if(email.length>20){
    seterror("email","enter valid email");
    returnval=false;
    }
    var phone=document.forms['empreg']["mobno"].value;
    if(phone.length!=10){
    seterror("phone","enter valid phone number");
    returnval=false;
    }var aadhar=document.forms['empreg']["aadhar"].value;
    if(aadhar.length!=12){
    seterror("Aadhar","enter valid Aadhar number");
    returnval=false;
    }
return returnval;
}
