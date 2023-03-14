module.exports = middleware = {
        requireAuth: function(req,res,next) {
            console.log('private route hot');
            next()
        },
        logger: function(req,res,next) {
            console.log(`Request ${new Date().toString()} ${req.method} ${req.originalUrl}`);
            next()
        }
}
