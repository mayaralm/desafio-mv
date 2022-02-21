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

Rotas: <br>
 - Endereços<br>
```
[GET] 
    /enderecos
    /enderecos/id 
[POST]
    /enderecos/new
[PUT]
    /enderecos/edit/id
[DELETE]
    /enderecos/delete/id`
```

 - Clientes<br>
 ```
[GET] 
    /clientes
    /clientes/id 
[POST]
    /clientes/new
[PUT]
    /clientes/edit/id
[DELETE]
    /clientes/delete/id`

```
 - Contas<br>
```
[GET] 
    /contas
    /contas/id 
[POST]
    /contas/new
[PUT]
    /contas/edit/id
[DELETE]
    /contas/delete/id`

```