/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.templatemethod;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class RelatorioCSV extends RelatorioFinanceiro {
    private String dadosFormatados;

    @Override
    protected void coletarDados() {
        // Simulação de coleta de dados
        System.out.println("Coletando dados para o relatório CSV...");
        // Aqui você coletaria dados reais de alguma fonte
    }

    @Override
    protected void formatarDados() {
        // Simulação de formatação de dados
        System.out.println("Formatando dados para o relatório CSV...");
        // Aqui você formataria os dados reais coletados
        dadosFormatados = "ID,Name,Age\n1,John Doe,28\n2,Jane Smith,34";
    }

    @Override
    protected void salvarRelatorio() {
        System.out.println("Salvando relatório CSV...");
        try (PrintWriter writer = new PrintWriter(new FileWriter("relatorio.csv"))) {
            writer.print(dadosFormatados);
            System.out.println("Relatório CSV salvo com sucesso.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
