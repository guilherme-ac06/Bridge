package implementacoes;

import model.ItemRelatorio;
import java.util.List;

public class ExportadorExcel implements Exportador {

    @Override
    public void exportar(String titulo, List<ItemRelatorio> itens, double total) {
        System.out.println("=== EXPORTANDO EXCEL ===");
        System.out.println("["+titulo +"]");

        for (ItemRelatorio item : itens) {
            System.out.println(item.getDescricao() + ";" +
                    item.getValor());
        }
        System.out.println("...\nTOTAL: R$ <" + total + ">");
        System.out.println("==========================");
    }

}
