const jwt = require("jsonwebtoken");

const config = require("./config");

module.exports = (req, res, next) => {
    const token = req.body.token || req.query.token || req.headers["x-access-token"];
    if(token) {
        jwt.verify(token, config.secret, function (err, decode) {
            if (err) {
                return res.status(401).json({error: true, message: " Unauthorized Access"});
            }
            req.decoded = decode;
            next();
        });
    } else {
        res.status(403).send({
            error: true,
            message: "No token found",
        });
    }
};