algoritmo "Conversor temperatura e moeda"

var
celsius, fahrenheit, reais, dolares, cotacao : real
opcaoMenu, continuar : literal

inicio

Repita
   Escreval("Opções do conversor: ")
   Escreval("1 - Celsius para Fahrenheit")
   Escreval("2 - Fahrenheit para Celsius")
   Escreval("3 - Real para Dólar")
   Escreval("4 - Dólar para Real")
   Escreval("5 - Encerrar programa")
   leia(opcaoMenu)
   
   se opcaoMenu = "1" entao
      Escreval("Diga a temperatura em Celsius")
      leia(celsius)
      fahrenheit <- (1.8 * celsius) + 32
      Escreval("A temperatura em Fahrenheit é de: ",fahrenheit:4:2, "ºF")
      Escreval("Deseja continuar?")
      Escreval("1 - Sim")
      Escreval("2 - Não")
      
      leia(continuar)
         se continuar = "2" entao
            interrompa
         fimse
    fimse
    
    se opcaoMenu = "2" entao
      Escreval("Diga a temperatura em Fahrenheit")
      leia(fahrenheit)
      celsius <- (fahrenheit - 32) / 1.8
      Escreval("A temperatura em Celsius é de: ",celsius:4:2, "ºC")
      Escreval("Deseja continuar?")
      Escreval("1 - Sim")
      Escreval("2 - Não")

      leia(continuar)
         se continuar = "2" entao
            interrompa
         fimse
    fimse
    
    se opcaoMenu = "3" entao
      Escreval("Diga qual é a cotação do dólar em relação ao real")
      leia(cotacao)
      Escreval("Diga o valor em Reais")
      leia(reais)
      dolares <- reais / cotacao

      Escreval("R$",reais, " reais, equivalem à US$ ",dolares:4:2, " dólares.")
      Escreval("Deseja continuar?")
      Escreval("1 - Sim")
      Escreval("2 - Não")

      leia(continuar)
         se continuar = "2" entao
            interrompa
         fimse
    fimse
    
    se opcaoMenu = "4" entao
      Escreval("Diga qual é a cotação do dólar em relação ao real")
      leia(cotacao)
      Escreval("Diga o valor em Dólares")
      leia(dolares)
      reais <- dolares * cotacao

      Escreval("US$ ",dolares," dólares, equivalem à R$",reais," reais.")
      Escreval("Deseja continuar?")
      Escreval("1 - Sim")
      Escreval("2 - Não")

      leia(continuar)
         se continuar = "2" entao
            interrompa
         fimse
    fimse

ate opcaoMenu = "5"
Escreval("PROGRAMA ENCERRADO.")

fimalgoritmo
