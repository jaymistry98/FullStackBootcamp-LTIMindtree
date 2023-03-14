var express = require('express')
var bp = require('body-parser')
var jwt = require("jsonwebtoken");

const router = express.Router()
const config = require('./config');

var app = express()
app.use(bp.json())

router.get("/", (req, res) => {
    res.send('All are welcome... ')
})

router.post('/login', (req,res) => {
    const postData = req.body
    const user = {
        "name": postData.name,
        "email": postData.email
    }
    const token = jwt.sign(user,config.secret,{expiresIn:config.tokenLife})
    const response = {
        "status":"Logged In",
        "token": token
    }
    res.status(200).json(response)
})

app.use('/api', router)
router.use(require('./tokenChecker'))

router.get("/secure", (req, res) => {
    res.send('I am secure')
})

app.listen(8040, () => {
    console.log("server is running")
})