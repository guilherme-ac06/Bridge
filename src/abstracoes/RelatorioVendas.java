package abstracoes;

import java.util.List;

import implementacoes.Exportador;
import model.ItemRelatorio;

public class RelatorioVendas extends Relatorio {

    public RelatorioVendas(Exportador exportador) {
        super(exportador);
    }

    @Override
    public void gerar(boolean detalhado) {

        String titulo = "Relatório de Vendas";

        List<ItemRelatorio> lista = filtrarItensDetalhados(detalhado);
        double total = calcularTotal(lista);

        exportador.exportar(titulo, lista, total);
    }
}