package com.mycompany.templatemethod;

/**
 *
 * @author Oem
 */
public class Templatemethod {

    public static void main(String[] args) {
       RelatorioFinanceiro relatorioCSV = new RelatorioCSV();
        relatorioCSV.gerarRelatorio();

        RelatorioFinanceiro relatorioJSON = new RelatorioJSON();
        relatorioJSON.gerarRelatorio();
    }
}
