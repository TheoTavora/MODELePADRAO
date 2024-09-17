/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.templatemethod;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class RelatorioJSON extends RelatorioFinanceiro {
    private String dadosFormatados;

    @Override
    protected void coletarDados() {
        // Simulação de coleta de dados
        System.out.println("Coletando dados para o relatório JSON...");
        // Aqui você coletaria dados reais de alguma fonte
    }

    @Override
    protected void formatarDados() {
        // Simulação de formatação de dados
        System.out.println("Formatando dados para o relatório JSON...");
        // Aqui você formataria os dados reais coletados
        class Person {
            int id;
            String name;
            int age;
            
            Person(int id, String name, int age) {
                this.id = id;
                this.name = name;
                this.age = age;
            }
        }

        Person[] pessoas = {
            new Person(1, "John Doe", 28),
            new Person(2, "Jane Smith", 34)
        };

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        dadosFormatados = gson.toJson(pessoas);
    }

    @Override
    protected void salvarRelatorio() {
        System.out.println("Salvando relatório JSON...");
        try (FileWriter writer = new FileWriter("relatorio.json")) {
            writer.write(dadosFormatados);
            System.out.println("Relatório JSON salvo com sucesso.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

