package Prova2;

import java.time.LocalDate;

public class Gerente extends CargoDeConfianca{

    public Gerente(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(bonificacao, nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento);
    }

    @Override
    public double getSalarioFinal() {
        double salarioFinal = 0;
        salarioFinal += super.salario * bonificacao.valor;
        salarioFinal += super.salario;
        return salarioFinal;
    }

    @Override
    public String toString() {
        return "\n Gerente: " +
                super.toString() +
                "\n Salario Final: " + Util.formatarBrl(getSalarioFinal());
    }
    
    
}
