algoritmo "Conversor"
var
   fahrenheit, celsius: real

inicio
   Escreval("Temperatura em Fahrenheit")
   leia(fahrenheit)
   celsius <- (fahrenheit - 32)* 5/9
   Escreval(celsius)
   
   se celsius <= 15 entao
   Escreval("Está frio")
   
   senao
        se celsius >= 28 entao
        Escreval("Está agradável")
        
        senao celsius > 28 entao
        Escreval("Está calor")
        fimse
   fimse

// Seção de Comandos 
fimalgoritmo
