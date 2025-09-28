import sys


QUANTIDADE_DE_BOIS = 4

# 0 - Boi mais gordo
# 1 - Index boi mais gordo
# 2 - Boi mais magro
# 3 - Index boi mais magro

informacoes = [-sys.maxsize - 1, 0, sys.maxsize, 0]

for i in range(QUANTIDADE_DE_BOIS):
    numero_boi = int(input("Digite o numero do boi: "))
    peso_boi = int(input("Digite o peso do boi: \n"))

    if peso_boi > informacoes[0]:
        informacoes[0] = peso_boi
        informacoes[1] = numero_boi
        
    if peso_boi < informacoes[2]:
        informacoes[2] = peso_boi
        informacoes[3] = numero_boi

print (f"Boi mais gordo: {informacoes[0]}\t\
Numero do boi mais gordo: {informacoes[1]}\n\
Boi mais magro: {informacoes[2]}\t\
Numero do boi mais magro: {informacoes[3]}")