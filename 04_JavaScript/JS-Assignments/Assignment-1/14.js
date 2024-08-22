 
 var year = 1900;


    if((year % 4 === 0 && year % 100 !== 0) || year % 400 === 0){
        console.log(+year + " Leap Year");
     }
     else{
        console.log(+year + " Not Leap Year");
     }
 

 