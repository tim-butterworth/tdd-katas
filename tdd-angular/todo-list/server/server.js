const express = require("express");
const app = express();
const port = 9000;

const todos = [];

app.use(express.json());

app.get("/hi", (req, res) => {
    res.send({ key: "value" });
});
app.get("/todos", (req, res) => {
    res.send(todos);
})
app.post("/todos", (req, res) => {
    // this should save the todo
    console.log("req", req.body);

    res.send({ differentKey: "value" });
});

app.listen(9000, () => console.log(`starting server at http://localhost:${port}`));
