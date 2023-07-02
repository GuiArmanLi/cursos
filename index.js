const express = require("express")
const app = express()

pessoa = [
    {
        nome: "Guilherme",
        idade: 20,
        profissao: "Auxiliar de Legalizacao"
    },
    {
        nome: "Paulo",
        idade: 21,
        profissao: "Vagabundo"
    }
]

app.get('/', (request, response) => {
    return response.json({
        message: "Testando, acho que melhorei um pouco. Agora tudo se atualiza em tempo real!\nAqui aparece no navegador. Mudei ein"
    })
})

app.post('/object', (request, response)=>{
    return response.json({
        nome: "Lucas",
        idade: 20,
        profissao: "Estagiario"
    })
})

app.post('/object', (request, response)=>{
    return response.json({
        nome: "Lucas",
        idade: 20,
        profissao: "Estagiario"
    })
})

app.put('/object/:id', (request, response)=>{
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