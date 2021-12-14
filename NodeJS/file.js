const fs = require('fs');
const path = require('path');


fs.mkdir(path.join(__dirname,'/TrainingDetails'),{},function(err){
    if(err) throw err;
    console.log('')
}) 

fs.writeFile(path.join(__dirname,'/TrainingDetails','/Student.txt')
   ,'Student name is sushma'
   ,(err)=>{
    if(err) throw err;
    console.log('File written to...');
});


fs.readFile(path.join(__dirname,'/TrainingDetails','/Student.txt'),'utf8',(err,data)=>{
    if(err)throw err;
    console.log(data);
});

