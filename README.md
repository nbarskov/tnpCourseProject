Используемые технологии:
1. PL - Java 8
2. Application Server - JBoss WildFly
3. RDBMS - PostgreSQL 9.6
4. Server Side - Spring Boot/Spring 4
5. ORM - Spring Data JPA/Hibernate
6. Client Side - AngularJS 1.6

Для того, чтобы запустить у себя, необходимо иметь:
1. Java 8
2. IntelliJ IDEA
3. WildFly 10
4. PostgreSQL 9.6
5. Здравый смысл 

**IntelliJ IDEA:**
1. Импортируем проект (File -> New Project -> New Project From Existing Sources -> Выбираем папку с проектом)
2. Во время импорта указать, что это Gradle Project.
3. В окне настройки Gradle выбрать Enable Auto-Import

Ждем, пока IDEA и Gradle загрузят зависимости проекта и проиндексируют исходники.

В файле настроек Spring (src/main/resources/application.yml) указать
    spring:datasource:url - локальный url к вашей базе
    spring:datasource:username и password - аналогично
    
Перед первым запуском применить скрипты schema.sql и data.sql.

**Gradle:**
Выполняем две Gradle Task: clean и war. Таким образом у нас получится WAR-архив, который после будем разворачивать на AS

**WildFly:**
1. Распаковать куда-нибудь
2. В IDEA выбрать пункт Run -> Edit Configurations
3. Там создать новый конфиг, выбрать JBoss Server
4. Настраиваем
![alt text](https://pp.userapi.com/c837636/v837636337/38fe8/ZhDrRb41ORs.jpg)
   4.1. Application Server - путь к той папке, где распаковали WildFly
   
   4.2. Остальное можно на свое усмотрение

5. Настраиваем артефакт:
![alt text](https://pp.userapi.com/c837636/v837636337/38ff1/qjAJ_ctfaSo.jpg)
(плюсик -> Artifact -> Выбираем тот, что (exploded))

6. Сохраняем настройки
7. Запускаем эту конфигурацию (смотрим на localhost:8080/ или что там в конфиге)
8. Profit

**Что сделано:**
1. Схема БД (нормальные названия таблиц и аттрибутов, внешние ключи)
2. Описаны классы-сущности с аннотациями JPA
3. Описаны Spring Data JPA репозитории (частично)
4. Описаны REST ресурсы (частично)
5. Реализована логика клиентской части, а именно: отображение списка полетов и фильтрация их по выбранным в ТЗ признакам

**Сейчас доступны адреса:**
* / - клиент, построенный на AngularJS 1.6
* /flights - REST ресурс, возвращающий список полетов
* /flights/search - REST ресурс фильтрации списка полетов
* /companies - REST ресурс, возвращающий список авиакомпаний