const express = require('express')
const router  = express.Router();

router.get("/", (req,res)=>{
    res.render('index')
})

router.post('/send', (req,res)=>{
    const message = req.body.message
    console.log("message")
    
    res.redirect('/')
})

module.exports = router;