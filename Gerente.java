package Exercicio1;

public class Gerente extends Funcionario {

    String departamento;

    public Gerente(String nome, int idade, double salario, String departamento) {
        super(nome, idade, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(){
        this.departamento = departamento;
    }

    public void info(){
        System.out.println("Nome: " + getNome() + ", Idade: " + getIdade() + ", Salário: R$" + getSalario() + ", Departamento: " + getDepartamento());
    }
}
