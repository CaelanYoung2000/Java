
function daysUpdate(){
	
   const today = new Date() //Todays date
   const superBowlDate = new Date("02/07/2021") // Superbowl day
   const diff_in_days = (superBowlDate.getTime() - today.getTime()) / (1000 * 3600 * 24)
   days.innerHTML = Math.ceil(diff_in_days) // Calculate amount of days between today and superbowl day
   
}
//Validates and breaks check if one of roman characters is found
function validateInput(inputRomanWord) {
   for (let i=0; i < inputRomanWord.length; i++) {
       switch(inputRomanWord.charAt(i)) {
           case 'C': break;
           case 'D': break;
           case 'L': break;
           case 'M': break;
		   case 'I': break;
           case 'V': break;
           case 'X': break;
           default: return false;       
       }
   }

   return true
}

function timeUpdate() {
   dateInformation.innerHTML = new Date().toLocaleString();  //Update for date display
}

function reset() {
   userInput.value = "";
   result.innerHTML = "";
}

function calculate(roman) {
   const holders = {
        'I': 1,
		'V': 5,
        'X': 10,
        'L': 50,
        'C': 100,
        'D': 500,
        'M': 1000
   };
   let num = 0;
  
   for(let i = 0; i < roman.length; i++) {
   const curr = holders[roman[i]], next = holders[roman[i+1]];
   if(curr < next) num -= curr;
   else num += curr;
   }
   return num;
  
   return result
}
//Converts input into roman
function convertToRoman() {
   var inputRomanWord = userInput.value.toUpperCase();
  
   if (inputRomanWord.length == 0) {
       window.alert("Please Enter a Number")
       return;
   }

   if (!validateInput(inputRomanWord)) {
       result.innerHTML = "<strong> ===> NaN, Not a Number</strong>"
   } else {
       const answer = calculate(inputRomanWord);
       result.innerHTML = `<strong> ===> ${answer}</strong>`
   }
}

const dateInformation = document.querySelector("#dateInfo");
const userInput = document.querySelector("#romanInput");
const convertBtn = document.querySelector("#convert");
const resetBtn = document.querySelector("#reset");
const result = document.querySelector("#result");
const days = document.querySelector("#days")


resetBtn.addEventListener("click", reset)
convertBtn.addEventListener("click", convertToRoman)

setInterval(timeUpdate, 1000)
setInterval(daysUpdate, 1000)