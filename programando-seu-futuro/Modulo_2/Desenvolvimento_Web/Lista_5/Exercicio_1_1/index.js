let pessoas = [
    {
        nome: "Guilherme",
        idade: 20,
        admin: true,
        email: "guilherme@gmail.com"
    },
    {
        nome: "João",
        idade: 19,
        admin: false,
        email: "joao@gmail.com"
    },
    {
        nome: "Paulo",
        idade: 21,
        admin: false,
        email: "paulo@gmail.com"
    },
    {
        nome: "Lucas",
        idade: 20,
        admin: true,
        email: "lucas@gmail.com"
    },
    {
        nome: "Kauan",
        idade: 20,
        admin: false,
        email: "kauan@gmail.com"
    }   
]
for(let i = 0; i < pessoas.length; i++){
    if(pessoas[i].admin == true){
        console.log("Olá " + pessoas[i].nome + "! Bem vindo(a) você é admin do sistema, enviamos um email para " + pessoas[i].nome + " para você criar uma senha")
    }else {
        console.log("Olá " + pessoas[i].nome + "! Bem vindo(a).")
    }
}