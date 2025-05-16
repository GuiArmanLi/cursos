const express = require("express")

const app = express()

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

app.post('/newData', (request, response)=>{
    return response.json({
        nome: "Lucas",
        idade: 20,
        profissao: "Estagiario"
    })
})

app.put('/change/:id', (request, response)=>{
    return response.json({
        nome: "Lucas",
        idade: 20,
        profissao: "Analista de BD",
        obs: "Parabens, foi promovido!"
    })
})

app.delete('/object/:id', (request, response)=>{
    return response.json({
        nome: "Paulo",
        idade: 21,
        profissao: "Vagabundo"
    })
})

app.listen(3000, () => {
    console.log("Aqui aparece no Terminal")
})