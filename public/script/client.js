// // 

// const socket = io();
// let myId = null;

// const form = document.getElementById('chat-form');
// const input = document.getElementById('chat_input');
// const chatContainer = document.getElementById('chat-container');

// // Get my own socket ID once connected
// // socket.on('connect', () => {
// //   myId = socket.id;
// // });

// // Send message
// form.addEventListener('submit', (e) => {
//   e.preventDefault();
//   const msg = input.value.trim();
//   if (msg) {
//     socket.emit('chat message', { id: socket.id, text: msg });
//     input.value = '';
//   }
// });

// // Receive message
// socket.on('chat message', (msg) => {
//   const msgElement = document.createElement('div');
//   const isMyMsg = msg.id === socket.id;

//   msgElement.className = `w-full flex ${isMyMsg ? 'justify-end' : 'justify-start'}`;

//   const bubble = document.createElement('div');
//   bubble.className = `${isMyMsg ? 'bg-blue-500 text-white' : 'bg-gray-200 text-black'} px-3 py-2 rounded-lg max-w-xs`;
//   bubble.textContent = msg.text;

//   msgElement.appendChild(bubble);
//   chatContainer.appendChild(msgElement);

//   // Scroll to bottom
//   chatContainer.scrollTop = chatContainer.scrollHeight;
// });


const socket = io();
const form = document.getElementById('chat-form');
const input = document.getElementById('chat_input');
const imageInput = document.getElementById('imageInput');
const chatContainer = document.querySelector('.flex-1');

form.addEventListener('submit', (e) => {
  e.preventDefault();

  const msg = input.value.trim();
  const file = imageInput.files[0];

  if (file) {
    const reader = new FileReader();
    reader.onload = () => {
      const imageData = reader.result; // base64 string
      socket.emit('chat message', { id: socket.id, image: imageData });
    };
    reader.readAsDataURL(file);
    imageInput.value = ''; // reset image
  }

  if (msg) {
    socket.emit('chat message', { id: socket.id, text: msg });
    input.value = '';
  }
});

socket.on('chat message', (msg) => {
  const isMyMsg = msg.id === socket.id;

  const msgElement = document.createElement('div');
  msgElement.className = `w-full flex ${isMyMsg ? 'justify-end' : 'justify-start'}`;

  const bubble = document.createElement('div');
  bubble.className = `${isMyMsg ? 'bg-blue-500 text-white' : 'bg-gray-200 text-black'} px-3 py-2 rounded-lg max-w-xs`;

  // Handle image or text
  if (msg.image) {
    const link = document.createElement('a');
    link.href = msg.image;
    link.download = "chat-image.png"; // you can customize the filename
    link.target = "_blank";

    const img = document.createElement('img');
    img.src = msg.image;
    img.className = "rounded-lg max-w-full h-auto hover:opacity-80 cursor-pointer";

    link.appendChild(img);
    bubble.appendChild(link);
  } else if (msg.text) {
    bubble.textContent = msg.text;
  }

  msgElement.appendChild(bubble);
  chatContainer.appendChild(msgElement);
  chatContainer.scrollTop = chatContainer.scrollHeight;
});
