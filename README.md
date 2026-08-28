# Expense Tracker API

> API RESTful desenvolvida em Java com Spring Boot, estruturada com foco em arquitetura limpa, manutenibilidade e alta escalabilidade para sistemas backend.

---

## 🛠️ Stack Tecnológica

| Componente | Tecnologia / Versão | Propósito |
| :--- | :--- | :--- |
| **Linguagem** | Java 17 | Base orientada a objetos e recursos modernos |
| **Framework** | Spring Boot 3.2+ | Injeção de dependências e ecossistema web |
| **Persistência** | Spring Data JPA / Hibernate | ORM e mapeamento relacional |
| **Banco de Dados** | H2 Database | Armazenamento relacional em memória para testes |
| **Connection Pool** | HikariCP | Gerenciamento de conexões de alta performance |
| **Utilitários** | Lombok | Redução de código *boilerplate* |

---

## 🏛️ Arquitetura e Decisões de Engenharia

O projeto foi concebido simulando um **Monolito Modular**, garantindo baixo acoplamento, alta coesão e divisão clara de responsabilidades:

```text
src/main/java/com/willyan/expense_tracker/
├── controller/    # Camada de Apresentação (Contratos REST / DTOs)
├── service/       # Camada de Regras de Negócio e Transacionalidade
├── repository/    # Camada de Acesso a Dados (Otimização de Queries)
└── model/         # Entidades de Domínio e Mapeamento Relacional

🔒 Considerações de Engenharia e Production-Ready
Prevenção de N+1: Mapeamentos relacionais (@ManyToOne / @OneToMany) planejados para uso de Entity Graphs ou JOIN FETCH em consultas complexas.

Connection Pool: Gerenciamento de conexões eficientes via HikariCP nativo do Spring.

Tratamento de Exceções: Padronização de respostas HTTP para falhas de validação e regras de negócio.
```
## ⚙️ Como Executar o Projeto
1 - Clone o repositório:
> git clone https://github.com/WillyanMata/expense-tracker.git

2 - Acesse a pasta do projeto:
> cd expense-tracker

3 - Execute via Maven Wrapper:
> ./mvnw spring-boot:run

## 📡 Endpoints da API
POST /api/users — Cadastra um novo usuário.

GET /api/users — Lista todos os usuários cadastrados.

DELETE /api/users/{id} — Remove um usuário pelo identificador único.

## 👨‍💻 Autor
Desenvolvido por **Willyan Da Mata.**
