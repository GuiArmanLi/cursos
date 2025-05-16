let express = require('express')
let app = express()
let port = 9050

let users = [
    {
        nomeDeUsuario: "Lucas",
        criadoEm: "14 de Fevereiro",
        idade: 20,
        email: "lucasSantos@gmail.com",
        isAdmin: true,
        telefone: ["11 4002-8022", "11 92342-4792"],
        endereco: ["Rua Sapo Boi Brota Direto, N 444"]
    },
    {
        nomeDeUsuario: "Paulito",
        criadoEm: "16 de Agosto",
        idade: 21,
        email: "nagasumiDemencia@gmail.com",
        isAdmin: false,
        telefone: ["18 3874-9310", "11 834240-9321"],
        endereco: ["Rua so os especiais, N 1"]
    },
    {
        nomeDeUsuario: "Kauan",
        criadoEm: "9 de Fevereiro",
        idade: 16,
        email: "corVisTubarao@gmail.com",
        isAdmin: false,
        telefone: ["21 09123-3547", "21 85234-1543"],
        endereco: ["Rua Camelos Fa Do Breier, 88"]
    },
    {
        nomeDeUsuario: "Guilherme",
        criadoEm: "9 de Janeiro",
        idade: 20,
        email: "albertCamus@hotmail.com",
        isAdmin: true,
        telefone: ["45 21300-1223", "45 55437-9865"],
        endereco: ["Rua Vida Nao Faz Sentido, 344"]
    },
    {
        nomeDeUsuario: "Gabriel",
        criadoEm: "8 de Dezembro",
        idade: 26,
        email: "deixaPraDepois@gmail.com",
        isAdmin: false,
        telefone: ["11 80125-6439", "11 63302-5498"],
        endereco: ["Rua Deixa Pra Depois, N 11"]
    },
]

app.get('/usuarios', function(req, res){
    return res.status(200).json(users)
})

app.listen(port, function(){
    console.log(`servidor rodando http://localhost:${port}`)
})