# 🏆 Campeonato Brasileiro API

Esta API foi desenvolvida em **Java 21** com **Spring Boot** e é voltada para a gestão de rodadas, jogos e classificação do Campeonato Brasileiro de Futebol. A API fornece endpoints para a criação de jogos, consulta de informações sobre jogos e times, além de operações de CRUD para os times.

## 🚀 Tecnologias Utilizadas
- 🟦 **Java 21**
- 🌱 **Spring Boot 3**
- 📄 **Swagger OpenAPI 3**
- 🗄️ **H2 Database** (ou outro banco de dados configurado)
- 📦 **Maven**

## ⚙️ Como Executar o Projeto

1. Clone o repositório:
    ```bash
    git clone https://github.com/bfrjunior/campeonato-brasileiro-api.git
    ```
2. Navegue até o diretório do projeto:
    ```bash
    cd campeonato-brasileiro-api
    ```
3. Execute o projeto:
    ```bash
    mvn spring-boot:run
    ```

4. Acesse a documentação Swagger:
    ```
    http://localhost:8080/swagger-ui.html
    ```

## 📋 Endpoints Disponíveis

### 🎮 Jogos

1. **Gerar Jogos do Campeonato**
    - **URL:** `/jogos`
    - **Método:** `POST`
    - **Descrição:** Gera a lista de jogos para o campeonato.
    - **Resposta:** `200 OK`

2. **Buscar um Jogo Específico**
    - **URL:** `/jogos/{id}`
    - **Método:** `GET`
    - **Descrição:** Retorna os detalhes de um jogo específico.
    - **Parâmetros:**
      - `id`: ID do jogo.
    - **Resposta:** `200 OK` (contém um objeto `JogoDTO`)

3. **Listar Todos os Jogos**
    - **URL:** `/jogos`
    - **Método:** `GET`
    - **Descrição:** Retorna a lista de todos os jogos.
    - **Resposta:** `200 OK` (contém uma lista de objetos `JogoDTO`)

4. **Obter Classificação**
    - **URL:** `/jogos/classificacao`
    - **Método:** `GET`
    - **Descrição:** Retorna a classificação atual dos times.
    - **Resposta:** `200 OK` (contém um objeto `ClassificacaoDTO`)

5. **Finalizar um Jogo**
    - **URL:** `/jogos/finalizar/{id}`
    - **Método:** `POST`
    - **Descrição:** Finaliza um jogo específico.
    - **Parâmetros:**
      - `id`: ID do jogo.
    - **Corpo da Requisição:** Objeto `JogoDTO` com os detalhes do jogo.
    - **Resposta:** `200 OK`

### ⚽ Times

1. **Listar Todos os Times**
    - **URL:** `/times`
    - **Método:** `GET`
    - **Descrição:** Retorna a lista de todos os times.
    - **Resposta:** `200 OK` (contém uma lista de objetos `TimeDTO`)

2. **Adicionar um Novo Time**
    - **URL:** `/times`
    - **Método:** `POST`
    - **Descrição:** Adiciona um novo time.
    - **Corpo da Requisição:** Objeto `NovoTimeDTO` com os detalhes do time.
    - **Resposta:** `200 OK` (contém o objeto `TimeDTO` criado)

3. **Atualizar um Time**
    - **URL:** `/times/{id}`
    - **Método:** `PUT`
    - **Descrição:** Atualiza os detalhes de um time existente.
    - **Parâmetros:**
      - `id`: ID do time.
    - **Corpo da Requisição:** Objeto `NovoTimeDTO` com os novos detalhes do time.
    - **Resposta:** `200 OK` (contém o objeto `TimeDTO` atualizado)

4. **Deletar um Time**
    - **URL:** `/times/{id}`
    - **Método:** `DELETE`
    - **Descrição:** Deleta um time existente.
    - **Parâmetros:**
      - `id`: ID do time.
    - **Resposta:** `200 OK`

## 🗂️ Estrutura de Dados

- **`JogoDTO`**: Contém as informações dos jogos (times, data, placar, etc.).
- **`ClassificacaoDTO`**: Contém a classificação dos times no campeonato.
- **`TimeDTO`**: Contém as informações dos times (nome, sigla, UF, etc.).
- **`NovoTimeDTO`**: Utilizado para criar ou atualizar times.

## 💻 Como Contribuir

1. Faça um fork do repositório.
2. Crie uma nova branch: `git checkout -b minha-feature`.
3. Faça suas alterações e commit: `git commit -m 'Adiciona nova feature'`.
4. Envie para a branch principal: `git push origin minha-feature`.
5. Abra um Pull Request.

