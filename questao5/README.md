
Este é um projeto criado para a questão 5 da avalição do teste tinnova.
O projeto foi criado utilizando as seguintes tecnologias:
- PostgreSQL
- Spring Boot
- Linguagem: Java
- IDE: Spring Tool Suite, utilizando o Eclipse
- React


Para executar o projeto é necessario:
Back-end:
 - instalar/utilizar o PostgreSQL
 - criar uma database e editar as configs do arquivo /questao5/src/main/resources/application.properties
 - rodar a classe da aplicação: Questao5Application

Front-end:
 - abrir o terminal no root do projeto react (questao5-front) e dar os comandos:
	- npm install (instalar depedencias)
	- npm start (rodar o projeto)
	
 O front do projeto não foi finalizado, porém o back-end pode ser testado utilizando uma ferramenta cliente de API REST, 
 como por exemplo Insomnia o qual utilizei para o teste.
 Para testar as pesquisas, informar no parametro q os seguintes valores:
	-localhost:8080/veiculos/find?q=vendidos
	-localhost:8080/veiculos/find?q=fabricante
	-localhost:8080/veiculos/find?q=decada
	-localhost:8080/veiculos/find?q=semana