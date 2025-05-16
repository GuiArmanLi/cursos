let express = require('express')
let app = express()
let port = 8050

let produtos = [
    {
        nomeProduto: "Linhaca",
        descricao: "Grao recomendado para nutricao cerebral porque possui omega 3",
        valor: 4.99,
        criadoEm: "2 de Fevereiro",
        emEstoque: true
        
    },
    {
        nomeProduto: "Amendoim",
        descricao: "Otima opcao para ingerir omega 6",
        valor: 9.99,
        criadoEm: "26 de Maio",
        emEstoque: true
    },
    {
        nomeProduto: "Ovo",
        descricao: "Alimento que contem diversas vitaminas essenciais",
        valor: 17.99,
        criadoEm: "20 de Maio",
        emEstoque: false
    },
    {
        nomeProduto: "Frango",
        descricao: "Quer construir musculos saudaveis? Nem pense, so comprar!",
        valor: 14.99,
        criadoEm: "20 de Dezembro",
        emEstoque: false
    },
    {
        nomeProduto: "Cenoura",
        descricao: "Melhore sua visao com esse legume maravilhoso",
        valor: 4.99,
        criadoEm: "5 de Abril",
        emEstoque: true
    },
]

app.get('/produtos', function(req, res){
    return res.status(200).json(produtos)
})

app.listen(port, function(){
    console.log(`servidor rodando http://localhost:${port}`)
})