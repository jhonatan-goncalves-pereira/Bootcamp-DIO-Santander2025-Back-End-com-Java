# 📌 Projeto 01 - Conta Banco

Desafio do **Bootcamp Santander 2025 - Back-End com Java (DIO)**.  
O objetivo é exercitar a sintaxe Java criando um programa de terminal que simula a abertura de uma conta bancária.

---

## 📂 Estrutura do Projeto

Este projeto foi criado com **Maven**, seguindo a convenção de diretórios padrão:

project01-conta-banco

    │── src
    │ └── main
    │ └── java
    │ └── org
    │ └── yourcompany
    │ └── yourproject
    │ └── ContaTerminal.java # Classe principal do 
    programa
    │
    │── test/ # Testes automatizados (não utilizados neste desafio)
    │── pom.xml # Configuração do Maven
    │── README.md # Documentação do projeto


---

## ▶️ Como Executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/jhonatan-goncalves-pereira/Bootcamp-DIO-Santander2025-Back-End-com-Java.git
Entre na pasta do projeto:

    ```cd project01-conta-banco

Compile o projeto com Maven:

    ```mvn clean install


Execute a classe principal:

    mvn exec:java -Dexec.mainClass="org.yourcompany.yourproject.ContaTerminal"

## 🖥️ Exemplo de Execução
    Por favor, digite o número da Conta: 1021
    Por favor, digite o número da Agência: 067-8
    Por favor, digite o nome do Cliente: MARIO ANDRADE
    Por favor, digite o saldo inicial: 237.48


Saída:

    Olá MARIO ANDRADE, obrigado por criar uma conta em nosso banco,
    sua agência é 067-8, conta 1021 e seu saldo R$ 237,48 já está disponível para saque.

## 🛠️ Tecnologias Utilizadas

Java 17+

Maven 3.8+

Scanner (entrada de dados via terminal)

## 📖 Autor

👤 [Jhonatan Gonçalves Pereira](https://www.linkedin.com/in/jhonatan-goncalves-pereira/)
Projeto desenvolvido como parte do bootcamp DIO + Santander Back-End com Java 2025.


---

