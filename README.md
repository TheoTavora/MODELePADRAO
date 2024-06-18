# Relatórios Financeiros

Este projeto Java gera relatórios financeiros em dois formatos: CSV e JSON. Cada tipo de relatório segue um conjunto de etapas comuns para coletar, formatar e salvar os dados.

## Estrutura do Projeto

O projeto é composto por uma classe abstrata e duas classes concretas:

- **RelatorioFinanceiro (abstract):** Define o esqueleto do método `gerarRelatorio`, que inclui as etapas de `coletarDados`, `formatarDados` e `salvarRelatorio`.

- **RelatorioCSV:** Implementa os métodos para gerar relatórios em formato CSV.

- **RelatorioJSON:** Implementa os métodos para gerar relatórios em formato JSON.

## Como Usar

1. Clone o repositório para sua máquina local.
2. Adicione a dependência Gson ao seu projeto (se estiver usando Maven, adicione ao seu `pom.xml`):
    ```xml
    <dependency>
        <groupId>com.google.code.gson</groupId>
        <artifactId>gson</artifactId>
        <version>2.8.6</version>
    </dependency>
    ```
3. Compile e execute o projeto.

## Exemplo de Uso

Para gerar os relatórios, execute a classe `Main`:

```java
public class Main {
    public static void main(String[] args) {
        RelatorioFinanceiro relatorioCSV = new RelatorioCSV();
        relatorioCSV.gerarRelatorio();

        RelatorioFinanceiro relatorioJSON = new RelatorioJSON();
        relatorioJSON.gerarRelatorio();
    }
}
