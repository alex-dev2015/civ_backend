<h1>Acerto Individual de Viagens </h1>
<p>Projeto feio usando algumas tecnologias do Spring Boot, como JPA, Lombook e Hibernate.</p><br>

<h2>🎯 Objetivo do Projeto</h2>
<p>Servir e coletar dados para o fechamento das viagens realizadas pelos motoristas da empresa.</p>
<p>Importante realizar a edição das configurações de conexão com o banco no arquivo application.yml</p>

<h2>
🛑 Pré-requistos
</h2>

- [x] Maven

- [x] Java 8

<h2> 🚦 Guia </h2>


##Visualizar a documentação

```
  http://localhost:8080/swagger-ui.html
```
![Documentacao](https://github.com/alex-dev2015/civ_backend/blob/main/doc.png)

<h2>🛠 Tecnologias Utilizadas</h2>

<ul>
    <li>IDE IntelliJ</li>
    <li>Java 8</li>
    <li>Maven</li>
    <li><strong>Spring Web</strong></li>
    <li><strong>Spring Data JPA</strong></li>
    <li><strong>MysqlSQL Driver</strong></li>
    <li><strong>Hibernate Validator</strong></li>
    <li>Lombok</li>
    <li>Insomnia</li>
    <li>Swagger</li>
</ul>


<h2><a href="https://strn.com.br/artigos/2018/12/11/todas-as-anota%C3%A7%C3%B5es-do-jpa-anota%C3%A7%C3%B5es-de-mapeamento/"> Anotações de Mapeamento </a></h2>

<strong>@Entity</strong>
Usada para especificar que a classe anotada atualmente representa um tipo de entidade.

<strong>@Table</strong>
Usada para especificar a tabela principal da entidade atualmente anotada.

<strong>@Id</strong>
Especifica o identificador da entidade. Uma entidade deve sempre ter um atributo identificado.

<strong>@GeneratedValue</strong>
Especifica que o valor do identificador de entidade é gerado automaticamente.

<strong>@Column</strong>
Usada para especificar o mapeamento entre um atributo de entidade básico e a coluna da tabela de banco de dados.

<strong>@JoinColumn</strong>
Usada para especificar a coluna FOREIGN KEY. Indica que a entidade é a responsável pelo relacionamento.

<strong>@OneToMany</strong>
Usada para especificar um relacionamento de banco de dados um-para-muitos.

<strong>@OneToOne</strong>
Usada para especificar um relacionamento de banco de dados um-para-um.

<strong>@ManyToOne</strong>
Usada para especificar um relacionamento de banco de dados muitos-para-um.

<strong>cascade</strong>
Realizar operações em cascata só faz sentido em relacionamentos Pai - Filho.

<strong>mappedBy</strong>
Indica qual é o lado inverso ou não dominante da relação.

<h2>🔗 Links Úteis</h2>
<ul>
    <li><a href="https://start.spring.io/#!type=maven-project&language=java&platformVersion=2.6.1&packaging=jar&jvmVersion=11&groupId=me.dio.academia&artifactId=academia-digital&name=academia-digital&description=Tutorial%20API%20RESTful%20modelando%20sistema%20de%20academia%20de%20gin%C3%A1stica&packageName=me.dio.academia.digital&dependencies=web,data-jpa,postgresql,validation,lombok">Spring Initializr</a></li>
    <li><a href="https://docs.spring.io/spring-boot/docs/2.0.x/reference/html/common-application-properties.html">Common application properties</a></li>
    <li><a href="https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.repositories">Spring Data JPA - Reference Documentation</a></li>
    <li><a href="https://swagger.io/">Swagger - API Documentation</a></li>

</ul>


<h2> 🤝 Contribuindo </h2>

Este repositório foi criado para fins de estudo, porém esse projeto está rodando em ambiente de produção num cliente, porém que a vontade para compatilhar.

Se possível:

⭐️  Star o projeto

🐛 Encontrar e relatar issues

------------






