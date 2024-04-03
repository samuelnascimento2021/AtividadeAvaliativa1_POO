package Exercicio1;

import jdk.dynalink.beans.StaticClass;

public class TesteFuncionario {

    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("Vitor", 35, 3800);
        Funcionario f2 = new Funcionario("Jonas", 60, 4200);

        Gerente g1 = new Gerente("Alberto", 46, 39000, "Vendas");
        Gerente g2 = new Gerente("Rafaela", 44, 42000, "Diretoria");

        f1.info();
        f2.info();

        g1.info();
        g2.info();

    }
}