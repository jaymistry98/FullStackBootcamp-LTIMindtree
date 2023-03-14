function getUser(id) {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            console.log('Getting the user from multiple social media accounts');
            resolve({
                id: id,
                name:'samuel'
            });
        }, 2000);
    })
}

function loadBlogs(username,){
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            console.log('calling Instagram, FB and Twitter for posts');
            resolve(['Post-1', 'Post-2', 'Post-3'])
        }, 2000);
    })
    
}

function loadComments(post,){
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            console.log('Loading comments .....' + post);
            resolve(['comments for ' + post])
        }, 2000);
    }) 
}

getUser(101)
    .then(user => loadBlogs(user.name))
    .then(bp => loadComments(bp[0])
    .then(comments => console.log(comments))
    .catch(err => console.log(err)))