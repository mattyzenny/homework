// add pageTitle
const pageTitle = 'My Shopping List';
// add groceries
let groceries = [
  // {id: 1, name: 'apples', completed: false},
  // {id: 2, name: 'oranges', completed: false},
  // {id: 3, name: 'grapes', completed: false},
  // {id: 4, name: 'pineapple', completed: false},
  // {id: 5, name: 'cherry', completed: false},
  // {id: 6, name: 'watermellon', completed: false},
  // {id: 7, name: 'grapefruit', completed: false},
  // {id: 8, name: 'starfruit', completed: false},
  // {id: 9, name: 'peaches', completed: false},
  // {id: 10, name: 'plums', completed: false}
  'Apples', 'Oranges', 'Grapes', 'Pineapple', 'Cherry', 'Watermellon', 'Grapefruit', 'Starfruit', 'Peaches', 'Plums'
];
/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle() {
  const heading = document.getElementById('title')
  heading.innerText = pageTitle;
  
}


/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries() {
  const ul = document.querySelector('.shopping-list ul');
  groceries.forEach(item => {
      const li = document.createElement('li')
      li.innerText = item
      ul.appendChild(li)
  });
}


/**
 * This function will be called when the button is clicked. You will need to get a reference
 * to every list item and add the class completed to each one
 */
function markCompleted() {
  const fruits = document.querySelectorAll('li');
  fruits.forEach((fruit) => {
    fruit.classList.add('completed');
  });
}

setPageTitle();

displayGroceries();

// Don't worry too much about what is going on here, we will cover this when we discuss events.
document.addEventListener('DOMContentLoaded', () => {
  // When the DOM Content has loaded attach a click listener to the button
  const button = document.querySelector('.btn');
  button.addEventListener('click', markCompleted);
});
