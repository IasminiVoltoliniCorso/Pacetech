algoritmo "Conversor de Temperatura"

var
celsius : vetor[1..4] de literal
fahrenheit : vetor[1..4] de literal
hora : vetor[1..4] de literal
opcaoMenu : literal

procedimento menu()
inicio
Escreval("Opções do conversor: ")
Escreval("1 - Celsius para Fahrenheit")
Escreval("2 - Fahrenheit para Celsius")
Escreval("3 - Sair")
leia(opcaoMenu)
fimprocedimento

procedimento converterCelsius()
var
i : inteiro

inicio

para i de 1 ate 4 faca
   Escreval("Favor informar a hora:")
   leia(hora[i])
   Escreval("Diga a temperatura em Celsius:")
   leia(celsius[i])
   fahrenheit <- (1.8 * celsius[i]) + 32

fimpara
fimprocedimento

procedimento converterFahrenheit()
var
i : inteiro

inicio

para i de 1 ate 4 faca
   Escreval("Favor informar a hora:")
   leia(hora[i])
   Escreval("Diga a temperatura em Fahrenheit")
   leia(fahrenheit[i])
   celsius <- (fahrenheit - 32) / 1.8
   escreval(celsius:4:2)
fimpara

fimprocedimento

procedimento resultadoCaso1()
var

inicio
para i de 1 ate 4 faca
     Escreval("Temperatura ", celsius,"ºC, foi registrada às ", hora,"h, correspodente a ", fahrenheit,"ºF")
fimpara

fimprocedimento

procedimento resultadoCaso2()
var

inicio
para i de 1 ate 4 faca
     Escreval("Temperatura ", fahrenheit,"ºF, foi registrada às ", hora,"h, correspodente a ", celsius,"ºC")
fimpara

fimprocedimento

inicio

Repita
   menu()
      Escolha opcaoMenu
         caso "1"
              converterCelsius()
              resultadoCaso1()

         caso "2"
              converterFahrenheit()
              resultadoCaso1()
         caso "3"
              escreval("Fim.")
         outrocaso
              escreval("Opção inválida.")
              escreval("---------------------------")
      fimescolha
ate opcaoMenu = "3"

fimalgoritmo
