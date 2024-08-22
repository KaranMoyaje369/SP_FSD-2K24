
var number;

for(number=1; number<=50; number++){
    if(number % 2 == 0 && number % 3 == 0 && number % 4 == 0) {
        console.log(+number + " is Divisible by 2, 3 and 4.")
    }
    else(
        console.log(+number + " is not Divisible by 2, 3 and 4.")
    )
}

// Number is divisible by 2 and 2,4 both.

// var number;

// for(number=1; number<=100; number++) {

//     if(number % 2 == 0 && number == 2){
//         console.log(+number +" is Divisible by 2.")
//     }

//     else if(number % 2 === 0 && !(number % 4 === 0) ){
//         console.log(+number +" is Divisible by 2.")
//     }

//     else if(number % 2 === 0 && number % 4 === 0 ){
//         console.log(+number +" is Divisible by 2 and 4.")
//     }

//     else{
//         console.log(+number +" is not Divisible by 2 and 4.")
//     }
// }