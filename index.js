const express = require("express")
const app = express()

app.get('/', (request, response) => {
    return response.json({
        message: "Testando, acho que melhorei um pouco. Agora tudo se atualiza em tempo real!"
    })
})

app.listen(3000, () => {
    console.log("Testando aplicacao")
})