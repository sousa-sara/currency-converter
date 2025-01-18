# Currency Converter - Conversor de Moedas

## Descrição
O **Currency Converter** é uma aplicação Java que permite a conversão de valores entre diferentes moedas utilizando taxas de câmbio em tempo real obtidas de uma API externa. O projeto foi desenvolvido com foco em simplicidade, modularidade e escalabilidade, utilizando as bibliotecas `HttpClient` e `Gson` para integração com a API e manipulação de dados JSON.

## Funcionalidades
- Exibição de uma lista de moedas disponíveis para conversão.
- Conversão de valores entre moedas com base em taxas de câmbio atualizadas.
- Manipulação de erros para entradas inválidas ou problemas na comunicação com a API.

## Moedas Suportadas
Atualmente, o projeto suporta as seguintes moedas:
- ARS (Peso Argentino)
- BOB (Boliviano)
- BRL (Real Brasileiro)
- CLP (Peso Chileno)
- COP (Peso Colombiano)
- USD (Dólar Americano)

## Pré-requisitos
- **IntelliJ** IDE para desenvolvimento.
- **Java 17** ou superior.
- **Maven** para gerenciamento de dependências.
- Chave de acesso a uma API de taxas de câmbio (o utilizado: ExchangeRate API).

## Configuração
1. Clone o repositório:
   ```bash
   git clone https://github.com/sousa-sara/currency-converter.git
   cd currency-converter

## Como Usar
Ao executar o programa, você verá uma lista de moedas disponíveis.

Selecione o índice das moedas de origem e destino.

Insira o valor a ser convertido.

O programa exibirá o valor convertido com base na taxa de câmbio atual.

## Tecnologias Utilizadas
Linguagem: Java

Gerenciamento de dependências: Maven

## Bibliotecas
HttpClient para requisições HTTP.

Gson para manipulação de JSON.
