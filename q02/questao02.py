'''

2) Escreva um programa que verifique, em uma string, a existência da letra ‘a’, 
seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre. 

'''

string = input('Digite a string: ') #pegamos a string informada, podendo ser uma frase, palavra, etc.

#definimos variaveis para o 'A' maiusculo e o 'a' minusculo.
letra_Maiuscula = 'A' 
letra_minuscula = 'a'

aparicao = False #uma variavel para informar se realmente a letra está na palavra/frase
cont = 0 #uma variavel para contar as aparições da letra na string

for palavra in string: #Aqui acessamos cada palavra (no caso da string ser uma frase.)
    for letra in palavra: #Aqui acessamos cada letra de uma palavra
        if letra == letra_Maiuscula or letra == letra_minuscula: #verificamos se a letra, em ambas as formas está presente
            aparicao = True #se estiver presente, setamos a variavel de aparição como True
            cont += 1 #contamos as ocorrencias

if aparicao: #caso tenha apareceido, mostramos na tela que a letra 'a' estava presente e quantas vezes apareceu
    print(f'A letra "a" foi encontrada na string, tanto em maiuculo quanto em minusculo, {cont} vezes.')
    
else: #Senão, apenas informamos que a letra 'a', não apareceu.
    print('A letra "a", tanto em maiuculo quanto em minusculo, nao apareceu na string informada!')