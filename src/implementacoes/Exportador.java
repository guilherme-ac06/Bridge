package implementacoes;

import java.util.List;
import model.ItemRelatorio;

public interface Exportador {

    void exportar(String titulo, List<ItemRelatorio> itens, double total);

}