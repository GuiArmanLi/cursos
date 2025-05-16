let pessoas = [
    {
        nome: 'Paulo',
        sobrenome: 'Leal',
        idade: 21
    },
    {
        nome: 'Lucas',
        sobrenome: 'Santos',
        idade: 20
    },
    {
        nome: 'Joao',
        sobrenome: 'Lima',
        idade: 20
    },
    {
        nome: 'Kauan',
        sobrenome: 'Barbosa',
        idade: 20
    },
    {
        nome: 'Guilherme',
        sobrenome: 'Pessa',
        idade: 20
    }
]

function verificaMaiorIdade (pessoas){
    for(i = 0; i < pessoas.length; i++){
        if (pessoas[i].idade < 18){
        console.log("Seja bem vindo(a) " + pessoas[i].nome + " " +  pessoas[i].sobrenome + " tem " + pessoas[i].idade + " anos e é menor de idade.")
        }else {
            console.log("Seja bem vindo(a) " + pessoas[i].nome + " " +  pessoas[i].sobrenome + " tem " + pessoas[i].idade + " anos e é maior de idade.")
            }
    }
}

function verificaNome(pessoas){
    for(i = 0; i < pessoas.length; i++){
        if(pessoas[i].nome.length < 3){
            console.log("Erro! Nome invalido, nome e sobrenome devem ser maiores que 3 caracteres.")
        }else if(pessoas[i].nome.length > 50){
            console.log("Erro! Nome invalido, nome e sobrenome devem ser menores que 50 caracteres.")
        }
    }
}

function verificaQuantidadePessoas(pessoas){
    return console.log(pessoas.length);
}

verificaMaiorIdade(pessoas)
verificaNome(pessoas);
verificaQuantidadePessoas(pessoas)