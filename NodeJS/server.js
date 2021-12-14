const Http=require('http')
const fs = require('fs')
const path = require('path')

const server = Http.createServer((req,res)=>{
    //the home page url
    if(req.url=='/student.html'){
        fs.readFile(path.join(__dirname,'Public','student.html'),
        (err,content)=>{
            if(err) throw err;
            res.writeHead(200,{'Content-Type':'text/html'}),
            res.end(content);
        })
    }

});
const PORT= process.env.PORT || 5000;
server.listen(PORT,()=>console.log(`Server running on port ${PORT}`));