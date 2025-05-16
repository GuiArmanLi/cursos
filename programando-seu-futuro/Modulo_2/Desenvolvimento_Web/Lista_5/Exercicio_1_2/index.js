    let pessoa1 = {
        nome: "Guilherme",
        idade: 20,
        admin: true,
        email: "guilherme@gmail.com"
    }
    let pessoa2 = {
        nome: "João",
        idade: 19,
        admin: false,
        email: "joao@gmail.com"
    }
    let pessoa3 = {
        nome: "Paulo",
        idade: 21,
        admin: false,
        email: "paulo@gmail.com"
    }
    let pessoa4 = {
        nome: "Lucas",
        idade: 20,
        admin: true,
        email: "lucas@gmail.com"
    }
    let pessoa5 = {
        nome: "Kauan",
        idade: 20,
        admin: false,
        email: "kauan@gmail.com"
    }   

let listaPessoas = [pessoa1, pessoa2, pessoa3, pessoa4, pessoa5]

for (let pessoa of listaPessoas) {
    console.log()
    if(pessoa.admin){
        console.log("Olá " + pessoa.nome + "! Bem vindo(a) você é admin do sistema, enviamos um email para " + pessoa.email + " para você criar uma senha")
    }else {
        console.log("Olá " + pessoa.nome + "! Bem vindo(a).")
    }
}