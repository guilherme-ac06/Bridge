package abstracoes;

import java.util.List;

import implementacoes.Exportador;
import model.ItemRelatorio;

public class RelatorioFinanceiro extends Relatorio {

    public RelatorioFinanceiro(Exportador exportador) {
        super(exportador);
    }

    @Override
    public void gerar(boolean detalhado) {

        String titulo = "Relatório Financeiro";

        List<ItemRelatorio> lista = filtrarItensDetalhados(detalhado);
        double total = calcularTotal(lista);

        exportador.exportar(titulo, lista, total);
    }
}