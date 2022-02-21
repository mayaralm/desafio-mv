# Desafio MV - Desenvolvedor JR

## Informaçoes: <br>

Para executar esse projeto você precisa ter instalado na sua maquina o java, mysql e o postman;

Etapas: 
- Clone esse repositório <br>
- Copie e cole o código no arquivo `.sql`
- execute as requisiçoes através do `POSTMAN`

O **projeto** sera executado na *porta* `8080` e o **banco de dados**(`sql`) na *porta* `3306` por padrão.


Dependencias utilizadas:
```
 Java 11
 Maven
 MySQL 
 Spring Boot
```` 

`http://localhost:8080` <br>

Endpoints: <br>
 - Endereços<br>
```
[GET] 
    /enderecos
    /enderecos/id 
[POST]
    rota:
        /enderecos/new
    body:
    {
        "rua": "Rua abc",
        "numero": "17",
        "complemento": "",
        "cep": 12345678,
        "bairro": "Ouro Preto",
        "cidade": "Olinda",
        "estado": "PE"  
    }
[PUT]
    rota: 
        /enderecos/edit/id

    body:
    {
        "rua": "canela",
        "numero": "17",
        "complemento": "",
        "cep": 123456789,
        "bairro": "Ouro Preto",
        "cidade": "Olinda",
        "estado": "PE"  
    }
    
[DELETE]
    /enderecos/delete/id`
```

 - Clientes<br>
 ```
[GET] 
    /clientes
    /clientes/id 
[POST]
     rota:
        /clientes/new
    body:
    {        
        "nome": "Test",
        "endereco": "Rua A",
        "email": "user@teste.com",
        "telefone": "8179797979",
        "conta": 123457,
        "cpf": "01233344455",
        "cnpj": "123456789000"
    }
[PUT]
    rota: 
    /clientes/edit/id

    body:
    {
        "nome": "Test",
        "endereco": "Rua A",
        "email": "user@teste.com",
        "telefone": "8179797979",
    }
[DELETE]
    /clientes/delete/id`

```
 - Contas<br>
```
[GET] 
    /contas
    /contas/id 
[POST]
    rota:
        /contas/new
    
    body:
    {
        "id": 1,
        "numero": "12365478",
        "cpf": "123654789",
        "cnpj": "11111111",
        "saldo": 50.1,
        "tipo": "pessoa fisica"
    }
[PUT]
    /contas/edit/id
[DELETE]
    /contas/delete/id`

```