
# Quantidade máxima de ingressos
limite_ingressos = 100

# Limite máximo de convidados
limite_convidados = 20

# Entrada de dados
alunos = int(input("Digite a quantidade de alunos: "))
monitores = int(input("Digite a quantidade de monitores: "))
convidados = int(input("Digite a quantidade de convidados: "))

# Soma do total de pessoas
total = alunos + monitores + convidados

# Verificação das condições
if total <= limite_ingressos and convidados <= limite_convidados:
    print("Inscrições permitidas!")
    print("Todos poderão participar do evento.")

else:
    print("Inscrições não permitidas!")

    if total > limite_ingressos:
        print("O número total de pessoas ultrapassou os 100 ingressos.")

    if convidados > limite_convidados:
        print("O número de convidados ultrapassou o limite de 20 pessoas.")
