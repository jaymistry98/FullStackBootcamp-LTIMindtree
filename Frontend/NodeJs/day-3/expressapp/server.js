
var express = require('express')

var bp = require('body-parser')

var _ = require('underscore')

var mw = require('./middleware.js')

var jwt = require("jsonwebtoken");

const router = express.Router()
const config = require('./config');

var app = express()

app.use(bp.urlencoded({extended: true}));

app.use(mw.requireAuth)

var uid = 1
var userdata = []

app.use('/api', router)
router.use(require('./tokenChecker.js'))


app.get("/", (req,res) => {
    res.render('index.ejs', {userdata:userdata})
})

router.get("/login", (req, res) => {
    res.render('login.ejs');
})

router.post('/login', (req,res) => {
    const postData = req.body
    const user = {
        "email": postData.email,
        "uname": postData.uname
    }
    var find_user = _.findWhere(userdata, {uname:user.uname}, {email:user.email})
    if(find_user){
        const token = jwt.sign(user,config.secret,{expiresIn:config.tokenLife})
        const response = {
            "status":"Logged In",
            "token": token
        }
        res.status(200).json(response)
    }
    else {
        res.send("user not found")
    }
    //res.render('login.ejs', {userdata:userdata})
})

app.post("/adduser", mw.requireAuth, (req, res) => {
    let data = req.body;
    data.id = uid++;
    userdata.push(data);
    //res.send("user added");
    res.render('index.ejs', {userdata:userdata})
});

app.get("/loadusers", mw.logger, (req,res) => {
    res.send(userdata)
})

app.get("/loaduser/:id", (req, res) => {
    var did = parseInt(req.params.id);
    var mtd = _.findWhere(userdata, {uid:did})
    
    if (mtd) {
        res.send(mtd);
    } else {
        res.send("User not found");
    }
});


router.delete("/deleteuser/:id", (req, res) => {
    var did = parseInt(req.params.id);
    var mtd = _.findWhere(userdata, {id:did})
    
    if (!mtd) {
        res.status(404).json({"error": "User not found..."})
    } else {
        userdata = _.without(userdata,mtd)
        res.send("User deleted");
    }
});

app.put("/updateuser/:id", (req, res) => {
    var did = parseInt(req.params.id);
    var mtd = _.findWhere(userdata, {id:did})
    
    if (!mtd) {
        res.status(404).json({"error": "User not found..."})
    } else {
        let data = req.body;
        mtd = _.extend(mtd, data);
        res.send("user updated");
    }
});

/* //professor's solution for updateuser
app.put("/updateuser/:id", (req, res) => {
    var did = parseInt(req.params.id);
    var mtd = _.findWhere(userdata, { id: did });
    var body = _.pick(req.body, "uname", "email");
    if (!mtd) {
      res.status(404).json({ error: "User not found..." });
    } else {
      var udata = {};
      udata.uname = body.uname;
      udata.email = body.email;
      console.log(udata);
      _.extend(mtd, udata);
      res.json(mtd);
    }
  });
*/  

//app.use(express.static('public'))

app.listen(8040, () => {
    console.log('server is ready');
})