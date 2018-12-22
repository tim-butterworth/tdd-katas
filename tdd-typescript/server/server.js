const express = require("express");
const path = require("path");

const app = express();
const serverPort = 3000;
const jsStaticResourcePath = path.join(__dirname, "../dist");
const htmlStaticResourcePath = path.join(__dirname, "./html");

app.use("/js", express.static(jsStaticResourcePath))
app.use("/html", express.static(htmlStaticResourcePath))
app.get("/favicon.ico", (req, res) => {
    res.send("My favicon!");
});

app.listen(serverPort, () => {
    console.log("server started on port -> ", serverPort);
});
