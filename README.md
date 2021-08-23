# API Restful – Banco de Dados de Posts de Rede Social | Restful API - Social Network Posts Database

### Introdução | Introduction:

PT-BR: Este projeto consiste em uma API Restful destinada a manipulação do banco de dados relacionado aos posts de uma  rede social. O software é baseado em Java, Spring Boot e utilizando o banco de dados MongoDB. 

EN-US: This project consists of a Restful API aimed at manipulating the database related to posts from a social network. The software is based on Java, Spring Boot and using the MongoDB database.

### Instruções Para Inicialização do Software | Software Startup Instructions:
<div> 
PT-BR: Quando o projeto for baixado e você importar o mesmo em sua IDE (Eu utilizo o Eclipse), espere um momento pois as dependencias serão baixadas automaticamente através do Maven, as mesmas se encontram no arquivo "pom.xml" na pasta principal do projeto caso você queira conferi-las.
<br> É necessário ter o MongoDB instalado em seu computador e ter uma database criada para que o software funcione de forma corretamente. Tendo o MongoDB instalado e a database criada, acesse o arquivo "application.properties" no caminho "src/main/resources/". Esse é o arquivo de conexão com o banco MongoDB, o mesmo contém  apenas uma linha e nela está escrito "spring.data.mongodb.uri=mongodb://localhost:27017/social-network-java" altere a parte "social-network-java" no final da linha para o nome da sua database em seu MongoDB, pois as tabelas e dados serão inseridos nela.
<br> A inserção das informações serão feitas automaticamente conforme configurado no arquivo "Instantiation.java" presente no diretório "src/main/java/com/guilhermeoscp/socialnetworkposts/config/". Tendo o apache instalado também em seu computador, para ter acesso ao software, basta acessar nos endereços em qualquer browzer de internet "http://localhost:8080/users" ou "http://localhost:8080/posts/fullsearch" para acessar os dados. Mas recomendo que utilize o software Postman para acessar os dados, visto que nos browzers os dados ficam mostrados  por extenso sem nenhum padrão de organização e através do Postman, você pode fazer as operações administrativas como edição, criação e deleção de usuários, posts e comentários através dos comandos get, post, delete e put presentes no console do Postman, que é o objetivo da API.
</div> 

<div> 
<br>EN-US: When the project is downloaded and you import it into your IDE (I use Eclipse), wait a moment because the dependencies will be automatically downloaded through Maven, they are found in the "pom.xml" file in the main project folder if you want to check them out.
<br> It is necessary to have MongoDB installed on your computer and have a database created for the software to work properly. Having MongoDB installed and the database created, access the file "application.properties" in the path "src/main/resources/". This is the MongoDB database connection file, it contains only one line and it says "spring.data.mongodb.uri=mongodb://localhost:27017/social-network-java" change the part "social- network-java" at the end of the line for the name of your database in your MongoDB, as the tables and data will be inserted into it.
<br> The insertion of information will be done automatically as configured in the file "Instantiation.java" present in the directory "src/main/java/com/guilhermeoscp/socialnetworkposts/config/". Having apache also installed on your computer, to access the software, just access the addresses on any internet browser "http://localhost:8080/users" or "http://localhost:8080/posts/fullsearch" to access the data. But I recommend that you use Postman software to access the data, since in browsers the data is shown in full without any organization pattern and through Postman, you can do administrative operations such as editing, creating and deleting users, posts and comments through the get, post, delete and put commands present in the Postman console, which is the purpose of the API.
</div> 
  
### Observação | Observation:

PT-BR: Você pode usar meu código como base de outro ou utiliza-lo como demonstração, mas gostaria que os devidos creditos fossem dados.

EN-US: You can use my code as a base for another or use it as a demonstration, but I would like the proper credits to be given.
