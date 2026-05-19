# 💇‍♀️ LuminaAgenda

Sistema de Agendamento para Profissionais Autônomos

---

## 📖 Descrição

O LuminaAgenda é um sistema desenvolvido em Java para gerenciamento de agendamentos entre clientes e profissionais autônomos.

O sistema permite organizar horários, serviços e controle de agenda de forma simples e estruturada, aplicando conceitos de Programação Orientada a Objetos e Design Patterns.

---

## 🚀 Tecnologias Utilizadas

- Java
- Programação Orientada a Objetos (POO)
- Princípios SOLID
- Design Patterns:
  - Builder
  - Decorator
- UML (Astah)

---

## 🏗️ Arquitetura do Projeto

O sistema está organizado em camadas:

- model → entidades do sistema
- dao → acesso aos dados
- service → regras de negócio

---

## 🧠 Design Patterns Aplicados

### 🔹 Builder
Utilizado na classe `Agendamento` para facilitar a criação de objetos complexos de forma fluente e organizada.

### 🔹 Decorator
Aplicado para representar serviços de forma dinâmica, permitindo adicionar funcionalidades extras (ex: hidratação, tintura, nail art, etc.) sem modificar a estrutura base do serviço.

---

## 📋 Regras de Negócio

- Um cliente pode ter apenas um agendamento ativo por vez
- Um profissional não pode ter dois agendamentos no mesmo horário
- Cada agendamento está vinculado a:
  - Cliente
  - Profissional
  - Serviço
- Status possíveis:
  - AGENDADO
  - CANCELADO
  - CONCLUIDO
- Tipos de atendimento:
  - PRESENCIAL
  - DOMICILIAR

---

## 📊 Diagrama de Classes

Abaixo está o diagrama do sistema com aplicação do padrão Decorator:

> 📌 (Inserir aqui o print do seu diagrama do Astah)

---

## 📌 Funcionalidades

- Cadastro de clientes
- Cadastro de profissionais
- Cadastro de serviços
- Criação de agendamentos
- Listagem de agendamentos
- Validação de regras de negócio

---

## 🎯 Objetivo do Projeto

Este projeto foi desenvolvido com foco em:

- Organização de código
- Aplicação de boas práticas de POO
- Uso de padrões de projeto
- Estruturação em camadas
- Preparação para evolução futura (API e banco de dados)

---

## 📈 Possíveis Evoluções

- Integração com banco de dados relacional
- API REST com Spring Boot
- Interface web
- Autenticação de usuários
- Novos padrões de projeto

---

## 👩‍💻 Autor

Projeto desenvolvido para estudos de Engenharia de Software e Programação Orientada a Objetos.
