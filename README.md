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

```
```java conexao
String url = "jdbc:mysql://localhost:3306/crud_db";
String usuario = "seu_usuario";
String senha = "sua_senha";
```

## Como Executar o Projeto

Clone este repositório:
```
git clone https://github.com/seuusuario/sistema-crud-java.git
```
-Abra o projeto no NetBeans.

-Configure as dependências, se necessário.

-Execute o projeto pressionando Shift + F6.

## Estrutura do Projeto

-src: Contém os arquivos de código fonte.

-DatabaseConnection.java: Classe para gerenciar a conexão com o banco de dados.

-Main.java: Classe principal para iniciar a aplicação.

-UI: Contém as telas e componentes da interface gráfica.

## Contribuições

**Contribuições são bem-vindas! Siga os seguintes passos:**

-Faça um fork deste repositório.

-Crie uma branch para sua feature/bugfix:
```
git checkout -b minha-branch
```
-Faça commit das suas modificações:
```
git commit -m "Minha nova feature"
```
-Faça o push para o repositório remoto:
```
git push origin minha-branch
```
Abra um pull request.
