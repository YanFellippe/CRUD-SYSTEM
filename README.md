# Sistema CRUD com Java, NetBeans e MySQL

## Descrição do Projeto
Este é um sistema CRUD (Create, Read, Update, Delete) desenvolvido em Java, utilizando o ambiente de desenvolvimento NetBeans e um banco de dados MySQL. O projeto é uma aplicação simples para gerenciar registros de uma tabela no banco de dados.

## Funcionalidades
- **Criar**: Adicionar novos registros no banco de dados.
- **Ler**: Listar e visualizar os registros existentes.
- **Atualizar**: Editar os dados de registros existentes.
- **Deletar**: Remover registros do banco de dados.

## Tecnologias Utilizadas
- **Linguagem**: Java
- **IDE**: NetBeans
- **Banco de Dados**: MySQL
- **Bibliotecas**:
  - JDBC para conexão com o banco de dados.
  - Swing para criação da interface gráfica.
  - JCalendar para seleção de datas.

## Requisitos
- **JDK** 8 ou superior
- **NetBeans** (versão 12 ou superior recomendada)
- **Servidor MySQL**

## Configuração do Banco de Dados
1. Certifique-se de que o servidor MySQL está em execução.
2. Crie um banco de dados com o nome `crud_db`.
3. Execute o seguinte script SQL para criar a tabela necessária:

```sql
CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    telefone VARCHAR(15)
);
