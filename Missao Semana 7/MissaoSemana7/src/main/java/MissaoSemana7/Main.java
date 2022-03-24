package MissaoSemana7;

public class Main {

    public static void main(String[] args) {
        
        Empregado empregado1 = new Empregado("Iasmini", "Corso", 1000);
        
        System.out.println("Nome: " + empregado1.getPrimeiroNome() + " " + empregado1.getSobrenome());
        
        System.out.println("Salario anual = " + empregado1.getSalarioAnual());
        
        empregado1.aumentarSalario(10);
        
        System.out.println("Aumento de 10% = " + empregado1.getSalarioAnual());
        
        Empregado empregado2 = new Empregado("Larissa", "Voltolini", 2000);
        
        System.out.println("Salario anual = " + empregado2.getSalarioAnual());
        
        empregado2.aumentarSalario(10);
        
        System.out.println("Aumento de 10% = " + empregado2.getSalarioAnual());
    }       
}

