/* 
const getBlogs=(callbackapp) => {
    setTimeout(() => {
        callbackapp({
            title: 'Welcome to callbacks'
        })
    }, 2000);
}

getBlogs((bp) => {
    console.log(bp.title);
}) 
*/

function getUser(id, callback) {
    setTimeout(() => {
        console.log('Getting the user from multiple social media accounts');
        callback({
            id: id,
            name:'samuel'
        })
    }, 2000);
}

function loadBlogs(username, callback){
    setTimeout(() => {
        console.log('calling Instagram, FB and Twitter for posts');
        callback(['Post-1', 'Post-2', 'Post-3'])
    }, 2000);
}

function loadComments(post, callback){
    setTimeout(() => {
        console.log('Loading comments .....' + post);
        callback(['comments for ' + post])
    }, 2000);
}

getUser(101, (user) => {
    loadBlogs(user.name, (blogs) => {
        loadComments([blogs[0]], (comments) => {
            console.log(user, blogs[0], comments);
        });
    });
});