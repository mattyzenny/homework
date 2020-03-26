document.addEventListener('DOMContentLoaded', (event) => {
const loadButton = document.querySelector('.loadingButton');
const tmpl = document.getElementById('shopping-list-item-template').content.cloneNode(true);
const list = document.querySelector('ul');

loadButton.addEventListener('click', (event) => {


    fetch('assets/data/shopping-list.json`')
    .then(response => {
        return response.json()
    })
    .then(data => {
        data.forEach(grocery => {
            if( true ) {
                let item = document.importNode(tmpl.content).querySelector('li');
                let name = document.createElement('span');
                name.innerText = grocery.name;
                item.appendChild(name);
                if( grocery.completed ) {
                    item.querySelector("i").classList.add("completed");
                }
                list.appendChild(item);
            }
        });
    });
})
});
