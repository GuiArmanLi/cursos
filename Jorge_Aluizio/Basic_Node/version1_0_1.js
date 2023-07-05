const express = require("express")
const app = express()
app.use(express.json())

const { v4: uuidv4 } = require('uuid');

const products = [
    {
        id: uuidv4(),
        nome: "Guilherme",
        peso: 62,
        tamanho: 1.81
    }
]

app.get('/getInformation', (request, response) => {
    return response.json({
        products
    })
})

app.post('/newData', (req, res) =>{
    const {nome, peso, tamanho} = req.body

    const product = {id: uuidv4(), nome, peso, tamanho}

    products.push(product)
    console.log(product)
    
    return "Os dados cadastrados foram" + res.status(201).json({
        products
    })
})

app.put('/change/:id', (request, response)=>{
    return ""

})

app.delete('/object/:id', (request, response)=>{
    return ""
})

// Escutando o Programa
app.listen(3001, () => {
    console.log("Rodando no VS")
})