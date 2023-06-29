package Prova2;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        
        Engenheiro engenheiro = new Engenheiro("1391283", "João", "123.456.876-64", "53.231.457-54", 
                new Endereco("Praça do Campo Grande", "1325", "Perto da Clínica", "12-423-312", "Salvador", UnidadeFederativa.BAHIA), Setor.ENGENHARIA, Genero.MASCULINO, 3000, EstadoCivil.CASADO, LocalDate.of(1997, Month.MARCH, 23));
        Motoboy motoboy = new Motoboy("3214212", "Marcelo", "312.435.645-21", "12.534.876-42", 
                new Endereco("Rua Engenheiro Afonso", "12", "casa verde", "13-235-121", "Salvador", UnidadeFederativa.BAHIA), Setor.OPERACOES, Genero.MASCULINO, 1300, EstadoCivil.SOLTEIRO, LocalDate.of(1998, Month.AUGUST, 18));
        Gerente gerente = new Gerente(Bonificacao.GERENTE, "Ricardo", "123.423.654-23", "12.342.321-42", 
                new Endereco("Rua do Meier", "231", "Casa azul", "123-345-123", "Rio de Janeiro", UnidadeFederativa.RIO_DE_JANEIRO), Setor.RECURSOS_HUMANOS, Genero.MASCULINO, 2700, EstadoCivil.CASADO, LocalDate.of(1989, Month.APRIL, 15));
        Diretor diretor = new Diretor(Bonificacao.DIRETOR, "Natalia", "123-534-154-65", "12.412.312-78", 
                new Endereco("Avenida Paulista", "2353", "Edificio preto", "13-464-872", "São Paulo", UnidadeFederativa.SAO_PAULO), Setor.JURIDICO, Genero.FEMININO, 8000, EstadoCivil.SEPARADO, LocalDate.of(1990, Month.JUNE, 23));
        
        diretor.admitir(engenheiro);
        System.out.println("");
        diretor.demitir(motoboy);
        System.out.println(gerente.toString());
        System.out.println(diretor.toString());
    }
}
