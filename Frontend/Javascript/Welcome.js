/* console.log('Welcome to JavaScript');
document.write('Welcome to JS')
alert('Welcome') */

/* let name = 'sam'
let age = 22
let income = 4500.25
//var city = 'Mumbai'


//document.write(name + ' ' + age + ' ' + income)

function showData(){
    document.write(`Hello your name is ${name} your age is ${age} with income ${income} `)
} */

/*
function show(){
    let name = document.getElementById('uname').value 
    let age = document.getElementById('age').value
    let income = document.getElementById('income').value 
    //document.write(`Hello your name is ${name} your age is ${age} with income ${income}`)
    document.getElementById('shw').innerHTML=name
}
*/

/* function saveObj(){
    var userData={
        name: document.getElementById('uname').value,
        age: document.getElementById('age').value,
        income: document.getElementById('income').value
    }
    var data = JSON.stringify(userData)
    localStorage.setItem('mydata',data)
    //console.log(userData)
}

function showData(){

    var loadData = localStorage.getItem('mydata')
    document.getElementById('shw').innerHTML=loadData
    console.log(loadData)
}
 */


function saveData(){
    const formData = document.querySelector('form')

    formData.addEventListener('submit', function(e){
        e.preventDefault()
        const fdata = new FormData(formData)
        const obj = Object.fromEntries(fdata)
        console.log(obj);
    })
}