package MissaoSemana7;

public class Empregado {
    
    private String primeiroNome;
    private String sobrenome;
    private double salarioMensal;

    public Empregado(String primeiroNome, String sobrenome, double salarioMensal) {
        this.setPrimeiroNome(primeiroNome);
        this.setSobrenome(sobrenome);
        this.setSalarioMensal(salarioMensal);
    }

    // Cálculo salário anual:
    public double getSalarioAnual(){
        return (salarioMensal * 12);
    }
    
    // Cálculo aumento de 10%:
    public void aumentarSalario(float percentualAumento){
        salarioMensal += (salarioMensal * percentualAumento) / 100;
    }
    
    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        if(salarioMensal < 0){
            this.salarioMensal = 0;         
        } else {
            this.salarioMensal = salarioMensal;
        }
    }

}
