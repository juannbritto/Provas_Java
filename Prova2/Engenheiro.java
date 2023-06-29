package Prova2;

import java.time.LocalDate;

public class Engenheiro extends Funcionario{
    
    private String crea;

    public Engenheiro(String crea, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento);
        this.crea = crea;
    }

    @Override
    public double getSalarioFinal() {
        return salario;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    @Override
    public String toString() {
        return "\n Engenheiro: " + 
                super.toString() +
                "crea: " + crea +
                "\n Salario Final: " + Util.formatarBrl(getSalarioFinal());
    }
    
    
}
