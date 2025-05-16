const express = require("express")
const app = express()
app.use(express.json())

const { v4: uuidv4 } = require('uuid');

const products = []

app.get('/getInformation', (request, response) => {
    return response.json({
        products
    })
})

app.post('/newData', (req, res) =>{
    const {name, price, describe} = req.body

    const product = {id: uuidv4(), name, price, describe}

    products.push(product)
    console.log(product)
    
    return "Os dados cadastrados foram" + res.status(201).json({
        products
    })
})

app.put('/alterProduct{id}', (request, response) => {
    const {id} = request.params
    const {name, price} = request.body

    const indexProduct = products.findIndex(p => p.id === id)
    if (indexProduct < 0){
        return response.status(404).json({
            error: "Product not found"
        })
    }

    if (!name || !price){
        return response.status(204).json({
            message: "Please, put the name and price of the product to alter the item!"
        })
    }

    const product = {name, price}   
    products[indexProduct] = product

    return response.status(200).json(products)
})

app.listen(3001, () => {})