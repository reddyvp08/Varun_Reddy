const express = require('express');
const app = express();
const path = require('path');
const fs =require('fs');
app.get('/',function(req,resp){
    resp.sendFile(path.join(__dirname+'/index.html'));
});
app.listen(3000);
console.log("Server is started");