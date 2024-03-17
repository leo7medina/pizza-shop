# Pizza Shop

Demo project of a pizza restaurant in which Spring Data JPA is applied.

STATUS: FINALIZED

## Requirements

- Gradle 8.5
- Java 17
- Spring Boot 3.2.3


## Dependencies
- Lombok
- Spring data jpa
- Spring web
- Spring Security
- JWT
- My sql driver



## Mysql with docker
docker pull mysql

docker volume create <mysql-volume>

docker run -d -p 3306:3306 -v v_mysql:/var/lib/mysql -e MYSQL_ROOT_PASSWORD=admin --name mysql-container mysql:latest