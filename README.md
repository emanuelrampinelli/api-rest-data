# api-rest | Cálculo de Idade - Teste

## Informações do projeto

- Java 17
- Spring Boot 

## Disponibilidade - Heroku

### Exemplos Requisição

- https://datahub-test.herokuapp.com/pessoa/idade/26-11-1996
- https://datahub-test.herokuapp.com/pessoa/idade/01-01-0000
- https://datahub-test.herokuapp.com/pessoa/idade/20-05-2021



## Descrição

Criar uma API Rest em que o parâmetro de entrada é a Data de Nascimento e retornar
à idade da Pessoa.

#### OBS - Qualquer valor invalido utilizado na requisição terá como retorno "-1";
![image](https://user-images.githubusercontent.com/37427276/169579347-45e8cb8d-6ccf-4912-8d18-267f239f96a9.png)

## Montagem de Ambiente

OBS - A descrição é baseada no Visual Studio Code

### 1 - Faça o download/clone do projeto;

### 2 - Abra o prompt de comando na pasta do projeto e digite : "code ."

![image](https://user-images.githubusercontent.com/37427276/169576419-e58f6adf-3cff-4b08-98b4-be13e2254e8f.png)

### 3 - Aguarde o Visual Studio abrir e carregar as dependências do projeto;

### 4 - Execute o projeto pela aba "SPRING BOOT DASHBOARD" localizado no canto inferior esquerdo.

![image](https://user-images.githubusercontent.com/37427276/169577395-fe534584-3d25-441a-a765-1d8dea95058e.png)

### 5 - Pronto! Aplicação disponível em: http://localhost:8080/

### Exemplos de requisição 

- http://localhost:8080/pessoa/idade/21-05-2021
- http://localhost:8080/pessoa/idade/01-01-0000
- http://localhost:8080/pessoa/idade/26-11-1996

### ATENÇÃO - Para rodar projetos Spring Boot no Visual Studio, instale a extenção "Spring Boot Extension Pack"
![image](https://user-images.githubusercontent.com/37427276/169578627-4333d7b6-e5af-4eaa-94ff-a308bae06c7a.png)


