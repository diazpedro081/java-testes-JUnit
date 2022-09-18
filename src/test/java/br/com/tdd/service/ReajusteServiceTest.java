package br.com.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.service.ReajusteService;

public class ReajusteServiceTest {

    @Test
    public void reajusteDeveriaSerDe3PorcentoQuandoDesepenhoForADesejar() {
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal(1000.00));

        service.concederReajusteADesejar(funcionario, Desempenho.A_DESEJAR);

        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());

    }

    @Test
    public void reajusteDeveriaSerDequizePorcentoQuandoDesepenhoForBom() {
        ReajusteService service = new ReajusteService();
        Funcionario funcionarioDois = new Funcionario("Paulo", LocalDate.now(), new BigDecimal(1000.00));

        service.concederReajusteBom(funcionarioDois, Desempenho.BOM);

        assertEquals(new BigDecimal("1150.00"), funcionarioDois.getSalario());
    }

    @Test
    public void reajusteDeveriaSerDeVintePorcentoQuandoDesepenhoForOtimo() {
        ReajusteService service = new ReajusteService();
        Funcionario funcionarioTres = new Funcionario("Amanda", LocalDate.now(), new BigDecimal(1000.00));

        service.concederReajusteOtimo(funcionarioTres, Desempenho.OTIMO);

        assertEquals(new BigDecimal("1200.00"), funcionarioTres.getSalario());
    }

}
