package Prova2;

import java.time.LocalDate;

public class Diretor extends CargoDeConfianca implements Contratacao{
    
    private final double PREMIO = 0.3;

    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(bonificacao, nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento);
    }

    @Override
    public double getSalarioFinal() {
        double salarioFinal = 0;
        salarioFinal += super.salario * bonificacao.valor;
        salarioFinal += super.salario * PREMIO;
        salarioFinal += super.salario;
        return salarioFinal;
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Admitir Funcionario: ");
        System.out.println(funcionario.toString());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitir Funcionario: ");
        System.out.println(funcionario.toString());
    }

    public double getPREMIO() {
        return PREMIO;
    }

    @Override
    public String toString() {
        return "\n Diretor: " + 
                super.toString() +
                "\n PREMIO: " + PREMIO +
                "\n Salario Final: " + Util.formatarBrl(getSalarioFinal());
    }
    
    
    
}
