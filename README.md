# Gestao de Vagas

Aplicacao REST em desenvolvimento para gestao de vagas e cadastro de candidatos. O projeto utiliza Java 21, Spring Boot e Maven.

## Requisitos

- JDK 21
- PostgreSQL local, conforme configuracao atual em `src/main/resources/application.properties`

## Executar

Na raiz do projeto, inicie a aplicacao com o Maven Wrapper:

```powershell
.\mvnw.cmd spring-boot:run
```

Por padrao, a configuracao do projeto aponta para o banco `postgres` em `localhost:5432`. Ajuste as propriedades de conexao em `src/main/resources/application.properties` para o seu ambiente.

## API de candidatos

O endpoint implementado para cadastro de candidatos e:

```http
POST /candidate/
Content-Type: application/json
```

Exemplo de corpo:

```json
{
  "name": "Ana Silva",
  "username": "ana_silva",
  "email": "ana@example.com",
  "password": "senha",
  "description": "Desenvolvedora Java",
  "curriculum": "Experiencia com Java e Spring"
}
```

O `username` e obrigatorio e aceita apenas letras, numeros e sublinhado (`_`). O `email` e obrigatorio e deve ter formato valido. Erros de validacao retornam HTTP `400` com uma lista de objetos contendo `message` e `field`.

O cadastro ainda esta em desenvolvimento: atualmente o endpoint valida os dados e imprime o e-mail recebido no console; os dados nao sao persistidos.

## Testes

Execute os testes com:

```powershell
.\mvnw.cmd test
```
