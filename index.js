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
        message: "testing the program"
    })
})

app.listen(3000, () => {
    console.log("Aqui aparece no Terminal")
})