const form = document.getElementById("form")
const uname = document.getElementById("uname")
const email = document.getElementById("email")
const password = document.getElementById("password")
const cpassword = document.getElementById("cpassword")
const tandc= document.getElementById("tc")
// const submit = document.querySelector("button")

form.addEventListener('submit',(e)=>{
    e.preventDefault()
    validate()
})

function validate() {
    let nameValue = uname.value.trim() ; 
    let emailValue = email.value.trim()
    let passwordValue = password.value.trim()
    let cpasswordValue = cpassword.value.trim()
    let formIsValid = true;  // This flag checks if the form is valid

     //User name check

     if(nameValue===''){
        setError(uname,'user name cannot be empty')
        let formIsValid = false;
    }
    else if(nameValue.length<3){
        setError(uname,'user name should be minimum 3 characters')
        let formIsValid = false;
    }
    else{        
        setSuccesss(uname)
    }

    //email check
    if(emailValue===''){
        setError(email,'Email cannot be empty')
        let formIsValid = false;
    }  
    else if(!emailCheck(emailValue)){
        setError(email,'Enter Valid Email Id')
        let formIsValid = false;
    }
    else{        
        setSuccesss(email)
    }

      //Password check

      if(passwordValue===''){
        setError(password,'password cannot be empty')
        let formIsValid = false;
    }
    else if(passwordValue.length<8){
        setError(password,'user name should be minimum 8 characters')
        let formIsValid = false;
    }
    else{        
        setSuccesss(password)
    }

    //Confirm Password check

    if(cpasswordValue===''){
        setError(cpassword,'password cannot be empty')
        let formIsValid = false;
    }
    else if(cpasswordValue !==passwordValue){
        setError(cpassword,'passwords not matched')
        let formIsValid = false;
    }
    else{        
        setSuccesss(cpassword)
    }

    //Terms and conditions check

    if(!tandc.checked){
         
        setError(tc,'click on agree terms checkbox')        
        let formIsValid = false;
    }
    else{
        setSuccesss(tc)
    }

    // If the form is valid, redirect to index.html
    if (formIsValid) {
        window.location.href = "thank_you.html";
    }
    

    function setError(input,message){
        let parent = input.parentElement;
        let small = parent.querySelector('small')
        small.innerText = message
        parent.classList.add('error')
        parent.classList.remove('success')
    }
    function setSuccesss(input){
        let parent = input.parentElement;
        parent.classList.add('success')
        parent.classList.remove('error')
    }

    function emailCheck(input){
        let emailReg = /^[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$/;
        let valid = emailReg.test(input)       
        return valid
    }

}
