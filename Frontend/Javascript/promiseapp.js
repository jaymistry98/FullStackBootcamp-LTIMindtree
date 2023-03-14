/* 
const URL = 'https://jsonplaceholder.typicode.com/users'
function loadUsers(){
    fetch(URL)
    .then((respone) => {
        return respone.json()
    })
    .then((data) => {
        console.log(data);
    })
} 
*/

const URL = "https://jsonplaceholder.typicode.com/users";

function loadUsers() {
  const ul = document.getElementById("data");

  const list = document.createDocumentFragment();

  fetch(URL)
    .then((response) => {
      return response.json();
    })
    .then((data) => {
      let mydata = data;
      console.log(mydata);

      mydata.map(function (dt) {
        let li = document.createElement("li");
        let name = document.createElement("h2");
        let email = document.createElement("span");

        name.innerHTML = `${dt.name}`;

        email.innerHTML = `${dt.email}`;

        li.appendChild(name);
        li.appendChild(email);

        ul.appendChild(li);
        console.log(ul);
      });
    })
    .catch(function (error) {
      console.log(error);
    });
}
