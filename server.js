const express = require('express');
const path = require('path');
const http = require('http');
const { Server } = require('socket.io');

const app = express();
const server = http.createServer(app);
const io = new Server(server);
const port = 3000;

// Set EJS as the templating engine
app.set('view engine', 'ejs');
app.set('views', path.join(__dirname, 'views'));

// Middlewares
app.use(express.static(path.join(__dirname, 'public'))); // Static files (CSS, images, JS)
app.use(express.urlencoded({ extended: false }));
app.use(express.json());

// Routes
const userRoute = require('./router/userRoute');
app.use('/', userRoute); // Main route

// WebSocket connection
io.on('connection', (socket) => {
  console.log('New user connected:', socket.id);

  socket.on('chat message', (msg) => {
    console.log('Message received:', msg);
    // io.emit('chat message', { id: msg.id, text: msg.text }); // Broadcast to all clients
    io.emit('chat message', msg); // Broadcast to all clients
  });

  socket.on('disconnect', () => {
    console.log('User disconnected:', socket.id);
  });
});

// Start the server
server.listen(port, () => {
  console.log(`Server is running at http://localhost:${port}`);
});
