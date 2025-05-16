QUANTIDADE_DE_NUMEROS = 10
numeros = [QUANTIDADE_DE_NUMEROS]

somatorio = 0
for i in range( QUANTIDADE_DE_NUMEROS):
    i = input(f"Digite o valor da posição {i + 1} no vetor: ")
    numero = int(i)
    if (numero % 3 == 0):
        somatorio +=numero

print(somatorio)