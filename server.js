const express = require('express');
const cors = require('cors')
const app = express();
const mysql = require('mysql')
const db = mysql.createConnection({
    host: "localhost",
    user: "varun",
    password: "root123",
    database: "test"
})

app.use(cors());
app.use(express.json())

app.get("/", (req, res) => {
    db.query("SELECT * FROM emp", (err, result) => {
        if (err) {
            console.log(err)
        }
        console.log(result);
        res.send(result)
    });
});

app.post('/adddata', (req, res) => {
    console.log(req.body)
    const { name, rollno, email, batch } = req.body;
    const query1 = `insert into emp values ('${name}','${rollno}','${email}','${batch}')`;
    db.query(query1, (err, result) => {
        if (err) {
            console.log(err);
        }
        else {
            res.send(result);
        }
    })
})
app.delete('/delete/:empno', (req, res) => {
    const empno = req.params.empno;
    const query2 = `DELETE FROM emp WHERE empno = '${empno}'`;
    db.query(query2, (err, result) => {
        if (err) {
            console.log(err)

        } else {
            res.send(result);
        }
    })
})



app.listen(3000, () => {
    console.log("Server is running on 3000")
})
