var nome = ["Larissa","Maria","Jonas","Francisco","Guilherme"]
var salario = [2000, 5000, 1000, 3000, 2000]

for(var i = 0; i < 4; i++){
    console.log(nome[i])
    salario[i] = (salario[i] * 0.1) + salario[i]
    console.log(salario[i] + "\n")
}