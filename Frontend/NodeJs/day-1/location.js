
var axios = require('axios')

module.exports = function(callback) {
    var url = 'http://ipinfo.io'

    axios.get(url).then((res) => {
        console.log(res.data.city);
    })
}
