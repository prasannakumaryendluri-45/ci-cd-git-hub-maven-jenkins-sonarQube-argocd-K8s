// app.js
const http = require('http');

const resumeContent = `
First Name
Prasanna

Surname
Kumar Yendluri

City
Hyderabad

Country
India

Pin Code
110034

Phone
+91 6302729969

Email *
prasannayendluri45@gmail.com
`;

const PORT = 9090;

const server = http.createServer((req, res) => {
  res.writeHead(200, {'Content-Type': 'text/plain'});
  res.end(resumeContent);
});

server.listen(PORT, () => {
  console.log(`Server running on port ${PORT}`);
});
