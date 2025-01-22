# CRUD em Java

Este é um projeto de exemplo de um CRUD (Create, Read, Update, Delete) implementado em **Java puro**, sem o uso de frameworks como Spring. O foco do projeto é demonstrar a implementação básica de um sistema CRUD, utilizando JDBC para comunicação com o banco de dados.

---

## 📚 Tecnologias Utilizadas

- **Java SE 17** ou superior
- **JDBC (Java Database Connectivity)** para interação com o banco de dados
- **MySQL** como banco de dados
- **Maven** (opcional, para gerenciar dependências)
- IDE de sua preferência (IntelliJ IDEA, Eclipse, VS Code)

---

## ⚙️ Funcionalidades do Projeto

1. **Conexão ao Banco de Dados**:
   - Configurada manualmente no código, usando JDBC.
2. **Operações CRUD**:
   - **Create**: Inserir novos registros.
   - **Read**: Consultar registros no banco.
   - **Update**: Atualizar informações existentes.
   - **Delete**: Remover registros.
3. **Exemplo com uma Entidade Simples**:
   - Tabela `Aluno` com os campos `id`, `nome`, `email` e `telefone`.

---

## 🚀 Como Rodar o Projeto

### Pré-requisitos

1. **JDK 17** ou superior instalado.
2. **Banco de Dados MySQL** configurado.

### Passos

1. Clone o repositório:
   ```bash
   git clone https://github.com/SeuUsuario/CRUD_JAVA.git
   cd CRUD_JAVA
