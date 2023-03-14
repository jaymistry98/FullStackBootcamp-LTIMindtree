
var express = require('express')

var bp = require('body-parser')

var _ = require('underscore')

var mw = require('./middleware.js')

var app = express()

app.use(bp.urlencoded({extended: true}));
/*
var middleware = {
    requireAuth: function(req,res,next) {
        console.log('private route hot');
        next()
    },
    logger: function(req,res,next) {
        console.log(`Request ${new Date().toString()} ${req.method} ${req.originalUrl}`);
        next()
    }
}
*/
app.use(mw.requireAuth)

var uid = 1
var userdata = []

app.get("/", (req,res) => {
    res.render('index.ejs', {userdata:userdata})
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
    /*
    userdata.forEach(function (td) {
        if (did === td.uid) {
            mtd = td;
        }
    });
    */
    if (mtd) {
        res.send(mtd);
    } else {
        res.send("User not found");
    }
});

app.delete("/deleteuser/:id", (req, res) => {
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

app.listen(8045, () => {
    console.log('server is ready');
})