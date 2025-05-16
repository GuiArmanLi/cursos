var pessoas = [
    { name: "Guilherme", idade: 20 },
    { name: "Gabriel", idade: 22 },
    { name: "Lucas", idade: 23 },
    { name: "Dulcinea", idade: 53 },
    { name: "Cavalcante", idade: 20 }
];

for (pessoa of pessoas) {
    console.log("Name: " + pessoa.name + ", idade: " + pessoa.idade + ".");
}
