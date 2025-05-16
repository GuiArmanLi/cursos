quantidade_de_pessoas = int(input("Digite a quantidade de pessoas a serem entrevistadas: "))

respostas = [0] * 4
sexos = [0] * 2

for i in range(quantidade_de_pessoas):
    resposta = input(f"O {i + 1}º entrevistado gostou do produto? [y/n]: ").lower()
    sexo = input(f"Qual o sexo do {i + 1}º entrevistado? [f/m]: ").lower()
    
    if sexo == "f":
        sexos[0] += 1  
        if resposta == "y":
            respostas[2] += 1
        else:
            respostas[3] += 1
    elif sexo == "m":
        sexos[1] += 1  
        if resposta == "y":
            respostas[0] += 1
        else:
            respostas[1] += 1

porcentagem_feminina = (respostas[2] * 100 / sexos[0]) if sexos[0] > 0 else 0
porcentagem_masculina = (respostas[3] * 100 / sexos[1]) if sexos[1] > 0 else 0

print(f"O número de entrevistados que responderam sim: {respostas[0] + respostas[2]}\n\
O número de entrevistados que responderam não: {respostas[1] + respostas[3]}\n\
A porcentagem de entrevistados do sexo feminino que responderam sim: {porcentagem_feminina:.2f}%\n\
A porcentagem de entrevistados do sexo masculino que responderam não: {porcentagem_masculina:.2f}%")
