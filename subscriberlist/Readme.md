# Spring Boot - Accessing and Adding Data

## Dependencies

- Spring Web
- Spring Data JPA
- H2 Database
- Spring Boot Dev Tools
- Thymeleaf

### Dependencies

Had to update my Java version in pom.xml to 1.11 to make my local JDK

### App Properties

Added a few lines to be able to access our H2 Database through console and to be able to load a external SQL source

### JPA

JPA- Java Persistance API
Collection of methods and classes for storing data in a database

- Dependency :Spring Data JPA

### Annotations

- @Entity - designates a POJO class as an entity so that we can use it with JPA
- @Id - JPA will recognize this as the object's primary key
- @GeneratedValue - allows the database to set the value for the field
- @Column - attribute is stored in a database column by the same name
- @ CreationTimestamp - sets the calue of the field to the current time

### Thymeleaf

Thymeleaf a server-side Java templating engine for both web and standalone JAR apps. Thymeleaf sits on top of existing HTML, so we write HTML like normal and just add a few things to make it a Thymeleaf template.

### Thymeleaf "Dialect" Basics

- \${...} : Variable expressions.
- \*{...} : Selection expressions.
- #{...} : Message (i18n) expressions.
- @{...} : Link (URL) expressions.
- ~{...} : Fragment expressions.
  Repository
  A repository is neccessary in Spring applications. It aids us in adding data to our database. It extends the built-in CrudRepository.
