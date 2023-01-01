var express =require('express');
var app= express();
app.get('/add',function(req,resp){
    resp.send("addition of number ="+(Number(req.query.num)+Number(req.query.num1)));
    console.log("ADdition");
});
app.get('/mul',function(req,resp){
    resp.send("mul of number ="+(Number(req.query.num)*Number(req.query.num1)));
 console.log("multiplication");
});
app.get('/',function(req,resp){
    resp.send("mul of number" );
 console.log("multiplication");
});
app.listen(3000);
