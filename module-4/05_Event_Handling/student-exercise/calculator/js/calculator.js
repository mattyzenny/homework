let display;
let previous = null;
let operator = null;
let operatorClicked = false;

/**
 * Calculates the operation and updates the display.
 */
function performOperation() {
  let result;
  const current = parseNumber(display.value);
  previous = parseNumber(previous);

  switch(operator) {
    case '+' :
      result = previous + current;
    break;
    case '-' :
        result = previous - current;
    break;
    case '*' :
        result = previous * current;
    break;
    case '/' :
        result = previous / current;
    break;
  }

  display.value = result;
  operator = null;
}

/**
 * Parses the display value into a number (float or int).
 * @param {String} num 
 */
function parseNumber(num) {
  return num.includes('.') ? parseFloat(num) : parseInt(num);
}

/**
 * Capture the previous value and the clicked operator
 * so that an operation can be performed.
 */
function clickOperator() {
  operator = event.target.value;
  previous = display.value;
  operatorClicked = true;
}

/**
 * Captures a number click and updates the display value.
 * @param {Event} event 
 */
function clickNumber(event) {
  const val = event.target.value;

  if( operatorClicked ) {
    display.value = val;
    operatorClicked = false;
  } else {
    display.value == 0 ? display.value = val : display.value += val;
  }

}

/**
 * Resets the display value.
 */
function clear() {
  display.value = 0;
}

// add event listener for when the DOM is loaded
document.addEventListener('DOMContentLoaded', () => {


  // set the variable called display equal to the display element
  // HINT: use its id #display to get a reference to it
  const display = document.getElementById('calculator-screen');

  // get a reference to all of the numbers
  const numbers = document.getElementsByClassName('number');
 

  // loop over each of the numbers
  // numbers.forEach((item) => {
  
  // add a click event listener to each number to call the function clickNumber
//     item.addEventListener('click', (event) => {
//       clickNumber(event.target);
    
//   });
// });
  // get a reference to the decimal point button
const decimal = document.getElementsByClassName('decimal');
  // add a click event listener to call the function clickNumber
  // decimal.addEventListener('click', (event)=> {
  //   clickNumber(event.target);
  // });
  // the decimal point is part of the number so append it

  // get a reference to the all clear button
const clear = document.getElementsByClassName('all-clear');
 
  // add a click event listener to call the function clear  
// clear.addEventListener('click', (event)=> {
//   clear(event.target);
// });
  // get a reference to all of the operators;
const operators = document.getElementsByClassName('operator');

  // loop over each of the operators
  // operators.forEach((item) => {


  // add a click event listener to each operator to call the function clickOperator
// operators.addEventListener('click', (event) => {
//   clickOperator(target.event);
// });
  // add click event listener for the equal sign
// operators.addEventListener('click', (event) => {

  // should call the function performOperation
//   performOperation(target.event);
// });
//   });
});
