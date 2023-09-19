# Projeto MongoDB com Spring Boot

## Objetivo geral:
* Compreender as principais diferenças entre paradigma orientado a documentos e relacional
* Implementar operações de CRUD
* Refletir sobre decisões de design para um banco de dados orientado a documentos
* Implementar associações entre objetos
  - Objetos aninhados
  - Referências
* Realizar consultas com Spring Data e MongoRepository

## Descrição

Neste projeto, desenvolvi uma API RESTful utilizando o Spring Boot, Spring Data MongoDB e MongoDB para gerenciar posts, comentários e usuários. Cada post é armazenado como um documento no MongoDB e inclui campos para data de criação, título e corpo. Aproveitei ao máximo o poder do NoSQL para flexibilidade de esquema. Implementei relacionamentos entre os documentos, onde cada post possui um autor associado, representado por um objeto com um ID e um nome. Os comentários também são armazenados em um array, incluindo texto, data e autor. Além disso, dei atenção aos nossos valiosos usuários! Cada usuário é representado com seu nome e endereço de e-mail, e suas postagens são associadas a eles. Essa abordagem escalável e eficiente permite a gestão de uma quantidade crescente de posts, enquanto mantém uma estrutura de dados organizada e fácil de consultar. Este projeto me proporcionou uma incrível oportunidade de aprendizado, permitindo-me adquirir habilidades essenciais em banco de dados NoSQL e explorar insights valiosos por meio da análise de dados.

## Pré-requisitos

Antes de executar o projeto localmente, certifique-se de que você tenha as seguintes ferramentas e recursos instalados:

- [Java](https://www.java.com/pt-BR/download/help/windows_manual_download.html)
- [Spring Boot]((https://www.devmedia.com.br/primeiros-passos-com-o-spring-boot/33654))
- [MongoDB]((https://www.devmedia.com.br/introducao-ao-mongodb/30792))


## Configuração do Ambiente

Configuração do Ambiente: Você precisa ter o ambiente de desenvolvimento Java configurado em sua máquina. Isso inclui a instalação do JDK (Java Development Kit).

Inclusão do Spring: O Spring Framework é geralmente incluído em um projeto Java como uma dependência. Isso pode ser feito manualmente configurando seu gerenciador de dependências (por exemplo, Maven ou Gradle) para baixar as bibliotecas do Spring ou usando uma IDE que possui ferramentas de construção de projeto integradas.

Configuração do Spring: Você configurará o Spring em seu projeto usando anotações Java ou XML, dependendo da preferência e das práticas recomendadas.

## Contribuições

Se desejar contribuir para o projeto, envie um pull request. Ficarei feliz em aprender e mesclar contribuições úteis.

## Contato

- Giordan Garcia
- giordangarcia12@gmail.com
- https://www.linkedin.com/in/giordan-garcia-623508265/

---
