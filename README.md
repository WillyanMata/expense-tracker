# 💰 Expense Tracker API

> API RESTful desenvolvida em Java com Spring Boot, projetada com foco em arquitetura limpa, manutenibilidade e escalabilidade para o ecossistema backend.

---

## 🚀 Tecnologias e Stack Tecnológica

* **Java 17** (Linguagem base orientada a objetos)
* **Spring Boot 3.2+** (Injeção de dependências e ecossistema web)
* **Spring Data JPA / Hibernate** (ORM e persistência de dados)
* **H2 Database** (Persistência em memória otimizada para ambiente de testes rápidos)
* **HikariCP** (Connection Pool padrão de alta performance do Spring Boot)
* **Lombok** (Produtividade e redução de boilerplate)

---

## 🏛️ Decisões Arquiteturais e Padrões de Projeto

O projeto foi estruturado simulando um **Monolito Modular**, garantindo baixo acoplamento e alta coesão entre os domínios:

```text
src/main/java/com/willyan/expense_tracker/
├── controller/   # Camada de Apresentação (Contratos REST / DTOs)
├── service/      # Camada de Regras de Negócio e Transacionalidade
├── repository/   # Camada de Acesso a Dados (Otimização de Queries)
└── model/        # Entidades de Domínio e Mapeamento Relacional

---

## 🔒 Considerações de Engenharia e Production-Ready

* **Prevenção de N+1:** Mapeamentos relacionais (`@ManyToOne` / `@OneToMany`) planejados para uso de Entity Graphs ou `JOIN FETCH` em consultas complexas.
* **Connection Pool:** Gerenciamento de conexões eficientes via HikariCP nativo do Spring.
* **Tratamento de Exceções:** Padronização de respostas HTTP para falhas de validação e regras de negócio.

---

## ⚙️ Como Executar o Projeto

1. Clone o repositório:
   ```bash
   git clone [https://github.com/WillyanMata/expense-tracker.git](https://github.com/WillyanMata/expense-tracker.git)


Acesse a pasta:
 cd expense-tracker

Execute via Maven Wrapper:
 ./mvnw spring-boot:run

📡 Endpoints da API
- POST /api/users - Cadastra um novo usuário.
- GET /api/users - Lista todos os usuários cadastrados.
- DELETE /api/users/{id} - Remove um usuário pelo identificador único.

👨‍💻 Desenvolvido por Willyan Da Mata.