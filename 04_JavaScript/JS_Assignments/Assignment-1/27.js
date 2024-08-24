
var days;
 
var months;


    for(months=1; months<=12; months++){
        if(months == 1 || months == 3 || months == 5 || months == 7 || months == 8 || months == 10 || months == 12){
            console.log("In "+months +" month there is 31 days." )
        }
        else if (months == 2){
            console.log("This month is Februry");
        }
        else{
            console.log("In This month there is 30 days.")
        }
    }
