package app;

import abstracoes.Relatorio;
import abstracoes.RelatorioFinanceiro;
import abstracoes.RelatorioVendas;
import implementacoes.ExportadorExcel;
import implementacoes.ExportadorPDF;
import model.ItemRelatorio;

public class Main {

    public static void main(String[] args) {

        ItemRelatorio a = new ItemRelatorio("Produto A", 50);
        ItemRelatorio b = new ItemRelatorio("Produto B", 200);
        ItemRelatorio c = new ItemRelatorio("Produto C", 150);

        Relatorio r1 = new RelatorioFinanceiro(new ExportadorPDF());
        r1.adicionarItem(a);
        r1.adicionarItem(b);
        r1.adicionarItem(c);
        r1.gerar(false);

        Relatorio r2 = new RelatorioFinanceiro(new ExportadorExcel());
        r2.adicionarItem(a);
        r2.adicionarItem(b);
        r2.adicionarItem(c);
        r2.gerar(true);

        Relatorio r3 = new RelatorioVendas(new ExportadorPDF());
        r3.adicionarItem(a);
        r3.adicionarItem(b);
        r3.adicionarItem(c);
        r3.gerar(true);

        Relatorio r4 = new RelatorioVendas(new ExportadorExcel());
        r4.adicionarItem(a);
        r4.adicionarItem(b);
        r4.adicionarItem(c);
        r4.gerar(false);
    }
}