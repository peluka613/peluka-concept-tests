var express = require("express");
const app = express();
const PORT = process.env.port || 3000;
const routes = require('./src/routes/crmRoutes');

routes(app);

app.listen(PORT, () => {
    console.log(`Running on port: ${PORT}`);
})