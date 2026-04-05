# 🏦 Sistema Bancário em Java

Um projeto desenvolvido em Java para praticar os pilares da Programação Orientada a Objetos (POO):
**Abstração, Encapsulamento, Herança e Polimorfismo**, além de regras de negócio e validação de operações.

---

## 📌 Objetivo

O sistema simula o funcionamento básico de um banco, permitindo a criação de contas e a realização de operações financeiras como depósito, saque e transferência entre contas, incluindo validação de senha para segurança das operações.

---

## 🧩 Estrutura do Projeto

### IConta (Interface)

Define as operações básicas que toda conta deve possuir:

* depositar
* sacar
* transferir
* imprimirExtrato

Garante que todas as contas sigam o mesmo padrão de funcionamento.

---

### Conta (Classe Abstrata)

Classe base que possui os atributos comuns:

* Titular
* Agência
* Número da conta
* Saldo
* Senha

Também contém métodos comuns utilizados pelas contas.

---

### ContaCorrente

Classe que herda de Conta e representa uma conta corrente, podendo realizar todas as operações bancárias.

---

### ContaPoupanca

Classe que herda de Conta e representa uma conta poupança, utilizando a mesma estrutura base de conta.

---

### Main

Classe responsável por criar as contas e executar as operações, demonstrando o funcionamento do sistema bancário.

---

## 🚀 Funcionalidades

* Criar contas bancárias
* Realizar depósitos
* Realizar saques
* Transferir dinheiro entre contas
* Imprimir extrato da conta
* Validação de senha para operações financeiras
* Geração automática de número da conta e agência

---

## 🛠️ Tecnologias Utilizadas

* Java
* Programação Orientada a Objetos
* Interface e Classes Abstratas
* Herança e Polimorfismo
* Encapsulamento
* Regras de Negócio

---

## 🎯 Aprendizados

Este projeto reforça:

* **Abstração:** uso de interface e classe abstrata para definir comportamento das contas.
* **Encapsulamento:** atributos privados com controle de acesso.
* **Herança:** ContaCorrente e ContaPoupanca herdando de Conta.
* **Polimorfismo:** diferentes tipos de conta utilizando os mesmos métodos.
* **Regras de negócio:** validação de senha e operações financeiras.
* **Modelagem de sistema:** estrutura semelhante a sistemas bancários reais.

---

