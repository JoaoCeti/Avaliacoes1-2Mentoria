
numero_secreto = 7

print("=== JOGO DA ADIVINHAÇÃO ===")
print("Tente descobrir o número secreto!")
print("Você tem 5 tentativas.\n")

for tentativa in range(1, 6):
    palpite = int(input(f"Tentativa {tentativa}: Digite um número: "))

    if palpite == numero_secreto:
        print("Parabéns! Você acertou o número secreto!")
        break

    elif palpite > numero_secreto:
        print("Você errou! O número secreto é MENOR.")

    else:
        print("Você errou! O número secreto é MAIOR.")

else:
    print("\nVocê perdeu! Suas tentativas acabaram.")
    print(f"O número secreto era {numero_secreto}.")
