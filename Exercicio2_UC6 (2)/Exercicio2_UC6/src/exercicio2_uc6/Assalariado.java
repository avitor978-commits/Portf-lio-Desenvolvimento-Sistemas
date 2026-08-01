
package exercicio2_uc6;


public class Assalariado extends Funcionario {
    
    private double salario;
    
    public Assalariado(String nome, String cpf, String endereco, String telefone, String setor, double salario){
        super(nome, cpf, endereco,telefone,  setor);
        
        this.salario = salario;
    }
    public double getSalario(){
        return salario;
    }
    public void seteSalario(double salario){
        this.salario = salario;
    }
    @Override
    public double calcularPagamento(){
        return salario;
    }
    @Override
    public void aplicarAumento(double porcentagem){
        this.salario = this.salario + (this.salario * (porcentagem / 100));
    }
}
