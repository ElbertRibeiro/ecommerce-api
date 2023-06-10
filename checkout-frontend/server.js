let express = require('express');
let app = express();
app.use(express.static(__dirname + '/public')); //__dir and not _dir
let port = 8000; // you can use any port
app.listen(port);
console.log('server on: ' + port);