algoritmo "Matrizes"

var
escada : vetor[1..20] de inteiro
i,j, n : inteiro
contador : inteiro

inicio

escreval("Informe o valor de N: ")
leia(n)
   se n > 20 entao
      Escreval("Operação invalida.")
      interrompa
   senao

      contador <- 1

       para i de 1 ate n faca
            para j de 1 ate contador faca
                 escreva (j)
            fimpara
                   escreval()
                   contador <- contador + 1
       fimpara
   fimse





fimalgoritmo
