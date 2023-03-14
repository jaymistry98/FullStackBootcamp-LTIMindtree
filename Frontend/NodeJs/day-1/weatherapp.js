var axios = require('axios')

//var url = 'https://jsonplaceholder.typicode.com/users'

module.exports = function(location, callback) {
    var loc = encodeURIComponent(location)

    var url = `https://api.openweathermap.org/data/2.5/weather?q=${loc}&appid=b3aaa0b3323c0baab93aff38f75b44cb&units=metric`

    axios.get(url).then((response) => {
        callback(`The current temperature is ${response.data.main.temp}, pressure is ${response.data.main.pressure}, feels like ${response.data.main.feels_like}, 
        min temperature is ${response.data.main.temp_min}, max temperature is ${response.data.main.temp_max}, sea level is ${response.data.main.sea_level}, ground level is ${response.data.main.grnd_level}`);
    })
} 
