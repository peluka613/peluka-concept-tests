const routes = (app) => {

    app.route('/')
    
    .get((req, res) => {
        res.send(`Get service`);
    })
    
    .put((req, res) => {
        res.send(`Put service`);
    })
    
    .post((req, res) => {
        res.send(`Post service`);
    })
    
    .delete((req, res) => {
        res.send(`Delete service`);
    })
}

module.exports = routes;

