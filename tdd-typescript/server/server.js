const express = require("express");
const path = require("path");

const app = express();
const serverPort = 3000;
const staticResourcePath = path.join(__dirname, "../dist");

app.use(express.static(staticResourcePath))

app.listen(serverPort, () => {
    console.log("server started on port -> ", serverPort);
});
