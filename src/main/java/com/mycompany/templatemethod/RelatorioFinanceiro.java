/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.templatemethod;

public abstract class RelatorioFinanceiro {
    // Método Template
    public final void gerarRelatorio() {
        coletarDados();
        formatarDados();
        salvarRelatorio();
    }

    // Métodos abstratos que devem ser implementados pelas subclasses
    protected abstract void coletarDados();
    protected abstract void formatarDados();
    protected abstract void salvarRelatorio();
}
