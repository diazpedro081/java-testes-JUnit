package br.com.alura.tdd.service;

import java.math.BigDecimal;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteService {
    
    public void concederReajusteADesejar(Funcionario funcionario, Desempenho desempenho){
        if (desempenho == Desempenho.A_DESEJAR) {
            BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.03"));
            funcionario.reajustarSalario(reajuste);
        }
    }
    
    public void concederReajusteBom(Funcionario funcionarioDois, Desempenho desempenho){
        if (desempenho == Desempenho.BOM) {
            BigDecimal reajuste = funcionarioDois.getSalario().multiply(new BigDecimal("0.15"));
            funcionarioDois.reajustarSalario(reajuste);
        }
    }

    public void concederReajusteOtimo(Funcionario funcionario, Desempenho desempenho){
        if (desempenho == Desempenho.OTIMO
        ) {
            BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.20"));
            funcionario.reajustarSalario(reajuste);
        }
    }
}
