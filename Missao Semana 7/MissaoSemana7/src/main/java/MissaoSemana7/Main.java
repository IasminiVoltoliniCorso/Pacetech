package MissaoSemana7;

public class Main {

    public static void main(String[] args) {

        Empregado empregado1 = new Empregado("Iasmini", "Corso", 3000);

        System.out.println("Nome: " + empregado1.getPrimeiroNome() + " " + empregado1.getSobrenome());

        System.out.println("Salario anual = R$ " + empregado1.getSalarioAnual());

        empregado1.aumentarSalario(10);

        System.out.println("Aumento de 10% = R$ " + empregado1.getSalarioAnual());

        System.out.println("-----------------------------------");

        Empregado empregado2 = new Empregado("Larissa", "Voltolini", 4000);

        System.out.println("Nome: " + empregado2.getPrimeiroNome() + " " + empregado2.getSobrenome());

        System.out.println("Salario anual = R$ " + empregado2.getSalarioAnual());

        empregado2.aumentarSalario(10);

        System.out.println("Aumento de 10% = R$ " + empregado2.getSalarioAnual());
    }
}
