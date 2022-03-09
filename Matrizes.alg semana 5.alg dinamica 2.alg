algoritmo "Matrizes"

var
escada : vetor[1..5, 1..5] de literal
i,j, n : inteiro
contador : inteiro


inicio

para i de 1 ate 5 faca
para j de 1 ate 5 faca
     escada[i,j] <- "1"
fimpara
fimpara
escreval("Informe o valor de N: ")
leia(n)

contador <- 1

 para i de 1 ate n faca
      para j de 1 ate contador faca
           escreva (j)
      fimpara
             escreval()
             contador <- contador + 1
 fimpara





fimalgoritmo
