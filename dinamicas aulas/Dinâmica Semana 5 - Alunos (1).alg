algoritmo "Ordenacao"

var
numeros: vetor[1..6] de inteiro
aux: inteiro
i, j: inteiro

contador: inteiro

procedimento OrdenacaoNumeros
inicio
//Ordena��o do vetor pelo metodo bolha
para i de 1 ate 6 faca
   para j de 1 ate 6 faca
      se numeros[j] < numeros[i] entao
         aux <- numeros[i]
         numeros[i] <- numeros[j]
         numeros[j] <- aux
      fimse
   fimpara
fimpara
fimprocedimento

inicio

//Implementar a leitura dos 6 n�meros a serem digitados pelo usu�rio
//Armazenar os numeros digitados no vetor de numeros

para contador de 1 ate 6 faca
     Escreva("Informe o", contador, " n�mero a ser armazenado: ")
     leia(numeros[contador])
fimpara



OrdenacaoNumeros

Escreval()
Escreval("N�meros ordenados de forma DECRESCENTE:")
para contador de 1 ate 6 faca
     Escreval(numeros[contador])
fimpara

fimalgoritmo

