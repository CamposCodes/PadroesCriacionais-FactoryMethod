# Factory Method Pattern — Validação de Documentos

<p align="center">
  <a href="https://www.ufjf.br/" rel="noopener">
    <img width=261 height=148 src="https://upload.wikimedia.org/wikipedia/commons/thumb/7/71/Logo_da_UFJF.png/640px-Logo_da_UFJF.png" alt="Logo UFJF">
  </a>
</p>

<h3 align="center">DCC078-2025.3-A — Aspectos Avançados em Engenharia de Software (UFJF/ICE)</h3>

---

## 📝 Sumário
- [Sobre](#about)
- [Informações da Atividade](#work_info)
- [Objetivo](#objetivo)
- [Funcionalidades](#funcionalidades)
- [Padrão Implementado](#padrao)
- [Estrutura de Diretórios](#estrutura)
- [Exemplo de Uso](#exemplo)
- [Testes](#testes)
- [Tecnologias](#tecnologias)
- [Autores](#autores)

## 🧐 Sobre <a name="about"></a>
Projeto acadêmico da disciplina DCC078 — Aspectos Avançados em Engenharia de Software (UFJF/ICE). O objetivo é aplicar o padrão Factory Method para criar um sistema extensível de validação de documentos brasileiros (CPF, CNPJ, RG), com cobertura de testes e documentação.

## 📌 Informações da Atividade <a name="work_info"></a>
**Universidade:** Universidade Federal de Juiz de Fora (UFJF)  
**Departamento:** Ciência da Computação (ICE)  
**Disciplina:** DCC078 – Aspectos Avançados em Engenharia de Software  
**Semestre:** 2025/2  
**Docente:** Prof. Marco Antonio Araujo]  
**Data de entrega:** 02/10/2025  
**Grupo:**
  - Gabriel Campos Lima Alves (202176005)

## 🎯 Objetivo <a name="objetivo"></a>
Implementar o padrão **Factory Method** para validação algorítmica e formatação de documentos brasileiros (CPF, CNPJ, RG), promovendo desacoplamento, extensibilidade e robustez no código.

## 🚀 Funcionalidades <a name="funcionalidades"></a>
- Validação algorítmica de CPF, CNPJ e RG
- Formatação automática de documentos
- Tratamento robusto de exceções
- Cobertura completa de testes com JUnit 5

## 🏗️ Padrão Implementado <a name="padrao"></a>
**Factory Method Pattern** — Permite criação de validadores específicos mantendo o código desacoplado e extensível.

## 📋 Estrutura de Diretórios <a name="estrutura"></a>
```
src/
├── main/java/padroescriacao/factorymethod/
│   ├── IValidadorDocumento.java         # Interface Product
│   ├── ValidadorDocumentoFactory.java  # Creator (Factory)
│   ├── ValidadorCPF.java               # ConcreteProduct
│   ├── ValidadorCNPJ.java              # ConcreteProduct
│   ├── ValidadorRG.java                # ConcreteProduct
│   └── ... (exceções, utilitários)
└── test/java/padroescriacao/factorymethod/
    ├── ValidadorDocumentoFactoryTest.java
    ├── ValidadorCPFTest.java
    ├── ValidadorCNPJTest.java
    └── ValidadorRGTest.java
```

## 📊 Exemplo de Uso <a name="exemplo"></a>
```java
DocumentoValidatorService service = new DocumentoValidatorService();
boolean valido = service.validarDocumento("CPF", "111.444.777-35");
```

## 🧪 Testes <a name="testes"></a>
- Testes de casos base e valores limite
- Testes de exceção para entradas inválidas
- Testes de cobertura para todos os validadores
- Execução via Maven:
```bash
mvn test
```

## 💻 Tecnologias <a name="tecnologias"></a>
- Java 17+
- JUnit 5
- Maven
- UML

## 👨‍💻 Autores <a name="autores"></a>
Grupo:
  - Gabriel Campos Lima Alves (202176005)
---
*Projeto acadêmico — UFJF — Aspectos Avançados em Engenharia de Software*
