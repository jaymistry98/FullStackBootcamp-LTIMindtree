
var weather = require('./weatherapp.js')

var location = require('./location.js')

var argv = require('yargs')
    .option('location', {
        alias: 'l',
        type:'string'
    }).help('help').argv

if(typeof argv.l === 'string' && argv.l.length > 0) {
    weather(argv.location, function(call){
        console.log(call)
    })
} else {
    location(function(loc){
        if(loc) {
            weather(loc.data.city, function(call) {
                console.log(loc.data.city);
                console.log(call);
            })
        } 
    })
}

