# Sistema de Pedidos - E-commerce em Java

Projeto desenvolvido como trabalho final da disciplina de **Programação Orientada a Objetos**, com o objetivo de aplicar conceitos fundamentais de POO em um sistema simples de e-commerce.

## Sobre o projeto

O sistema simula o fluxo básico de um pedido em uma loja virtual. Nele, um cliente pode realizar pedidos, adicionar produtos, escolher uma forma de pagamento, selecionar uma forma de entrega e gerar uma nota fiscal com os dados da compra.

O foco principal do projeto é a aplicação de conceitos de orientação a objetos em Java.

## Funcionalidades

- Cadastro de cliente
- Cadastro de endereço
- Criação de pedido
- Adição de produtos ao pedido
- Cálculo do valor total dos produtos
- Formas de pagamento:
    - PIX
    - Débito
    - Crédito
    - Boleto
- Desconto de 15% para pagamento via PIX
- Formas de entrega:
    - Entrega padrão
    - Entrega rápida
    - Retirada na loja
- Cálculo de frete
- Cálculo do valor final do pedido
- Geração de nota fiscal

## Conceitos de POO aplicados

- Classes e objetos
- Encapsulamento
- Construtores
- Associação entre classes
- Agregação
- Composição
- Interfaces
- Polimorfismo
- Sobrescrita de métodos
- Uso de `ArrayList`
- Separação de responsabilidades

## Estrutura do projeto

```text
src/main/java/br/com/sistemapedidos
├── application
│   └── Main.java
├── domain
│   ├── cliente
│   │   ├── Cliente.java
│   │   └── Endereco.java
│   ├── pedido
│   │   ├── Pedido.java
│   │   └── Produto.java
│   ├── pagamento
│   │   ├── FormaPagamento.java
│   │   ├── PagamentoPix.java
│   │   ├── PagamentoDebito.java
│   │   ├── PagamentoCredito.java
│   │   └── PagamentoBoleto.java
│   ├── entrega
│   │   ├── FormaEntrega.java
│   │   ├── EntregaPadrao.java
│   │   ├── EntregaRapida.java
│   │   └── RetirarNaLoja.java
│   └── NotaFiscal.java

Fluxo principal
Criar um endereço.
Criar um cliente associado ao endereço.
Criar um pedido para o cliente.
Criar produtos.
Adicionar produtos ao pedido.
Definir uma forma de pagamento.
Definir uma forma de entrega.
Calcular desconto, frete e valor final.
Gerar a nota fiscal.
Exemplo de saída
====== Nota Fiscal ======

Dados do cliente:
Nome: joao
Cpf: 77777777
Email: joao@gmail.com
Endereço: av teste, Número: 222, Bairro: centro, CEP: 38700233

Entrega:
Forma de entrega: Entrega rápida
Frete: 40

Produtos:
celular
mouse
lapis

Valores:
Valor dos produtos: 2300.0
Desconto aplicado: 0.0
Valor final: 2340.0

=========================
Regras de negócio
Pagamento

O sistema possui diferentes formas de pagamento por meio da interface FormaPagamento.

A forma de pagamento via PIX aplica um desconto de 15% sobre o valor dos produtos.

As demais formas de pagamento não aplicam desconto.

Entrega

O sistema possui diferentes formas de entrega por meio da interface FormaEntrega.

Cada tipo de entrega possui uma regra própria de frete.

Tecnologias utilizadas
Java
IntelliJ IDEA
Git
GitHub
Próximas melhorias
Modelar cliente pessoa física e cliente empresa
Adicionar suporte completo a CNPJ
Criar diagrama de classes UML
Melhorar a geração da nota fiscal
Adicionar validações básicas
Criar testes automatizados
Autor

Desenvolvido por João Vítor.


Depois salva o arquivo e roda:

```bash
git add README.md
git commit -m "Adiciona README do projeto"
git push