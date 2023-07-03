const express = require("express")
const app = express()

// Get
app.get('/getInformation', (request, response) => {
    // Primeira forma
    const query = request.query
    console.log(query)

    // Segunda Forma
    const {title, owner} = request.query
    console.log(title, owner)

    return response.json({
        message: "Mosquito morto!"
    })
})

// Post
app.post('/newData', (request, response)=>{
    return response.json({
        nome: "Lucas",
        idade: 20,
        profissao: "Estagiario"
    })
})

// Put
app.put('/change/:id', (request, response)=>{
    return response.json({
        nome: "Lucas",
        idade: 20,
        profissao: "Analista de BD",
        obs: "Parabens, foi promovido!"
    })
})

// Delete
app.delete('/object/:id', (request, response)=>{
    return response.json({
        nome: "Paulo",
        idade: 21,
        profissao: "Vagabundo"
    })
})

// Escutando o Programa
app.listen(3000, () => {
    console.log("Aqui aparece no Terminal")
})