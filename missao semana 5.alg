algoritmo "Conversor de Temperatura"

var
temperatura, hora : vetor[1..4] de real

opcaoMenu : literal
i, j : inteiro
auxTemperatura, auxHora : real

procedimento apresentarMenu()
inicio
Escreval("Opções do conversor: ")
Escreval("1 - Celsius para Fahrenheit")
Escreval("2 - Fahrenheit para Celsius")
Escreval("3 - Sair")
leia(opcaoMenu)
fimprocedimento

procedimento acumulador()
inicio

    para i de 1 ate 4 faca
         escreva("Informe a hora: ")
         leia(hora[i])
         
         escreva("Informe a temperatura", i,": ")
         leia(temperatura[i])
         escreval()
    fimpara
fimprocedimento


procedimento converter()
inicio
mostrarHistorico()
    se opcaoMenu = "1" entao
       para i de 1 ate 4 faca
            escreval("A temperatura", temperatura[i], "ºC, registrada às ",hora[i],"h corresponde à ",((temperatura[i]*1.8)+32):4:2, "ºF.")
       fimpara
    senao
       se opcaoMenu = "2" entao
          para i de 1 ate 4 faca
               escreval("A temperatura", temperatura[i], "ºF, registrada às ",hora[i],"h corresponde à ",((temperatura[i]-32)/1.8):4:2, "ºC.")
          fimpara
       fimse
    fimse
fimprocedimento

procedimento mostrarHistorico()
inicio
para i de 1 ate 4 faca
     para j de 1 ate 4 faca
          se temperatura[j] > temperatura[i] entao
             auxTemperatura <- temperatura[i]
             temperatura[i] <- temperatura[j]
             temperatura[j] <- auxTemperatura
             
             auxHora <- hora[i]
             hora[i] <- hora[j]
             hora[j] <- auxHora
          fimse
     fimpara
fimpara
fimprocedimento

inicio

Escreval("BEM VINDO(A) AO CONVERSOR DE TEMPERATURA.")

Repita
   apresentarMenu()
      Escolha opcaoMenu
         caso "1"
              acumulador()
              converter()
         caso "2"
              acumulador()
              converter()
         caso "3"
              escreval("Fim.")
         outrocaso
              escreval("Opção inválida. Tente novamente.")
              escreval("---------------------------")
      fimescolha
ate opcaoMenu = "3"


fimalgoritmo
