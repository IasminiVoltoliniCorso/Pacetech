algoritmo "Conversor"
var
   fahrenheit, celsius: real
   i : inteiro

inicio
fahrenheit <- 32

   Escreval("Diga a temperatura em Fahrenheit")
   leia(fahrenheit)
   celsius <- (fahrenheit - 32)* 5/9
   Escreval(celsius:4:2)
   
   se celsius <= 15 entao
   Escreval("Está frio")
   
   senao
        se celsius <= 28 entao
        Escreval("Está agradável")
        
        senao celsius > 28 entao
        Escreval("Está calor")
        fimse
   fimse
para i de 0 ate 100 faca
     fahrenheit <- (i * 1.8) + 32
     escreval(i"ºC - ", fahrenheit,"ºF")

fimpara

fimalgoritmo
